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


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyProductsByIDImagesPost {
   
   
   private ApiHttpHeaders headers = new ApiHttpHeaders();
   private Map<String, String> additionalQueryParams = new HashMap<>();
   private final ApiHttpClient apiHttpClient; 
   private List<String> filename = new ArrayList<>();
   private List<Integer> variant = new ArrayList<>();
   private List<String> sku = new ArrayList<>();
   private List<Boolean> staged = new ArrayList<>();
   private String projectKey;
   private String ID;
   
   private java.io.File file;
   
   public ByProjectKeyProductsByIDImagesPost(final ApiHttpClient apiHttpClient, String projectKey, String ID, java.io.File file){
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
      this.ID = ID;
      this.file = file;
   }
   
   public ApiHttpRequest createHttpRequest() {
      ApiHttpRequest httpRequest = new ApiHttpRequest();
      List<String> params = new ArrayList<>();
      params.add(this.filename.stream().map(s -> "filename=" + urlEncode(s)).collect(Collectors.joining("&")));
      params.add(this.variant.stream().map(s -> "variant=" + s).collect(Collectors.joining("&")));
      params.add(this.sku.stream().map(s -> "sku=" + urlEncode(s)).collect(Collectors.joining("&")));
      params.add(this.staged.stream().map(s -> "staged=" + s).collect(Collectors.joining("&")));
      params.add(additionalQueryParams.entrySet().stream().map(entry -> entry.getKey() + "=" + entry.getValue()).collect(Collectors.joining("&")));
      params.removeIf(String::isEmpty);
      String httpRequestPath = String.format("/%s/products/%s/images", this.projectKey, this.ID);
      if(!params.isEmpty()){
         httpRequestPath += "?" + String.join("&", params);
      }
      httpRequest.setRelativeUrl(httpRequestPath); 
      httpRequest.setMethod(ApiHttpMethod.POST);
      httpRequest.setHeaders(headers);
      try{httpRequest.setBody(VrapJsonUtils.toJsonByteArray(file));}catch(Exception e){e.printStackTrace();}
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
   
   public List<String> getFilename() {
      return this.filename;
   }
   
   public List<Integer> getVariant() {
      return this.variant;
   }
   
   public List<String> getSku() {
      return this.sku;
   }
   
   public List<Boolean> getStaged() {
      return this.staged;
   }
   
   public void setProjectKey(final String projectKey) {this.projectKey = projectKey;}
   
   public void setID(final String ID) {this.ID = ID;}
   
   public ByProjectKeyProductsByIDImagesPost addFilename(final String filename){
      this.filename.add(filename);
      return this;
   }
   
   public ByProjectKeyProductsByIDImagesPost withFilename(final List<String> filename){
      this.filename = filename;
      return this;
   }
   
   public ByProjectKeyProductsByIDImagesPost addVariant(final Integer variant){
      this.variant.add(variant);
      return this;
   }
   
   public ByProjectKeyProductsByIDImagesPost withVariant(final List<Integer> variant){
      this.variant = variant;
      return this;
   }
   
   public ByProjectKeyProductsByIDImagesPost addSku(final String sku){
      this.sku.add(sku);
      return this;
   }
   
   public ByProjectKeyProductsByIDImagesPost withSku(final List<String> sku){
      this.sku = sku;
      return this;
   }
   
   public ByProjectKeyProductsByIDImagesPost addStaged(final Boolean staged){
      this.staged.add(staged);
      return this;
   }
   
   public ByProjectKeyProductsByIDImagesPost withStaged(final List<Boolean> staged){
      this.staged = staged;
      return this;
   }
   
   public ByProjectKeyProductsByIDImagesPost addHeader(final String key, final String value) {
      this.headers.addHeader(key, value);
      return this;
   }
   
   public ByProjectKeyProductsByIDImagesPost withHeaders(final ApiHttpHeaders headers) {
      this.headers = headers;
      return this;
   }
   
   public String getHeaderValue(final String key) {
      return this.headers.getHeaderValue(key);
   }
   
   public ApiHttpHeaders getHeaders() {
      return this.headers;
   }
   
   public ByProjectKeyProductsByIDImagesPost addAdditionalQueryParam(final String additionalQueryParamKey, final String additionalQueryParamValue) {
      this.additionalQueryParams.put(additionalQueryParamKey, additionalQueryParamValue);
      return this;
   }
   
   public ByProjectKeyProductsByIDImagesPost setAdditionalQueryParams(final Map<String, String> additionalQueryParams) {
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