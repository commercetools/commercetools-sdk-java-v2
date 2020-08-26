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


/**
*  <p>To create a new product, send a representation that is going to become the initial staged representation
*  of the new product in the master catalog. If price selection query parameters are provided,
*  the selected prices will be added to the response.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyProductsPost {

    
    private ApiHttpHeaders headers = new ApiHttpHeaders();
    private Map<String, String> additionalQueryParams = new HashMap<>();
    private final ApiHttpClient apiHttpClient; 
    private List<String> priceCurrency = new ArrayList<>();
    private List<String> priceCountry = new ArrayList<>();
    private List<String> priceCustomerGroup = new ArrayList<>();
    private List<String> priceChannel = new ArrayList<>();
    private List<String> localeProjection = new ArrayList<>();
    private List<String> storeProjection = new ArrayList<>();
    private List<String> expand = new ArrayList<>();
    private String projectKey;
    
    private com.commercetools.api.models.product.ProductDraft productDraft;

    public ByProjectKeyProductsPost(final ApiHttpClient apiHttpClient, String projectKey, com.commercetools.api.models.product.ProductDraft productDraft){
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
        params.add(this.localeProjection.stream().map(s -> "localeProjection=" + urlEncode(s)).collect(Collectors.joining("&")));
        params.add(this.storeProjection.stream().map(s -> "storeProjection=" + urlEncode(s)).collect(Collectors.joining("&")));
        params.add(this.expand.stream().map(s -> "expand=" + urlEncode(s)).collect(Collectors.joining("&")));
        params.add(additionalQueryParams.entrySet().stream().map(entry -> entry.getKey() + "=" + entry.getValue()).collect(Collectors.joining("&")));
        params.removeIf(String::isEmpty);
        String httpRequestPath = String.format("/%s/products", this.projectKey);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        httpRequest.setRelativeUrl(httpRequestPath); 
        httpRequest.setMethod(ApiHttpMethod.POST);
        httpRequest.setHeaders(headers);
        try{httpRequest.setBody(VrapJsonUtils.toJsonByteArray(productDraft));}catch(Exception e){e.printStackTrace();}
        return httpRequest;
    }

    public ApiHttpResponse<com.commercetools.api.models.product.Product> executeBlocking(){
        try {
            return execute().get();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.product.Product>> execute(){
        return apiHttpClient.execute(this.createHttpRequest())
                .thenApply(response -> {
                    if(response.getStatusCode() >= 400){
                        throw new ApiHttpException(response.getStatusCode(), new String(response.getBody()), response.getHeaders());
                    }
                    return Utils.convertResponse(response,com.commercetools.api.models.product.Product.class);
                });
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
    
    public List<String> getLocaleProjection() {
        return this.localeProjection;
    }
    
    public List<String> getStoreProjection() {
        return this.storeProjection;
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
    
    public ByProjectKeyProductsPost addLocaleProjection(final String localeProjection){
        this.localeProjection.add(localeProjection);
        return this;
    }
    
    public ByProjectKeyProductsPost withLocaleProjection(final List<String> localeProjection){
        this.localeProjection = localeProjection;
        return this;
    }
    
    public ByProjectKeyProductsPost addStoreProjection(final String storeProjection){
        this.storeProjection.add(storeProjection);
        return this;
    }
    
    public ByProjectKeyProductsPost withStoreProjection(final List<String> storeProjection){
        this.storeProjection = storeProjection;
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
