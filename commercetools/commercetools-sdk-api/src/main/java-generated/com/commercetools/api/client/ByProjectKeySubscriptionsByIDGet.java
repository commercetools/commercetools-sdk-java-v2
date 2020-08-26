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
*  <p>Retrieves the representation of a subscription by its id.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeySubscriptionsByIDGet {

    
    private ApiHttpHeaders headers = new ApiHttpHeaders();
    private Map<String, String> additionalQueryParams = new HashMap<>();
    private final ApiHttpClient apiHttpClient; 
    private List<String> expand = new ArrayList<>();
    private String projectKey;
    private String ID;
    

    public ByProjectKeySubscriptionsByIDGet(final ApiHttpClient apiHttpClient, String projectKey, String ID){
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.ID = ID;
    }

    public ApiHttpRequest createHttpRequest() {
        ApiHttpRequest httpRequest = new ApiHttpRequest();
        List<String> params = new ArrayList<>();
        params.add(this.expand.stream().map(s -> "expand=" + urlEncode(s)).collect(Collectors.joining("&")));
        params.add(additionalQueryParams.entrySet().stream().map(entry -> entry.getKey() + "=" + entry.getValue()).collect(Collectors.joining("&")));
        params.removeIf(String::isEmpty);
        String httpRequestPath = String.format("/%s/subscriptions/%s", this.projectKey, this.ID);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        httpRequest.setRelativeUrl(httpRequestPath); 
        httpRequest.setMethod(ApiHttpMethod.GET);
        httpRequest.setHeaders(headers);
        
        return httpRequest;
    }

    public ApiHttpResponse<com.commercetools.api.models.subscription.Subscription> executeBlocking(){
        try {
            return execute().get();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.subscription.Subscription>> execute(){
        return apiHttpClient.execute(this.createHttpRequest())
                .thenApply(response -> {
                    if(response.getStatusCode() >= 400){
                        throw new ApiHttpException(response.getStatusCode(), new String(response.getBody()), response.getHeaders());
                    }
                    return Utils.convertResponse(response,com.commercetools.api.models.subscription.Subscription.class);
                });
    }

    public String getProjectKey() {return this.projectKey;}
    public String getID() {return this.ID;}

    public List<String> getExpand() {
        return this.expand;
    }

    public void setProjectKey(final String projectKey) {this.projectKey = projectKey;}
    
    public void setID(final String ID) {this.ID = ID;}

    public ByProjectKeySubscriptionsByIDGet addExpand(final String expand){
        this.expand.add(expand);
        return this;
    }
    
    public ByProjectKeySubscriptionsByIDGet withExpand(final List<String> expand){
        this.expand = expand;
        return this;
    }

    public ByProjectKeySubscriptionsByIDGet addHeader(final String key, final String value) {
        this.headers.addHeader(key, value);
        return this;
    }
    
    public ByProjectKeySubscriptionsByIDGet withHeaders(final ApiHttpHeaders headers) {
        this.headers = headers;
        return this;
    }
    
    public ApiHttpHeaders getHeaders() {
        return this.headers;
    }
    
    public ByProjectKeySubscriptionsByIDGet addAdditionalQueryParam(final String additionalQueryParamKey, final String additionalQueryParamValue) {
        this.additionalQueryParams.put(additionalQueryParamKey, additionalQueryParamValue);
        return this;
    }
    
    public ByProjectKeySubscriptionsByIDGet setAdditionalQueryParams(final Map<String, String> additionalQueryParams) {
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
