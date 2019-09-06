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

public class ByProjectKeyProductsPost {
   
   
   private ApiHttpHeaders headers = new ApiHttpHeaders();
   private Map<String, String> additionalQueryParams = new HashMap<>();
   private final ApiHttpClient apiHttpClient; 
   private List<String> priceCurrency = new ArrayList<>();
   private List<String> priceCountry = new ArrayList<>();
   private List<String> priceCustomerGroup = new ArrayList<>();
   private List<String> priceChannel = new ArrayList<>();
   private List<String> expand = new ArrayList<>();
   private String projectKey;
   
   private com.commercetools.models.Product.ProductDraft productDraft;
   
   public ByProjectKeyProductsPost(final ApiHttpClient apiHttpClient, String projectKey, com.commercetools.models.Product.ProductDraft productDraft){
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
      this.productDraft = productDraft;
   }
   
   public ApiHttpRequest createHttpRequest() {
      ApiHttpRequest httpRequest = new ApiHttpRequest();
      List<String> params = new ArrayList<>();
      params.add(this.priceCurrency.stream().map(s -> "priceCurrency=" + urlEncode(s)).collect(Collectors.joining("&")));
      params.add(this.priceCountry.stream().map(s -> "priceCountry=" + urlEncode(s)).collect(Collectors.joining("&")));
      params.add(this.priceCustomerGroup.stream().map(s -> "priceCustomerGroup=" + urlEncode(s)).collect(Collectors.joining("&")));
      params.add(this.priceChannel.stream().map(s -> "priceChannel=" + urlEncode(s)).collect(Collectors.joining("&")));
      params.add(this.expand.stream().map(s -> "expand=" + urlEncode(s)).collect(Collectors.joining("&")));
      params.add(additionalQueryParams.entrySet().stream().map(entry -> entry.getKey() + "=" + entry.getValue()).collect(Collectors.joining("&")));
      params.removeIf(String::isEmpty);
      String httpRequestPath = String.format("/%s/products", this.projectKey);
      if(!params.isEmpty()){
         httpRequestPath += "?" + String.join("&", params);
      }
      httpRequest.setPath(httpRequestPath); 
      httpRequest.setMethod(ApiHttpMethod.POST);
      httpRequest.setHeaders(headers);
      try{httpRequest.setBody(CommercetoolsJsonUtils.toJsonString(productDraft));}catch(Exception e){e.printStackTrace();}
      return httpRequest;
   }
   
   public com.commercetools.models.Product.Product executeBlocking() {
      ApiHttpResponse response;
      try {
         response = apiHttpClient.executeBlocking(this.createHttpRequest());
         return CommercetoolsJsonUtils.fromJsonString(response.getBody(),  com.commercetools.models.Product.Product.class);
      } catch (Exception e) {
         e.printStackTrace();
      }
      return null;
   }
   
   public String getProjectKey() {return this.projectKey;}
   
   public List<String> getPriceCurrency() {
      return this.priceCurrency;
   }
   
   public List<String> getPriceCountry() {
      return this.priceCountry;
   }
   
   public List<String> getPriceCustomerGroup() {
      return this.priceCustomerGroup;
   }
   
   public List<String> getPriceChannel() {
      return this.priceChannel;
   }
   
   public List<String> getExpand() {
      return this.expand;
   }
   
   public void setProjectKey(final String projectKey) {this.projectKey = projectKey;}
   
   public ByProjectKeyProductsPost addPriceCurrency(final String priceCurrency){
      this.priceCurrency.add(priceCurrency);
      return this;
   }
   
   public ByProjectKeyProductsPost withPriceCurrency(final List<String> priceCurrency){
      this.priceCurrency = priceCurrency;
      return this;
   }
   
   public ByProjectKeyProductsPost addPriceCountry(final String priceCountry){
      this.priceCountry.add(priceCountry);
      return this;
   }
   
   public ByProjectKeyProductsPost withPriceCountry(final List<String> priceCountry){
      this.priceCountry = priceCountry;
      return this;
   }
   
   public ByProjectKeyProductsPost addPriceCustomerGroup(final String priceCustomerGroup){
      this.priceCustomerGroup.add(priceCustomerGroup);
      return this;
   }
   
   public ByProjectKeyProductsPost withPriceCustomerGroup(final List<String> priceCustomerGroup){
      this.priceCustomerGroup = priceCustomerGroup;
      return this;
   }
   
   public ByProjectKeyProductsPost addPriceChannel(final String priceChannel){
      this.priceChannel.add(priceChannel);
      return this;
   }
   
   public ByProjectKeyProductsPost withPriceChannel(final List<String> priceChannel){
      this.priceChannel = priceChannel;
      return this;
   }
   
   public ByProjectKeyProductsPost addExpand(final String expand){
      this.expand.add(expand);
      return this;
   }
   
   public ByProjectKeyProductsPost withExpand(final List<String> expand){
      this.expand = expand;
      return this;
   }
   
   public ByProjectKeyProductsPost addHeader(final String key, final String value) {
      this.headers.addHeader(key, value);
      return this;
   }
   
   public ByProjectKeyProductsPost withHeaders(final ApiHttpHeaders headers) {
      this.headers = headers;
      return this;
   }
   
   public String getHeaderValue(final String key) {
      return this.headers.getHeaderValue(key);
   }
   
   public ApiHttpHeaders getHeaders() {
      return this.headers;
   }
   
   public ByProjectKeyProductsPost addAdditionalQueryParam(final String additionalQueryParamKey, final String additionalQueryParamValue) {
      this.additionalQueryParams.put(additionalQueryParamKey, additionalQueryParamValue);
      return this;
   }
   
   public ByProjectKeyProductsPost setAdditionalQueryParams(final Map<String, String> additionalQueryParams) {
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