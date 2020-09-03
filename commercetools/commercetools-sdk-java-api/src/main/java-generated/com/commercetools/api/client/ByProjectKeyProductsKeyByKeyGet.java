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
*  <p>Gets the full representation of a product by Key.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyProductsKeyByKeyGet extends ApiMethod<ByProjectKeyProductsKeyByKeyGet> {

    
    private String projectKey;
    private String key;
    

    public ByProjectKeyProductsKeyByKeyGet(final ApiHttpClient apiHttpClient, String projectKey, String key) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.key = key;
    }

    public ByProjectKeyProductsKeyByKeyGet(ByProjectKeyProductsKeyByKeyGet t) {
        super(t);
        this.projectKey = t.projectKey;
        this.key = t.key;
    }

    public ApiHttpRequest createHttpRequest() {
        ApiHttpRequest httpRequest = new ApiHttpRequest();
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/products/key=%s", this.projectKey, this.key);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        httpRequest.setUri(httpRequestPath); 
        httpRequest.setMethod(ApiHttpMethod.GET);
        httpRequest.setHeaders(getHeaders());
        
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
        return apiHttpClient().execute(this.createHttpRequest())
                .thenApply(response -> {
                    if(response.getStatusCode() >= 400){
                        throw new ApiHttpException(response.getStatusCode(), new String(response.getBody()), response.getHeaders());
                    }
                    return Utils.convertResponse(response,com.commercetools.api.models.product.Product.class);
                });
    }

    public String getProjectKey() {return this.projectKey;}
    public String getKey() {return this.key;}

    public List<String> getPriceCurrency() {
        return this.getQueryParam("priceCurrency");
    }
    
    public List<String> getPriceCountry() {
        return this.getQueryParam("priceCountry");
    }
    
    public List<String> getPriceCustomerGroup() {
        return this.getQueryParam("priceCustomerGroup");
    }
    
    public List<String> getPriceChannel() {
        return this.getQueryParam("priceChannel");
    }
    
    public List<String> getLocaleProjection() {
        return this.getQueryParam("localeProjection");
    }
    
    public List<String> getStoreProjection() {
        return this.getQueryParam("storeProjection");
    }
    
    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }
    
    public void setKey(final String key) { this.key = key; }

    public ByProjectKeyProductsKeyByKeyGet withPriceCurrency(final String priceCurrency){
        return new ByProjectKeyProductsKeyByKeyGet(this).addQueryParam("priceCurrency", priceCurrency);
    }
    
    public ByProjectKeyProductsKeyByKeyGet withPriceCountry(final String priceCountry){
        return new ByProjectKeyProductsKeyByKeyGet(this).addQueryParam("priceCountry", priceCountry);
    }
    
    public ByProjectKeyProductsKeyByKeyGet withPriceCustomerGroup(final String priceCustomerGroup){
        return new ByProjectKeyProductsKeyByKeyGet(this).addQueryParam("priceCustomerGroup", priceCustomerGroup);
    }
    
    public ByProjectKeyProductsKeyByKeyGet withPriceChannel(final String priceChannel){
        return new ByProjectKeyProductsKeyByKeyGet(this).addQueryParam("priceChannel", priceChannel);
    }
    
    public ByProjectKeyProductsKeyByKeyGet withLocaleProjection(final String localeProjection){
        return new ByProjectKeyProductsKeyByKeyGet(this).addQueryParam("localeProjection", localeProjection);
    }
    
    public ByProjectKeyProductsKeyByKeyGet withStoreProjection(final String storeProjection){
        return new ByProjectKeyProductsKeyByKeyGet(this).addQueryParam("storeProjection", storeProjection);
    }
    
    public ByProjectKeyProductsKeyByKeyGet withExpand(final String expand){
        return new ByProjectKeyProductsKeyByKeyGet(this).addQueryParam("expand", expand);
    }
}
