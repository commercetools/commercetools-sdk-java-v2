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
*  <p>Get CustomObject by container</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyCustomObjectsByContainerGet extends ApiMethod<ByProjectKeyCustomObjectsByContainerGet> {

    
    private String projectKey;
    private String container;
    

    public ByProjectKeyCustomObjectsByContainerGet(final ApiHttpClient apiHttpClient, String projectKey, String container) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.container = container;
    }

    public ByProjectKeyCustomObjectsByContainerGet(ByProjectKeyCustomObjectsByContainerGet t) {
        super(t);
        this.projectKey = t.projectKey;
        this.container = t.container;
    }

    public ApiHttpRequest createHttpRequest() {
        ApiHttpRequest httpRequest = new ApiHttpRequest();
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/custom-objects/%s", this.projectKey, this.container);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        httpRequest.setUri(httpRequestPath); 
        httpRequest.setMethod(ApiHttpMethod.GET);
        httpRequest.setHeaders(getHeaders());
        
        return httpRequest;
    }

    public ApiHttpResponse<com.commercetools.api.models.custom_object.CustomObject> executeBlocking(){
        return executeBlocking(Duration.ofSeconds(60));
    }
    
    public ApiHttpResponse<com.commercetools.api.models.custom_object.CustomObject> executeBlocking(Duration timeout){
        return blockingWait(execute(), timeout);
    }

    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.custom_object.CustomObject>> execute(){
        return apiHttpClient().execute(this.createHttpRequest(), com.commercetools.api.models.custom_object.CustomObject.class);
    }

    public String getProjectKey() {return this.projectKey;}
    public String getContainer() {return this.container;}

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }
    
    public void setContainer(final String container) { this.container = container; }

    public ByProjectKeyCustomObjectsByContainerGet withExpand(final String expand){
        return new ByProjectKeyCustomObjectsByContainerGet(this).addQueryParam("expand", expand);
    }
}
