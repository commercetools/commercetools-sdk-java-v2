
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
            Duration timeout) {
        return blockingWait(execute(), timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.ml.models.category_recommendations.ProjectCategoryRecommendationPagedQueryResponse>> execute() {
        return apiHttpClient().execute(this.createHttpRequest(),
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

    public ByProjectKeyRecommendationsProjectCategoriesByProductIdGet withLimit(final Integer limit) {
        return copy().withQueryParam("limit", limit);
    }

    public ByProjectKeyRecommendationsProjectCategoriesByProductIdGet addLimit(final Integer limit) {
        return copy().addQueryParam("limit", limit);
    }

    public ByProjectKeyRecommendationsProjectCategoriesByProductIdGet withOffset(final Integer offset) {
        return copy().withQueryParam("offset", offset);
    }

    public ByProjectKeyRecommendationsProjectCategoriesByProductIdGet addOffset(final Integer offset) {
        return copy().addQueryParam("offset", offset);
    }

    public ByProjectKeyRecommendationsProjectCategoriesByProductIdGet withStaged(final Boolean staged) {
        return copy().withQueryParam("staged", staged);
    }

    public ByProjectKeyRecommendationsProjectCategoriesByProductIdGet addStaged(final Boolean staged) {
        return copy().addQueryParam("staged", staged);
    }

    public ByProjectKeyRecommendationsProjectCategoriesByProductIdGet withConfidenceMin(final Double confidenceMin) {
        return copy().withQueryParam("confidenceMin", confidenceMin);
    }

    public ByProjectKeyRecommendationsProjectCategoriesByProductIdGet addConfidenceMin(final Double confidenceMin) {
        return copy().addQueryParam("confidenceMin", confidenceMin);
    }

    public ByProjectKeyRecommendationsProjectCategoriesByProductIdGet withConfidenceMax(final Double confidenceMax) {
        return copy().withQueryParam("confidenceMax", confidenceMax);
    }

    public ByProjectKeyRecommendationsProjectCategoriesByProductIdGet addConfidenceMax(final Double confidenceMax) {
        return copy().addQueryParam("confidenceMax", confidenceMax);
    }

    @Override
    protected ByProjectKeyRecommendationsProjectCategoriesByProductIdGet copy() {
        return new ByProjectKeyRecommendationsProjectCategoriesByProductIdGet(this);
    }
}
