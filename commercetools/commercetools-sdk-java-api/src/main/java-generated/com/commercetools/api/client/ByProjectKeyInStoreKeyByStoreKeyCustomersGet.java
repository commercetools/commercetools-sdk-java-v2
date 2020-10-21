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
*  <p>Query customers</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyInStoreKeyByStoreKeyCustomersGet extends ApiMethod<ByProjectKeyInStoreKeyByStoreKeyCustomersGet> {

    
    private String projectKey;
    private String storeKey;
    

    public ByProjectKeyInStoreKeyByStoreKeyCustomersGet(final ApiHttpClient apiHttpClient, String projectKey, String storeKey) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.storeKey = storeKey;
    }

    public ByProjectKeyInStoreKeyByStoreKeyCustomersGet(ByProjectKeyInStoreKeyByStoreKeyCustomersGet t) {
        super(t);
        this.projectKey = t.projectKey;
        this.storeKey = t.storeKey;
    }

    public ApiHttpRequest createHttpRequest() {
        ApiHttpRequest httpRequest = new ApiHttpRequest();
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/in-store/key=%s/customers", this.projectKey, this.storeKey);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        httpRequest.setUri(httpRequestPath); 
        httpRequest.setMethod(ApiHttpMethod.GET);
        httpRequest.setHeaders(getHeaders());
        
        return httpRequest;
    }

    public ApiHttpResponse<com.commercetools.api.models.customer.CustomerPagedQueryResponse> executeBlocking(){
        return executeBlocking(Duration.ofSeconds(60));
    }
    
    public ApiHttpResponse<com.commercetools.api.models.customer.CustomerPagedQueryResponse> executeBlocking(Duration timeout){
        return blockingWait(execute(), timeout);
    }

    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.customer.CustomerPagedQueryResponse>> execute(){
        return apiHttpClient().execute(this.createHttpRequest())
                .thenApply(response -> Utils.convertResponse(response,com.commercetools.api.models.customer.CustomerPagedQueryResponse.class));
    }

    public String getProjectKey() {return this.projectKey;}
    public String getStoreKey() {return this.storeKey;}

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
    
    public void setStoreKey(final String storeKey) { this.storeKey = storeKey; }

    public ByProjectKeyInStoreKeyByStoreKeyCustomersGet withExpand(final String expand){
        return new ByProjectKeyInStoreKeyByStoreKeyCustomersGet(this).addQueryParam("expand", expand);
    }
    
    public ByProjectKeyInStoreKeyByStoreKeyCustomersGet withSort(final String sort){
        return new ByProjectKeyInStoreKeyByStoreKeyCustomersGet(this).addQueryParam("sort", sort);
    }
    
    public ByProjectKeyInStoreKeyByStoreKeyCustomersGet withLimit(final Integer limit){
        return new ByProjectKeyInStoreKeyByStoreKeyCustomersGet(this).addQueryParam("limit", limit);
    }
    
    public ByProjectKeyInStoreKeyByStoreKeyCustomersGet withOffset(final Integer offset){
        return new ByProjectKeyInStoreKeyByStoreKeyCustomersGet(this).addQueryParam("offset", offset);
    }
    
    public ByProjectKeyInStoreKeyByStoreKeyCustomersGet withWithTotal(final Boolean withTotal){
        return new ByProjectKeyInStoreKeyByStoreKeyCustomersGet(this).addQueryParam("withTotal", withTotal);
    }
    
    public ByProjectKeyInStoreKeyByStoreKeyCustomersGet withWhere(final String where){
        return new ByProjectKeyInStoreKeyByStoreKeyCustomersGet(this).addQueryParam("where", where);
    }
}
