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
*  <p>Gets the full representation of a product by Key.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyProductsKeyByKeyGet extends ApiMethod<ByProjectKeyProductsKeyByKeyGet, com.commercetools.api.models.product.Product> implements com.commercetools.api.client.PriceselectingTrait<ByProjectKeyProductsKeyByKeyGet>, com.commercetools.api.client.ExpandableTrait<ByProjectKeyProductsKeyByKeyGet>, com.commercetools.api.client.ErrorableTrait<ByProjectKeyProductsKeyByKeyGet>, com.commercetools.api.client.DeprecatableTrait<ByProjectKeyProductsKeyByKeyGet> {

    
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

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/products/key=%s", this.projectKey, this.key);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        
        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.product.Product> executeBlocking(Duration timeout){
        return blockingWait(execute(), timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.product.Product>> execute(){
        return apiHttpClient().execute(this.createHttpRequest(), com.commercetools.api.models.product.Product.class);
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
        return copy().addQueryParam("priceCurrency", priceCurrency);
    }
    
    public ByProjectKeyProductsKeyByKeyGet withPriceCountry(final String priceCountry){
        return copy().addQueryParam("priceCountry", priceCountry);
    }
    
    public ByProjectKeyProductsKeyByKeyGet withPriceCustomerGroup(final String priceCustomerGroup){
        return copy().addQueryParam("priceCustomerGroup", priceCustomerGroup);
    }
    
    public ByProjectKeyProductsKeyByKeyGet withPriceChannel(final String priceChannel){
        return copy().addQueryParam("priceChannel", priceChannel);
    }
    
    public ByProjectKeyProductsKeyByKeyGet withLocaleProjection(final String localeProjection){
        return copy().addQueryParam("localeProjection", localeProjection);
    }
    
    public ByProjectKeyProductsKeyByKeyGet withStoreProjection(final String storeProjection){
        return copy().addQueryParam("storeProjection", storeProjection);
    }
    
    public ByProjectKeyProductsKeyByKeyGet withExpand(final String expand){
        return copy().addQueryParam("expand", expand);
    }
    
    @Override
    protected ByProjectKeyProductsKeyByKeyGet copy()
    {
        return new ByProjectKeyProductsKeyByKeyGet(this);
    }
}
