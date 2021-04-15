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
*  <p>Update a shopping list found by its Key.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyInStoreKeyByStoreKeyShoppingListsKeyByKeyPost extends ApiMethod<ByProjectKeyInStoreKeyByStoreKeyShoppingListsKeyByKeyPost, com.commercetools.api.models.shopping_list.ShoppingList> implements com.commercetools.api.client.ConflictingTrait<ByProjectKeyInStoreKeyByStoreKeyShoppingListsKeyByKeyPost>, com.commercetools.api.client.ExpandableTrait<ByProjectKeyInStoreKeyByStoreKeyShoppingListsKeyByKeyPost>, com.commercetools.api.client.ErrorableTrait<ByProjectKeyInStoreKeyByStoreKeyShoppingListsKeyByKeyPost>, com.commercetools.api.client.DeprecatableTrait<ByProjectKeyInStoreKeyByStoreKeyShoppingListsKeyByKeyPost> {

    
    private String projectKey;
    private String storeKey;
    private String key;
    
    private com.commercetools.api.models.shopping_list.ShoppingListUpdate shoppingListUpdate;

    public ByProjectKeyInStoreKeyByStoreKeyShoppingListsKeyByKeyPost(final ApiHttpClient apiHttpClient, String projectKey, String storeKey, String key, com.commercetools.api.models.shopping_list.ShoppingListUpdate shoppingListUpdate) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.key = key;
        this.shoppingListUpdate = shoppingListUpdate;
    }

    public ByProjectKeyInStoreKeyByStoreKeyShoppingListsKeyByKeyPost(ByProjectKeyInStoreKeyByStoreKeyShoppingListsKeyByKeyPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.storeKey = t.storeKey;
        this.key = t.key;
        this.shoppingListUpdate = t.shoppingListUpdate;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/in-store/key=%s/shopping-lists/key=%s", this.projectKey, this.storeKey, this.key);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        try {
        final byte[] body = apiHttpClient().getSerializerService().toJsonByteArray(shoppingListUpdate);
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), body);
    } catch(Exception e) {
        e.printStackTrace();
    }
    
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), null);
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

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }
    
    public void setStoreKey(final String storeKey) { this.storeKey = storeKey; }
    
    public void setKey(final String key) { this.key = key; }

    public ByProjectKeyInStoreKeyByStoreKeyShoppingListsKeyByKeyPost withExpand(final String expand){
        return copy().withQueryParam("expand", expand);
    }
    
    public ByProjectKeyInStoreKeyByStoreKeyShoppingListsKeyByKeyPost addExpand(final String expand){
        return copy().addQueryParam("expand", expand);
    }

    

    @Override
    protected ByProjectKeyInStoreKeyByStoreKeyShoppingListsKeyByKeyPost copy()
    {
        return new ByProjectKeyInStoreKeyByStoreKeyShoppingListsKeyByKeyPost(this);
    }
}
