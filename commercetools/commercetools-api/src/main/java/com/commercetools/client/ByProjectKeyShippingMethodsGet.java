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

public class ByProjectKeyShippingMethodsGet {
   
   
   private ApiHttpHeaders headers = new ApiHttpHeaders();
   private Map<String, String> additionalQueryParams = new HashMap<>();
   private final ApiHttpClient apiHttpClient; 
   private List<String> shippingMethodId = new ArrayList<>();
   private List<String> country = new ArrayList<>();
   private List<String> state = new ArrayList<>();
   private List<String> currency = new ArrayList<>();
   private List<String> expand = new ArrayList<>();
   private List<String> where = new ArrayList<>();
   private List<String> sort = new ArrayList<>();
   private List<Integer> limit = new ArrayList<>();
   private List<Integer> offset = new ArrayList<>();
   private List<Boolean> withTotal = new ArrayList<>();
   private String projectKey;
   
   
   public ByProjectKeyShippingMethodsGet(final ApiHttpClient apiHttpClient, String projectKey){
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
   }
   
   public ApiHttpRequest createHttpRequest() {
      ApiHttpRequest httpRequest = new ApiHttpRequest();
      List<String> params = new ArrayList<>();
      params.add(this.shippingMethodId.stream().map(s -> "shipping-methodId=" + urlEncode(s)).collect(Collectors.joining("&")));
      params.add(this.country.stream().map(s -> "country=" + urlEncode(s)).collect(Collectors.joining("&")));
      params.add(this.state.stream().map(s -> "state=" + urlEncode(s)).collect(Collectors.joining("&")));
      params.add(this.currency.stream().map(s -> "currency=" + urlEncode(s)).collect(Collectors.joining("&")));
      params.add(this.expand.stream().map(s -> "expand=" + urlEncode(s)).collect(Collectors.joining("&")));
      params.add(this.where.stream().map(s -> "where=" + urlEncode(s)).collect(Collectors.joining("&")));
      params.add(this.sort.stream().map(s -> "sort=" + urlEncode(s)).collect(Collectors.joining("&")));
      params.add(this.limit.stream().map(s -> "limit=" + s).collect(Collectors.joining("&")));
      params.add(this.offset.stream().map(s -> "offset=" + s).collect(Collectors.joining("&")));
      params.add(this.withTotal.stream().map(s -> "withTotal=" + s).collect(Collectors.joining("&")));
      params.add(additionalQueryParams.entrySet().stream().map(entry -> entry.getKey() + "=" + entry.getValue()).collect(Collectors.joining("&")));
      params.removeIf(String::isEmpty);
      String httpRequestPath = String.format("/%s/shipping-methods", this.projectKey);
      if(!params.isEmpty()){
         httpRequestPath += "?" + String.join("&", params);
      }
      httpRequest.setRelativeUrl(httpRequestPath); 
      httpRequest.setMethod(ApiHttpMethod.GET);
      httpRequest.setHeaders(headers);
      
      return httpRequest;
   }
   
   public ApiHttpResponse<com.commercetools.models.shipping_method.ShippingMethodPagedQueryResponse> executeBlocking(){
      try {
          return execute().get();
      } catch (Exception e) {
          throw new RuntimeException(e);
      }
   }
   
   public CompletableFuture<ApiHttpResponse<com.commercetools.models.shipping_method.ShippingMethodPagedQueryResponse>> execute(){
      return apiHttpClient.execute(this.createHttpRequest())
              .thenApply(response -> Utils.convertResponse(response,com.commercetools.models.shipping_method.ShippingMethodPagedQueryResponse.class));
   }
   
   public String getProjectKey() {return this.projectKey;}
   
   public List<String> getShippingMethodId() {
      return this.shippingMethodId;
   }
   
   public List<String> getCountry() {
      return this.country;
   }
   
   public List<String> getState() {
      return this.state;
   }
   
   public List<String> getCurrency() {
      return this.currency;
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
   
   public ByProjectKeyShippingMethodsGet addShippingMethodId(final String shippingMethodId){
      this.shippingMethodId.add(shippingMethodId);
      return this;
   }
   
   public ByProjectKeyShippingMethodsGet withShippingMethodId(final List<String> shippingMethodId){
      this.shippingMethodId = shippingMethodId;
      return this;
   }
   
   public ByProjectKeyShippingMethodsGet addCountry(final String country){
      this.country.add(country);
      return this;
   }
   
   public ByProjectKeyShippingMethodsGet withCountry(final List<String> country){
      this.country = country;
      return this;
   }
   
   public ByProjectKeyShippingMethodsGet addState(final String state){
      this.state.add(state);
      return this;
   }
   
   public ByProjectKeyShippingMethodsGet withState(final List<String> state){
      this.state = state;
      return this;
   }
   
   public ByProjectKeyShippingMethodsGet addCurrency(final String currency){
      this.currency.add(currency);
      return this;
   }
   
   public ByProjectKeyShippingMethodsGet withCurrency(final List<String> currency){
      this.currency = currency;
      return this;
   }
   
   public ByProjectKeyShippingMethodsGet addExpand(final String expand){
      this.expand.add(expand);
      return this;
   }
   
   public ByProjectKeyShippingMethodsGet withExpand(final List<String> expand){
      this.expand = expand;
      return this;
   }
   
   public ByProjectKeyShippingMethodsGet addWhere(final String where){
      this.where.add(where);
      return this;
   }
   
   public ByProjectKeyShippingMethodsGet withWhere(final List<String> where){
      this.where = where;
      return this;
   }
   
   public ByProjectKeyShippingMethodsGet addSort(final String sort){
      this.sort.add(sort);
      return this;
   }
   
   public ByProjectKeyShippingMethodsGet withSort(final List<String> sort){
      this.sort = sort;
      return this;
   }
   
   public ByProjectKeyShippingMethodsGet addLimit(final Integer limit){
      this.limit.add(limit);
      return this;
   }
   
   public ByProjectKeyShippingMethodsGet withLimit(final List<Integer> limit){
      this.limit = limit;
      return this;
   }
   
   public ByProjectKeyShippingMethodsGet addOffset(final Integer offset){
      this.offset.add(offset);
      return this;
   }
   
   public ByProjectKeyShippingMethodsGet withOffset(final List<Integer> offset){
      this.offset = offset;
      return this;
   }
   
   public ByProjectKeyShippingMethodsGet addWithTotal(final Boolean withTotal){
      this.withTotal.add(withTotal);
      return this;
   }
   
   public ByProjectKeyShippingMethodsGet withWithTotal(final List<Boolean> withTotal){
      this.withTotal = withTotal;
      return this;
   }
   
   public ByProjectKeyShippingMethodsGet addHeader(final String key, final String value) {
      this.headers.addHeader(key, value);
      return this;
   }
   
   public ByProjectKeyShippingMethodsGet withHeaders(final ApiHttpHeaders headers) {
      this.headers = headers;
      return this;
   }
   
   public String getHeaderValue(final String key) {
      return this.headers.getHeaderValue(key);
   }
   
   public ApiHttpHeaders getHeaders() {
      return this.headers;
   }
   
   public ByProjectKeyShippingMethodsGet addAdditionalQueryParam(final String additionalQueryParamKey, final String additionalQueryParamValue) {
      this.additionalQueryParams.put(additionalQueryParamKey, additionalQueryParamValue);
      return this;
   }
   
   public ByProjectKeyShippingMethodsGet setAdditionalQueryParams(final Map<String, String> additionalQueryParams) {
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