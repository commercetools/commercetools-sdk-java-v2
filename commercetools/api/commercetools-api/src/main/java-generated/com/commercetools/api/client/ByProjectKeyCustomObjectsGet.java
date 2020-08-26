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
*  <p>The query endpoint allows to retrieve custom objects in a specific container or all custom objects.
*  For performance reasons, it is highly advisable to query only for custom objects in a container by using
*  the container field in the where predicate.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyCustomObjectsGet {

    
    private ApiHttpHeaders headers = new ApiHttpHeaders();
    private Map<String, String> additionalQueryParams = new HashMap<>();
    private final ApiHttpClient apiHttpClient; 
    private List<String> expand = new ArrayList<>();
    private List<String> sort = new ArrayList<>();
    private List<Integer> limit = new ArrayList<>();
    private List<Integer> offset = new ArrayList<>();
    private List<Boolean> withTotal = new ArrayList<>();
    private List<String> where = new ArrayList<>();
    private String projectKey;
    

    public ByProjectKeyCustomObjectsGet(final ApiHttpClient apiHttpClient, String projectKey){
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ApiHttpRequest createHttpRequest() {
        ApiHttpRequest httpRequest = new ApiHttpRequest();
        List<String> params = new ArrayList<>();
        params.add(this.expand.stream().map(s -> "expand=" + urlEncode(s)).collect(Collectors.joining("&")));
        params.add(this.sort.stream().map(s -> "sort=" + urlEncode(s)).collect(Collectors.joining("&")));
        params.add(this.limit.stream().map(s -> "limit=" + s).collect(Collectors.joining("&")));
        params.add(this.offset.stream().map(s -> "offset=" + s).collect(Collectors.joining("&")));
        params.add(this.withTotal.stream().map(s -> "withTotal=" + s).collect(Collectors.joining("&")));
        params.add(this.where.stream().map(s -> "where=" + urlEncode(s)).collect(Collectors.joining("&")));
        params.add(additionalQueryParams.entrySet().stream().map(entry -> entry.getKey() + "=" + entry.getValue()).collect(Collectors.joining("&")));
        params.removeIf(String::isEmpty);
        String httpRequestPath = String.format("/%s/custom-objects", this.projectKey);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        httpRequest.setRelativeUrl(httpRequestPath); 
        httpRequest.setMethod(ApiHttpMethod.GET);
        httpRequest.setHeaders(headers);
        
        return httpRequest;
    }

    public ApiHttpResponse<com.commercetools.api.models.custom_object.CustomObjectPagedQueryResponse> executeBlocking(){
        try {
            return execute().get();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.custom_object.CustomObjectPagedQueryResponse>> execute(){
        return apiHttpClient.execute(this.createHttpRequest())
                .thenApply(response -> {
                    if(response.getStatusCode() >= 400){
                        throw new ApiHttpException(response.getStatusCode(), new String(response.getBody()), response.getHeaders());
                    }
                    return Utils.convertResponse(response,com.commercetools.api.models.custom_object.CustomObjectPagedQueryResponse.class);
                });
    }

    public String getProjectKey() {return this.projectKey;}

    public List<String> getExpand() {
        return this.expand;
    }
    
    public List<String> getSort() {
        return this.sort;
    }
    
    public List<Integer> getLimit() {
        return this.limit;
    }
    
    public List<Integer> getOffset() {
        return this.offset;
    }
    
    public List<Boolean> getWithTotal() {
        return this.withTotal;
    }
    
    public List<String> getWhere() {
        return this.where;
    }

    public void setProjectKey(final String projectKey) {this.projectKey = projectKey;}

    public ByProjectKeyCustomObjectsGet addExpand(final String expand){
        this.expand.add(expand);
        return this;
    }
    
    public ByProjectKeyCustomObjectsGet withExpand(final List<String> expand){
        this.expand = expand;
        return this;
    }
    
    public ByProjectKeyCustomObjectsGet addSort(final String sort){
        this.sort.add(sort);
        return this;
    }
    
    public ByProjectKeyCustomObjectsGet withSort(final List<String> sort){
        this.sort = sort;
        return this;
    }
    
    public ByProjectKeyCustomObjectsGet addLimit(final Integer limit){
        this.limit.add(limit);
        return this;
    }
    
    public ByProjectKeyCustomObjectsGet withLimit(final List<Integer> limit){
        this.limit = limit;
        return this;
    }
    
    public ByProjectKeyCustomObjectsGet addOffset(final Integer offset){
        this.offset.add(offset);
        return this;
    }
    
    public ByProjectKeyCustomObjectsGet withOffset(final List<Integer> offset){
        this.offset = offset;
        return this;
    }
    
    public ByProjectKeyCustomObjectsGet addWithTotal(final Boolean withTotal){
        this.withTotal.add(withTotal);
        return this;
    }
    
    public ByProjectKeyCustomObjectsGet withWithTotal(final List<Boolean> withTotal){
        this.withTotal = withTotal;
        return this;
    }
    
    public ByProjectKeyCustomObjectsGet addWhere(final String where){
        this.where.add(where);
        return this;
    }
    
    public ByProjectKeyCustomObjectsGet withWhere(final List<String> where){
        this.where = where;
        return this;
    }

    public ByProjectKeyCustomObjectsGet addHeader(final String key, final String value) {
        this.headers.addHeader(key, value);
        return this;
    }
    
    public ByProjectKeyCustomObjectsGet withHeaders(final ApiHttpHeaders headers) {
        this.headers = headers;
        return this;
    }
    
    public String getHeaderValue(final String key) {
        return this.headers.getHeaderValue(key);
    }
    
    public ApiHttpHeaders getHeaders() {
        return this.headers;
    }
    
    public ByProjectKeyCustomObjectsGet addAdditionalQueryParam(final String additionalQueryParamKey, final String additionalQueryParamValue) {
        this.additionalQueryParams.put(additionalQueryParamKey, additionalQueryParamValue);
        return this;
    }
    
    public ByProjectKeyCustomObjectsGet setAdditionalQueryParams(final Map<String, String> additionalQueryParams) {
        this.additionalQueryParams = additionalQueryParams;
        return this;
    }
    
    public Map<String, String> getAdditionalQueryParams() {
        return this.additionalQueryParams;
    }
    
    private String urlEncode(final String s){
        try{
             return URLEncoder.encode(s, "UTF-8");
         }catch (UnsupportedEncodingException e) {
             //this will never happen
             return null;
         }
    }

}
