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
*  <p>Delete Subscription by key</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeySubscriptionsKeyByKeyDelete extends ApiMethod<ByProjectKeySubscriptionsKeyByKeyDelete> {

    
    private String projectKey;
    private String key;
    

    public ByProjectKeySubscriptionsKeyByKeyDelete(final ApiHttpClient apiHttpClient, String projectKey, String key) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.key = key;
    }

    public ByProjectKeySubscriptionsKeyByKeyDelete(ByProjectKeySubscriptionsKeyByKeyDelete t) {
        super(t);
        this.projectKey = t.projectKey;
        this.key = t.key;
    }

    public ApiHttpRequest createHttpRequest() {
        ApiHttpRequest httpRequest = new ApiHttpRequest();
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/subscriptions/key=%s", this.projectKey, this.key);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        httpRequest.setUri(httpRequestPath); 
        httpRequest.setMethod(ApiHttpMethod.DELETE);
        httpRequest.setHeaders(getHeaders());
        
        return httpRequest;
    }

    public ApiHttpResponse<com.commercetools.api.models.subscription.Subscription> executeBlocking(){
        return executeBlocking(Duration.ofSeconds(60));
    }
    
    public ApiHttpResponse<com.commercetools.api.models.subscription.Subscription> executeBlocking(Duration timeout){
        return blockingWait(execute(), timeout);
    }

    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.subscription.Subscription>> execute(){
        return apiHttpClient().execute(this.createHttpRequest(), com.commercetools.api.models.subscription.Subscription.class);
    }

    public String getProjectKey() {return this.projectKey;}
    public String getKey() {return this.key;}

    public List<String> getVersion() {
        return this.getQueryParam("version");
    }
    
    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }
    
    public void setKey(final String key) { this.key = key; }

    public ByProjectKeySubscriptionsKeyByKeyDelete withVersion(final Long version){
        return new ByProjectKeySubscriptionsKeyByKeyDelete(this).addQueryParam("version", version);
    }
    
    public ByProjectKeySubscriptionsKeyByKeyDelete withExpand(final String expand){
        return new ByProjectKeySubscriptionsKeyByKeyDelete(this).addQueryParam("expand", expand);
    }
}
