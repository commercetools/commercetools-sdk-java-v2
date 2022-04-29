
package com.commercetools.ml.client;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
*  <p>This endpoint takes arbitrary product names or image URLs and generates recommendations from a general set of categories, which cover a broad range of industries. The full list of supported categories can be found <a href="https://docs.commercetools.com/category_recommendations_supported_categories.txt">here</a>. These are independent of the categories that are actually defined in your project. The main  purpose of this API is to provide a quick way to test the behavior of the category recommendations engine for different names and images. In contrast to the <a href="https://docs.commercetools.com/http-api-projects-categoryrecommendations#project-specific-category-recommendations">project-specific endpoint</a>, this endpoint does not have <a href="https://docs.commercetools.com/http-api-projects-categoryrecommendations#activating-the-api">activation criteria</a> and is enabled for all projects.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyRecommendationsGeneralCategoriesGet extends
        ApiMethod<ByProjectKeyRecommendationsGeneralCategoriesGet, com.commercetools.ml.models.general_category_recommendations.GeneralCategoryRecommendationPagedQueryResponse> {

    private String projectKey;

    public ByProjectKeyRecommendationsGeneralCategoriesGet(final ApiHttpClient apiHttpClient, String projectKey) {
        super(apiHttpClient);
        this.projectKey = projectKey;
    }

    public ByProjectKeyRecommendationsGeneralCategoriesGet(ByProjectKeyRecommendationsGeneralCategoriesGet t) {
        super(t);
        this.projectKey = t.projectKey;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/recommendations/general-categories", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.ml.models.general_category_recommendations.GeneralCategoryRecommendationPagedQueryResponse> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout,
            com.commercetools.ml.models.general_category_recommendations.GeneralCategoryRecommendationPagedQueryResponse.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.ml.models.general_category_recommendations.GeneralCategoryRecommendationPagedQueryResponse>> execute(
            final ApiHttpClient client) {
        return execute(client,
            com.commercetools.ml.models.general_category_recommendations.GeneralCategoryRecommendationPagedQueryResponse.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public List<String> getProductImageUrl() {
        return this.getQueryParam("productImageUrl");
    }

    public List<String> getProductName() {
        return this.getQueryParam("productName");
    }

    public List<String> getLimit() {
        return this.getQueryParam("limit");
    }

    public List<String> getOffset() {
        return this.getQueryParam("offset");
    }

    public List<String> getConfidenceMin() {
        return this.getQueryParam("confidenceMin");
    }

    public List<String> getConfidenceMax() {
        return this.getQueryParam("confidenceMax");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    /**
     * set productImageUrl with the specified value
     */
    public <TValue> ByProjectKeyRecommendationsGeneralCategoriesGet withProductImageUrl(final TValue productImageUrl) {
        return copy().withQueryParam("productImageUrl", productImageUrl);
    }

    /**
     * add additional productImageUrl query parameter
     */
    public <TValue> ByProjectKeyRecommendationsGeneralCategoriesGet addProductImageUrl(final TValue productImageUrl) {
        return copy().addQueryParam("productImageUrl", productImageUrl);
    }

    /**
     * set productImageUrl with the specified value
     */
    public ByProjectKeyRecommendationsGeneralCategoriesGet withProductImageUrl(final Supplier<String> supplier) {
        return copy().withQueryParam("productImageUrl", supplier.get());
    }

    /**
     * add additional productImageUrl query parameter
     */
    public ByProjectKeyRecommendationsGeneralCategoriesGet addProductImageUrl(final Supplier<String> supplier) {
        return copy().addQueryParam("productImageUrl", supplier.get());
    }

    /**
     * set productImageUrl with the specified value
     */
    public ByProjectKeyRecommendationsGeneralCategoriesGet withProductImageUrl(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("productImageUrl", op.apply(new StringBuilder()));
    }

    /**
     * add additional productImageUrl query parameter
     */
    public ByProjectKeyRecommendationsGeneralCategoriesGet addProductImageUrl(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("productImageUrl", op.apply(new StringBuilder()));
    }

    /**
     * set productImageUrl with the specified values
     */
    public <TValue> ByProjectKeyRecommendationsGeneralCategoriesGet withProductImageUrl(
            final List<TValue> productImageUrl) {
        return copy().withoutQueryParam("productImageUrl")
                .addQueryParams(productImageUrl.stream()
                        .map(s -> new ParamEntry<>("productImageUrl", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional productImageUrl query parameters
     */
    public <TValue> ByProjectKeyRecommendationsGeneralCategoriesGet addProductImageUrl(
            final List<TValue> productImageUrl) {
        return copy().addQueryParams(productImageUrl.stream()
                .map(s -> new ParamEntry<>("productImageUrl", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set productName with the specified value
     */
    public <TValue> ByProjectKeyRecommendationsGeneralCategoriesGet withProductName(final TValue productName) {
        return copy().withQueryParam("productName", productName);
    }

    /**
     * add additional productName query parameter
     */
    public <TValue> ByProjectKeyRecommendationsGeneralCategoriesGet addProductName(final TValue productName) {
        return copy().addQueryParam("productName", productName);
    }

    /**
     * set productName with the specified value
     */
    public ByProjectKeyRecommendationsGeneralCategoriesGet withProductName(final Supplier<String> supplier) {
        return copy().withQueryParam("productName", supplier.get());
    }

    /**
     * add additional productName query parameter
     */
    public ByProjectKeyRecommendationsGeneralCategoriesGet addProductName(final Supplier<String> supplier) {
        return copy().addQueryParam("productName", supplier.get());
    }

    /**
     * set productName with the specified value
     */
    public ByProjectKeyRecommendationsGeneralCategoriesGet withProductName(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("productName", op.apply(new StringBuilder()));
    }

    /**
     * add additional productName query parameter
     */
    public ByProjectKeyRecommendationsGeneralCategoriesGet addProductName(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("productName", op.apply(new StringBuilder()));
    }

    /**
     * set productName with the specified values
     */
    public <TValue> ByProjectKeyRecommendationsGeneralCategoriesGet withProductName(final List<TValue> productName) {
        return copy().withoutQueryParam("productName")
                .addQueryParams(productName.stream()
                        .map(s -> new ParamEntry<>("productName", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional productName query parameters
     */
    public <TValue> ByProjectKeyRecommendationsGeneralCategoriesGet addProductName(final List<TValue> productName) {
        return copy().addQueryParams(
            productName.stream().map(s -> new ParamEntry<>("productName", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set limit with the specified value
     */
    public <TValue> ByProjectKeyRecommendationsGeneralCategoriesGet withLimit(final TValue limit) {
        return copy().withQueryParam("limit", limit);
    }

    /**
     * add additional limit query parameter
     */
    public <TValue> ByProjectKeyRecommendationsGeneralCategoriesGet addLimit(final TValue limit) {
        return copy().addQueryParam("limit", limit);
    }

    /**
     * set limit with the specified value
     */
    public ByProjectKeyRecommendationsGeneralCategoriesGet withLimit(final Supplier<Integer> supplier) {
        return copy().withQueryParam("limit", supplier.get());
    }

    /**
     * add additional limit query parameter
     */
    public ByProjectKeyRecommendationsGeneralCategoriesGet addLimit(final Supplier<Integer> supplier) {
        return copy().addQueryParam("limit", supplier.get());
    }

    /**
     * set limit with the specified value
     */
    public ByProjectKeyRecommendationsGeneralCategoriesGet withLimit(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("limit", op.apply(new StringBuilder()));
    }

    /**
     * add additional limit query parameter
     */
    public ByProjectKeyRecommendationsGeneralCategoriesGet addLimit(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("limit", op.apply(new StringBuilder()));
    }

    /**
     * set limit with the specified values
     */
    public <TValue> ByProjectKeyRecommendationsGeneralCategoriesGet withLimit(final List<TValue> limit) {
        return copy().withoutQueryParam("limit")
                .addQueryParams(
                    limit.stream().map(s -> new ParamEntry<>("limit", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional limit query parameters
     */
    public <TValue> ByProjectKeyRecommendationsGeneralCategoriesGet addLimit(final List<TValue> limit) {
        return copy().addQueryParams(
            limit.stream().map(s -> new ParamEntry<>("limit", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set offset with the specified value
     */
    public <TValue> ByProjectKeyRecommendationsGeneralCategoriesGet withOffset(final TValue offset) {
        return copy().withQueryParam("offset", offset);
    }

    /**
     * add additional offset query parameter
     */
    public <TValue> ByProjectKeyRecommendationsGeneralCategoriesGet addOffset(final TValue offset) {
        return copy().addQueryParam("offset", offset);
    }

    /**
     * set offset with the specified value
     */
    public ByProjectKeyRecommendationsGeneralCategoriesGet withOffset(final Supplier<Integer> supplier) {
        return copy().withQueryParam("offset", supplier.get());
    }

    /**
     * add additional offset query parameter
     */
    public ByProjectKeyRecommendationsGeneralCategoriesGet addOffset(final Supplier<Integer> supplier) {
        return copy().addQueryParam("offset", supplier.get());
    }

    /**
     * set offset with the specified value
     */
    public ByProjectKeyRecommendationsGeneralCategoriesGet withOffset(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("offset", op.apply(new StringBuilder()));
    }

    /**
     * add additional offset query parameter
     */
    public ByProjectKeyRecommendationsGeneralCategoriesGet addOffset(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("offset", op.apply(new StringBuilder()));
    }

    /**
     * set offset with the specified values
     */
    public <TValue> ByProjectKeyRecommendationsGeneralCategoriesGet withOffset(final List<TValue> offset) {
        return copy().withoutQueryParam("offset")
                .addQueryParams(
                    offset.stream().map(s -> new ParamEntry<>("offset", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional offset query parameters
     */
    public <TValue> ByProjectKeyRecommendationsGeneralCategoriesGet addOffset(final List<TValue> offset) {
        return copy().addQueryParams(
            offset.stream().map(s -> new ParamEntry<>("offset", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set confidenceMin with the specified value
     */
    public <TValue> ByProjectKeyRecommendationsGeneralCategoriesGet withConfidenceMin(final TValue confidenceMin) {
        return copy().withQueryParam("confidenceMin", confidenceMin);
    }

    /**
     * add additional confidenceMin query parameter
     */
    public <TValue> ByProjectKeyRecommendationsGeneralCategoriesGet addConfidenceMin(final TValue confidenceMin) {
        return copy().addQueryParam("confidenceMin", confidenceMin);
    }

    /**
     * set confidenceMin with the specified value
     */
    public ByProjectKeyRecommendationsGeneralCategoriesGet withConfidenceMin(final Supplier<Double> supplier) {
        return copy().withQueryParam("confidenceMin", supplier.get());
    }

    /**
     * add additional confidenceMin query parameter
     */
    public ByProjectKeyRecommendationsGeneralCategoriesGet addConfidenceMin(final Supplier<Double> supplier) {
        return copy().addQueryParam("confidenceMin", supplier.get());
    }

    /**
     * set confidenceMin with the specified value
     */
    public ByProjectKeyRecommendationsGeneralCategoriesGet withConfidenceMin(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("confidenceMin", op.apply(new StringBuilder()));
    }

    /**
     * add additional confidenceMin query parameter
     */
    public ByProjectKeyRecommendationsGeneralCategoriesGet addConfidenceMin(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("confidenceMin", op.apply(new StringBuilder()));
    }

    /**
     * set confidenceMin with the specified values
     */
    public <TValue> ByProjectKeyRecommendationsGeneralCategoriesGet withConfidenceMin(
            final List<TValue> confidenceMin) {
        return copy().withoutQueryParam("confidenceMin")
                .addQueryParams(confidenceMin.stream()
                        .map(s -> new ParamEntry<>("confidenceMin", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional confidenceMin query parameters
     */
    public <TValue> ByProjectKeyRecommendationsGeneralCategoriesGet addConfidenceMin(final List<TValue> confidenceMin) {
        return copy().addQueryParams(confidenceMin.stream()
                .map(s -> new ParamEntry<>("confidenceMin", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set confidenceMax with the specified value
     */
    public <TValue> ByProjectKeyRecommendationsGeneralCategoriesGet withConfidenceMax(final TValue confidenceMax) {
        return copy().withQueryParam("confidenceMax", confidenceMax);
    }

    /**
     * add additional confidenceMax query parameter
     */
    public <TValue> ByProjectKeyRecommendationsGeneralCategoriesGet addConfidenceMax(final TValue confidenceMax) {
        return copy().addQueryParam("confidenceMax", confidenceMax);
    }

    /**
     * set confidenceMax with the specified value
     */
    public ByProjectKeyRecommendationsGeneralCategoriesGet withConfidenceMax(final Supplier<Double> supplier) {
        return copy().withQueryParam("confidenceMax", supplier.get());
    }

    /**
     * add additional confidenceMax query parameter
     */
    public ByProjectKeyRecommendationsGeneralCategoriesGet addConfidenceMax(final Supplier<Double> supplier) {
        return copy().addQueryParam("confidenceMax", supplier.get());
    }

    /**
     * set confidenceMax with the specified value
     */
    public ByProjectKeyRecommendationsGeneralCategoriesGet withConfidenceMax(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("confidenceMax", op.apply(new StringBuilder()));
    }

    /**
     * add additional confidenceMax query parameter
     */
    public ByProjectKeyRecommendationsGeneralCategoriesGet addConfidenceMax(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("confidenceMax", op.apply(new StringBuilder()));
    }

    /**
     * set confidenceMax with the specified values
     */
    public <TValue> ByProjectKeyRecommendationsGeneralCategoriesGet withConfidenceMax(
            final List<TValue> confidenceMax) {
        return copy().withoutQueryParam("confidenceMax")
                .addQueryParams(confidenceMax.stream()
                        .map(s -> new ParamEntry<>("confidenceMax", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional confidenceMax query parameters
     */
    public <TValue> ByProjectKeyRecommendationsGeneralCategoriesGet addConfidenceMax(final List<TValue> confidenceMax) {
        return copy().addQueryParams(confidenceMax.stream()
                .map(s -> new ParamEntry<>("confidenceMax", s.toString()))
                .collect(Collectors.toList()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyRecommendationsGeneralCategoriesGet that = (ByProjectKeyRecommendationsGeneralCategoriesGet) o;

        return new EqualsBuilder().append(projectKey, that.projectKey).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).toHashCode();
    }

    @Override
    protected ByProjectKeyRecommendationsGeneralCategoriesGet copy() {
        return new ByProjectKeyRecommendationsGeneralCategoriesGet(this);
    }
}
