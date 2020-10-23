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
*  <p>Query subscriptions</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeySubscriptionsGet extends ApiMethod<ByProjectKeySubscriptionsGet> {

    
    private String projectKey;
    

    public ByProjectKeySubscriptionsGet(final ApiHttpClient apiHttpClient, String projectKey) {
        super(apiHttpClient);
        this.projectKey = projectKey;
    }

    public ByProjectKeySubscriptionsGet(ByProjectKeySubscriptionsGet t) {
        super(t);
        this.projectKey = t.projectKey;
    }

    public ApiHttpRequest createHttpRequest() {
        ApiHttpRequest httpRequest = new ApiHttpRequest();
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/subscriptions", this.projectKey);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        httpRequest.setUri(httpRequestPath); 
        httpRequest.setMethod(ApiHttpMethod.GET);
        httpRequest.setHeaders(getHeaders());
        
        return httpRequest;
    }

    public ApiHttpResponse<com.commercetools.api.models.subscription.SubscriptionPagedQueryResponse> executeBlocking(){
        return executeBlocking(Duration.ofSeconds(60));
    }
    
    public ApiHttpResponse<com.commercetools.api.models.subscription.SubscriptionPagedQueryResponse> executeBlocking(Duration timeout){
        return blockingWait(execute(), timeout);
    }

    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.subscription.SubscriptionPagedQueryResponse>> execute(){
        return apiHttpClient().execute(this.createHttpRequest(), com.commercetools.api.models.subscription.SubscriptionPagedQueryResponse.class);
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

    public ByProjectKeySubscriptionsGet withExpand(final String expand){
        return new ByProjectKeySubscriptionsGet(this).addQueryParam("expand", expand);
    }
    
    public ByProjectKeySubscriptionsGet withSort(final String sort){
        return new ByProjectKeySubscriptionsGet(this).addQueryParam("sort", sort);
    }
    
    public ByProjectKeySubscriptionsGet withLimit(final Integer limit){
        return new ByProjectKeySubscriptionsGet(this).addQueryParam("limit", limit);
    }
    
    public ByProjectKeySubscriptionsGet withOffset(final Integer offset){
        return new ByProjectKeySubscriptionsGet(this).addQueryParam("offset", offset);
    }
    
    public ByProjectKeySubscriptionsGet withWithTotal(final Boolean withTotal){
        return new ByProjectKeySubscriptionsGet(this).addQueryParam("withTotal", withTotal);
    }
    
    public ByProjectKeySubscriptionsGet withWhere(final String where){
        return new ByProjectKeySubscriptionsGet(this).addQueryParam("where", where);
    }
}
