
package com.commercetools.api.client;

import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyMeShoppingListsByIDPost
        extends ApiMethod<ByProjectKeyMeShoppingListsByIDPost, com.commercetools.api.models.shopping_list.ShoppingList>
        implements com.commercetools.api.client.ConflictingTrait<ByProjectKeyMeShoppingListsByIDPost>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyMeShoppingListsByIDPost>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyMeShoppingListsByIDPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyMeShoppingListsByIDPost> {

    private String projectKey;
    private String ID;

    private com.commercetools.api.models.me.MyShoppingListUpdate myShoppingListUpdate;

    public ByProjectKeyMeShoppingListsByIDPost(final ApiHttpClient apiHttpClient, String projectKey, String ID,
            com.commercetools.api.models.me.MyShoppingListUpdate myShoppingListUpdate) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.ID = ID;
        this.myShoppingListUpdate = myShoppingListUpdate;
    }

    public ByProjectKeyMeShoppingListsByIDPost(ByProjectKeyMeShoppingListsByIDPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.ID = t.ID;
        this.myShoppingListUpdate = t.myShoppingListUpdate;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/me/shopping-lists/%s", this.projectKey, this.ID);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        try {
            final byte[] body = apiHttpClient().getSerializerService().toJsonByteArray(myShoppingListUpdate);
            return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), body);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.shopping_list.ShoppingList> executeBlocking(
            final ApiHttpClient client, Duration timeout) {
        ApiHttpRequest request = this.createHttpRequest();
        return blockingWait(client.execute(request, com.commercetools.api.models.shopping_list.ShoppingList.class),
            request, timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.shopping_list.ShoppingList>> execute(
            final ApiHttpClient client) {
        return client.execute(this.createHttpRequest(), com.commercetools.api.models.shopping_list.ShoppingList.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getID() {
        return this.ID;
    }

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setID(final String ID) {
        this.ID = ID;
    }

    /**
     * set expand with the specificied value
     */
    public ByProjectKeyMeShoppingListsByIDPost withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyMeShoppingListsByIDPost addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    @Override
    protected ByProjectKeyMeShoppingListsByIDPost copy() {
        return new ByProjectKeyMeShoppingListsByIDPost(this);
    }
}
