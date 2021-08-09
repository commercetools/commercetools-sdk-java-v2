
package com.commercetools.ml.client;

import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

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
            final ApiHttpClient client, Duration timeout) {
        ApiHttpRequest request = this.createHttpRequest();
        return blockingWait(client.execute(request,
            com.commercetools.ml.models.category_recommendations.ProjectCategoryRecommendationPagedQueryResponse.class),
            request, timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.ml.models.category_recommendations.ProjectCategoryRecommendationPagedQueryResponse>> execute(
            final ApiHttpClient client) {
        return client.execute(this.createHttpRequest(),
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

    @Override
    protected ByProjectKeyRecommendationsProjectCategoriesByProductIdGet copy() {
        return new ByProjectKeyRecommendationsProjectCategoriesByProductIdGet(this);
    }
}
