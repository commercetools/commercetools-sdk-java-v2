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

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyShippingMethodsMatchingOrdereditGet extends ApiMethod<ByProjectKeyShippingMethodsMatchingOrdereditGet> {

    
    private String projectKey;
    

    public ByProjectKeyShippingMethodsMatchingOrdereditGet(final ApiHttpClient apiHttpClient, String projectKey) {
        super(apiHttpClient);
        this.projectKey = projectKey;
    }

    public ByProjectKeyShippingMethodsMatchingOrdereditGet(ByProjectKeyShippingMethodsMatchingOrdereditGet t) {
        super(t);
        this.projectKey = t.projectKey;
    }

    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/shipping-methods/matching-orderedit", this.projectKey);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        
        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    public ApiHttpResponse<com.commercetools.api.models.shipping_method.ShippingMethodPagedQueryResponse> executeBlocking(){
        return executeBlocking(Duration.ofSeconds(60));
    }
    
    public ApiHttpResponse<com.commercetools.api.models.shipping_method.ShippingMethodPagedQueryResponse> executeBlocking(Duration timeout){
        return blockingWait(execute(), timeout);
    }

    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.shipping_method.ShippingMethodPagedQueryResponse>> execute(){
        return apiHttpClient().execute(this.createHttpRequest(), com.commercetools.api.models.shipping_method.ShippingMethodPagedQueryResponse.class);
    }

    public String getProjectKey() {return this.projectKey;}

    public List<String> getOrderEditId() {
        return this.getQueryParam("orderEditId");
    }
    
    public List<String> getCountry() {
        return this.getQueryParam("country");
    }
    
    public List<String> getState() {
        return this.getQueryParam("state");
    }

    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }

    public ByProjectKeyShippingMethodsMatchingOrdereditGet withOrderEditId(final String orderEditId){
        return new ByProjectKeyShippingMethodsMatchingOrdereditGet(this).addQueryParam("orderEditId", orderEditId);
    }
    
    public ByProjectKeyShippingMethodsMatchingOrdereditGet withCountry(final String country){
        return new ByProjectKeyShippingMethodsMatchingOrdereditGet(this).addQueryParam("country", country);
    }
    
    public ByProjectKeyShippingMethodsMatchingOrdereditGet withState(final String state){
        return new ByProjectKeyShippingMethodsMatchingOrdereditGet(this).addQueryParam("state", state);
    }
}
