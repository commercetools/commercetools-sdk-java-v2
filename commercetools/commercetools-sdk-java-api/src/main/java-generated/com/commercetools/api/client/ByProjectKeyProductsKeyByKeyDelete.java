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
*  <p>Delete Product by key</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyProductsKeyByKeyDelete extends ApiMethod<ByProjectKeyProductsKeyByKeyDelete> {

    
    private String projectKey;
    private String key;
    

    public ByProjectKeyProductsKeyByKeyDelete(final ApiHttpClient apiHttpClient, String projectKey, String key) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.key = key;
    }

    public ByProjectKeyProductsKeyByKeyDelete(ByProjectKeyProductsKeyByKeyDelete t) {
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
        httpRequest.setRelativeUrl(httpRequestPath); 
        httpRequest.setMethod(ApiHttpMethod.DELETE);
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
    
    public List<String> getVersion() {
        return this.getQueryParam("version");
    }
    
    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }
    
    public void setKey(final String key) { this.key = key; }

    public ByProjectKeyProductsKeyByKeyDelete withPriceCurrency(final String priceCurrency){
        return new ByProjectKeyProductsKeyByKeyDelete(this).addQueryParam("priceCurrency", priceCurrency);
    }
    
    public ByProjectKeyProductsKeyByKeyDelete withPriceCountry(final String priceCountry){
        return new ByProjectKeyProductsKeyByKeyDelete(this).addQueryParam("priceCountry", priceCountry);
    }
    
    public ByProjectKeyProductsKeyByKeyDelete withPriceCustomerGroup(final String priceCustomerGroup){
        return new ByProjectKeyProductsKeyByKeyDelete(this).addQueryParam("priceCustomerGroup", priceCustomerGroup);
    }
    
    public ByProjectKeyProductsKeyByKeyDelete withPriceChannel(final String priceChannel){
        return new ByProjectKeyProductsKeyByKeyDelete(this).addQueryParam("priceChannel", priceChannel);
    }
    
    public ByProjectKeyProductsKeyByKeyDelete withLocaleProjection(final String localeProjection){
        return new ByProjectKeyProductsKeyByKeyDelete(this).addQueryParam("localeProjection", localeProjection);
    }
    
    public ByProjectKeyProductsKeyByKeyDelete withStoreProjection(final String storeProjection){
        return new ByProjectKeyProductsKeyByKeyDelete(this).addQueryParam("storeProjection", storeProjection);
    }
    
    public ByProjectKeyProductsKeyByKeyDelete withVersion(final Long version){
        return new ByProjectKeyProductsKeyByKeyDelete(this).addQueryParam("version", version);
    }
    
    public ByProjectKeyProductsKeyByKeyDelete withExpand(final String expand){
        return new ByProjectKeyProductsKeyByKeyDelete(this).addQueryParam("expand", expand);
    }
}
