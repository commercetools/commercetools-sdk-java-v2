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
*  <p>Update a shopping list found by its Key.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyShoppingListsKeyByKeyPost extends ApiMethod<ByProjectKeyShoppingListsKeyByKeyPost> {

    
    private String projectKey;
    private String key;
    
    private com.commercetools.api.models.shopping_list.ShoppingListUpdate shoppingListUpdate;

    public ByProjectKeyShoppingListsKeyByKeyPost(final ApiHttpClient apiHttpClient, String projectKey, String key, com.commercetools.api.models.shopping_list.ShoppingListUpdate shoppingListUpdate) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.key = key;
        this.shoppingListUpdate = shoppingListUpdate;
    }

    public ByProjectKeyShoppingListsKeyByKeyPost(ByProjectKeyShoppingListsKeyByKeyPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.key = t.key;
        this.shoppingListUpdate = t.shoppingListUpdate;
    }

    public ApiHttpRequest createHttpRequest() {
        ApiHttpRequest httpRequest = new ApiHttpRequest();
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/shopping-lists/key=%s", this.projectKey, this.key);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        httpRequest.setRelativeUrl(httpRequestPath); 
        httpRequest.setMethod(ApiHttpMethod.POST);
        httpRequest.setHeaders(getHeaders());
        try{httpRequest.setBody(VrapJsonUtils.toJsonByteArray(shoppingListUpdate));}catch(Exception e){e.printStackTrace();}
        return httpRequest;
    }

    public ApiHttpResponse<com.commercetools.api.models.shopping_list.ShoppingList> executeBlocking(){
        try {
            return execute().get();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.shopping_list.ShoppingList>> execute(){
        return apiHttpClient().execute(this.createHttpRequest())
                .thenApply(response -> {
                    if(response.getStatusCode() >= 400){
                        throw new ApiHttpException(response.getStatusCode(), new String(response.getBody()), response.getHeaders());
                    }
                    return Utils.convertResponse(response,com.commercetools.api.models.shopping_list.ShoppingList.class);
                });
    }

    public String getProjectKey() {return this.projectKey;}
    public String getKey() {return this.key;}

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }
    
    public void setKey(final String key) { this.key = key; }

    public ByProjectKeyShoppingListsKeyByKeyPost withExpand(final String expand){
        return new ByProjectKeyShoppingListsKeyByKeyPost(this).addQueryParam("expand", expand);
    }
}
