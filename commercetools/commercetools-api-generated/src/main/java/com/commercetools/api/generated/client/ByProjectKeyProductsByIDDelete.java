package com.commercetools.api.generated.client;

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
import io.vrap.rmf.base.client.utils.Generated;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import io.vrap.rmf.base.client.*;


/**
	<p>Delete Product by ID</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyProductsByIDDelete {
   
   
   private ApiHttpHeaders headers = new ApiHttpHeaders();
   private Map<String, String> additionalQueryParams = new HashMap<>();
   private final ApiHttpClient apiHttpClient; 
   private List<String> priceCurrency = new ArrayList<>();
   private List<String> priceCountry = new ArrayList<>();
   private List<String> priceCustomerGroup = new ArrayList<>();
   private List<String> priceChannel = new ArrayList<>();
   private List<Long> version = new ArrayList<>();
   private List<String> expand = new ArrayList<>();
   private String projectKey;
   private String ID;
   
   
   public ByProjectKeyProductsByIDDelete(final ApiHttpClient apiHttpClient, String projectKey, String ID){
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
      this.ID = ID;
   }
   
   public ApiHttpRequest createHttpRequest() {
      ApiHttpRequest httpRequest = new ApiHttpRequest();
      List<String> params = new ArrayList<>();
      params.add(this.priceCurrency.stream().map(s -> "priceCurrency=" + urlEncode(s)).collect(Collectors.joining("&")));
      params.add(this.priceCountry.stream().map(s -> "priceCountry=" + urlEncode(s)).collect(Collectors.joining("&")));
      params.add(this.priceCustomerGroup.stream().map(s -> "priceCustomerGroup=" + urlEncode(s)).collect(Collectors.joining("&")));
      params.add(this.priceChannel.stream().map(s -> "priceChannel=" + urlEncode(s)).collect(Collectors.joining("&")));
      params.add(this.version.stream().map(s -> "version=" + s).collect(Collectors.joining("&")));
      params.add(this.expand.stream().map(s -> "expand=" + urlEncode(s)).collect(Collectors.joining("&")));
      params.add(additionalQueryParams.entrySet().stream().map(entry -> entry.getKey() + "=" + entry.getValue()).collect(Collectors.joining("&")));
      params.removeIf(String::isEmpty);
      String httpRequestPath = String.format("/%s/products/%s", this.projectKey, this.ID);
      if(!params.isEmpty()){
         httpRequestPath += "?" + String.join("&", params);
      }
      httpRequest.setRelativeUrl(httpRequestPath); 
      httpRequest.setMethod(ApiHttpMethod.DELETE);
      httpRequest.setHeaders(headers);
      
      return httpRequest;
   }
   
   public ApiHttpResponse<com.commercetools.api.generated.models.product.Product> executeBlocking(){
      try {
          return execute().get();
      } catch (Exception e) {
          throw new RuntimeException(e);
      }
   }
   
   public CompletableFuture<ApiHttpResponse<com.commercetools.api.generated.models.product.Product>> execute(){
      return apiHttpClient.execute(this.createHttpRequest())
              .thenApply(response -> {
                  if(response.getStatusCode() >= 400){
                      throw new ApiHttpException(response.getStatusCode(), new String(response.getBody()), response.getHeaders());
                  }
                  return Utils.convertResponse(response,com.commercetools.api.generated.models.product.Product.class);
              });
   }
   
   public String getProjectKey() {return this.projectKey;}
   public String getID() {return this.ID;}
   
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
   
   public List<Long> getVersion() {
      return this.version;
   }
   
   public List<String> getExpand() {
      return this.expand;
   }
   
   public void setProjectKey(final String projectKey) {this.projectKey = projectKey;}
   
   public void setID(final String ID) {this.ID = ID;}
   
   public ByProjectKeyProductsByIDDelete addPriceCurrency(final String priceCurrency){
      this.priceCurrency.add(priceCurrency);
      return this;
   }
   
   public ByProjectKeyProductsByIDDelete withPriceCurrency(final List<String> priceCurrency){
      this.priceCurrency = priceCurrency;
      return this;
   }
   
   public ByProjectKeyProductsByIDDelete addPriceCountry(final String priceCountry){
      this.priceCountry.add(priceCountry);
      return this;
   }
   
   public ByProjectKeyProductsByIDDelete withPriceCountry(final List<String> priceCountry){
      this.priceCountry = priceCountry;
      return this;
   }
   
   public ByProjectKeyProductsByIDDelete addPriceCustomerGroup(final String priceCustomerGroup){
      this.priceCustomerGroup.add(priceCustomerGroup);
      return this;
   }
   
   public ByProjectKeyProductsByIDDelete withPriceCustomerGroup(final List<String> priceCustomerGroup){
      this.priceCustomerGroup = priceCustomerGroup;
      return this;
   }
   
   public ByProjectKeyProductsByIDDelete addPriceChannel(final String priceChannel){
      this.priceChannel.add(priceChannel);
      return this;
   }
   
   public ByProjectKeyProductsByIDDelete withPriceChannel(final List<String> priceChannel){
      this.priceChannel = priceChannel;
      return this;
   }
   
   public ByProjectKeyProductsByIDDelete addVersion(final Long version){
      this.version.add(version);
      return this;
   }
   
   public ByProjectKeyProductsByIDDelete withVersion(final List<Long> version){
      this.version = version;
      return this;
   }
   
   public ByProjectKeyProductsByIDDelete addExpand(final String expand){
      this.expand.add(expand);
      return this;
   }
   
   public ByProjectKeyProductsByIDDelete withExpand(final List<String> expand){
      this.expand = expand;
      return this;
   }
   
   public ByProjectKeyProductsByIDDelete addHeader(final String key, final String value) {
      this.headers.addHeader(key, value);
      return this;
   }
   
   public ByProjectKeyProductsByIDDelete withHeaders(final ApiHttpHeaders headers) {
      this.headers = headers;
      return this;
   }
   
   public String getHeaderValue(final String key) {
      return this.headers.getHeaderValue(key);
   }
   
   public ApiHttpHeaders getHeaders() {
      return this.headers;
   }
   
   public ByProjectKeyProductsByIDDelete addAdditionalQueryParam(final String additionalQueryParamKey, final String additionalQueryParamValue) {
      this.additionalQueryParams.put(additionalQueryParamKey, additionalQueryParamValue);
      return this;
   }
   
   public ByProjectKeyProductsByIDDelete setAdditionalQueryParams(final Map<String, String> additionalQueryParams) {
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