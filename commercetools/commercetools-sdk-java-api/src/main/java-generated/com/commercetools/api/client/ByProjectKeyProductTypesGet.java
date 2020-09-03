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
*  <p>Query product-types</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyProductTypesGet extends ApiMethod<ByProjectKeyProductTypesGet> {

    
    private String projectKey;
    

    public ByProjectKeyProductTypesGet(final ApiHttpClient apiHttpClient, String projectKey) {
        super(apiHttpClient);
        this.projectKey = projectKey;
    }

    public ByProjectKeyProductTypesGet(ByProjectKeyProductTypesGet t) {
        super(t);
        this.projectKey = t.projectKey;
    }

    public ApiHttpRequest createHttpRequest() {
        ApiHttpRequest httpRequest = new ApiHttpRequest();
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/product-types", this.projectKey);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        httpRequest.setUri(httpRequestPath); 
        httpRequest.setMethod(ApiHttpMethod.GET);
        httpRequest.setHeaders(getHeaders());
        
        return httpRequest;
    }

    public ApiHttpResponse<com.commercetools.api.models.product_type.ProductTypePagedQueryResponse> executeBlocking(){
        try {
            return execute().get();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.product_type.ProductTypePagedQueryResponse>> execute(){
        return apiHttpClient().execute(this.createHttpRequest())
                .thenApply(response -> {
                    if(response.getStatusCode() >= 400){
                        throw new ApiHttpException(response.getStatusCode(), new String(response.getBody()), response.getHeaders());
                    }
                    return Utils.convertResponse(response,com.commercetools.api.models.product_type.ProductTypePagedQueryResponse.class);
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

    public ByProjectKeyProductTypesGet withExpand(final String expand){
        return new ByProjectKeyProductTypesGet(this).addQueryParam("expand", expand);
    }
    
    public ByProjectKeyProductTypesGet withSort(final String sort){
        return new ByProjectKeyProductTypesGet(this).addQueryParam("sort", sort);
    }
    
    public ByProjectKeyProductTypesGet withLimit(final Integer limit){
        return new ByProjectKeyProductTypesGet(this).addQueryParam("limit", limit);
    }
    
    public ByProjectKeyProductTypesGet withOffset(final Integer offset){
        return new ByProjectKeyProductTypesGet(this).addQueryParam("offset", offset);
    }
    
    public ByProjectKeyProductTypesGet withWithTotal(final Boolean withTotal){
        return new ByProjectKeyProductTypesGet(this).addQueryParam("withTotal", withTotal);
    }
    
    public ByProjectKeyProductTypesGet withWhere(final String where){
        return new ByProjectKeyProductTypesGet(this).addQueryParam("where", where);
    }
}
