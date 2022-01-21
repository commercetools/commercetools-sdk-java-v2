
package com.commercetools.ml.client;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
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
    public ApiHttpRequest createHttpRequest() {
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
     * set limit with the specificied value
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
     * set limit with the specificied values
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
     * set offset with the specificied value
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
     * set offset with the specificied values
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
     * set staged with the specificied value
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
     * set staged with the specificied values
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
     * set confidenceMin with the specificied value
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
     * set confidenceMin with the specificied values
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
     * set confidenceMax with the specificied value
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
     * set confidenceMax with the specificied values
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
