
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
*  <p>Response Representation: PagedQueryResult with a results array of ProjectCategoryrecommendation, sorted by confidence scores in descending order and the meta information of ProjectCategoryrecommendationMeta.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyRecommendationsProjectCategoriesByProductIdGet extends
        ApiMethod<ByProjectKeyRecommendationsProjectCategoriesByProductIdGet, com.commercetools.ml.models.category_recommendations.ProjectCategoryRecommendationPagedQueryResponse> {

    private String projectKey;
    private String productId;

    public ByProjectKeyRecommendationsProjectCategoriesByProductIdGet(final ApiHttpClient apiHttpClient,
            String projectKey, String productId) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.productId = productId;
    }

    public ByProjectKeyRecommendationsProjectCategoriesByProductIdGet(
            ByProjectKeyRecommendationsProjectCategoriesByProductIdGet t) {
        super(t);
        this.projectKey = t.projectKey;
        this.productId = t.productId;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/recommendations/project-categories/%s", this.projectKey,
            this.productId);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.ml.models.category_recommendations.ProjectCategoryRecommendationPagedQueryResponse> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout,
            com.commercetools.ml.models.category_recommendations.ProjectCategoryRecommendationPagedQueryResponse.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.ml.models.category_recommendations.ProjectCategoryRecommendationPagedQueryResponse>> execute(
            final ApiHttpClient client) {
        return execute(client,
            com.commercetools.ml.models.category_recommendations.ProjectCategoryRecommendationPagedQueryResponse.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getProductId() {
        return this.productId;
    }

    public List<String> getLimit() {
        return this.getQueryParam("limit");
    }

    public List<String> getOffset() {
        return this.getQueryParam("offset");
    }

    public List<String> getStaged() {
        return this.getQueryParam("staged");
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

    public void setProductId(final String productId) {
        this.productId = productId;
    }

    /**
     * set limit with the specified value
     */
    public ByProjectKeyRecommendationsProjectCategoriesByProductIdGet withLimit(final int limit) {
        return copy().withQueryParam("limit", limit);
    }

    /**
     * add additional limit query parameter
     */
    public ByProjectKeyRecommendationsProjectCategoriesByProductIdGet addLimit(final int limit) {
        return copy().addQueryParam("limit", limit);
    }

    /**
     * set limit with the specified value
     */
    public ByProjectKeyRecommendationsProjectCategoriesByProductIdGet withLimit(final Supplier<Integer> supplier) {
        return copy().withQueryParam("limit", supplier.get());
    }

    /**
     * add additional limit query parameter
     */
    public ByProjectKeyRecommendationsProjectCategoriesByProductIdGet addLimit(final Supplier<Integer> supplier) {
        return copy().addQueryParam("limit", supplier.get());
    }

    /**
     * set limit with the specified value
     */
    public ByProjectKeyRecommendationsProjectCategoriesByProductIdGet withLimit(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("limit", op.apply(new StringBuilder()));
    }

    /**
     * add additional limit query parameter
     */
    public ByProjectKeyRecommendationsProjectCategoriesByProductIdGet addLimit(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("limit", op.apply(new StringBuilder()));
    }

    /**
     * set limit with the specified values
     */
    public ByProjectKeyRecommendationsProjectCategoriesByProductIdGet withLimit(final List<Integer> limit) {
        return copy().withoutQueryParam("limit")
                .addQueryParams(
                    limit.stream().map(s -> new ParamEntry<>("limit", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional limit query parameters
     */
    public ByProjectKeyRecommendationsProjectCategoriesByProductIdGet addLimit(final List<Integer> limit) {
        return copy().addQueryParams(
            limit.stream().map(s -> new ParamEntry<>("limit", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set offset with the specified value
     */
    public ByProjectKeyRecommendationsProjectCategoriesByProductIdGet withOffset(final int offset) {
        return copy().withQueryParam("offset", offset);
    }

    /**
     * add additional offset query parameter
     */
    public ByProjectKeyRecommendationsProjectCategoriesByProductIdGet addOffset(final int offset) {
        return copy().addQueryParam("offset", offset);
    }

    /**
     * set offset with the specified value
     */
    public ByProjectKeyRecommendationsProjectCategoriesByProductIdGet withOffset(final Supplier<Integer> supplier) {
        return copy().withQueryParam("offset", supplier.get());
    }

    /**
     * add additional offset query parameter
     */
    public ByProjectKeyRecommendationsProjectCategoriesByProductIdGet addOffset(final Supplier<Integer> supplier) {
        return copy().addQueryParam("offset", supplier.get());
    }

    /**
     * set offset with the specified value
     */
    public ByProjectKeyRecommendationsProjectCategoriesByProductIdGet withOffset(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("offset", op.apply(new StringBuilder()));
    }

    /**
     * add additional offset query parameter
     */
    public ByProjectKeyRecommendationsProjectCategoriesByProductIdGet addOffset(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("offset", op.apply(new StringBuilder()));
    }

    /**
     * set offset with the specified values
     */
    public ByProjectKeyRecommendationsProjectCategoriesByProductIdGet withOffset(final List<Integer> offset) {
        return copy().withoutQueryParam("offset")
                .addQueryParams(
                    offset.stream().map(s -> new ParamEntry<>("offset", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional offset query parameters
     */
    public ByProjectKeyRecommendationsProjectCategoriesByProductIdGet addOffset(final List<Integer> offset) {
        return copy().addQueryParams(
            offset.stream().map(s -> new ParamEntry<>("offset", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set staged with the specified value
     */
    public ByProjectKeyRecommendationsProjectCategoriesByProductIdGet withStaged(final boolean staged) {
        return copy().withQueryParam("staged", staged);
    }

    /**
     * add additional staged query parameter
     */
    public ByProjectKeyRecommendationsProjectCategoriesByProductIdGet addStaged(final boolean staged) {
        return copy().addQueryParam("staged", staged);
    }

    /**
     * set staged with the specified value
     */
    public ByProjectKeyRecommendationsProjectCategoriesByProductIdGet withStaged(final Supplier<Boolean> supplier) {
        return copy().withQueryParam("staged", supplier.get());
    }

    /**
     * add additional staged query parameter
     */
    public ByProjectKeyRecommendationsProjectCategoriesByProductIdGet addStaged(final Supplier<Boolean> supplier) {
        return copy().addQueryParam("staged", supplier.get());
    }

    /**
     * set staged with the specified value
     */
    public ByProjectKeyRecommendationsProjectCategoriesByProductIdGet withStaged(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("staged", op.apply(new StringBuilder()));
    }

    /**
     * add additional staged query parameter
     */
    public ByProjectKeyRecommendationsProjectCategoriesByProductIdGet addStaged(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("staged", op.apply(new StringBuilder()));
    }

    /**
     * set staged with the specified values
     */
    public ByProjectKeyRecommendationsProjectCategoriesByProductIdGet withStaged(final List<Boolean> staged) {
        return copy().withoutQueryParam("staged")
                .addQueryParams(
                    staged.stream().map(s -> new ParamEntry<>("staged", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional staged query parameters
     */
    public ByProjectKeyRecommendationsProjectCategoriesByProductIdGet addStaged(final List<Boolean> staged) {
        return copy().addQueryParams(
            staged.stream().map(s -> new ParamEntry<>("staged", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set confidenceMin with the specified value
     */
    public ByProjectKeyRecommendationsProjectCategoriesByProductIdGet withConfidenceMin(final double confidenceMin) {
        return copy().withQueryParam("confidenceMin", confidenceMin);
    }

    /**
     * add additional confidenceMin query parameter
     */
    public ByProjectKeyRecommendationsProjectCategoriesByProductIdGet addConfidenceMin(final double confidenceMin) {
        return copy().addQueryParam("confidenceMin", confidenceMin);
    }

    /**
     * set confidenceMin with the specified value
     */
    public ByProjectKeyRecommendationsProjectCategoriesByProductIdGet withConfidenceMin(
            final Supplier<Double> supplier) {
        return copy().withQueryParam("confidenceMin", supplier.get());
    }

    /**
     * add additional confidenceMin query parameter
     */
    public ByProjectKeyRecommendationsProjectCategoriesByProductIdGet addConfidenceMin(
            final Supplier<Double> supplier) {
        return copy().addQueryParam("confidenceMin", supplier.get());
    }

    /**
     * set confidenceMin with the specified value
     */
    public ByProjectKeyRecommendationsProjectCategoriesByProductIdGet withConfidenceMin(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("confidenceMin", op.apply(new StringBuilder()));
    }

    /**
     * add additional confidenceMin query parameter
     */
    public ByProjectKeyRecommendationsProjectCategoriesByProductIdGet addConfidenceMin(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("confidenceMin", op.apply(new StringBuilder()));
    }

    /**
     * set confidenceMin with the specified values
     */
    public ByProjectKeyRecommendationsProjectCategoriesByProductIdGet withConfidenceMin(
            final List<Double> confidenceMin) {
        return copy().withoutQueryParam("confidenceMin")
                .addQueryParams(confidenceMin.stream()
                        .map(s -> new ParamEntry<>("confidenceMin", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional confidenceMin query parameters
     */
    public ByProjectKeyRecommendationsProjectCategoriesByProductIdGet addConfidenceMin(
            final List<Double> confidenceMin) {
        return copy().addQueryParams(confidenceMin.stream()
                .map(s -> new ParamEntry<>("confidenceMin", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set confidenceMax with the specified value
     */
    public ByProjectKeyRecommendationsProjectCategoriesByProductIdGet withConfidenceMax(final double confidenceMax) {
        return copy().withQueryParam("confidenceMax", confidenceMax);
    }

    /**
     * add additional confidenceMax query parameter
     */
    public ByProjectKeyRecommendationsProjectCategoriesByProductIdGet addConfidenceMax(final double confidenceMax) {
        return copy().addQueryParam("confidenceMax", confidenceMax);
    }

    /**
     * set confidenceMax with the specified value
     */
    public ByProjectKeyRecommendationsProjectCategoriesByProductIdGet withConfidenceMax(
            final Supplier<Double> supplier) {
        return copy().withQueryParam("confidenceMax", supplier.get());
    }

    /**
     * add additional confidenceMax query parameter
     */
    public ByProjectKeyRecommendationsProjectCategoriesByProductIdGet addConfidenceMax(
            final Supplier<Double> supplier) {
        return copy().addQueryParam("confidenceMax", supplier.get());
    }

    /**
     * set confidenceMax with the specified value
     */
    public ByProjectKeyRecommendationsProjectCategoriesByProductIdGet withConfidenceMax(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("confidenceMax", op.apply(new StringBuilder()));
    }

    /**
     * add additional confidenceMax query parameter
     */
    public ByProjectKeyRecommendationsProjectCategoriesByProductIdGet addConfidenceMax(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("confidenceMax", op.apply(new StringBuilder()));
    }

    /**
     * set confidenceMax with the specified values
     */
    public ByProjectKeyRecommendationsProjectCategoriesByProductIdGet withConfidenceMax(
            final List<Double> confidenceMax) {
        return copy().withoutQueryParam("confidenceMax")
                .addQueryParams(confidenceMax.stream()
                        .map(s -> new ParamEntry<>("confidenceMax", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional confidenceMax query parameters
     */
    public ByProjectKeyRecommendationsProjectCategoriesByProductIdGet addConfidenceMax(
            final List<Double> confidenceMax) {
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

        ByProjectKeyRecommendationsProjectCategoriesByProductIdGet that = (ByProjectKeyRecommendationsProjectCategoriesByProductIdGet) o;

        return new EqualsBuilder().append(projectKey, that.projectKey).append(productId, that.productId).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(productId).toHashCode();
    }

    @Override
    protected ByProjectKeyRecommendationsProjectCategoriesByProductIdGet copy() {
        return new ByProjectKeyRecommendationsProjectCategoriesByProductIdGet(this);
    }
}
