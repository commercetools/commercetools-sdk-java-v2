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
*  <p>Create MyCart</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyMeCartsPost extends ApiMethod<ByProjectKeyMeCartsPost> {

    
    private String projectKey;
    
    private com.commercetools.api.models.me.MyCartDraft myCartDraft;

    public ByProjectKeyMeCartsPost(final ApiHttpClient apiHttpClient, String projectKey, com.commercetools.api.models.me.MyCartDraft myCartDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.myCartDraft = myCartDraft;
    }

    public ByProjectKeyMeCartsPost(ByProjectKeyMeCartsPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.myCartDraft = t.myCartDraft;
    }

    public ApiHttpRequest createHttpRequest() {
        ApiHttpRequest httpRequest = new ApiHttpRequest();
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/me/carts", this.projectKey);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        httpRequest.setUri(httpRequestPath); 
        httpRequest.setMethod(ApiHttpMethod.POST);
        httpRequest.setHeaders(getHeaders());
        try{httpRequest.setBody(apiHttpClient().getSerializerService().toJsonByteArray(myCartDraft));}catch(Exception e){e.printStackTrace();}
        return httpRequest;
    }

    public ApiHttpResponse<com.commercetools.api.models.me.MyCart> executeBlocking(){
        return executeBlocking(Duration.ofSeconds(60));
    }
    
    public ApiHttpResponse<com.commercetools.api.models.me.MyCart> executeBlocking(Duration timeout){
        return blockingWait(execute(), timeout);
    }

    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.me.MyCart>> execute(){
        return apiHttpClient().execute(this.createHttpRequest(), com.commercetools.api.models.me.MyCart.class);
    }

    public String getProjectKey() {return this.projectKey;}

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }

    public ByProjectKeyMeCartsPost withExpand(final String expand){
        return new ByProjectKeyMeCartsPost(this).addQueryParam("expand", expand);
    }
}
