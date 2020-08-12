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


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyShippingMethodsMatchingLocationGet {
   
   
   private ApiHttpHeaders headers = new ApiHttpHeaders();
   private Map<String, String> additionalQueryParams = new HashMap<>();
   private final ApiHttpClient apiHttpClient; 
   private List<String> country = new ArrayList<>();
   private List<String> state = new ArrayList<>();
   private List<String> currency = new ArrayList<>();
   private List<String> expand = new ArrayList<>();
   private String projectKey;
   
   
   public ByProjectKeyShippingMethodsMatchingLocationGet(final ApiHttpClient apiHttpClient, String projectKey){
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
   }
   
   public ApiHttpRequest createHttpRequest() {
      ApiHttpRequest httpRequest = new ApiHttpRequest();
      List<String> params = new ArrayList<>();
      params.add(this.country.stream().map(s -> "country=" + urlEncode(s)).collect(Collectors.joining("&")));
      params.add(this.state.stream().map(s -> "state=" + urlEncode(s)).collect(Collectors.joining("&")));
      params.add(this.currency.stream().map(s -> "currency=" + urlEncode(s)).collect(Collectors.joining("&")));
      params.add(this.expand.stream().map(s -> "expand=" + urlEncode(s)).collect(Collectors.joining("&")));
      params.add(additionalQueryParams.entrySet().stream().map(entry -> entry.getKey() + "=" + entry.getValue()).collect(Collectors.joining("&")));
      params.removeIf(String::isEmpty);
      String httpRequestPath = String.format("/%s/shipping-methods/matching-location", this.projectKey);
      if(!params.isEmpty()){
         httpRequestPath += "?" + String.join("&", params);
      }
      httpRequest.setRelativeUrl(httpRequestPath); 
      httpRequest.setMethod(ApiHttpMethod.GET);
      httpRequest.setHeaders(headers);
      
      return httpRequest;
   }
   
   public ApiHttpResponse<com.commercetools.api.models.shipping_method.ShippingMethodPagedQueryResponse> executeBlocking(){
      try {
          return execute().get();
      } catch (Exception e) {
          throw new RuntimeException(e);
      }
   }
   
   public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.shipping_method.ShippingMethodPagedQueryResponse>> execute(){
      return apiHttpClient.execute(this.createHttpRequest())
              .thenApply(response -> {
                  if(response.getStatusCode() >= 400){
                      throw new ApiHttpException(response.getStatusCode(), new String(response.getBody()), response.getHeaders());
                  }
                  return Utils.convertResponse(response,com.commercetools.api.models.shipping_method.ShippingMethodPagedQueryResponse.class);
              });
   }
   
   public String getProjectKey() {return this.projectKey;}
   
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
   
   public void setProjectKey(final String projectKey) {this.projectKey = projectKey;}
   
   public ByProjectKeyShippingMethodsMatchingLocationGet addCountry(final String country){
      this.country.add(country);
      return this;
   }
   
   public ByProjectKeyShippingMethodsMatchingLocationGet withCountry(final List<String> country){
      this.country = country;
      return this;
   }
   
   public ByProjectKeyShippingMethodsMatchingLocationGet addState(final String state){
      this.state.add(state);
      return this;
   }
   
   public ByProjectKeyShippingMethodsMatchingLocationGet withState(final List<String> state){
      this.state = state;
      return this;
   }
   
   public ByProjectKeyShippingMethodsMatchingLocationGet addCurrency(final String currency){
      this.currency.add(currency);
      return this;
   }
   
   public ByProjectKeyShippingMethodsMatchingLocationGet withCurrency(final List<String> currency){
      this.currency = currency;
      return this;
   }
   
   public ByProjectKeyShippingMethodsMatchingLocationGet addExpand(final String expand){
      this.expand.add(expand);
      return this;
   }
   
   public ByProjectKeyShippingMethodsMatchingLocationGet withExpand(final List<String> expand){
      this.expand = expand;
      return this;
   }
   
   public ByProjectKeyShippingMethodsMatchingLocationGet addHeader(final String key, final String value) {
      this.headers.addHeader(key, value);
      return this;
   }
   
   public ByProjectKeyShippingMethodsMatchingLocationGet withHeaders(final ApiHttpHeaders headers) {
      this.headers = headers;
      return this;
   }
   
   public String getHeaderValue(final String key) {
      return this.headers.getHeaderValue(key);
   }
   
   public ApiHttpHeaders getHeaders() {
      return this.headers;
   }
   
   public ByProjectKeyShippingMethodsMatchingLocationGet addAdditionalQueryParam(final String additionalQueryParamKey, final String additionalQueryParamValue) {
      this.additionalQueryParams.put(additionalQueryParamKey, additionalQueryParamValue);
      return this;
   }
   
   public ByProjectKeyShippingMethodsMatchingLocationGet setAdditionalQueryParams(final Map<String, String> additionalQueryParams) {
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
