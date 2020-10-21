package com.commercetools.api.client;

import io.vrap.rmf.base.client.utils.Utils;
import io.vrap.rmf.base.client.utils.json.VrapJsonUtils;

import java.io.InputStream;
import java.io.IOException;

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
*  <p>Gets the current or staged representation of a product in a catalog by ID.
*  When used with an API client that has the view_published_products:{projectKey} scope,
*  this endpoint only returns published (current) product projections.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyProductProjectionsByIDGet extends ApiMethod<ByProjectKeyProductProjectionsByIDGet> {

    
    private String projectKey;
    private String ID;
    

    public ByProjectKeyProductProjectionsByIDGet(final ApiHttpClient apiHttpClient, String projectKey, String ID) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.ID = ID;
    }

    public ByProjectKeyProductProjectionsByIDGet(ByProjectKeyProductProjectionsByIDGet t) {
        super(t);
        this.projectKey = t.projectKey;
        this.ID = t.ID;
    }

    public ApiHttpRequest createHttpRequest() {
        ApiHttpRequest httpRequest = new ApiHttpRequest();
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/product-projections/%s", this.projectKey, this.ID);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        httpRequest.setUri(httpRequestPath); 
        httpRequest.setMethod(ApiHttpMethod.GET);
        httpRequest.setHeaders(getHeaders());
        
        return httpRequest;
    }

    public ApiHttpResponse<com.commercetools.api.models.product.ProductProjection> executeBlocking(){
        return executeBlocking(Duration.ofSeconds(60));
    }
    
    public ApiHttpResponse<com.commercetools.api.models.product.ProductProjection> executeBlocking(Duration timeout){
        return blockingWait(execute(), timeout);
    }

    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.product.ProductProjection>> execute(){
        return apiHttpClient().execute(this.createHttpRequest())
                .thenApply(response -> Utils.convertResponse(response,com.commercetools.api.models.product.ProductProjection.class));
    }

    public String getProjectKey() {return this.projectKey;}
    public String getID() {return this.ID;}

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

    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }
    
    public void setID(final String ID) { this.ID = ID; }

    public ByProjectKeyProductProjectionsByIDGet withStaged(final Boolean staged){
        return new ByProjectKeyProductProjectionsByIDGet(this).addQueryParam("staged", staged);
    }
    
    public ByProjectKeyProductProjectionsByIDGet withPriceCurrency(final String priceCurrency){
        return new ByProjectKeyProductProjectionsByIDGet(this).addQueryParam("priceCurrency", priceCurrency);
    }
    
    public ByProjectKeyProductProjectionsByIDGet withPriceCountry(final String priceCountry){
        return new ByProjectKeyProductProjectionsByIDGet(this).addQueryParam("priceCountry", priceCountry);
    }
    
    public ByProjectKeyProductProjectionsByIDGet withPriceCustomerGroup(final String priceCustomerGroup){
        return new ByProjectKeyProductProjectionsByIDGet(this).addQueryParam("priceCustomerGroup", priceCustomerGroup);
    }
    
    public ByProjectKeyProductProjectionsByIDGet withPriceChannel(final String priceChannel){
        return new ByProjectKeyProductProjectionsByIDGet(this).addQueryParam("priceChannel", priceChannel);
    }
    
    public ByProjectKeyProductProjectionsByIDGet withLocaleProjection(final String localeProjection){
        return new ByProjectKeyProductProjectionsByIDGet(this).addQueryParam("localeProjection", localeProjection);
    }
    
    public ByProjectKeyProductProjectionsByIDGet withStoreProjection(final String storeProjection){
        return new ByProjectKeyProductProjectionsByIDGet(this).addQueryParam("storeProjection", storeProjection);
    }
    
    public ByProjectKeyProductProjectionsByIDGet withExpand(final String expand){
        return new ByProjectKeyProductProjectionsByIDGet(this).addQueryParam("expand", expand);
    }
}
