package com.commercetools.ml.client;

import io.vrap.rmf.base.client.utils.Utils;
import io.vrap.rmf.base.client.utils.json.VrapJsonUtils;

import java.io.InputStream;
import java.io.IOException;

import java.nio.file.Files;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.concurrent.CompletableFuture;
import io.vrap.rmf.base.client.utils.Generated;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import io.vrap.rmf.base.client.*;


/**
*  <p>This endpoint takes arbitrary product names or image URLs and generates recommendations from a general set of categories, which cover a broad range of industries. The full list of supported categories can be found <a href="https://docs.commercetools.com/category_recommendations_supported_categories.txt">here</a>. These are independent of the categories that are actually defined in your project. The main  purpose of this API is to provide a quick way to test the behavior of the category recommendations engine for different names and images. In contrast to the <a href="https://docs.commercetools.com/http-api-projects-categoryrecommendations#project-specific-category-recommendations">project-specific endpoint</a>, this endpoint does not have <a href="https://docs.commercetools.com/http-api-projects-categoryrecommendations#activating-the-api">activation criteria</a> and is enabled for all projects.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyRecommendationsGeneralCategoriesGet extends ApiMethod<ByProjectKeyRecommendationsGeneralCategoriesGet> {

    
    private String projectKey;
    

    public ByProjectKeyRecommendationsGeneralCategoriesGet(final ApiHttpClient apiHttpClient, String projectKey){
        super(apiHttpClient);
        this.projectKey = projectKey;
    }

    public ApiHttpRequest createHttpRequest() {
        ApiHttpRequest httpRequest = new ApiHttpRequest();
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/recommendations/general-categories", this.projectKey);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        httpRequest.setRelativeUrl(httpRequestPath); 
        httpRequest.setMethod(ApiHttpMethod.GET);
        httpRequest.setHeaders(getHeaders());
        
        return httpRequest;
    }

    public ApiHttpResponse<com.commercetools.ml.models.general_category_recommendations.GeneralCategoryRecommendationPagedQueryResponse> executeBlocking(){
        try {
            return execute().get();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public CompletableFuture<ApiHttpResponse<com.commercetools.ml.models.general_category_recommendations.GeneralCategoryRecommendationPagedQueryResponse>> execute(){
        return apiHttpClient().execute(this.createHttpRequest())
                .thenApply(response -> {
                    if(response.getStatusCode() >= 400){
                        throw new ApiHttpException(response.getStatusCode(), new String(response.getBody()), response.getHeaders());
                    }
                    return Utils.convertResponse(response,com.commercetools.ml.models.general_category_recommendations.GeneralCategoryRecommendationPagedQueryResponse.class);
                });
    }

    public String getProjectKey() {return this.projectKey;}

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

    public void setProjectKey(final String projectKey) {this.projectKey = projectKey;}

    public ByProjectKeyRecommendationsGeneralCategoriesGet withProductImageUrl(final String productImageUrl){
        return this.addQueryParam("productImageUrl", productImageUrl);
    }
    
    public ByProjectKeyRecommendationsGeneralCategoriesGet withProductName(final String productName){
        return this.addQueryParam("productName", productName);
    }
    
    public ByProjectKeyRecommendationsGeneralCategoriesGet withLimit(final Integer limit){
        return this.addQueryParam("limit", limit);
    }
    
    public ByProjectKeyRecommendationsGeneralCategoriesGet withOffset(final Integer offset){
        return this.addQueryParam("offset", offset);
    }
    
    public ByProjectKeyRecommendationsGeneralCategoriesGet withConfidenceMin(final Double confidenceMin){
        return this.addQueryParam("confidenceMin", confidenceMin);
    }
    
    public ByProjectKeyRecommendationsGeneralCategoriesGet withConfidenceMax(final Double confidenceMax){
        return this.addQueryParam("confidenceMax", confidenceMax);
    }
}
