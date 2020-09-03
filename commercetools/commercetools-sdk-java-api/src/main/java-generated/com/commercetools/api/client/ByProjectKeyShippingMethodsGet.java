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
*  <p>Query shipping-methods</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyShippingMethodsGet extends ApiMethod<ByProjectKeyShippingMethodsGet> {

    
    private String projectKey;
    

    public ByProjectKeyShippingMethodsGet(final ApiHttpClient apiHttpClient, String projectKey) {
        super(apiHttpClient);
        this.projectKey = projectKey;
    }

    public ByProjectKeyShippingMethodsGet(ByProjectKeyShippingMethodsGet t) {
        super(t);
        this.projectKey = t.projectKey;
    }

    public ApiHttpRequest createHttpRequest() {
        ApiHttpRequest httpRequest = new ApiHttpRequest();
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/shipping-methods", this.projectKey);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        httpRequest.setUri(httpRequestPath); 
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

    public ByProjectKeyShippingMethodsGet withExpand(final String expand){
        return new ByProjectKeyShippingMethodsGet(this).addQueryParam("expand", expand);
    }
    
    public ByProjectKeyShippingMethodsGet withSort(final String sort){
        return new ByProjectKeyShippingMethodsGet(this).addQueryParam("sort", sort);
    }
    
    public ByProjectKeyShippingMethodsGet withLimit(final Integer limit){
        return new ByProjectKeyShippingMethodsGet(this).addQueryParam("limit", limit);
    }
    
    public ByProjectKeyShippingMethodsGet withOffset(final Integer offset){
        return new ByProjectKeyShippingMethodsGet(this).addQueryParam("offset", offset);
    }
    
    public ByProjectKeyShippingMethodsGet withWithTotal(final Boolean withTotal){
        return new ByProjectKeyShippingMethodsGet(this).addQueryParam("withTotal", withTotal);
    }
    
    public ByProjectKeyShippingMethodsGet withWhere(final String where){
        return new ByProjectKeyShippingMethodsGet(this).addQueryParam("where", where);
    }
}
