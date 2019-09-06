package com.commercetools.client;

import client.ApiHttpRequest;
import client.ApiHttpMethod;
import client.ApiHttpHeaders;
import client.ApiHttpResponse;
import json.CommercetoolsJsonUtils;

import java.io.IOException;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.stream.Collectors;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import client.*;

public class ByProjectKeyInStoreKeyByStoreKeyMeCartsPost {
   
   
   private ApiHttpHeaders headers = new ApiHttpHeaders();
   private Map<String, String> additionalQueryParams = new HashMap<>();
   private final ApiHttpClient apiHttpClient; 
   private List<String> expand = new ArrayList<>();
   private String projectKey;
   private String storeKey;
   
   private com.commercetools.models.Me.MyCartDraft myCartDraft;
   
   public ByProjectKeyInStoreKeyByStoreKeyMeCartsPost(final ApiHttpClient apiHttpClient, String projectKey, String storeKey, com.commercetools.models.Me.MyCartDraft myCartDraft){
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
      this.storeKey = storeKey;
      this.myCartDraft = myCartDraft;
   }
   
   public ApiHttpRequest createHttpRequest() {
      ApiHttpRequest httpRequest = new ApiHttpRequest();
      List<String> params = new ArrayList<>();
      params.add(this.expand.stream().map(s -> "expand=" + urlEncode(s)).collect(Collectors.joining("&")));
      params.add(additionalQueryParams.entrySet().stream().map(entry -> entry.getKey() + "=" + entry.getValue()).collect(Collectors.joining("&")));
      params.removeIf(String::isEmpty);
      String httpRequestPath = String.format("/%s/in-store/key=%s/me/carts", this.projectKey, this.storeKey);
      if(!params.isEmpty()){
         httpRequestPath += "?" + String.join("&", params);
      }
      httpRequest.setPath(httpRequestPath); 
      httpRequest.setMethod(ApiHttpMethod.POST);
      httpRequest.setHeaders(headers);
      try{httpRequest.setBody(CommercetoolsJsonUtils.toJsonString(myCartDraft));}catch(Exception e){e.printStackTrace();}
      return httpRequest;
   }
   
   public com.commercetools.models.Cart.Cart executeBlocking() {
      ApiHttpResponse response;
      try {
         response = apiHttpClient.executeBlocking(this.createHttpRequest());
         return CommercetoolsJsonUtils.fromJsonString(response.getBody(),  com.commercetools.models.Cart.Cart.class);
      } catch (Exception e) {
         e.printStackTrace();
      }
      return null;
   }
   
   public String getProjectKey() {return this.projectKey;}
   public String getStoreKey() {return this.storeKey;}
   
   public List<String> getExpand() {
      return this.expand;
   }
   
   public void setProjectKey(final String projectKey) {this.projectKey = projectKey;}
   
   public void setStoreKey(final String storeKey) {this.storeKey = storeKey;}
   
   public ByProjectKeyInStoreKeyByStoreKeyMeCartsPost addExpand(final String expand){
      this.expand.add(expand);
      return this;
   }
   
   public ByProjectKeyInStoreKeyByStoreKeyMeCartsPost withExpand(final List<String> expand){
      this.expand = expand;
      return this;
   }
   
   public ByProjectKeyInStoreKeyByStoreKeyMeCartsPost addHeader(final String key, final String value) {
      this.headers.addHeader(key, value);
      return this;
   }
   
   public ByProjectKeyInStoreKeyByStoreKeyMeCartsPost withHeaders(final ApiHttpHeaders headers) {
      this.headers = headers;
      return this;
   }
   
   public String getHeaderValue(final String key) {
      return this.headers.getHeaderValue(key);
   }
   
   public ApiHttpHeaders getHeaders() {
      return this.headers;
   }
   
   public ByProjectKeyInStoreKeyByStoreKeyMeCartsPost addAdditionalQueryParam(final String additionalQueryParamKey, final String additionalQueryParamValue) {
      this.additionalQueryParams.put(additionalQueryParamKey, additionalQueryParamValue);
      return this;
   }
   
   public ByProjectKeyInStoreKeyByStoreKeyMeCartsPost setAdditionalQueryParams(final Map<String, String> additionalQueryParams) {
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