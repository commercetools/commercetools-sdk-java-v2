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
*  <p>Query discount-codes</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyDiscountCodesGet extends ApiMethod<ByProjectKeyDiscountCodesGet> {

    
    private String projectKey;
    

    public ByProjectKeyDiscountCodesGet(final ApiHttpClient apiHttpClient, String projectKey) {
        super(apiHttpClient);
        this.projectKey = projectKey;
    }

    public ByProjectKeyDiscountCodesGet(ByProjectKeyDiscountCodesGet t) {
        super(t);
        this.projectKey = t.projectKey;
    }

    public ApiHttpRequest createHttpRequest() {
        ApiHttpRequest httpRequest = new ApiHttpRequest();
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/discount-codes", this.projectKey);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        httpRequest.setUri(httpRequestPath); 
        httpRequest.setMethod(ApiHttpMethod.GET);
        httpRequest.setHeaders(getHeaders());
        
        return httpRequest;
    }

    public ApiHttpResponse<com.commercetools.api.models.discount_code.DiscountCodePagedQueryResponse> executeBlocking(){
        return executeBlocking(Duration.ofSeconds(60));
    }
    
    public ApiHttpResponse<com.commercetools.api.models.discount_code.DiscountCodePagedQueryResponse> executeBlocking(Duration timeout){
        return blockingWait(execute(), timeout);
    }

    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.discount_code.DiscountCodePagedQueryResponse>> execute(){
        return apiHttpClient().execute(this.createHttpRequest())
                .thenApply(response -> Utils.convertResponse(response,com.commercetools.api.models.discount_code.DiscountCodePagedQueryResponse.class));
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

    public ByProjectKeyDiscountCodesGet withExpand(final String expand){
        return new ByProjectKeyDiscountCodesGet(this).addQueryParam("expand", expand);
    }
    
    public ByProjectKeyDiscountCodesGet withSort(final String sort){
        return new ByProjectKeyDiscountCodesGet(this).addQueryParam("sort", sort);
    }
    
    public ByProjectKeyDiscountCodesGet withLimit(final Integer limit){
        return new ByProjectKeyDiscountCodesGet(this).addQueryParam("limit", limit);
    }
    
    public ByProjectKeyDiscountCodesGet withOffset(final Integer offset){
        return new ByProjectKeyDiscountCodesGet(this).addQueryParam("offset", offset);
    }
    
    public ByProjectKeyDiscountCodesGet withWithTotal(final Boolean withTotal){
        return new ByProjectKeyDiscountCodesGet(this).addQueryParam("withTotal", withTotal);
    }
    
    public ByProjectKeyDiscountCodesGet withWhere(final String where){
        return new ByProjectKeyDiscountCodesGet(this).addQueryParam("where", where);
    }
}
