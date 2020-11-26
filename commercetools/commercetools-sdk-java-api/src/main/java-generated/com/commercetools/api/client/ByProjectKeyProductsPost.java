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
*  <p>To create a new product, send a representation that is going to become the initial staged representation
*  of the new product in the master catalog. If price selection query parameters are provided,
*  the selected prices will be added to the response.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyProductsPost extends ApiMethod<ByProjectKeyProductsPost> {

    
    private String projectKey;
    
    private com.commercetools.api.models.product.ProductDraft productDraft;

    public ByProjectKeyProductsPost(final ApiHttpClient apiHttpClient, String projectKey, com.commercetools.api.models.product.ProductDraft productDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.productDraft = productDraft;
    }

    public ByProjectKeyProductsPost(ByProjectKeyProductsPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.productDraft = t.productDraft;
    }

    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/products", this.projectKey);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        try {
        final byte[] body = apiHttpClient().getSerializerService().toJsonByteArray(productDraft);
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), body);
    } catch(Exception e) {
        e.printStackTrace();
    }
    
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), null);
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

    public ByProjectKeyProductsPost withPriceCurrency(final String priceCurrency){
        return new ByProjectKeyProductsPost(this).addQueryParam("priceCurrency", priceCurrency);
    }
    
    public ByProjectKeyProductsPost withPriceCountry(final String priceCountry){
        return new ByProjectKeyProductsPost(this).addQueryParam("priceCountry", priceCountry);
    }
    
    public ByProjectKeyProductsPost withPriceCustomerGroup(final String priceCustomerGroup){
        return new ByProjectKeyProductsPost(this).addQueryParam("priceCustomerGroup", priceCustomerGroup);
    }
    
    public ByProjectKeyProductsPost withPriceChannel(final String priceChannel){
        return new ByProjectKeyProductsPost(this).addQueryParam("priceChannel", priceChannel);
    }
    
    public ByProjectKeyProductsPost withLocaleProjection(final String localeProjection){
        return new ByProjectKeyProductsPost(this).addQueryParam("localeProjection", localeProjection);
    }
    
    public ByProjectKeyProductsPost withStoreProjection(final String storeProjection){
        return new ByProjectKeyProductsPost(this).addQueryParam("storeProjection", storeProjection);
    }
    
    public ByProjectKeyProductsPost withExpand(final String expand){
        return new ByProjectKeyProductsPost(this).addQueryParam("expand", expand);
    }
    
    @Override
    protected ByProjectKeyProductsPost copy()
    {
        return new ByProjectKeyProductsPost(this);
    }
}
