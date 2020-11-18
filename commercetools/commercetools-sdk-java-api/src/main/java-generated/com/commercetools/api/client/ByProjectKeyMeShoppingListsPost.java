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
*  <p>Create MyShoppingList</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyMeShoppingListsPost extends ApiMethod<ByProjectKeyMeShoppingListsPost> {

    
    private String projectKey;
    
    private com.commercetools.api.models.me.MyShoppingListDraft myShoppingListDraft;

    public ByProjectKeyMeShoppingListsPost(final ApiHttpClient apiHttpClient, String projectKey, com.commercetools.api.models.me.MyShoppingListDraft myShoppingListDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.myShoppingListDraft = myShoppingListDraft;
    }

    public ByProjectKeyMeShoppingListsPost(ByProjectKeyMeShoppingListsPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.myShoppingListDraft = t.myShoppingListDraft;
    }

    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/me/shopping-lists", this.projectKey);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        try {
        final byte[] body = apiHttpClient().getSerializerService().toJsonByteArray(myShoppingListDraft);
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), body);
    } catch(Exception e) {
        e.printStackTrace();
    }
    
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), null);
    }

    public ApiHttpResponse<com.commercetools.api.models.shopping_list.MyShoppingList> executeBlocking(){
        return executeBlocking(Duration.ofSeconds(60));
    }
    
    public ApiHttpResponse<com.commercetools.api.models.shopping_list.MyShoppingList> executeBlocking(Duration timeout){
        return blockingWait(execute(), timeout);
    }

    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.shopping_list.MyShoppingList>> execute(){
        return apiHttpClient().execute(this.createHttpRequest(), com.commercetools.api.models.shopping_list.MyShoppingList.class);
    }

    public String getProjectKey() {return this.projectKey;}

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }

    public ByProjectKeyMeShoppingListsPost withExpand(final String expand){
        return new ByProjectKeyMeShoppingListsPost(this).addQueryParam("expand", expand);
    }
}
