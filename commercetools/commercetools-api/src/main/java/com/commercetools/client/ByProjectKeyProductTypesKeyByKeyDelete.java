package com.commercetools.client;

import io.vrap.rmf.base.client.utils.Utils;
import io.vrap.rmf.base.client.utils.json.VrapJsonUtils;

import java.io.InputStream;
import java.io.IOException;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.concurrent.CompletableFuture;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import io.vrap.rmf.base.client.*;

public class ByProjectKeyProductTypesKeyByKeyDelete {
   
   
   private ApiHttpHeaders headers = new ApiHttpHeaders();
   private Map<String, String> additionalQueryParams = new HashMap<>();
   private final ApiHttpClient apiHttpClient; 
   private List<Long> version = new ArrayList<>();
   private List<String> expand = new ArrayList<>();
   private String projectKey;
   private String key;
   
   
   public ByProjectKeyProductTypesKeyByKeyDelete(final ApiHttpClient apiHttpClient, String projectKey, String key){
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
      this.key = key;
   }
   
   public ApiHttpRequest createHttpRequest() {
      ApiHttpRequest httpRequest = new ApiHttpRequest();
      List<String> params = new ArrayList<>();
      params.add(this.version.stream().map(s -> "version=" + s).collect(Collectors.joining("&")));
      params.add(this.expand.stream().map(s -> "expand=" + urlEncode(s)).collect(Collectors.joining("&")));
      params.add(additionalQueryParams.entrySet().stream().map(entry -> entry.getKey() + "=" + entry.getValue()).collect(Collectors.joining("&")));
      params.removeIf(String::isEmpty);
      String httpRequestPath = String.format("/%s/product-types/key=%s", this.projectKey, this.key);
      if(!params.isEmpty()){
         httpRequestPath += "?" + String.join("&", params);
      }
      httpRequest.setRelativeUrl(httpRequestPath); 
      httpRequest.setMethod(ApiHttpMethod.DELETE);
      httpRequest.setHeaders(headers);
      
      return httpRequest;
   }
   
   public ApiHttpResponse<com.commercetools.models.product_type.ProductType> executeBlocking(){
      try {
          return execute().get();
      } catch (Exception e) {
          throw new RuntimeException(e);
      }
   }
   
   public CompletableFuture<ApiHttpResponse<com.commercetools.models.product_type.ProductType>> execute(){
      return apiHttpClient.execute(this.createHttpRequest())
              .thenApply(response -> {
                  if(response.getStatusCode() == 409){
      try{
          com.commercetools.models.error.ErrorResponse errorResponse = VrapJsonUtils.fromJsonString(new String(response.getBody()), com.commercetools.models.error.ErrorResponse.class);
          throw new RuntimeException(errorResponse.getMessage());
      }catch(Exception e){
          e.printStackTrace();
          throw new RuntimeException(e.getMessage());
      }
   }
   
   if(response.getStatusCode() == 400){
      try{
          com.commercetools.models.error.ErrorResponse errorResponse = VrapJsonUtils.fromJsonString(new String(response.getBody()), com.commercetools.models.error.ErrorResponse.class);
          throw new RuntimeException(errorResponse.getMessage());
      }catch(Exception e){
          e.printStackTrace();
          throw new RuntimeException(e.getMessage());
      }
   }
   
   if(response.getStatusCode() == 401){
      try{
          com.commercetools.models.error.ErrorResponse errorResponse = VrapJsonUtils.fromJsonString(new String(response.getBody()), com.commercetools.models.error.ErrorResponse.class);
          throw new RuntimeException(errorResponse.getMessage());
      }catch(Exception e){
          e.printStackTrace();
          throw new RuntimeException(e.getMessage());
      }
   }
   
   if(response.getStatusCode() == 403){
      try{
          com.commercetools.models.error.ErrorResponse errorResponse = VrapJsonUtils.fromJsonString(new String(response.getBody()), com.commercetools.models.error.ErrorResponse.class);
          throw new RuntimeException(errorResponse.getMessage());
      }catch(Exception e){
          e.printStackTrace();
          throw new RuntimeException(e.getMessage());
      }
   }
   
   if(response.getStatusCode() == 404){
      throw new RuntimeException("Response status code : " + 404);
   }
   
   if(response.getStatusCode() == 500){
      try{
          com.commercetools.models.error.ErrorResponse errorResponse = VrapJsonUtils.fromJsonString(new String(response.getBody()), com.commercetools.models.error.ErrorResponse.class);
          throw new RuntimeException(errorResponse.getMessage());
      }catch(Exception e){
          e.printStackTrace();
          throw new RuntimeException(e.getMessage());
      }
   }
   
   if(response.getStatusCode() == 503){
      try{
          com.commercetools.models.error.ErrorResponse errorResponse = VrapJsonUtils.fromJsonString(new String(response.getBody()), com.commercetools.models.error.ErrorResponse.class);
          throw new RuntimeException(errorResponse.getMessage());
      }catch(Exception e){
          e.printStackTrace();
          throw new RuntimeException(e.getMessage());
      }
   }
                  return Utils.convertResponse(response,com.commercetools.models.product_type.ProductType.class);
              });
   }
   
   public String getProjectKey() {return this.projectKey;}
   public String getKey() {return this.key;}
   
   public List<Long> getVersion() {
      return this.version;
   }
   
   public List<String> getExpand() {
      return this.expand;
   }
   
   public void setProjectKey(final String projectKey) {this.projectKey = projectKey;}
   
   public void setKey(final String key) {this.key = key;}
   
   public ByProjectKeyProductTypesKeyByKeyDelete addVersion(final Long version){
      this.version.add(version);
      return this;
   }
   
   public ByProjectKeyProductTypesKeyByKeyDelete withVersion(final List<Long> version){
      this.version = version;
      return this;
   }
   
   public ByProjectKeyProductTypesKeyByKeyDelete addExpand(final String expand){
      this.expand.add(expand);
      return this;
   }
   
   public ByProjectKeyProductTypesKeyByKeyDelete withExpand(final List<String> expand){
      this.expand = expand;
      return this;
   }
   
   public ByProjectKeyProductTypesKeyByKeyDelete addHeader(final String key, final String value) {
      this.headers.addHeader(key, value);
      return this;
   }
   
   public ByProjectKeyProductTypesKeyByKeyDelete withHeaders(final ApiHttpHeaders headers) {
      this.headers = headers;
      return this;
   }
   
   public String getHeaderValue(final String key) {
      return this.headers.getHeaderValue(key);
   }
   
   public ApiHttpHeaders getHeaders() {
      return this.headers;
   }
   
   public ByProjectKeyProductTypesKeyByKeyDelete addAdditionalQueryParam(final String additionalQueryParamKey, final String additionalQueryParamValue) {
      this.additionalQueryParams.put(additionalQueryParamKey, additionalQueryParamValue);
      return this;
   }
   
   public ByProjectKeyProductTypesKeyByKeyDelete setAdditionalQueryParams(final Map<String, String> additionalQueryParams) {
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