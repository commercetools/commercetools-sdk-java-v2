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
public class ByProjectKeyShippingMethodsMatchingOrdereditGet {

    
    private ApiHttpHeaders headers = new ApiHttpHeaders();
    private Map<String, String> additionalQueryParams = new HashMap<>();
    private final ApiHttpClient apiHttpClient; 
    private List<String> orderEditId = new ArrayList<>();
    private List<String> country = new ArrayList<>();
    private List<String> state = new ArrayList<>();
    private String projectKey;
    

    public ByProjectKeyShippingMethodsMatchingOrdereditGet(final ApiHttpClient apiHttpClient, String projectKey){
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ApiHttpRequest createHttpRequest() {
        ApiHttpRequest httpRequest = new ApiHttpRequest();
        List<String> params = new ArrayList<>();
        params.add(this.orderEditId.stream().map(s -> "orderEditId=" + urlEncode(s)).collect(Collectors.joining("&")));
        params.add(this.country.stream().map(s -> "country=" + urlEncode(s)).collect(Collectors.joining("&")));
        params.add(this.state.stream().map(s -> "state=" + urlEncode(s)).collect(Collectors.joining("&")));
        params.add(additionalQueryParams.entrySet().stream().map(entry -> entry.getKey() + "=" + entry.getValue()).collect(Collectors.joining("&")));
        params.removeIf(String::isEmpty);
        String httpRequestPath = String.format("/%s/shipping-methods/matching-orderedit", this.projectKey);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        httpRequest.setRelativeUrl(httpRequestPath); 
        httpRequest.setMethod(ApiHttpMethod.GET);
        httpRequest.setHeaders(headers);
        
        return httpRequest;
    }

    public ApiHttpResponse<com.commercetools.api.models.shipping_method.ShippingMethodPagedQueryResponse> executeBlocking(){
        try {
            return execute().get();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.shipping_method.ShippingMethodPagedQueryResponse>> execute(){
        return apiHttpClient.execute(this.createHttpRequest())
                .thenApply(response -> {
                    if(response.getStatusCode() >= 400){
                        throw new ApiHttpException(response.getStatusCode(), new String(response.getBody()), response.getHeaders());
                    }
                    return Utils.convertResponse(response,com.commercetools.api.models.shipping_method.ShippingMethodPagedQueryResponse.class);
                });
    }

    public String getProjectKey() {return this.projectKey;}

    public List<String> getOrderEditId() {
        return this.orderEditId;
    }
    
    public List<String> getCountry() {
        return this.country;
    }
    
    public List<String> getState() {
        return this.state;
    }

    public void setProjectKey(final String projectKey) {this.projectKey = projectKey;}

    public ByProjectKeyShippingMethodsMatchingOrdereditGet addOrderEditId(final String orderEditId){
        this.orderEditId.add(orderEditId);
        return this;
    }
    
    public ByProjectKeyShippingMethodsMatchingOrdereditGet withOrderEditId(final List<String> orderEditId){
        this.orderEditId = orderEditId;
        return this;
    }
    
    public ByProjectKeyShippingMethodsMatchingOrdereditGet addCountry(final String country){
        this.country.add(country);
        return this;
    }
    
    public ByProjectKeyShippingMethodsMatchingOrdereditGet withCountry(final List<String> country){
        this.country = country;
        return this;
    }
    
    public ByProjectKeyShippingMethodsMatchingOrdereditGet addState(final String state){
        this.state.add(state);
        return this;
    }
    
    public ByProjectKeyShippingMethodsMatchingOrdereditGet withState(final List<String> state){
        this.state = state;
        return this;
    }

    public ByProjectKeyShippingMethodsMatchingOrdereditGet addHeader(final String key, final String value) {
        this.headers.addHeader(key, value);
        return this;
    }
    
    public ByProjectKeyShippingMethodsMatchingOrdereditGet withHeaders(final ApiHttpHeaders headers) {
        this.headers = headers;
        return this;
    }
    
    public String getHeaderValue(final String key) {
        return this.headers.getHeaderValue(key);
    }
    
    public ApiHttpHeaders getHeaders() {
        return this.headers;
    }
    
    public ByProjectKeyShippingMethodsMatchingOrdereditGet addAdditionalQueryParam(final String additionalQueryParamKey, final String additionalQueryParamValue) {
        this.additionalQueryParams.put(additionalQueryParamKey, additionalQueryParamValue);
        return this;
    }
    
    public ByProjectKeyShippingMethodsMatchingOrdereditGet setAdditionalQueryParams(final Map<String, String> additionalQueryParams) {
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
