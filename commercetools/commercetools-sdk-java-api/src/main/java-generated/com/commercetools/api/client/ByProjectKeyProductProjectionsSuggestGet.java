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


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyProductProjectionsSuggestGet extends ApiMethod<ByProjectKeyProductProjectionsSuggestGet> {

    
    private String projectKey;
    

    public ByProjectKeyProductProjectionsSuggestGet(final ApiHttpClient apiHttpClient, String projectKey) {
        super(apiHttpClient);
        this.projectKey = projectKey;
    }

    public ByProjectKeyProductProjectionsSuggestGet(ByProjectKeyProductProjectionsSuggestGet t) {
        super(t);
        this.projectKey = t.projectKey;
    }

    public ApiHttpRequest createHttpRequest() {
        ApiHttpRequest httpRequest = new ApiHttpRequest();
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/product-projections/suggest", this.projectKey);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        httpRequest.setUri(httpRequestPath); 
        httpRequest.setMethod(ApiHttpMethod.GET);
        httpRequest.setHeaders(getHeaders());
        
        return httpRequest;
    }

    public ApiHttpResponse<com.fasterxml.jackson.databind.JsonNode> executeBlocking(){
        try {
            return execute().get();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public CompletableFuture<ApiHttpResponse<com.fasterxml.jackson.databind.JsonNode>> execute(){
        return apiHttpClient().execute(this.createHttpRequest())
                .thenApply(response -> {
                    if(response.getStatusCode() >= 400){
                        throw new ApiHttpException(response.getStatusCode(), new String(response.getBody()), response.getHeaders());
                    }
                    return Utils.convertResponse(response,com.fasterxml.jackson.databind.JsonNode.class);
                });
    }

    public String getProjectKey() {return this.projectKey;}

    public List<String> getFuzzy() {
        return this.getQueryParam("fuzzy");
    }
    
    public List<String> getStaged() {
        return this.getQueryParam("staged");
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

    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }

    public ByProjectKeyProductProjectionsSuggestGet withFuzzy(final Boolean fuzzy){
        return new ByProjectKeyProductProjectionsSuggestGet(this).addQueryParam("fuzzy", fuzzy);
    }
    
    public ByProjectKeyProductProjectionsSuggestGet withStaged(final Boolean staged){
        return new ByProjectKeyProductProjectionsSuggestGet(this).addQueryParam("staged", staged);
    }
    
    public ByProjectKeyProductProjectionsSuggestGet withSort(final String sort){
        return new ByProjectKeyProductProjectionsSuggestGet(this).addQueryParam("sort", sort);
    }
    
    public ByProjectKeyProductProjectionsSuggestGet withLimit(final Integer limit){
        return new ByProjectKeyProductProjectionsSuggestGet(this).addQueryParam("limit", limit);
    }
    
    public ByProjectKeyProductProjectionsSuggestGet withOffset(final Integer offset){
        return new ByProjectKeyProductProjectionsSuggestGet(this).addQueryParam("offset", offset);
    }
    
    public ByProjectKeyProductProjectionsSuggestGet withWithTotal(final Boolean withTotal){
        return new ByProjectKeyProductProjectionsSuggestGet(this).addQueryParam("withTotal", withTotal);
    }
}
