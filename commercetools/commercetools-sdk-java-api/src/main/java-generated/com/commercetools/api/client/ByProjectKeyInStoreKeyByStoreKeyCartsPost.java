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
*  <p>Creates a cart in the store specified by {storeKey}. The {storeKey} path parameter maps to a Store's key.
*  When using this endpoint the cart's store field is always set to the store specified in the path parameter.
*  Creating a cart can fail with an InvalidOperation if the referenced shipping method
*  in the CartDraft has a predicate which does not match the cart.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyInStoreKeyByStoreKeyCartsPost extends ApiMethod<ByProjectKeyInStoreKeyByStoreKeyCartsPost> {

    
    private String projectKey;
    private String storeKey;
    
    private com.commercetools.api.models.cart.CartDraft cartDraft;

    public ByProjectKeyInStoreKeyByStoreKeyCartsPost(final ApiHttpClient apiHttpClient, String projectKey, String storeKey, com.commercetools.api.models.cart.CartDraft cartDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.cartDraft = cartDraft;
    }

    public ByProjectKeyInStoreKeyByStoreKeyCartsPost(ByProjectKeyInStoreKeyByStoreKeyCartsPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.storeKey = t.storeKey;
        this.cartDraft = t.cartDraft;
    }

    public ApiHttpRequest createHttpRequest() {
        ApiHttpRequest httpRequest = new ApiHttpRequest();
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/in-store/key=%s/carts", this.projectKey, this.storeKey);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        httpRequest.setRelativeUrl(httpRequestPath); 
        httpRequest.setMethod(ApiHttpMethod.POST);
        httpRequest.setHeaders(getHeaders());
        try{httpRequest.setBody(VrapJsonUtils.toJsonByteArray(cartDraft));}catch(Exception e){e.printStackTrace();}
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

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }
    
    public void setStoreKey(final String storeKey) { this.storeKey = storeKey; }

    public ByProjectKeyInStoreKeyByStoreKeyCartsPost withExpand(final String expand){
        return new ByProjectKeyInStoreKeyByStoreKeyCartsPost(this).addQueryParam("expand", expand);
    }
}
