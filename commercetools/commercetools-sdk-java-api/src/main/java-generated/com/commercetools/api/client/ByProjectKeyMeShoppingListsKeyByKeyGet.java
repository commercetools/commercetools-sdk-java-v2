package com.commercetools.api.client;

import io.vrap.rmf.base.client.utils.Utils;
import io.vrap.rmf.base.client.utils.json.VrapJsonUtils;

import java.io.InputStream;
import java.io.IOException;

import java.net.URI;
import java.nio.file.Files;

import java.time.Duration;
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


import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

/**
*  <p>Get MyShoppingList by key</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyMeShoppingListsKeyByKeyGet extends ApiMethod<ByProjectKeyMeShoppingListsKeyByKeyGet, com.commercetools.api.models.shopping_list.MyShoppingList> implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyMeShoppingListsKeyByKeyGet>, com.commercetools.api.client.ErrorableTrait<ByProjectKeyMeShoppingListsKeyByKeyGet>, com.commercetools.api.client.DeprecatableTrait<ByProjectKeyMeShoppingListsKeyByKeyGet> {

    
    private String projectKey;
    private String key;
    

    public ByProjectKeyMeShoppingListsKeyByKeyGet(final ApiHttpClient apiHttpClient, String projectKey, String key) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.key = key;
    }

    public ByProjectKeyMeShoppingListsKeyByKeyGet(ByProjectKeyMeShoppingListsKeyByKeyGet t) {
        super(t);
        this.projectKey = t.projectKey;
        this.key = t.key;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/me/shopping-lists/key=%s", this.projectKey, this.key);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        
        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.shopping_list.MyShoppingList> executeBlocking(){
        return executeBlocking(Duration.ofSeconds(60));
    }
    
    @Override
    public ApiHttpResponse<com.commercetools.api.models.shopping_list.MyShoppingList> executeBlocking(Duration timeout){
        return blockingWait(execute(), timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.shopping_list.MyShoppingList>> execute(){
        return apiHttpClient().execute(this.createHttpRequest(), com.commercetools.api.models.shopping_list.MyShoppingList.class);
    }

    public String getProjectKey() {return this.projectKey;}
    public String getKey() {return this.key;}

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }
    
    public void setKey(final String key) { this.key = key; }

    public ByProjectKeyMeShoppingListsKeyByKeyGet withExpand(final String expand){
        return copy().addQueryParam("expand", expand);
    }
    
    @Override
    protected ByProjectKeyMeShoppingListsKeyByKeyGet copy()
    {
        return new ByProjectKeyMeShoppingListsKeyByKeyGet(this);
    }
}
