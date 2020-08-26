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
public class ByProjectKeyRecommendationsGeneralCategoriesGet {

    
    private ApiHttpHeaders headers = new ApiHttpHeaders();
    private Map<String, String> additionalQueryParams = new HashMap<>();
    private final ApiHttpClient apiHttpClient; 
    private List<String> productImageUrl = new ArrayList<>();
    private List<String> productName = new ArrayList<>();
    private List<Integer> limit = new ArrayList<>();
    private List<Integer> offset = new ArrayList<>();
    private List<Double> confidenceMin = new ArrayList<>();
    private List<Double> confidenceMax = new ArrayList<>();
    private String projectKey;
    

    public ByProjectKeyRecommendationsGeneralCategoriesGet(final ApiHttpClient apiHttpClient, String projectKey){
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ApiHttpRequest createHttpRequest() {
        ApiHttpRequest httpRequest = new ApiHttpRequest();
        List<String> params = new ArrayList<>();
        params.add(this.productImageUrl.stream().map(s -> "productImageUrl=" + urlEncode(s)).collect(Collectors.joining("&")));
        params.add(this.productName.stream().map(s -> "productName=" + urlEncode(s)).collect(Collectors.joining("&")));
        params.add(this.limit.stream().map(s -> "limit=" + s).collect(Collectors.joining("&")));
        params.add(this.offset.stream().map(s -> "offset=" + s).collect(Collectors.joining("&")));
        params.add(this.confidenceMin.stream().map(s -> "confidenceMin=" + s).collect(Collectors.joining("&")));
        params.add(this.confidenceMax.stream().map(s -> "confidenceMax=" + s).collect(Collectors.joining("&")));
        params.add(additionalQueryParams.entrySet().stream().map(entry -> entry.getKey() + "=" + entry.getValue()).collect(Collectors.joining("&")));
        params.removeIf(String::isEmpty);
        String httpRequestPath = String.format("/%s/recommendations/general-categories", this.projectKey);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        httpRequest.setRelativeUrl(httpRequestPath); 
        httpRequest.setMethod(ApiHttpMethod.GET);
        httpRequest.setHeaders(headers);
        
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
        return apiHttpClient.execute(this.createHttpRequest())
                .thenApply(response -> {
                    if(response.getStatusCode() >= 400){
                        throw new ApiHttpException(response.getStatusCode(), new String(response.getBody()), response.getHeaders());
                    }
                    return Utils.convertResponse(response,com.commercetools.ml.models.general_category_recommendations.GeneralCategoryRecommendationPagedQueryResponse.class);
                });
    }

    public String getProjectKey() {return this.projectKey;}

    public List<String> getProductImageUrl() {
        return this.productImageUrl;
    }
    
    public List<String> getProductName() {
        return this.productName;
    }
    
    public List<Integer> getLimit() {
        return this.limit;
    }
    
    public List<Integer> getOffset() {
        return this.offset;
    }
    
    public List<Double> getConfidenceMin() {
        return this.confidenceMin;
    }
    
    public List<Double> getConfidenceMax() {
        return this.confidenceMax;
    }

    public void setProjectKey(final String projectKey) {this.projectKey = projectKey;}

    public ByProjectKeyRecommendationsGeneralCategoriesGet addProductImageUrl(final String productImageUrl){
        this.productImageUrl.add(productImageUrl);
        return this;
    }
    
    public ByProjectKeyRecommendationsGeneralCategoriesGet withProductImageUrl(final List<String> productImageUrl){
        this.productImageUrl = productImageUrl;
        return this;
    }
    
    public ByProjectKeyRecommendationsGeneralCategoriesGet addProductName(final String productName){
        this.productName.add(productName);
        return this;
    }
    
    public ByProjectKeyRecommendationsGeneralCategoriesGet withProductName(final List<String> productName){
        this.productName = productName;
        return this;
    }
    
    public ByProjectKeyRecommendationsGeneralCategoriesGet addLimit(final Integer limit){
        this.limit.add(limit);
        return this;
    }
    
    public ByProjectKeyRecommendationsGeneralCategoriesGet withLimit(final List<Integer> limit){
        this.limit = limit;
        return this;
    }
    
    public ByProjectKeyRecommendationsGeneralCategoriesGet addOffset(final Integer offset){
        this.offset.add(offset);
        return this;
    }
    
    public ByProjectKeyRecommendationsGeneralCategoriesGet withOffset(final List<Integer> offset){
        this.offset = offset;
        return this;
    }
    
    public ByProjectKeyRecommendationsGeneralCategoriesGet addConfidenceMin(final Double confidenceMin){
        this.confidenceMin.add(confidenceMin);
        return this;
    }
    
    public ByProjectKeyRecommendationsGeneralCategoriesGet withConfidenceMin(final List<Double> confidenceMin){
        this.confidenceMin = confidenceMin;
        return this;
    }
    
    public ByProjectKeyRecommendationsGeneralCategoriesGet addConfidenceMax(final Double confidenceMax){
        this.confidenceMax.add(confidenceMax);
        return this;
    }
    
    public ByProjectKeyRecommendationsGeneralCategoriesGet withConfidenceMax(final List<Double> confidenceMax){
        this.confidenceMax = confidenceMax;
        return this;
    }

    public ByProjectKeyRecommendationsGeneralCategoriesGet addHeader(final String key, final String value) {
        this.headers.addHeader(key, value);
        return this;
    }
    
    public ByProjectKeyRecommendationsGeneralCategoriesGet withHeaders(final ApiHttpHeaders headers) {
        this.headers = headers;
        return this;
    }
    
    public ApiHttpHeaders getHeaders() {
        return this.headers;
    }
    
    public ByProjectKeyRecommendationsGeneralCategoriesGet addAdditionalQueryParam(final String additionalQueryParamKey, final String additionalQueryParamValue) {
        this.additionalQueryParams.put(additionalQueryParamKey, additionalQueryParamValue);
        return this;
    }
    
    public ByProjectKeyRecommendationsGeneralCategoriesGet setAdditionalQueryParams(final Map<String, String> additionalQueryParams) {
        this.additionalQueryParams = additionalQueryParams;
        return this;
    }
    
    public Map<String, String> getAdditionalQueryParams() {
        return this.additionalQueryParams;
    }
    
    private String urlEncode(final String s){
        try{
             return URLEncoder.encode(s, "UTF-8");
         }catch (UnsupportedEncodingException e) {
             //this will never happen
             return null;
         }
    }

}
