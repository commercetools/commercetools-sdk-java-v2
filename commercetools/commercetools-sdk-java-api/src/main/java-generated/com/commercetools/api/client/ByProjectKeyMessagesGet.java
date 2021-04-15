package com.commercetools.api.client;

import io.vrap.rmf.base.client.utils.Utils;

import java.io.InputStream;
import java.io.IOException;

import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.concurrent.CompletableFuture;
import io.vrap.rmf.base.client.utils.Generated;

import javax.annotation.Nullable;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import io.vrap.rmf.base.client.*;


import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

/**
*  <p>Query messages</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyMessagesGet extends ApiMethod<ByProjectKeyMessagesGet, com.commercetools.api.models.message.MessagePagedQueryResponse> implements com.commercetools.api.models.PagedQueryResourceRequest<ByProjectKeyMessagesGet, com.commercetools.api.models.message.MessagePagedQueryResponse>, com.commercetools.api.client.ExpandableTrait<ByProjectKeyMessagesGet>, com.commercetools.api.client.SortableTrait<ByProjectKeyMessagesGet>, com.commercetools.api.client.PagingTrait<ByProjectKeyMessagesGet>, com.commercetools.api.client.QueryTrait<ByProjectKeyMessagesGet>, com.commercetools.api.client.ErrorableTrait<ByProjectKeyMessagesGet>, com.commercetools.api.client.DeprecatableTrait<ByProjectKeyMessagesGet> {

    
    private String projectKey;
    

    public ByProjectKeyMessagesGet(final ApiHttpClient apiHttpClient, String projectKey) {
        super(apiHttpClient);
        this.projectKey = projectKey;
    }

    public ByProjectKeyMessagesGet(ByProjectKeyMessagesGet t) {
        super(t);
        this.projectKey = t.projectKey;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/messages", this.projectKey);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        
        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.message.MessagePagedQueryResponse> executeBlocking(final ApiHttpClient client, Duration timeout){
        return blockingWait(execute(client), timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.message.MessagePagedQueryResponse>> execute(final ApiHttpClient client){
        return client.execute(this.createHttpRequest(), com.commercetools.api.models.message.MessagePagedQueryResponse.class);
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

    public ByProjectKeyMessagesGet withExpand(final String expand){
        return copy().withQueryParam("expand", expand);
    }
    
    public ByProjectKeyMessagesGet addExpand(final String expand){
        return copy().addQueryParam("expand", expand);
    }
    
    public ByProjectKeyMessagesGet withSort(final String sort){
        return copy().withQueryParam("sort", sort);
    }
    
    public ByProjectKeyMessagesGet addSort(final String sort){
        return copy().addQueryParam("sort", sort);
    }
    
    public ByProjectKeyMessagesGet withLimit(final int limit){
        return copy().withQueryParam("limit", limit);
    }
    
    public ByProjectKeyMessagesGet addLimit(final int limit){
        return copy().addQueryParam("limit", limit);
    }
    
    public ByProjectKeyMessagesGet withOffset(final int offset){
        return copy().withQueryParam("offset", offset);
    }
    
    public ByProjectKeyMessagesGet addOffset(final int offset){
        return copy().addQueryParam("offset", offset);
    }
    
    public ByProjectKeyMessagesGet withWithTotal(final boolean withTotal){
        return copy().withQueryParam("withTotal", withTotal);
    }
    
    public ByProjectKeyMessagesGet addWithTotal(final boolean withTotal){
        return copy().addQueryParam("withTotal", withTotal);
    }
    
    public ByProjectKeyMessagesGet withWhere(final String where){
        return copy().withQueryParam("where", where);
    }
    
    public ByProjectKeyMessagesGet addWhere(final String where){
        return copy().addQueryParam("where", where);
    }

    public ByProjectKeyMessagesGet withPredicateVar(final String varName, final String predicateVar){
        return copy().withQueryParam(String.format("var.%s", varName), predicateVar);
    }
    
    public ByProjectKeyMessagesGet addPredicateVar(final String varName, final String predicateVar){
        return copy().addQueryParam(String.format("var.%s", varName), predicateVar);
    }
    
    

    @Override
    protected ByProjectKeyMessagesGet copy()
    {
        return new ByProjectKeyMessagesGet(this);
    }
}
