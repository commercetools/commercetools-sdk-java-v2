package com.commercetools.api.client;

import io.vrap.rmf.base.client.utils.Utils;

import java.io.InputStream;
import java.io.IOException;

import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.concurrent.CompletableFuture;
import io.vrap.rmf.base.client.utils.Generated;

import javax.annotation.Nullable;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import io.vrap.rmf.base.client.*;


import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

/**
*  <p>Delete ShoppingList by key</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyInStoreKeyByStoreKeyShoppingListsKeyByKeyDelete extends ApiMethod<ByProjectKeyInStoreKeyByStoreKeyShoppingListsKeyByKeyDelete, com.commercetools.api.models.shopping_list.ShoppingList> implements com.commercetools.api.client.DataerasureTrait<ByProjectKeyInStoreKeyByStoreKeyShoppingListsKeyByKeyDelete>, com.commercetools.api.client.VersionedTrait<ByProjectKeyInStoreKeyByStoreKeyShoppingListsKeyByKeyDelete>, com.commercetools.api.client.ConflictingTrait<ByProjectKeyInStoreKeyByStoreKeyShoppingListsKeyByKeyDelete>, com.commercetools.api.client.ExpandableTrait<ByProjectKeyInStoreKeyByStoreKeyShoppingListsKeyByKeyDelete>, com.commercetools.api.client.ErrorableTrait<ByProjectKeyInStoreKeyByStoreKeyShoppingListsKeyByKeyDelete>, com.commercetools.api.client.DeprecatableTrait<ByProjectKeyInStoreKeyByStoreKeyShoppingListsKeyByKeyDelete> {

    
    private String projectKey;
    private String storeKey;
    private String key;
    

    public ByProjectKeyInStoreKeyByStoreKeyShoppingListsKeyByKeyDelete(final ApiHttpClient apiHttpClient, String projectKey, String storeKey, String key) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.key = key;
    }

    public ByProjectKeyInStoreKeyByStoreKeyShoppingListsKeyByKeyDelete(ByProjectKeyInStoreKeyByStoreKeyShoppingListsKeyByKeyDelete t) {
        super(t);
        this.projectKey = t.projectKey;
        this.storeKey = t.storeKey;
        this.key = t.key;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/in-store/key=%s/shopping-lists/key=%s", this.projectKey, this.storeKey, this.key);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        
        return new ApiHttpRequest(ApiHttpMethod.DELETE, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.shopping_list.ShoppingList> executeBlocking(final ApiHttpClient client, Duration timeout){
        return blockingWait(execute(client), timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.shopping_list.ShoppingList>> execute(final ApiHttpClient client){
        return client.execute(this.createHttpRequest(), com.commercetools.api.models.shopping_list.ShoppingList.class);
    }

    public String getProjectKey() {return this.projectKey;}
    public String getStoreKey() {return this.storeKey;}
    public String getKey() {return this.key;}

    public List<String> getDataErasure() {
        return this.getQueryParam("dataErasure");
    }
    
    public List<String> getVersion() {
        return this.getQueryParam("version");
    }
    
    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }
    
    public void setStoreKey(final String storeKey) { this.storeKey = storeKey; }
    
    public void setKey(final String key) { this.key = key; }

    public ByProjectKeyInStoreKeyByStoreKeyShoppingListsKeyByKeyDelete withDataErasure(final boolean dataErasure){
        return copy().withQueryParam("dataErasure", dataErasure);
    }
    
    public ByProjectKeyInStoreKeyByStoreKeyShoppingListsKeyByKeyDelete addDataErasure(final boolean dataErasure){
        return copy().addQueryParam("dataErasure", dataErasure);
    }
    
    public ByProjectKeyInStoreKeyByStoreKeyShoppingListsKeyByKeyDelete withVersion(final long version){
        return copy().withQueryParam("version", version);
    }
    
    public ByProjectKeyInStoreKeyByStoreKeyShoppingListsKeyByKeyDelete addVersion(final long version){
        return copy().addQueryParam("version", version);
    }
    
    public ByProjectKeyInStoreKeyByStoreKeyShoppingListsKeyByKeyDelete withExpand(final String expand){
        return copy().withQueryParam("expand", expand);
    }
    
    public ByProjectKeyInStoreKeyByStoreKeyShoppingListsKeyByKeyDelete addExpand(final String expand){
        return copy().addQueryParam("expand", expand);
    }

    

    @Override
    protected ByProjectKeyInStoreKeyByStoreKeyShoppingListsKeyByKeyDelete copy()
    {
        return new ByProjectKeyInStoreKeyByStoreKeyShoppingListsKeyByKeyDelete(this);
    }
}
