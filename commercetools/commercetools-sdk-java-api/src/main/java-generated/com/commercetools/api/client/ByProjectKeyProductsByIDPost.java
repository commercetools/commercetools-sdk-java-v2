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
*  <p>Update Product by ID</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyProductsByIDPost extends ApiMethod<ByProjectKeyProductsByIDPost> {

    
    private String projectKey;
    private String ID;
    
    private com.commercetools.api.models.product.ProductUpdate productUpdate;

    public ByProjectKeyProductsByIDPost(final ApiHttpClient apiHttpClient, String projectKey, String ID, com.commercetools.api.models.product.ProductUpdate productUpdate) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.ID = ID;
        this.productUpdate = productUpdate;
    }

    public ByProjectKeyProductsByIDPost(ByProjectKeyProductsByIDPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.ID = t.ID;
        this.productUpdate = t.productUpdate;
    }

    public ApiHttpRequest createHttpRequest() {
        ApiHttpRequest httpRequest = new ApiHttpRequest();
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/products/%s", this.projectKey, this.ID);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        httpRequest.setRelativeUrl(httpRequestPath); 
        httpRequest.setUri(httpRequestPath); 
        httpRequest.setMethod(ApiHttpMethod.POST);
        httpRequest.setHeaders(getHeaders());
        try{httpRequest.setBody(VrapJsonUtils.toJsonByteArray(productUpdate));}catch(Exception e){e.printStackTrace();}
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

    public ByProjectKeyProductsByIDPost withPriceCurrency(final String priceCurrency){
        return new ByProjectKeyProductsByIDPost(this).addQueryParam("priceCurrency", priceCurrency);
    }
    
    public ByProjectKeyProductsByIDPost withPriceCountry(final String priceCountry){
        return new ByProjectKeyProductsByIDPost(this).addQueryParam("priceCountry", priceCountry);
    }
    
    public ByProjectKeyProductsByIDPost withPriceCustomerGroup(final String priceCustomerGroup){
        return new ByProjectKeyProductsByIDPost(this).addQueryParam("priceCustomerGroup", priceCustomerGroup);
    }
    
    public ByProjectKeyProductsByIDPost withPriceChannel(final String priceChannel){
        return new ByProjectKeyProductsByIDPost(this).addQueryParam("priceChannel", priceChannel);
    }
    
    public ByProjectKeyProductsByIDPost withLocaleProjection(final String localeProjection){
        return new ByProjectKeyProductsByIDPost(this).addQueryParam("localeProjection", localeProjection);
    }
    
    public ByProjectKeyProductsByIDPost withStoreProjection(final String storeProjection){
        return new ByProjectKeyProductsByIDPost(this).addQueryParam("storeProjection", storeProjection);
    }
    
    public ByProjectKeyProductsByIDPost withExpand(final String expand){
        return new ByProjectKeyProductsByIDPost(this).addQueryParam("expand", expand);
    }
}
