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

public class ByProjectKeyInStoreKeyByStoreKeyCartsGet {
   
   
   private ApiHttpHeaders headers = new ApiHttpHeaders();
   private Map<String, String> additionalQueryParams = new HashMap<>();
   private final ApiHttpClient apiHttpClient; 
   private List<String> customerId = new ArrayList<>();
   private List<String> expand = new ArrayList<>();
   private List<String> where = new ArrayList<>();
   private List<String> sort = new ArrayList<>();
   private List<Integer> limit = new ArrayList<>();
   private List<Integer> offset = new ArrayList<>();
   private List<Boolean> withTotal = new ArrayList<>();
   private String projectKey;
   private String storeKey;
   
   
   public ByProjectKeyInStoreKeyByStoreKeyCartsGet(final ApiHttpClient apiHttpClient, String projectKey, String storeKey){
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
      this.storeKey = storeKey;
   }
   
   public ApiHttpRequest createHttpRequest() {
      ApiHttpRequest httpRequest = new ApiHttpRequest();
      List<String> params = new ArrayList<>();
      params.add(this.customerId.stream().map(s -> "customerId=" + urlEncode(s)).collect(Collectors.joining("&")));
      params.add(this.expand.stream().map(s -> "expand=" + urlEncode(s)).collect(Collectors.joining("&")));
      params.add(this.where.stream().map(s -> "where=" + urlEncode(s)).collect(Collectors.joining("&")));
      params.add(this.sort.stream().map(s -> "sort=" + urlEncode(s)).collect(Collectors.joining("&")));
      params.add(this.limit.stream().map(s -> "limit=" + s).collect(Collectors.joining("&")));
      params.add(this.offset.stream().map(s -> "offset=" + s).collect(Collectors.joining("&")));
      params.add(this.withTotal.stream().map(s -> "withTotal=" + s).collect(Collectors.joining("&")));
      params.add(additionalQueryParams.entrySet().stream().map(entry -> entry.getKey() + "=" + entry.getValue()).collect(Collectors.joining("&")));
      params.removeIf(String::isEmpty);
      String httpRequestPath = String.format("/%s/in-store/key=%s/carts", this.projectKey, this.storeKey);
      if(!params.isEmpty()){
         httpRequestPath += "?" + String.join("&", params);
      }
      httpRequest.setPath(httpRequestPath); 
      httpRequest.setMethod(ApiHttpMethod.GET);
      httpRequest.setHeaders(headers);
      
      return httpRequest;
   }
   
   public java.lang.Object executeBlocking() {
      ApiHttpResponse response;
      try {
         response = apiHttpClient.executeBlocking(this.createHttpRequest());
         return CommercetoolsJsonUtils.fromJsonString(response.getBody(),  java.lang.Object.class);
      } catch (Exception e) {
         e.printStackTrace();
      }
      return null;
   }
   
   public String getProjectKey() {return this.projectKey;}
   public String getStoreKey() {return this.storeKey;}
   
   public List<String> getCustomerId() {
      return this.customerId;
   }
   
   public List<String> getExpand() {
      return this.expand;
   }
   
   public List<String> getWhere() {
      return this.where;
   }
   
   public List<String> getSort() {
      return this.sort;
   }
   
   public List<Integer> getLimit() {
      return this.limit;
   }
   
   public List<Integer> getOffset() {
      return this.offset;
   }
   
   public List<Boolean> getWithTotal() {
      return this.withTotal;
   }
   
   public void setProjectKey(final String projectKey) {this.projectKey = projectKey;}
   
   public void setStoreKey(final String storeKey) {this.storeKey = storeKey;}
   
   public ByProjectKeyInStoreKeyByStoreKeyCartsGet addCustomerId(final String customerId){
      this.customerId.add(customerId);
      return this;
   }
   
   public ByProjectKeyInStoreKeyByStoreKeyCartsGet withCustomerId(final List<String> customerId){
      this.customerId = customerId;
      return this;
   }
   
   public ByProjectKeyInStoreKeyByStoreKeyCartsGet addExpand(final String expand){
      this.expand.add(expand);
      return this;
   }
   
   public ByProjectKeyInStoreKeyByStoreKeyCartsGet withExpand(final List<String> expand){
      this.expand = expand;
      return this;
   }
   
   public ByProjectKeyInStoreKeyByStoreKeyCartsGet addWhere(final String where){
      this.where.add(where);
      return this;
   }
   
   public ByProjectKeyInStoreKeyByStoreKeyCartsGet withWhere(final List<String> where){
      this.where = where;
      return this;
   }
   
   public ByProjectKeyInStoreKeyByStoreKeyCartsGet addSort(final String sort){
      this.sort.add(sort);
      return this;
   }
   
   public ByProjectKeyInStoreKeyByStoreKeyCartsGet withSort(final List<String> sort){
      this.sort = sort;
      return this;
   }
   
   public ByProjectKeyInStoreKeyByStoreKeyCartsGet addLimit(final Integer limit){
      this.limit.add(limit);
      return this;
   }
   
   public ByProjectKeyInStoreKeyByStoreKeyCartsGet withLimit(final List<Integer> limit){
      this.limit = limit;
      return this;
   }
   
   public ByProjectKeyInStoreKeyByStoreKeyCartsGet addOffset(final Integer offset){
      this.offset.add(offset);
      return this;
   }
   
   public ByProjectKeyInStoreKeyByStoreKeyCartsGet withOffset(final List<Integer> offset){
      this.offset = offset;
      return this;
   }
   
   public ByProjectKeyInStoreKeyByStoreKeyCartsGet addWithTotal(final Boolean withTotal){
      this.withTotal.add(withTotal);
      return this;
   }
   
   public ByProjectKeyInStoreKeyByStoreKeyCartsGet withWithTotal(final List<Boolean> withTotal){
      this.withTotal = withTotal;
      return this;
   }
   
   public ByProjectKeyInStoreKeyByStoreKeyCartsGet addHeader(final String key, final String value) {
      this.headers.addHeader(key, value);
      return this;
   }
   
   public ByProjectKeyInStoreKeyByStoreKeyCartsGet withHeaders(final ApiHttpHeaders headers) {
      this.headers = headers;
      return this;
   }
   
   public String getHeaderValue(final String key) {
      return this.headers.getHeaderValue(key);
   }
   
   public ApiHttpHeaders getHeaders() {
      return this.headers;
   }
   
   public ByProjectKeyInStoreKeyByStoreKeyCartsGet addAdditionalQueryParam(final String additionalQueryParamKey, final String additionalQueryParamValue) {
      this.additionalQueryParams.put(additionalQueryParamKey, additionalQueryParamValue);
      return this;
   }
   
   public ByProjectKeyInStoreKeyByStoreKeyCartsGet setAdditionalQueryParams(final Map<String, String> additionalQueryParams) {
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