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

public class ByProjectKeyProductsKeyByKeyPost {
   
   
   private ApiHttpHeaders headers = new ApiHttpHeaders();
   private Map<String, String> additionalQueryParams = new HashMap<>();
   private final ApiHttpClient apiHttpClient; 
   private List<String> priceCurrency = new ArrayList<>();
   private List<String> priceCountry = new ArrayList<>();
   private List<String> priceCustomerGroup = new ArrayList<>();
   private List<String> priceChannel = new ArrayList<>();
   private List<String> expand = new ArrayList<>();
   private String projectKey;
   private String key;
   
   private com.commercetools.models.product.ProductUpdate productUpdate;
   
   public ByProjectKeyProductsKeyByKeyPost(final ApiHttpClient apiHttpClient, String projectKey, String key, com.commercetools.models.product.ProductUpdate productUpdate){
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
      this.key = key;
      this.productUpdate = productUpdate;
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
      String httpRequestPath = String.format("/%s/products/key=%s", this.projectKey, this.key);
      if(!params.isEmpty()){
         httpRequestPath += "?" + String.join("&", params);
      }
      httpRequest.setRelativeUrl(httpRequestPath); 
      httpRequest.setMethod(ApiHttpMethod.POST);
      httpRequest.setHeaders(headers);
      try{httpRequest.setBody(VrapJsonUtils.toJsonByteArray(productUpdate));}catch(Exception e){e.printStackTrace();}
      return httpRequest;
   }
   
   public ApiHttpResponse<com.commercetools.models.product.Product> executeBlocking(){
      try {
          return execute().get();
      } catch (Exception e) {
          throw new RuntimeException(e);
      }
   }
   
   public CompletableFuture<ApiHttpResponse<com.commercetools.models.product.Product>> execute(){
      return apiHttpClient.execute(this.createHttpRequest())
              .thenApply(response -> Utils.convertResponse(response,com.commercetools.models.product.Product.class));
   }
   
   public String getProjectKey() {return this.projectKey;}
   public String getKey() {return this.key;}
   
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
   
   public void setKey(final String key) {this.key = key;}
   
   public ByProjectKeyProductsKeyByKeyPost addPriceCurrency(final String priceCurrency){
      this.priceCurrency.add(priceCurrency);
      return this;
   }
   
   public ByProjectKeyProductsKeyByKeyPost withPriceCurrency(final List<String> priceCurrency){
      this.priceCurrency = priceCurrency;
      return this;
   }
   
   public ByProjectKeyProductsKeyByKeyPost addPriceCountry(final String priceCountry){
      this.priceCountry.add(priceCountry);
      return this;
   }
   
   public ByProjectKeyProductsKeyByKeyPost withPriceCountry(final List<String> priceCountry){
      this.priceCountry = priceCountry;
      return this;
   }
   
   public ByProjectKeyProductsKeyByKeyPost addPriceCustomerGroup(final String priceCustomerGroup){
      this.priceCustomerGroup.add(priceCustomerGroup);
      return this;
   }
   
   public ByProjectKeyProductsKeyByKeyPost withPriceCustomerGroup(final List<String> priceCustomerGroup){
      this.priceCustomerGroup = priceCustomerGroup;
      return this;
   }
   
   public ByProjectKeyProductsKeyByKeyPost addPriceChannel(final String priceChannel){
      this.priceChannel.add(priceChannel);
      return this;
   }
   
   public ByProjectKeyProductsKeyByKeyPost withPriceChannel(final List<String> priceChannel){
      this.priceChannel = priceChannel;
      return this;
   }
   
   public ByProjectKeyProductsKeyByKeyPost addExpand(final String expand){
      this.expand.add(expand);
      return this;
   }
   
   public ByProjectKeyProductsKeyByKeyPost withExpand(final List<String> expand){
      this.expand = expand;
      return this;
   }
   
   public ByProjectKeyProductsKeyByKeyPost addHeader(final String key, final String value) {
      this.headers.addHeader(key, value);
      return this;
   }
   
   public ByProjectKeyProductsKeyByKeyPost withHeaders(final ApiHttpHeaders headers) {
      this.headers = headers;
      return this;
   }
   
   public String getHeaderValue(final String key) {
      return this.headers.getHeaderValue(key);
   }
   
   public ApiHttpHeaders getHeaders() {
      return this.headers;
   }
   
   public ByProjectKeyProductsKeyByKeyPost addAdditionalQueryParam(final String additionalQueryParamKey, final String additionalQueryParamValue) {
      this.additionalQueryParams.put(additionalQueryParamKey, additionalQueryParamValue);
      return this;
   }
   
   public ByProjectKeyProductsKeyByKeyPost setAdditionalQueryParams(final Map<String, String> additionalQueryParams) {
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