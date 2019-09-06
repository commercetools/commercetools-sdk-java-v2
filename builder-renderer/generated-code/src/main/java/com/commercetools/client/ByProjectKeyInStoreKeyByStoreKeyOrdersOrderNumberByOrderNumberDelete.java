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

public class ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberDelete {
   
   
   private ApiHttpHeaders headers = new ApiHttpHeaders();
   private Map<String, String> additionalQueryParams = new HashMap<>();
   private final ApiHttpClient apiHttpClient; 
   private List<Boolean> dataErasure = new ArrayList<>();
   private List<Long> version = new ArrayList<>();
   private List<String> expand = new ArrayList<>();
   private String projectKey;
   private String storeKey;
   private String orderNumber;
   
   
   public ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberDelete(final ApiHttpClient apiHttpClient, String projectKey, String storeKey, String orderNumber){
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
      this.storeKey = storeKey;
      this.orderNumber = orderNumber;
   }
   
   public ApiHttpRequest createHttpRequest() {
      ApiHttpRequest httpRequest = new ApiHttpRequest();
      List<String> params = new ArrayList<>();
      params.add(this.dataErasure.stream().map(s -> "dataErasure=" + s).collect(Collectors.joining("&")));
      params.add(this.version.stream().map(s -> "version=" + s).collect(Collectors.joining("&")));
      params.add(this.expand.stream().map(s -> "expand=" + urlEncode(s)).collect(Collectors.joining("&")));
      params.add(additionalQueryParams.entrySet().stream().map(entry -> entry.getKey() + "=" + entry.getValue()).collect(Collectors.joining("&")));
      params.removeIf(String::isEmpty);
      String httpRequestPath = String.format("/%s/in-store/key=%s/orders/order-number=%s", this.projectKey, this.storeKey, this.orderNumber);
      if(!params.isEmpty()){
         httpRequestPath += "?" + String.join("&", params);
      }
      httpRequest.setPath(httpRequestPath); 
      httpRequest.setMethod(ApiHttpMethod.DELETE);
      httpRequest.setHeaders(headers);
      
      return httpRequest;
   }
   
   public com.commercetools.models.Order.Order executeBlocking() {
      ApiHttpResponse response;
      try {
         response = apiHttpClient.executeBlocking(this.createHttpRequest());
         return CommercetoolsJsonUtils.fromJsonString(response.getBody(),  com.commercetools.models.Order.Order.class);
      } catch (Exception e) {
         e.printStackTrace();
      }
      return null;
   }
   
   public String getProjectKey() {return this.projectKey;}
   public String getStoreKey() {return this.storeKey;}
   public String getOrderNumber() {return this.orderNumber;}
   
   public List<Boolean> getDataErasure() {
      return this.dataErasure;
   }
   
   public List<Long> getVersion() {
      return this.version;
   }
   
   public List<String> getExpand() {
      return this.expand;
   }
   
   public void setProjectKey(final String projectKey) {this.projectKey = projectKey;}
   
   public void setStoreKey(final String storeKey) {this.storeKey = storeKey;}
   
   public void setOrderNumber(final String orderNumber) {this.orderNumber = orderNumber;}
   
   public ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberDelete addDataErasure(final Boolean dataErasure){
      this.dataErasure.add(dataErasure);
      return this;
   }
   
   public ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberDelete withDataErasure(final List<Boolean> dataErasure){
      this.dataErasure = dataErasure;
      return this;
   }
   
   public ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberDelete addVersion(final Long version){
      this.version.add(version);
      return this;
   }
   
   public ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberDelete withVersion(final List<Long> version){
      this.version = version;
      return this;
   }
   
   public ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberDelete addExpand(final String expand){
      this.expand.add(expand);
      return this;
   }
   
   public ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberDelete withExpand(final List<String> expand){
      this.expand = expand;
      return this;
   }
   
   public ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberDelete addHeader(final String key, final String value) {
      this.headers.addHeader(key, value);
      return this;
   }
   
   public ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberDelete withHeaders(final ApiHttpHeaders headers) {
      this.headers = headers;
      return this;
   }
   
   public String getHeaderValue(final String key) {
      return this.headers.getHeaderValue(key);
   }
   
   public ApiHttpHeaders getHeaders() {
      return this.headers;
   }
   
   public ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberDelete addAdditionalQueryParam(final String additionalQueryParamKey, final String additionalQueryParamValue) {
      this.additionalQueryParams.put(additionalQueryParamKey, additionalQueryParamValue);
      return this;
   }
   
   public ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberDelete setAdditionalQueryParams(final Map<String, String> additionalQueryParams) {
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