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

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyMePasswordPost extends ApiMethod<ByProjectKeyMePasswordPost> {

    
    private String projectKey;
    
    private com.fasterxml.jackson.databind.JsonNode jsonNode;

    public ByProjectKeyMePasswordPost(final ApiHttpClient apiHttpClient, String projectKey, com.fasterxml.jackson.databind.JsonNode jsonNode) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.jsonNode = jsonNode;
    }

    public ByProjectKeyMePasswordPost(ByProjectKeyMePasswordPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.jsonNode = t.jsonNode;
    }

    public ApiHttpRequest createHttpRequest() {
        ApiHttpRequest httpRequest = new ApiHttpRequest();
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/me/password", this.projectKey);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        httpRequest.setUri(httpRequestPath); 
        httpRequest.setMethod(ApiHttpMethod.POST);
        httpRequest.setHeaders(getHeaders());
        try{httpRequest.setBody(apiHttpClient().getSerializerService().toJsonByteArray(jsonNode));}catch(Exception e){e.printStackTrace();}
        return httpRequest;
    }

    public ApiHttpResponse<com.commercetools.api.models.me.MyCustomer> executeBlocking(){
        return executeBlocking(Duration.ofSeconds(60));
    }
    
    public ApiHttpResponse<com.commercetools.api.models.me.MyCustomer> executeBlocking(Duration timeout){
        return blockingWait(execute(), timeout);
    }

    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.me.MyCustomer>> execute(){
        return apiHttpClient().execute(this.createHttpRequest(), com.commercetools.api.models.me.MyCustomer.class);
    }

    public String getProjectKey() {return this.projectKey;}


    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }

}
