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
*  <p>Delete Customer by ID</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyInStoreKeyByStoreKeyCustomersByIDDelete {

    
    private ApiHttpHeaders headers = new ApiHttpHeaders();
    private Map<String, String> additionalQueryParams = new HashMap<>();
    private final ApiHttpClient apiHttpClient; 
    private List<Boolean> dataErasure = new ArrayList<>();
    private List<Long> version = new ArrayList<>();
    private List<String> expand = new ArrayList<>();
    private String projectKey;
    private String storeKey;
    private String ID;
    

    public ByProjectKeyInStoreKeyByStoreKeyCustomersByIDDelete(final ApiHttpClient apiHttpClient, String projectKey, String storeKey, String ID){
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.ID = ID;
    }

    public ApiHttpRequest createHttpRequest() {
        ApiHttpRequest httpRequest = new ApiHttpRequest();
        List<String> params = new ArrayList<>();
        params.add(this.dataErasure.stream().map(s -> "dataErasure=" + s).collect(Collectors.joining("&")));
        params.add(this.version.stream().map(s -> "version=" + s).collect(Collectors.joining("&")));
        params.add(this.expand.stream().map(s -> "expand=" + urlEncode(s)).collect(Collectors.joining("&")));
        params.add(additionalQueryParams.entrySet().stream().map(entry -> entry.getKey() + "=" + entry.getValue()).collect(Collectors.joining("&")));
        params.removeIf(String::isEmpty);
        String httpRequestPath = String.format("/%s/in-store/key=%s/customers/%s", this.projectKey, this.storeKey, this.ID);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        httpRequest.setRelativeUrl(httpRequestPath); 
        httpRequest.setMethod(ApiHttpMethod.DELETE);
        httpRequest.setHeaders(headers);
        
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
        return apiHttpClient.execute(this.createHttpRequest())
                .thenApply(response -> {
                    if(response.getStatusCode() >= 400){
                        throw new ApiHttpException(response.getStatusCode(), new String(response.getBody()), response.getHeaders());
                    }
                    return Utils.convertResponse(response,com.commercetools.api.models.customer.Customer.class);
                });
    }

    public String getProjectKey() {return this.projectKey;}
    public String getStoreKey() {return this.storeKey;}
    public String getID() {return this.ID;}

    public List<Boolean> getDataErasure() {
        return this.dataErasure;
    }
    
    public List<Long> getVersion() {
        return this.version;
    }
    
    public List<String> getExpand() {
        return this.expand;
    }

    public void setProjectKey(final String projectKey) {this.projectKey = projectKey;}
    
    public void setStoreKey(final String storeKey) {this.storeKey = storeKey;}
    
    public void setID(final String ID) {this.ID = ID;}

    public ByProjectKeyInStoreKeyByStoreKeyCustomersByIDDelete addDataErasure(final Boolean dataErasure){
        this.dataErasure.add(dataErasure);
        return this;
    }
    
    public ByProjectKeyInStoreKeyByStoreKeyCustomersByIDDelete withDataErasure(final List<Boolean> dataErasure){
        this.dataErasure = dataErasure;
        return this;
    }
    
    public ByProjectKeyInStoreKeyByStoreKeyCustomersByIDDelete addVersion(final Long version){
        this.version.add(version);
        return this;
    }
    
    public ByProjectKeyInStoreKeyByStoreKeyCustomersByIDDelete withVersion(final List<Long> version){
        this.version = version;
        return this;
    }
    
    public ByProjectKeyInStoreKeyByStoreKeyCustomersByIDDelete addExpand(final String expand){
        this.expand.add(expand);
        return this;
    }
    
    public ByProjectKeyInStoreKeyByStoreKeyCustomersByIDDelete withExpand(final List<String> expand){
        this.expand = expand;
        return this;
    }

    public ByProjectKeyInStoreKeyByStoreKeyCustomersByIDDelete addHeader(final String key, final String value) {
        this.headers.addHeader(key, value);
        return this;
    }
    
    public ByProjectKeyInStoreKeyByStoreKeyCustomersByIDDelete withHeaders(final ApiHttpHeaders headers) {
        this.headers = headers;
        return this;
    }
    
    public String getHeaderValue(final String key) {
        return this.headers.getHeaderValue(key);
    }
    
    public ApiHttpHeaders getHeaders() {
        return this.headers;
    }
    
    public ByProjectKeyInStoreKeyByStoreKeyCustomersByIDDelete addAdditionalQueryParam(final String additionalQueryParamKey, final String additionalQueryParamValue) {
        this.additionalQueryParams.put(additionalQueryParamKey, additionalQueryParamValue);
        return this;
    }
    
    public ByProjectKeyInStoreKeyByStoreKeyCustomersByIDDelete setAdditionalQueryParams(final Map<String, String> additionalQueryParams) {
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
