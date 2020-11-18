package com.commercetools.api.client;

import io.vrap.rmf.base.client.utils.Utils;
import io.vrap.rmf.base.client.utils.json.VrapJsonUtils;

import java.io.InputStream;
import java.io.IOException;

import java.net.URI;
import java.nio.file.Files;

import java.time.Duration;
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


import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

/**
*  <p>Gets the full representation of a product by ID.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyProductsByIDGet extends ApiMethod<ByProjectKeyProductsByIDGet> {

    
    private String projectKey;
    private String ID;
    

    public ByProjectKeyProductsByIDGet(final ApiHttpClient apiHttpClient, String projectKey, String ID) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.ID = ID;
    }

    public ByProjectKeyProductsByIDGet(ByProjectKeyProductsByIDGet t) {
        super(t);
        this.projectKey = t.projectKey;
        this.ID = t.ID;
    }

    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/products/%s", this.projectKey, this.ID);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        
        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    public ApiHttpResponse<com.commercetools.api.models.product.Product> executeBlocking(){
        return executeBlocking(Duration.ofSeconds(60));
    }
    
    public ApiHttpResponse<com.commercetools.api.models.product.Product> executeBlocking(Duration timeout){
        return blockingWait(execute(), timeout);
    }

    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.product.Product>> execute(){
        return apiHttpClient().execute(this.createHttpRequest(), com.commercetools.api.models.product.Product.class);
    }

    public String getProjectKey() {return this.projectKey;}
    public String getID() {return this.ID;}

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
    
    public void setID(final String ID) { this.ID = ID; }

    public ByProjectKeyProductsByIDGet withPriceCurrency(final String priceCurrency){
        return new ByProjectKeyProductsByIDGet(this).addQueryParam("priceCurrency", priceCurrency);
    }
    
    public ByProjectKeyProductsByIDGet withPriceCountry(final String priceCountry){
        return new ByProjectKeyProductsByIDGet(this).addQueryParam("priceCountry", priceCountry);
    }
    
    public ByProjectKeyProductsByIDGet withPriceCustomerGroup(final String priceCustomerGroup){
        return new ByProjectKeyProductsByIDGet(this).addQueryParam("priceCustomerGroup", priceCustomerGroup);
    }
    
    public ByProjectKeyProductsByIDGet withPriceChannel(final String priceChannel){
        return new ByProjectKeyProductsByIDGet(this).addQueryParam("priceChannel", priceChannel);
    }
    
    public ByProjectKeyProductsByIDGet withLocaleProjection(final String localeProjection){
        return new ByProjectKeyProductsByIDGet(this).addQueryParam("localeProjection", localeProjection);
    }
    
    public ByProjectKeyProductsByIDGet withStoreProjection(final String storeProjection){
        return new ByProjectKeyProductsByIDGet(this).addQueryParam("storeProjection", storeProjection);
    }
    
    public ByProjectKeyProductsByIDGet withExpand(final String expand){
        return new ByProjectKeyProductsByIDGet(this).addQueryParam("expand", expand);
    }
}
