package com.commercetools.api.client;

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
*  <p>Query carts</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyCartsGet {
   
   
   private ApiHttpHeaders headers = new ApiHttpHeaders();
   private Map<String, String> additionalQueryParams = new HashMap<>();
   private final ApiHttpClient apiHttpClient; 
   private List<String> customerId = new ArrayList<>();
   private List<String> expand = new ArrayList<>();
   private List<String> sort = new ArrayList<>();
   private List<Double> limit = new ArrayList<>();
   private List<Double> offset = new ArrayList<>();
   private List<Boolean> withTotal = new ArrayList<>();
   private List<String> where = new ArrayList<>();
   private String projectKey;
   
   
   public ByProjectKeyCartsGet(final ApiHttpClient apiHttpClient, String projectKey){
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
   }
   
   public ApiHttpRequest createHttpRequest() {
      ApiHttpRequest httpRequest = new ApiHttpRequest();
      List<String> params = new ArrayList<>();
      params.add(this.customerId.stream().map(s -> "customerId=" + urlEncode(s)).collect(Collectors.joining("&")));
      params.add(this.expand.stream().map(s -> "expand=" + urlEncode(s)).collect(Collectors.joining("&")));
      params.add(this.sort.stream().map(s -> "sort=" + urlEncode(s)).collect(Collectors.joining("&")));
      params.add(this.limit.stream().map(s -> "limit=" + s).collect(Collectors.joining("&")));
      params.add(this.offset.stream().map(s -> "offset=" + s).collect(Collectors.joining("&")));
      params.add(this.withTotal.stream().map(s -> "withTotal=" + s).collect(Collectors.joining("&")));
      params.add(this.where.stream().map(s -> "where=" + urlEncode(s)).collect(Collectors.joining("&")));
      params.add(additionalQueryParams.entrySet().stream().map(entry -> entry.getKey() + "=" + entry.getValue()).collect(Collectors.joining("&")));
      params.removeIf(String::isEmpty);
      String httpRequestPath = String.format("/%s/carts", this.projectKey);
      if(!params.isEmpty()){
         httpRequestPath += "?" + String.join("&", params);
      }
      httpRequest.setRelativeUrl(httpRequestPath); 
      httpRequest.setMethod(ApiHttpMethod.GET);
      httpRequest.setHeaders(headers);
      
      return httpRequest;
   }
   
   public ApiHttpResponse<com.commercetools.api.models.cart.CartPagedQueryResponse> executeBlocking(){
      try {
          return execute().get();
      } catch (Exception e) {
          throw new RuntimeException(e);
      }
   }
   
   public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.cart.CartPagedQueryResponse>> execute(){
      return apiHttpClient.execute(this.createHttpRequest())
              .thenApply(response -> {
                  if(response.getStatusCode() >= 400){
                      throw new ApiHttpException(response.getStatusCode(), new String(response.getBody()), response.getHeaders());
                  }
                  return Utils.convertResponse(response,com.commercetools.api.models.cart.CartPagedQueryResponse.class);
              });
   }
   
   public String getProjectKey() {return this.projectKey;}
   
   public List<String> getCustomerId() {
      return this.customerId;
   }
   
   public List<String> getExpand() {
      return this.expand;
   }
   
   public List<String> getSort() {
      return this.sort;
   }
   
   public List<Double> getLimit() {
      return this.limit;
   }
   
   public List<Double> getOffset() {
      return this.offset;
   }
   
   public List<Boolean> getWithTotal() {
      return this.withTotal;
   }
   
   public List<String> getWhere() {
      return this.where;
   }
   
   public void setProjectKey(final String projectKey) {this.projectKey = projectKey;}
   
   public ByProjectKeyCartsGet addCustomerId(final String customerId){
      this.customerId.add(customerId);
      return this;
   }
   
   public ByProjectKeyCartsGet withCustomerId(final List<String> customerId){
      this.customerId = customerId;
      return this;
   }
   
   public ByProjectKeyCartsGet addExpand(final String expand){
      this.expand.add(expand);
      return this;
   }
   
   public ByProjectKeyCartsGet withExpand(final List<String> expand){
      this.expand = expand;
      return this;
   }
   
   public ByProjectKeyCartsGet addSort(final String sort){
      this.sort.add(sort);
      return this;
   }
   
   public ByProjectKeyCartsGet withSort(final List<String> sort){
      this.sort = sort;
      return this;
   }
   
   public ByProjectKeyCartsGet addLimit(final Double limit){
      this.limit.add(limit);
      return this;
   }
   
   public ByProjectKeyCartsGet withLimit(final List<Double> limit){
      this.limit = limit;
      return this;
   }
   
   public ByProjectKeyCartsGet addOffset(final Double offset){
      this.offset.add(offset);
      return this;
   }
   
   public ByProjectKeyCartsGet withOffset(final List<Double> offset){
      this.offset = offset;
      return this;
   }
   
   public ByProjectKeyCartsGet addWithTotal(final Boolean withTotal){
      this.withTotal.add(withTotal);
      return this;
   }
   
   public ByProjectKeyCartsGet withWithTotal(final List<Boolean> withTotal){
      this.withTotal = withTotal;
      return this;
   }
   
   public ByProjectKeyCartsGet addWhere(final String where){
      this.where.add(where);
      return this;
   }
   
   public ByProjectKeyCartsGet withWhere(final List<String> where){
      this.where = where;
      return this;
   }
   
   public ByProjectKeyCartsGet addHeader(final String key, final String value) {
      this.headers.addHeader(key, value);
      return this;
   }
   
   public ByProjectKeyCartsGet withHeaders(final ApiHttpHeaders headers) {
      this.headers = headers;
      return this;
   }
   
   public String getHeaderValue(final String key) {
      return this.headers.getHeaderValue(key);
   }
   
   public ApiHttpHeaders getHeaders() {
      return this.headers;
   }
   
   public ByProjectKeyCartsGet addAdditionalQueryParam(final String additionalQueryParamKey, final String additionalQueryParamValue) {
      this.additionalQueryParams.put(additionalQueryParamKey, additionalQueryParamValue);
      return this;
   }
   
   public ByProjectKeyCartsGet setAdditionalQueryParams(final Map<String, String> additionalQueryParams) {
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
