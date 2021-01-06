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
*  <p>Delete MyShoppingList by key</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyMeShoppingListsKeyByKeyDelete extends ApiMethod<ByProjectKeyMeShoppingListsKeyByKeyDelete, com.commercetools.api.models.shopping_list.MyShoppingList> implements com.commercetools.api.client.VersionedTrait<ByProjectKeyMeShoppingListsKeyByKeyDelete>, com.commercetools.api.client.ConflictingTrait<ByProjectKeyMeShoppingListsKeyByKeyDelete>, com.commercetools.api.client.ExpandableTrait<ByProjectKeyMeShoppingListsKeyByKeyDelete>, com.commercetools.api.client.ErrorableTrait<ByProjectKeyMeShoppingListsKeyByKeyDelete>, com.commercetools.api.client.DeprecatableTrait<ByProjectKeyMeShoppingListsKeyByKeyDelete> {

    
    private String projectKey;
    private String key;
    

    public ByProjectKeyMeShoppingListsKeyByKeyDelete(final ApiHttpClient apiHttpClient, String projectKey, String key) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.key = key;
    }

    public ByProjectKeyMeShoppingListsKeyByKeyDelete(ByProjectKeyMeShoppingListsKeyByKeyDelete t) {
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
        
        return new ApiHttpRequest(ApiHttpMethod.DELETE, URI.create(httpRequestPath), getHeaders(), null);
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

    public List<String> getVersion() {
        return this.getQueryParam("version");
    }
    
    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }
    
    public void setKey(final String key) { this.key = key; }

    public ByProjectKeyMeShoppingListsKeyByKeyDelete withVersion(final Long version){
        return copy().addQueryParam("version", version);
    }
    
    public ByProjectKeyMeShoppingListsKeyByKeyDelete withExpand(final String expand){
        return copy().addQueryParam("expand", expand);
    }
    
    @Override
    protected ByProjectKeyMeShoppingListsKeyByKeyDelete copy()
    {
        return new ByProjectKeyMeShoppingListsKeyByKeyDelete(this);
    }
}
