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
*  <p>Response Representation: PagedQueryResult with a results array of ProjectCategoryrecommendation, sorted by confidence scores in descending order and the meta information of ProjectCategoryrecommendationMeta.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyRecommendationsProjectCategoriesByProductIdGet {


   private ApiHttpHeaders headers = new ApiHttpHeaders();
   private Map<String, String> additionalQueryParams = new HashMap<>();
   private final ApiHttpClient apiHttpClient;
   private List<Integer> limit = new ArrayList<>();
   private List<Integer> offset = new ArrayList<>();
   private List<Boolean> staged = new ArrayList<>();
   private List<Integer> confidenceMin = new ArrayList<>();
   private List<Integer> confidenceMax = new ArrayList<>();
   private String projectKey;
   private String productId;


   public ByProjectKeyRecommendationsProjectCategoriesByProductIdGet(final ApiHttpClient apiHttpClient, String projectKey, String productId){
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
      this.productId = productId;
   }

   public ApiHttpRequest createHttpRequest() {
      ApiHttpRequest httpRequest = new ApiHttpRequest();
      List<String> params = new ArrayList<>();
      params.add(this.limit.stream().map(s -> "limit=" + s).collect(Collectors.joining("&")));
      params.add(this.offset.stream().map(s -> "offset=" + s).collect(Collectors.joining("&")));
      params.add(this.staged.stream().map(s -> "staged=" + s).collect(Collectors.joining("&")));
      params.add(this.confidenceMin.stream().map(s -> "confidenceMin=" + s).collect(Collectors.joining("&")));
      params.add(this.confidenceMax.stream().map(s -> "confidenceMax=" + s).collect(Collectors.joining("&")));
      params.add(additionalQueryParams.entrySet().stream().map(entry -> entry.getKey() + "=" + entry.getValue()).collect(Collectors.joining("&")));
      params.removeIf(String::isEmpty);
      String httpRequestPath = String.format("/%s/recommendations/project-categories/%s", this.projectKey, this.productId);
      if(!params.isEmpty()){
         httpRequestPath += "?" + String.join("&", params);
      }
      httpRequest.setRelativeUrl(httpRequestPath);
      httpRequest.setMethod(ApiHttpMethod.GET);
      httpRequest.setHeaders(headers);

      return httpRequest;
   }

   public ApiHttpResponse<com.commercetools.ml.models.category_recommendations.ProjectCategoryRecommendationPagedQueryResponse> executeBlocking(){
      try {
          return execute().get();
      } catch (Exception e) {
          throw new RuntimeException(e);
      }
   }

   public CompletableFuture<ApiHttpResponse<com.commercetools.ml.models.category_recommendations.ProjectCategoryRecommendationPagedQueryResponse>> execute(){
      return apiHttpClient.execute(this.createHttpRequest())
              .thenApply(response -> {
                  if(response.getStatusCode() >= 400){
                      throw new ApiHttpException(response.getStatusCode(), new String(response.getBody()), response.getHeaders());
                  }
                  return Utils.convertResponse(response,com.commercetools.ml.models.category_recommendations.ProjectCategoryRecommendationPagedQueryResponse.class);
              });
   }

   public String getProjectKey() {return this.projectKey;}
   public String getProductId() {return this.productId;}

   public List<Integer> getLimit() {
      return this.limit;
   }

   public List<Integer> getOffset() {
      return this.offset;
   }

   public List<Boolean> getStaged() {
      return this.staged;
   }

   public List<Integer> getConfidenceMin() {
      return this.confidenceMin;
   }

   public List<Integer> getConfidenceMax() {
      return this.confidenceMax;
   }

   public void setProjectKey(final String projectKey) {this.projectKey = projectKey;}

   public void setProductId(final String productId) {this.productId = productId;}

   public ByProjectKeyRecommendationsProjectCategoriesByProductIdGet addLimit(final Integer limit){
      this.limit.add(limit);
      return this;
   }

   public ByProjectKeyRecommendationsProjectCategoriesByProductIdGet withLimit(final List<Integer> limit){
      this.limit = limit;
      return this;
   }

   public ByProjectKeyRecommendationsProjectCategoriesByProductIdGet addOffset(final Integer offset){
      this.offset.add(offset);
      return this;
   }

   public ByProjectKeyRecommendationsProjectCategoriesByProductIdGet withOffset(final List<Integer> offset){
      this.offset = offset;
      return this;
   }

   public ByProjectKeyRecommendationsProjectCategoriesByProductIdGet addStaged(final Boolean staged){
      this.staged.add(staged);
      return this;
   }

   public ByProjectKeyRecommendationsProjectCategoriesByProductIdGet withStaged(final List<Boolean> staged){
      this.staged = staged;
      return this;
   }

   public ByProjectKeyRecommendationsProjectCategoriesByProductIdGet addConfidenceMin(final Integer confidenceMin){
      this.confidenceMin.add(confidenceMin);
      return this;
   }

   public ByProjectKeyRecommendationsProjectCategoriesByProductIdGet withConfidenceMin(final List<Integer> confidenceMin){
      this.confidenceMin = confidenceMin;
      return this;
   }

   public ByProjectKeyRecommendationsProjectCategoriesByProductIdGet addConfidenceMax(final Integer confidenceMax){
      this.confidenceMax.add(confidenceMax);
      return this;
   }

   public ByProjectKeyRecommendationsProjectCategoriesByProductIdGet withConfidenceMax(final List<Integer> confidenceMax){
      this.confidenceMax = confidenceMax;
      return this;
   }

   public ByProjectKeyRecommendationsProjectCategoriesByProductIdGet addHeader(final String key, final String value) {
      this.headers.addHeader(key, value);
      return this;
   }

   public ByProjectKeyRecommendationsProjectCategoriesByProductIdGet withHeaders(final ApiHttpHeaders headers) {
      this.headers = headers;
      return this;
   }

   public String getHeaderValue(final String key) {
      return this.headers.getHeaderValue(key);
   }

   public ApiHttpHeaders getHeaders() {
      return this.headers;
   }

   public ByProjectKeyRecommendationsProjectCategoriesByProductIdGet addAdditionalQueryParam(final String additionalQueryParamKey, final String additionalQueryParamValue) {
      this.additionalQueryParams.put(additionalQueryParamKey, additionalQueryParamValue);
      return this;
   }

   public ByProjectKeyRecommendationsProjectCategoriesByProductIdGet setAdditionalQueryParams(final Map<String, String> additionalQueryParams) {
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
