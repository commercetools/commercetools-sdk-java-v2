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
*  <p>Update Product by key</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyProductsKeyByKeyPost extends ApiMethod<ByProjectKeyProductsKeyByKeyPost, com.commercetools.api.models.product.Product> implements com.commercetools.api.client.PriceselectingTrait<ByProjectKeyProductsKeyByKeyPost>, com.commercetools.api.client.ConflictingTrait<ByProjectKeyProductsKeyByKeyPost>, com.commercetools.api.client.ExpandableTrait<ByProjectKeyProductsKeyByKeyPost>, com.commercetools.api.client.ErrorableTrait<ByProjectKeyProductsKeyByKeyPost>, com.commercetools.api.client.DeprecatableTrait<ByProjectKeyProductsKeyByKeyPost> {

    
    private String projectKey;
    private String key;
    
    private com.commercetools.api.models.product.ProductUpdate productUpdate;

    public ByProjectKeyProductsKeyByKeyPost(final ApiHttpClient apiHttpClient, String projectKey, String key, com.commercetools.api.models.product.ProductUpdate productUpdate) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.key = key;
        this.productUpdate = productUpdate;
    }

    public ByProjectKeyProductsKeyByKeyPost(ByProjectKeyProductsKeyByKeyPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.key = t.key;
        this.productUpdate = t.productUpdate;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/products/key=%s", this.projectKey, this.key);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        try {
        final byte[] body = apiHttpClient().getSerializerService().toJsonByteArray(productUpdate);
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), body);
    } catch(Exception e) {
        e.printStackTrace();
    }
    
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), null);
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

    public ByProjectKeyProductsKeyByKeyPost withPriceCurrency(final String priceCurrency){
        return copy().addQueryParam("priceCurrency", priceCurrency);
    }
    
    public ByProjectKeyProductsKeyByKeyPost withPriceCountry(final String priceCountry){
        return copy().addQueryParam("priceCountry", priceCountry);
    }
    
    public ByProjectKeyProductsKeyByKeyPost withPriceCustomerGroup(final String priceCustomerGroup){
        return copy().addQueryParam("priceCustomerGroup", priceCustomerGroup);
    }
    
    public ByProjectKeyProductsKeyByKeyPost withPriceChannel(final String priceChannel){
        return copy().addQueryParam("priceChannel", priceChannel);
    }
    
    public ByProjectKeyProductsKeyByKeyPost withLocaleProjection(final String localeProjection){
        return copy().addQueryParam("localeProjection", localeProjection);
    }
    
    public ByProjectKeyProductsKeyByKeyPost withStoreProjection(final String storeProjection){
        return copy().addQueryParam("storeProjection", storeProjection);
    }
    
    public ByProjectKeyProductsKeyByKeyPost withExpand(final String expand){
        return copy().addQueryParam("expand", expand);
    }
    
    @Override
    protected ByProjectKeyProductsKeyByKeyPost copy()
    {
        return new ByProjectKeyProductsKeyByKeyPost(this);
    }
}
