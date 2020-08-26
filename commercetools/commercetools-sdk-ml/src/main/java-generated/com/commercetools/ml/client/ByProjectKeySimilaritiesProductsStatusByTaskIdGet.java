package com.commercetools.ml.client;

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
public class ByProjectKeySimilaritiesProductsStatusByTaskIdGet {

    
    private ApiHttpHeaders headers = new ApiHttpHeaders();
    private Map<String, String> additionalQueryParams = new HashMap<>();
    private final ApiHttpClient apiHttpClient; 
    
    private String projectKey;
    private String taskId;
    

    public ByProjectKeySimilaritiesProductsStatusByTaskIdGet(final ApiHttpClient apiHttpClient, String projectKey, String taskId){
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.taskId = taskId;
    }

    public ApiHttpRequest createHttpRequest() {
        ApiHttpRequest httpRequest = new ApiHttpRequest();
        List<String> params = new ArrayList<>();
        
        params.add(additionalQueryParams.entrySet().stream().map(entry -> entry.getKey() + "=" + entry.getValue()).collect(Collectors.joining("&")));
        params.removeIf(String::isEmpty);
        String httpRequestPath = String.format("/%s/similarities/products/status/%s", this.projectKey, this.taskId);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        httpRequest.setRelativeUrl(httpRequestPath); 
        httpRequest.setMethod(ApiHttpMethod.GET);
        httpRequest.setHeaders(headers);
        
        return httpRequest;
    }

    public ApiHttpResponse<com.commercetools.ml.models.similar_products.SimilarProductsTaskStatus> executeBlocking(){
        try {
            return execute().get();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public CompletableFuture<ApiHttpResponse<com.commercetools.ml.models.similar_products.SimilarProductsTaskStatus>> execute(){
        return apiHttpClient.execute(this.createHttpRequest())
                .thenApply(response -> {
                    if(response.getStatusCode() >= 400){
                        throw new ApiHttpException(response.getStatusCode(), new String(response.getBody()), response.getHeaders());
                    }
                    return Utils.convertResponse(response,com.commercetools.ml.models.similar_products.SimilarProductsTaskStatus.class);
                });
    }

    public String getProjectKey() {return this.projectKey;}
    public String getTaskId() {return this.taskId;}


    public void setProjectKey(final String projectKey) {this.projectKey = projectKey;}
    
    public void setTaskId(final String taskId) {this.taskId = taskId;}


    public ByProjectKeySimilaritiesProductsStatusByTaskIdGet addHeader(final String key, final String value) {
        this.headers.addHeader(key, value);
        return this;
    }
    
    public ByProjectKeySimilaritiesProductsStatusByTaskIdGet withHeaders(final ApiHttpHeaders headers) {
        this.headers = headers;
        return this;
    }
    
    public ApiHttpHeaders getHeaders() {
        return this.headers;
    }
    
    public ByProjectKeySimilaritiesProductsStatusByTaskIdGet addAdditionalQueryParam(final String additionalQueryParamKey, final String additionalQueryParamValue) {
        this.additionalQueryParams.put(additionalQueryParamKey, additionalQueryParamValue);
        return this;
    }
    
    public ByProjectKeySimilaritiesProductsStatusByTaskIdGet setAdditionalQueryParams(final Map<String, String> additionalQueryParams) {
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
