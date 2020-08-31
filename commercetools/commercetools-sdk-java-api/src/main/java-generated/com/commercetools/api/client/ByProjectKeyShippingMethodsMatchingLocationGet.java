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


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyShippingMethodsMatchingLocationGet extends ApiMethod<ByProjectKeyShippingMethodsMatchingLocationGet> {

    
    private String projectKey;
    

    public ByProjectKeyShippingMethodsMatchingLocationGet(final ApiHttpClient apiHttpClient, String projectKey) {
        super(apiHttpClient);
        this.projectKey = projectKey;
    }

    public ByProjectKeyShippingMethodsMatchingLocationGet(ByProjectKeyShippingMethodsMatchingLocationGet t) {
        super(t);
        this.projectKey = t.projectKey;
    }

    public ApiHttpRequest createHttpRequest() {
        ApiHttpRequest httpRequest = new ApiHttpRequest();
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/shipping-methods/matching-location", this.projectKey);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        httpRequest.setRelativeUrl(httpRequestPath); 
        httpRequest.setMethod(ApiHttpMethod.GET);
        httpRequest.setHeaders(getHeaders());
        
        return httpRequest;
    }

    public ApiHttpResponse<com.commercetools.api.models.shipping_method.ShippingMethodPagedQueryResponse> executeBlocking(){
        try {
            return execute().get();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.shipping_method.ShippingMethodPagedQueryResponse>> execute(){
        return apiHttpClient().execute(this.createHttpRequest())
                .thenApply(response -> {
                    if(response.getStatusCode() >= 400){
                        throw new ApiHttpException(response.getStatusCode(), new String(response.getBody()), response.getHeaders());
                    }
                    return Utils.convertResponse(response,com.commercetools.api.models.shipping_method.ShippingMethodPagedQueryResponse.class);
                });
    }

    public String getProjectKey() {return this.projectKey;}

    public List<String> getCountry() {
        return this.getQueryParam("country");
    }
    
    public List<String> getState() {
        return this.getQueryParam("state");
    }
    
    public List<String> getCurrency() {
        return this.getQueryParam("currency");
    }
    
    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }

    public ByProjectKeyShippingMethodsMatchingLocationGet withCountry(final String country){
        return new ByProjectKeyShippingMethodsMatchingLocationGet(this).addQueryParam("country", country);
    }
    
    public ByProjectKeyShippingMethodsMatchingLocationGet withState(final String state){
        return new ByProjectKeyShippingMethodsMatchingLocationGet(this).addQueryParam("state", state);
    }
    
    public ByProjectKeyShippingMethodsMatchingLocationGet withCurrency(final String currency){
        return new ByProjectKeyShippingMethodsMatchingLocationGet(this).addQueryParam("currency", currency);
    }
    
    public ByProjectKeyShippingMethodsMatchingLocationGet withExpand(final String expand){
        return new ByProjectKeyShippingMethodsMatchingLocationGet(this).addQueryParam("expand", expand);
    }
}
