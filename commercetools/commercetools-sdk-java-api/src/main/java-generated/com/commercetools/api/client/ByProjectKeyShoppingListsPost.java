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
*  <p>Create ShoppingList</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyShoppingListsPost extends ApiMethod<ByProjectKeyShoppingListsPost, com.commercetools.api.models.shopping_list.ShoppingList> implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyShoppingListsPost>, com.commercetools.api.client.ErrorableTrait<ByProjectKeyShoppingListsPost>, com.commercetools.api.client.DeprecatableTrait<ByProjectKeyShoppingListsPost> {

    
    private String projectKey;
    
    private com.commercetools.api.models.shopping_list.ShoppingListDraft shoppingListDraft;

    public ByProjectKeyShoppingListsPost(final ApiHttpClient apiHttpClient, String projectKey, com.commercetools.api.models.shopping_list.ShoppingListDraft shoppingListDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.shoppingListDraft = shoppingListDraft;
    }

    public ByProjectKeyShoppingListsPost(ByProjectKeyShoppingListsPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.shoppingListDraft = t.shoppingListDraft;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/shopping-lists", this.projectKey);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        try {
        final byte[] body = apiHttpClient().getSerializerService().toJsonByteArray(shoppingListDraft);
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

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }

    public ByProjectKeyShoppingListsPost withExpand(final String expand){
        return copy().withQueryParam("expand", expand);
    }
    
    public ByProjectKeyShoppingListsPost addExpand(final String expand){
        return copy().addQueryParam("expand", expand);
    }

    

    @Override
    protected ByProjectKeyShoppingListsPost copy()
    {
        return new ByProjectKeyShoppingListsPost(this);
    }
}
