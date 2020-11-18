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
*  <p>You can use the query endpoint to get the full representations of products.
*  REMARK: We suggest to use the performance optimized search endpoint which has a bunch functionalities,
*  the query API lacks like sorting on custom attributes, etc.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyProductsGet extends ApiMethod<ByProjectKeyProductsGet> {

    
    private String projectKey;
    

    public ByProjectKeyProductsGet(final ApiHttpClient apiHttpClient, String projectKey) {
        super(apiHttpClient);
        this.projectKey = projectKey;
    }

    public ByProjectKeyProductsGet(ByProjectKeyProductsGet t) {
        super(t);
        this.projectKey = t.projectKey;
    }

    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/products", this.projectKey);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        
        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    public ApiHttpResponse<com.commercetools.api.models.product.ProductPagedQueryResponse> executeBlocking(){
        return executeBlocking(Duration.ofSeconds(60));
    }
    
    public ApiHttpResponse<com.commercetools.api.models.product.ProductPagedQueryResponse> executeBlocking(Duration timeout){
        return blockingWait(execute(), timeout);
    }

    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.product.ProductPagedQueryResponse>> execute(){
        return apiHttpClient().execute(this.createHttpRequest(), com.commercetools.api.models.product.ProductPagedQueryResponse.class);
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
    
    public List<String> getSort() {
        return this.getQueryParam("sort");
    }
    
    public List<String> getLimit() {
        return this.getQueryParam("limit");
    }
    
    public List<String> getOffset() {
        return this.getQueryParam("offset");
    }
    
    public List<String> getWithTotal() {
        return this.getQueryParam("withTotal");
    }
    
    public List<String> getWhere() {
        return this.getQueryParam("where");
    }

    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }

    public ByProjectKeyProductsGet withPriceCurrency(final String priceCurrency){
        return new ByProjectKeyProductsGet(this).addQueryParam("priceCurrency", priceCurrency);
    }
    
    public ByProjectKeyProductsGet withPriceCountry(final String priceCountry){
        return new ByProjectKeyProductsGet(this).addQueryParam("priceCountry", priceCountry);
    }
    
    public ByProjectKeyProductsGet withPriceCustomerGroup(final String priceCustomerGroup){
        return new ByProjectKeyProductsGet(this).addQueryParam("priceCustomerGroup", priceCustomerGroup);
    }
    
    public ByProjectKeyProductsGet withPriceChannel(final String priceChannel){
        return new ByProjectKeyProductsGet(this).addQueryParam("priceChannel", priceChannel);
    }
    
    public ByProjectKeyProductsGet withLocaleProjection(final String localeProjection){
        return new ByProjectKeyProductsGet(this).addQueryParam("localeProjection", localeProjection);
    }
    
    public ByProjectKeyProductsGet withStoreProjection(final String storeProjection){
        return new ByProjectKeyProductsGet(this).addQueryParam("storeProjection", storeProjection);
    }
    
    public ByProjectKeyProductsGet withExpand(final String expand){
        return new ByProjectKeyProductsGet(this).addQueryParam("expand", expand);
    }
    
    public ByProjectKeyProductsGet withSort(final String sort){
        return new ByProjectKeyProductsGet(this).addQueryParam("sort", sort);
    }
    
    public ByProjectKeyProductsGet withLimit(final Integer limit){
        return new ByProjectKeyProductsGet(this).addQueryParam("limit", limit);
    }
    
    public ByProjectKeyProductsGet withOffset(final Integer offset){
        return new ByProjectKeyProductsGet(this).addQueryParam("offset", offset);
    }
    
    public ByProjectKeyProductsGet withWithTotal(final Boolean withTotal){
        return new ByProjectKeyProductsGet(this).addQueryParam("withTotal", withTotal);
    }
    
    public ByProjectKeyProductsGet withWhere(final String where){
        return new ByProjectKeyProductsGet(this).addQueryParam("where", where);
    }
}
