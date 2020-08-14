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
public class ByProjectKeyInStoreKeyByStoreKeyShippingMethodsMatchingCartGet {

    
    private ApiHttpHeaders headers = new ApiHttpHeaders();
    private Map<String, String> additionalQueryParams = new HashMap<>();
    private final ApiHttpClient apiHttpClient; 
    private List<String> cartId = new ArrayList<>();
    private List<String> expand = new ArrayList<>();
    private String projectKey;
    private String storeKey;
    

    public ByProjectKeyInStoreKeyByStoreKeyShippingMethodsMatchingCartGet(final ApiHttpClient apiHttpClient, String projectKey, String storeKey){
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.storeKey = storeKey;
    }

    public ApiHttpRequest createHttpRequest() {
        ApiHttpRequest httpRequest = new ApiHttpRequest();
        List<String> params = new ArrayList<>();
        params.add(this.cartId.stream().map(s -> "cartId=" + urlEncode(s)).collect(Collectors.joining("&")));
        params.add(this.expand.stream().map(s -> "expand=" + urlEncode(s)).collect(Collectors.joining("&")));
        params.add(additionalQueryParams.entrySet().stream().map(entry -> entry.getKey() + "=" + entry.getValue()).collect(Collectors.joining("&")));
        params.removeIf(String::isEmpty);
        String httpRequestPath = String.format("/%s/in-store/key=%s/shipping-methods/matching-cart", this.projectKey, this.storeKey);
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
    public String getStoreKey() {return this.storeKey;}

    public List<String> getCartId() {
        return this.cartId;
    }
    
    public List<String> getExpand() {
        return this.expand;
    }

    public void setProjectKey(final String projectKey) {this.projectKey = projectKey;}
    
    public void setStoreKey(final String storeKey) {this.storeKey = storeKey;}

    public ByProjectKeyInStoreKeyByStoreKeyShippingMethodsMatchingCartGet addCartId(final String cartId){
        this.cartId.add(cartId);
        return this;
    }
    
    public ByProjectKeyInStoreKeyByStoreKeyShippingMethodsMatchingCartGet withCartId(final List<String> cartId){
        this.cartId = cartId;
        return this;
    }
    
    public ByProjectKeyInStoreKeyByStoreKeyShippingMethodsMatchingCartGet addExpand(final String expand){
        this.expand.add(expand);
        return this;
    }
    
    public ByProjectKeyInStoreKeyByStoreKeyShippingMethodsMatchingCartGet withExpand(final List<String> expand){
        this.expand = expand;
        return this;
    }

    public ByProjectKeyInStoreKeyByStoreKeyShippingMethodsMatchingCartGet addHeader(final String key, final String value) {
        this.headers.addHeader(key, value);
        return this;
    }
    
    public ByProjectKeyInStoreKeyByStoreKeyShippingMethodsMatchingCartGet withHeaders(final ApiHttpHeaders headers) {
        this.headers = headers;
        return this;
    }
    
    public String getHeaderValue(final String key) {
        return this.headers.getHeaderValue(key);
    }
    
    public ApiHttpHeaders getHeaders() {
        return this.headers;
    }
    
    public ByProjectKeyInStoreKeyByStoreKeyShippingMethodsMatchingCartGet addAdditionalQueryParam(final String additionalQueryParamKey, final String additionalQueryParamValue) {
        this.additionalQueryParams.put(additionalQueryParamKey, additionalQueryParamValue);
        return this;
    }
    
    public ByProjectKeyInStoreKeyByStoreKeyShippingMethodsMatchingCartGet setAdditionalQueryParams(final Map<String, String> additionalQueryParams) {
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
