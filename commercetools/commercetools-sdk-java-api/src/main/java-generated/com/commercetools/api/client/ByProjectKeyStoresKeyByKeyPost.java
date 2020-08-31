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
*  <p>Update Store by key</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyStoresKeyByKeyPost extends ApiMethod<ByProjectKeyStoresKeyByKeyPost> {

    
    private String projectKey;
    private String key;
    
    private com.commercetools.api.models.store.StoreUpdate storeUpdate;

    public ByProjectKeyStoresKeyByKeyPost(final ApiHttpClient apiHttpClient, String projectKey, String key, com.commercetools.api.models.store.StoreUpdate storeUpdate) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.key = key;
        this.storeUpdate = storeUpdate;
    }

    public ByProjectKeyStoresKeyByKeyPost(ByProjectKeyStoresKeyByKeyPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.key = t.key;
        this.storeUpdate = t.storeUpdate;
    }

    public ApiHttpRequest createHttpRequest() {
        ApiHttpRequest httpRequest = new ApiHttpRequest();
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/stores/key=%s", this.projectKey, this.key);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        httpRequest.setRelativeUrl(httpRequestPath); 
        httpRequest.setMethod(ApiHttpMethod.POST);
        httpRequest.setHeaders(getHeaders());
        try{httpRequest.setBody(VrapJsonUtils.toJsonByteArray(storeUpdate));}catch(Exception e){e.printStackTrace();}
        return httpRequest;
    }

    public ApiHttpResponse<com.commercetools.api.models.store.Store> executeBlocking(){
        try {
            return execute().get();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.store.Store>> execute(){
        return apiHttpClient().execute(this.createHttpRequest())
                .thenApply(response -> {
                    if(response.getStatusCode() >= 400){
                        throw new ApiHttpException(response.getStatusCode(), new String(response.getBody()), response.getHeaders());
                    }
                    return Utils.convertResponse(response,com.commercetools.api.models.store.Store.class);
                });
    }

    public String getProjectKey() {return this.projectKey;}
    public String getKey() {return this.key;}

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }
    
    public void setKey(final String key) { this.key = key; }

    public ByProjectKeyStoresKeyByKeyPost withExpand(final String expand){
        return new ByProjectKeyStoresKeyByKeyPost(this).addQueryParam("expand", expand);
    }
}
