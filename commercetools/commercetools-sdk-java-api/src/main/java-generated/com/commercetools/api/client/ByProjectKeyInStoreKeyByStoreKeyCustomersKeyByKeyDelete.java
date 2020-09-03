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
*  <p>Delete Customer by key</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyDelete extends ApiMethod<ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyDelete> {

    
    private String projectKey;
    private String storeKey;
    private String key;
    

    public ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyDelete(final ApiHttpClient apiHttpClient, String projectKey, String storeKey, String key) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.key = key;
    }

    public ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyDelete(ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyDelete t) {
        super(t);
        this.projectKey = t.projectKey;
        this.storeKey = t.storeKey;
        this.key = t.key;
    }

    public ApiHttpRequest createHttpRequest() {
        ApiHttpRequest httpRequest = new ApiHttpRequest();
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/in-store/key=%s/customers/key=%s", this.projectKey, this.storeKey, this.key);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        httpRequest.setRelativeUrl(httpRequestPath); 
        httpRequest.setUri(httpRequestPath); 
        httpRequest.setMethod(ApiHttpMethod.DELETE);
        httpRequest.setHeaders(getHeaders());
        
        return httpRequest;
    }

    public ApiHttpResponse<com.commercetools.api.models.customer.Customer> executeBlocking(){
        try {
            return execute().get();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.customer.Customer>> execute(){
        return apiHttpClient().execute(this.createHttpRequest())
                .thenApply(response -> {
                    if(response.getStatusCode() >= 400){
                        throw new ApiHttpException(response.getStatusCode(), new String(response.getBody()), response.getHeaders());
                    }
                    return Utils.convertResponse(response,com.commercetools.api.models.customer.Customer.class);
                });
    }

    public String getProjectKey() {return this.projectKey;}
    public String getStoreKey() {return this.storeKey;}
    public String getKey() {return this.key;}

    public List<String> getDataErasure() {
        return this.getQueryParam("dataErasure");
    }
    
    public List<String> getVersion() {
        return this.getQueryParam("version");
    }
    
    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }
    
    public void setStoreKey(final String storeKey) { this.storeKey = storeKey; }
    
    public void setKey(final String key) { this.key = key; }

    public ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyDelete withDataErasure(final Boolean dataErasure){
        return new ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyDelete(this).addQueryParam("dataErasure", dataErasure);
    }
    
    public ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyDelete withVersion(final Long version){
        return new ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyDelete(this).addQueryParam("version", version);
    }
    
    public ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyDelete withExpand(final String expand){
        return new ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyDelete(this).addQueryParam("expand", expand);
    }
}
