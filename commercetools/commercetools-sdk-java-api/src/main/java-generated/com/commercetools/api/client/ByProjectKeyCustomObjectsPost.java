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
*  <p>Creates a new custom object or updates an existing custom object.
*  If an object with the given container/key exists,
*  the object will be replaced with the new value and the version is incremented.
*  If the request contains a version and an object with the given container/key exists then the version
*  must match the version of the existing object. Concurrent updates for the same custom object still can result
*  in a Conflict (409) even if the version is not provided.
*  Fields with null values will not be saved.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyCustomObjectsPost extends ApiMethod<ByProjectKeyCustomObjectsPost> {

    
    private String projectKey;
    
    private com.commercetools.api.models.custom_object.CustomObjectDraft customObjectDraft;

    public ByProjectKeyCustomObjectsPost(final ApiHttpClient apiHttpClient, String projectKey, com.commercetools.api.models.custom_object.CustomObjectDraft customObjectDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.customObjectDraft = customObjectDraft;
    }

    public ByProjectKeyCustomObjectsPost(ByProjectKeyCustomObjectsPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.customObjectDraft = t.customObjectDraft;
    }

    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/custom-objects", this.projectKey);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        try {
        final byte[] body = apiHttpClient().getSerializerService().toJsonByteArray(customObjectDraft);
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), body);
    } catch(Exception e) {
        e.printStackTrace();
    }
    
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), null);
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

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }

    public ByProjectKeyCustomObjectsPost withExpand(final String expand){
        return new ByProjectKeyCustomObjectsPost(this).addQueryParam("expand", expand);
    }
    
    @Override
    protected ByProjectKeyCustomObjectsPost copy()
    {
        return new ByProjectKeyCustomObjectsPost(this);
    }
}
