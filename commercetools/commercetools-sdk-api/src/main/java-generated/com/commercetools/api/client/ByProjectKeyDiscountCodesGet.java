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
*  <p>Query discount-codes</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyDiscountCodesGet extends ApiMethod<ByProjectKeyDiscountCodesGet> {

    
    private String projectKey;
    

    public ByProjectKeyDiscountCodesGet(final ApiHttpClient apiHttpClient, String projectKey){
        super(apiHttpClient);
        this.projectKey = projectKey;
    }

    public ApiHttpRequest createHttpRequest() {
        ApiHttpRequest httpRequest = new ApiHttpRequest();
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/discount-codes", this.projectKey);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        httpRequest.setRelativeUrl(httpRequestPath); 
        httpRequest.setMethod(ApiHttpMethod.GET);
        httpRequest.setHeaders(getHeaders());
        
        return httpRequest;
    }

    public ApiHttpResponse<com.commercetools.api.models.discount_code.DiscountCodePagedQueryResponse> executeBlocking(){
        try {
            return execute().get();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.discount_code.DiscountCodePagedQueryResponse>> execute(){
        return apiHttpClient().execute(this.createHttpRequest())
                .thenApply(response -> {
                    if(response.getStatusCode() >= 400){
                        throw new ApiHttpException(response.getStatusCode(), new String(response.getBody()), response.getHeaders());
                    }
                    return Utils.convertResponse(response,com.commercetools.api.models.discount_code.DiscountCodePagedQueryResponse.class);
                });
    }

    public String getProjectKey() {return this.projectKey;}

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }
    
    public List<String> getSort() {
        return this.getQueryParam("sort");
    }
    
    public List<Integer> getLimit() {
        return this.getQueryParam("limit");
    }
    
    public List<Integer> getOffset() {
        return this.getQueryParam("offset");
    }
    
    public List<Boolean> getWithTotal() {
        return this.getQueryParam("withTotal");
    }
    
    public List<String> getWhere() {
        return this.getQueryParam("where");
    }

    public void setProjectKey(final String projectKey) {this.projectKey = projectKey;}

    public ByProjectKeyDiscountCodesGet withExpand(final String expand){
        return this.addQueryParam("expand", expand);
    }
    
    public ByProjectKeyDiscountCodesGet withSort(final String sort){
        return this.addQueryParam("sort", sort);
    }
    
    public ByProjectKeyDiscountCodesGet withLimit(final Integer limit){
        return this.addQueryParam("limit", limit);
    }
    
    public ByProjectKeyDiscountCodesGet withOffset(final Integer offset){
        return this.addQueryParam("offset", offset);
    }
    
    public ByProjectKeyDiscountCodesGet withWithTotal(final Boolean withTotal){
        return this.addQueryParam("withTotal", withTotal);
    }
    
    public ByProjectKeyDiscountCodesGet withWhere(final String where){
        return this.addQueryParam("where", where);
    }
}
