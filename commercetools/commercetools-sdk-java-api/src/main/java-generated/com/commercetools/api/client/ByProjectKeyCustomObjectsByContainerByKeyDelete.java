package com.commercetools.api.client;

import io.vrap.rmf.base.client.utils.Utils;
import io.vrap.rmf.base.client.utils.json.VrapJsonUtils;

import java.io.InputStream;
import java.io.IOException;

import java.nio.file.Files;

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


/**
*  <p>Delete CustomObject by container and key</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyCustomObjectsByContainerByKeyDelete extends ApiMethod<ByProjectKeyCustomObjectsByContainerByKeyDelete> {

    
    private String projectKey;
    private String container;
    private String key;
    

    public ByProjectKeyCustomObjectsByContainerByKeyDelete(final ApiHttpClient apiHttpClient, String projectKey, String container, String key) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.container = container;
        this.key = key;
    }

    public ByProjectKeyCustomObjectsByContainerByKeyDelete(ByProjectKeyCustomObjectsByContainerByKeyDelete t) {
        super(t);
        this.projectKey = t.projectKey;
        this.container = t.container;
        this.key = t.key;
    }

    public ApiHttpRequest createHttpRequest() {
        ApiHttpRequest httpRequest = new ApiHttpRequest();
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/custom-objects/%s/%s", this.projectKey, this.container, this.key);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        httpRequest.setRelativeUrl(httpRequestPath); 
        httpRequest.setUri(httpRequestPath); 
        httpRequest.setMethod(ApiHttpMethod.DELETE);
        httpRequest.setHeaders(getHeaders());
        
        return httpRequest;
    }

    public ApiHttpResponse<com.commercetools.api.models.custom_object.CustomObject> executeBlocking(){
        try {
            return execute().get();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.custom_object.CustomObject>> execute(){
        return apiHttpClient().execute(this.createHttpRequest())
                .thenApply(response -> {
                    if(response.getStatusCode() >= 400){
                        throw new ApiHttpException(response.getStatusCode(), new String(response.getBody()), response.getHeaders());
                    }
                    return Utils.convertResponse(response,com.commercetools.api.models.custom_object.CustomObject.class);
                });
    }

    public String getProjectKey() {return this.projectKey;}
    public String getContainer() {return this.container;}
    public String getKey() {return this.key;}

    public List<String> getVersion() {
        return this.getQueryParam("version");
    }
    
    public List<String> getDataErasure() {
        return this.getQueryParam("dataErasure");
    }
    
    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }
    
    public void setContainer(final String container) { this.container = container; }
    
    public void setKey(final String key) { this.key = key; }

    public ByProjectKeyCustomObjectsByContainerByKeyDelete withVersion(final Long version){
        return new ByProjectKeyCustomObjectsByContainerByKeyDelete(this).addQueryParam("version", version);
    }
    
    public ByProjectKeyCustomObjectsByContainerByKeyDelete withDataErasure(final Boolean dataErasure){
        return new ByProjectKeyCustomObjectsByContainerByKeyDelete(this).addQueryParam("dataErasure", dataErasure);
    }
    
    public ByProjectKeyCustomObjectsByContainerByKeyDelete withExpand(final String expand){
        return new ByProjectKeyCustomObjectsByContainerByKeyDelete(this).addQueryParam("expand", expand);
    }
}
