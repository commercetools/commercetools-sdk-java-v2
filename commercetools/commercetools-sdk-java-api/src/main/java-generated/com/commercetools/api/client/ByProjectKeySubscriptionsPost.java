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
*  <p>The creation of a Subscription is eventually consistent, it may take up to a minute before it becomes fully active.
*  In order to test that the destination is correctly configured, a test message will be put into the queue.
*  If the message could not be delivered, the subscription will not be created.
*  The payload of the test message is a notification of type ResourceCreated for the resourceTypeId subscription.
*  Currently, a maximum of 25 subscriptions can be created per project.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeySubscriptionsPost extends ApiMethod<ByProjectKeySubscriptionsPost> {

    
    private String projectKey;
    
    private com.commercetools.api.models.subscription.SubscriptionDraft subscriptionDraft;

    public ByProjectKeySubscriptionsPost(final ApiHttpClient apiHttpClient, String projectKey, com.commercetools.api.models.subscription.SubscriptionDraft subscriptionDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.subscriptionDraft = subscriptionDraft;
    }

    public ByProjectKeySubscriptionsPost(ByProjectKeySubscriptionsPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.subscriptionDraft = t.subscriptionDraft;
    }

    public ApiHttpRequest createHttpRequest() {
        ApiHttpRequest httpRequest = new ApiHttpRequest();
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/subscriptions", this.projectKey);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        httpRequest.setUri(httpRequestPath); 
        httpRequest.setMethod(ApiHttpMethod.POST);
        httpRequest.setHeaders(getHeaders());
        try{httpRequest.setBody(VrapJsonUtils.toJsonByteArray(subscriptionDraft));}catch(Exception e){e.printStackTrace();}
        return httpRequest;
    }

    public ApiHttpResponse<com.commercetools.api.models.subscription.Subscription> executeBlocking(){
        return executeBlocking(Duration.ofSeconds(60));
    }
    
    public ApiHttpResponse<com.commercetools.api.models.subscription.Subscription> executeBlocking(Duration timeout){
        return blockingWait(execute(), timeout);
    }

    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.subscription.Subscription>> execute(){
        return apiHttpClient().execute(this.createHttpRequest())
                .thenApply(response -> Utils.convertResponse(response,com.commercetools.api.models.subscription.Subscription.class));
    }

    public String getProjectKey() {return this.projectKey;}

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }

    public ByProjectKeySubscriptionsPost withExpand(final String expand){
        return new ByProjectKeySubscriptionsPost(this).addQueryParam("expand", expand);
    }
}
