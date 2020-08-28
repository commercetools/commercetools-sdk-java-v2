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
*  <p>You can use the product projections query endpoint to get the current or staged representations of Products.
*  When used with an API client that has the view_published_products:{projectKey} scope,
*  this endpoint only returns published (current) product projections.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyProductProjectionsGet extends ApiMethod<ByProjectKeyProductProjectionsGet> {

    
    private String projectKey;
    

    public ByProjectKeyProductProjectionsGet(final ApiHttpClient apiHttpClient, String projectKey) {
        super(apiHttpClient);
        this.projectKey = projectKey;
    }

    public ByProjectKeyProductProjectionsGet(ByProjectKeyProductProjectionsGet t) {
        super(t);
        this.projectKey = t.projectKey;
    }

    public ApiHttpRequest createHttpRequest() {
        ApiHttpRequest httpRequest = new ApiHttpRequest();
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/product-projections", this.projectKey);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        httpRequest.setRelativeUrl(httpRequestPath); 
        httpRequest.setMethod(ApiHttpMethod.GET);
        httpRequest.setHeaders(getHeaders());
        
        return httpRequest;
    }

    public ApiHttpResponse<com.commercetools.api.models.product.ProductProjectionPagedQueryResponse> executeBlocking(){
        try {
            return execute().get();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.product.ProductProjectionPagedQueryResponse>> execute(){
        return apiHttpClient().execute(this.createHttpRequest())
                .thenApply(response -> {
                    if(response.getStatusCode() >= 400){
                        throw new ApiHttpException(response.getStatusCode(), new String(response.getBody()), response.getHeaders());
                    }
                    return Utils.convertResponse(response,com.commercetools.api.models.product.ProductProjectionPagedQueryResponse.class);
                });
    }

    public String getProjectKey() {return this.projectKey;}

    public List<String> getStaged() {
        return this.getQueryParam("staged");
    }
    
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

    public ByProjectKeyProductProjectionsGet withStaged(final Boolean staged){
        return new ByProjectKeyProductProjectionsGet(this).addQueryParam("staged", staged);
    }
    
    public ByProjectKeyProductProjectionsGet withPriceCurrency(final String priceCurrency){
        return new ByProjectKeyProductProjectionsGet(this).addQueryParam("priceCurrency", priceCurrency);
    }
    
    public ByProjectKeyProductProjectionsGet withPriceCountry(final String priceCountry){
        return new ByProjectKeyProductProjectionsGet(this).addQueryParam("priceCountry", priceCountry);
    }
    
    public ByProjectKeyProductProjectionsGet withPriceCustomerGroup(final String priceCustomerGroup){
        return new ByProjectKeyProductProjectionsGet(this).addQueryParam("priceCustomerGroup", priceCustomerGroup);
    }
    
    public ByProjectKeyProductProjectionsGet withPriceChannel(final String priceChannel){
        return new ByProjectKeyProductProjectionsGet(this).addQueryParam("priceChannel", priceChannel);
    }
    
    public ByProjectKeyProductProjectionsGet withLocaleProjection(final String localeProjection){
        return new ByProjectKeyProductProjectionsGet(this).addQueryParam("localeProjection", localeProjection);
    }
    
    public ByProjectKeyProductProjectionsGet withStoreProjection(final String storeProjection){
        return new ByProjectKeyProductProjectionsGet(this).addQueryParam("storeProjection", storeProjection);
    }
    
    public ByProjectKeyProductProjectionsGet withExpand(final String expand){
        return new ByProjectKeyProductProjectionsGet(this).addQueryParam("expand", expand);
    }
    
    public ByProjectKeyProductProjectionsGet withSort(final String sort){
        return new ByProjectKeyProductProjectionsGet(this).addQueryParam("sort", sort);
    }
    
    public ByProjectKeyProductProjectionsGet withLimit(final Integer limit){
        return new ByProjectKeyProductProjectionsGet(this).addQueryParam("limit", limit);
    }
    
    public ByProjectKeyProductProjectionsGet withOffset(final Integer offset){
        return new ByProjectKeyProductProjectionsGet(this).addQueryParam("offset", offset);
    }
    
    public ByProjectKeyProductProjectionsGet withWithTotal(final Boolean withTotal){
        return new ByProjectKeyProductProjectionsGet(this).addQueryParam("withTotal", withTotal);
    }
    
    public ByProjectKeyProductProjectionsGet withWhere(final String where){
        return new ByProjectKeyProductProjectionsGet(this).addQueryParam("where", where);
    }
}
