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
*  <p>Retrieves the active cart of the customer that has been modified most recently in a specific Store.
*  The {storeKey} path parameter maps to a Store's key.</p>
*  <p>If the cart exists in the commercetools project but does not have the store field, or the store field
*  references a different store, this method returns a ResourceNotFound error.</p>
*  <p>The cart may not contain up-to-date prices, discounts etc. If you want to ensure they're up-to-date,
*  send an Update request with the Recalculate update action instead.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyInStoreKeyByStoreKeyCartsCustomerIdByCustomerIdGet extends ApiMethod<ByProjectKeyInStoreKeyByStoreKeyCartsCustomerIdByCustomerIdGet> {

    
    private String projectKey;
    private String storeKey;
    private String customerId;
    

    public ByProjectKeyInStoreKeyByStoreKeyCartsCustomerIdByCustomerIdGet(final ApiHttpClient apiHttpClient, String projectKey, String storeKey, String customerId) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.customerId = customerId;
    }

    public ByProjectKeyInStoreKeyByStoreKeyCartsCustomerIdByCustomerIdGet(ByProjectKeyInStoreKeyByStoreKeyCartsCustomerIdByCustomerIdGet t) {
        super(t);
        this.projectKey = t.projectKey;
        this.storeKey = t.storeKey;
        this.customerId = t.customerId;
    }

    public ApiHttpRequest createHttpRequest() {
        ApiHttpRequest httpRequest = new ApiHttpRequest();
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/in-store/key=%s/carts/customer-id=%s", this.projectKey, this.storeKey, this.customerId);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        httpRequest.setUri(httpRequestPath); 
        httpRequest.setMethod(ApiHttpMethod.GET);
        httpRequest.setHeaders(getHeaders());
        
        return httpRequest;
    }

    public ApiHttpResponse<com.commercetools.api.models.cart.Cart> executeBlocking(){
        try {
            return execute().get();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.cart.Cart>> execute(){
        return apiHttpClient().execute(this.createHttpRequest())
                .thenApply(response -> {
                    if(response.getStatusCode() >= 400){
                        throw new ApiHttpException(response.getStatusCode(), new String(response.getBody()), response.getHeaders());
                    }
                    return Utils.convertResponse(response,com.commercetools.api.models.cart.Cart.class);
                });
    }

    public String getProjectKey() {return this.projectKey;}
    public String getStoreKey() {return this.storeKey;}
    public String getCustomerId() {return this.customerId;}

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }
    
    public void setStoreKey(final String storeKey) { this.storeKey = storeKey; }
    
    public void setCustomerId(final String customerId) { this.customerId = customerId; }

    public ByProjectKeyInStoreKeyByStoreKeyCartsCustomerIdByCustomerIdGet withExpand(final String expand){
        return new ByProjectKeyInStoreKeyByStoreKeyCartsCustomerIdByCustomerIdGet(this).addQueryParam("expand", expand);
    }
}
