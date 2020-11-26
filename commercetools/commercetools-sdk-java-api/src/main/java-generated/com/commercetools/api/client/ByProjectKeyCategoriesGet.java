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
*  <p>Query categories</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyCategoriesGet extends ApiMethod<ByProjectKeyCategoriesGet> {

    
    private String projectKey;
    

    public ByProjectKeyCategoriesGet(final ApiHttpClient apiHttpClient, String projectKey) {
        super(apiHttpClient);
        this.projectKey = projectKey;
    }

    public ByProjectKeyCategoriesGet(ByProjectKeyCategoriesGet t) {
        super(t);
        this.projectKey = t.projectKey;
    }

    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/categories", this.projectKey);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        
        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    public ApiHttpResponse<com.commercetools.api.models.category.CategoryPagedQueryResponse> executeBlocking(){
        return executeBlocking(Duration.ofSeconds(60));
    }
    
    public ApiHttpResponse<com.commercetools.api.models.category.CategoryPagedQueryResponse> executeBlocking(Duration timeout){
        return blockingWait(execute(), timeout);
    }

    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.category.CategoryPagedQueryResponse>> execute(){
        return apiHttpClient().execute(this.createHttpRequest(), com.commercetools.api.models.category.CategoryPagedQueryResponse.class);
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

    public ByProjectKeyCategoriesGet withExpand(final String expand){
        return new ByProjectKeyCategoriesGet(this).addQueryParam("expand", expand);
    }
    
    public ByProjectKeyCategoriesGet withSort(final String sort){
        return new ByProjectKeyCategoriesGet(this).addQueryParam("sort", sort);
    }
    
    public ByProjectKeyCategoriesGet withLimit(final Integer limit){
        return new ByProjectKeyCategoriesGet(this).addQueryParam("limit", limit);
    }
    
    public ByProjectKeyCategoriesGet withOffset(final Integer offset){
        return new ByProjectKeyCategoriesGet(this).addQueryParam("offset", offset);
    }
    
    public ByProjectKeyCategoriesGet withWithTotal(final Boolean withTotal){
        return new ByProjectKeyCategoriesGet(this).addQueryParam("withTotal", withTotal);
    }
    
    public ByProjectKeyCategoriesGet withWhere(final String where){
        return new ByProjectKeyCategoriesGet(this).addQueryParam("where", where);
    }
    
    @Override
    protected ByProjectKeyCategoriesGet copy()
    {
        return new ByProjectKeyCategoriesGet(this);
    }
}
