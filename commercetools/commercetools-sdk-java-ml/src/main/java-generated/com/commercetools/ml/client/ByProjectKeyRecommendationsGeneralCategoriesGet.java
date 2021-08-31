
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
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/recommendations/general-categories", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }

        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.ml.models.general_category_recommendations.GeneralCategoryRecommendationPagedQueryResponse> executeBlocking(
            final ApiHttpClient client, Duration timeout) {
        ApiHttpRequest request = this.createHttpRequest();
        return blockingWait(client.execute(request,
            com.commercetools.ml.models.general_category_recommendations.GeneralCategoryRecommendationPagedQueryResponse.class),
            request, timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.ml.models.general_category_recommendations.GeneralCategoryRecommendationPagedQueryResponse>> execute(
            final ApiHttpClient client) {
        return client.execute(this.createHttpRequest(),
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
     * set productImageUrl with the specificied value
     */
    public ByProjectKeyRecommendationsGeneralCategoriesGet withProductImageUrl(final String productImageUrl) {
        return copy().withQueryParam("productImageUrl", productImageUrl);
    }

    /**
     * add additional productImageUrl query parameter
     */
    public ByProjectKeyRecommendationsGeneralCategoriesGet addProductImageUrl(final String productImageUrl) {
        return copy().addQueryParam("productImageUrl", productImageUrl);
    }

    /**
     * set productName with the specificied value
     */
    public ByProjectKeyRecommendationsGeneralCategoriesGet withProductName(final String productName) {
        return copy().withQueryParam("productName", productName);
    }

    /**
     * add additional productName query parameter
     */
    public ByProjectKeyRecommendationsGeneralCategoriesGet addProductName(final String productName) {
        return copy().addQueryParam("productName", productName);
    }

    /**
     * set limit with the specificied value
     */
    public ByProjectKeyRecommendationsGeneralCategoriesGet withLimit(final int limit) {
        return copy().withQueryParam("limit", limit);
    }

    /**
     * add additional limit query parameter
     */
    public ByProjectKeyRecommendationsGeneralCategoriesGet addLimit(final int limit) {
        return copy().addQueryParam("limit", limit);
    }

    /**
     * set offset with the specificied value
     */
    public ByProjectKeyRecommendationsGeneralCategoriesGet withOffset(final int offset) {
        return copy().withQueryParam("offset", offset);
    }

    /**
     * add additional offset query parameter
     */
    public ByProjectKeyRecommendationsGeneralCategoriesGet addOffset(final int offset) {
        return copy().addQueryParam("offset", offset);
    }

    /**
     * set confidenceMin with the specificied value
     */
    public ByProjectKeyRecommendationsGeneralCategoriesGet withConfidenceMin(final double confidenceMin) {
        return copy().withQueryParam("confidenceMin", confidenceMin);
    }

    /**
     * add additional confidenceMin query parameter
     */
    public ByProjectKeyRecommendationsGeneralCategoriesGet addConfidenceMin(final double confidenceMin) {
        return copy().addQueryParam("confidenceMin", confidenceMin);
    }

    /**
     * set confidenceMax with the specificied value
     */
    public ByProjectKeyRecommendationsGeneralCategoriesGet withConfidenceMax(final double confidenceMax) {
        return copy().withQueryParam("confidenceMax", confidenceMax);
    }

    /**
     * add additional confidenceMax query parameter
     */
    public ByProjectKeyRecommendationsGeneralCategoriesGet addConfidenceMax(final double confidenceMax) {
        return copy().addQueryParam("confidenceMax", confidenceMax);
    }

    @Override
    protected ByProjectKeyRecommendationsGeneralCategoriesGet copy() {
        return new ByProjectKeyRecommendationsGeneralCategoriesGet(this);
    }
}
