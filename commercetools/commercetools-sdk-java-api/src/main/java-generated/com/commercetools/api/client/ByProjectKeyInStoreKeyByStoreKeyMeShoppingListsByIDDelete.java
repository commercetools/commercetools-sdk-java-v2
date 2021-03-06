
package com.commercetools.api.client;

import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>Delete ShoppingList by ID</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsByIDDelete extends
        ApiMethod<ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsByIDDelete, com.commercetools.api.models.shopping_list.ShoppingList>
        implements
        com.commercetools.api.client.DataerasureTrait<ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsByIDDelete>,
        com.commercetools.api.client.VersionedTrait<ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsByIDDelete>,
        com.commercetools.api.client.ConflictingTrait<ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsByIDDelete>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsByIDDelete>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsByIDDelete>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsByIDDelete> {

    private String projectKey;
    private String storeKey;
    private String ID;

    public ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsByIDDelete(final ApiHttpClient apiHttpClient,
            String projectKey, String storeKey, String ID) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.ID = ID;
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsByIDDelete(
            ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsByIDDelete t) {
        super(t);
        this.projectKey = t.projectKey;
        this.storeKey = t.storeKey;
        this.ID = t.ID;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/in-store/key=%s/me/shopping-lists/%s", this.projectKey,
            this.storeKey, this.ID);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }

        return new ApiHttpRequest(ApiHttpMethod.DELETE, URI.create(httpRequestPath), getHeaders(), null);
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

    public String getStoreKey() {
        return this.storeKey;
    }

    public String getID() {
        return this.ID;
    }

    public List<String> getDataErasure() {
        return this.getQueryParam("dataErasure");
    }

    public List<String> getVersion() {
        return this.getQueryParam("version");
    }

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setStoreKey(final String storeKey) {
        this.storeKey = storeKey;
    }

    public void setID(final String ID) {
        this.ID = ID;
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsByIDDelete withDataErasure(final boolean dataErasure) {
        return copy().withQueryParam("dataErasure", dataErasure);
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsByIDDelete addDataErasure(final boolean dataErasure) {
        return copy().addQueryParam("dataErasure", dataErasure);
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsByIDDelete withVersion(final long version) {
        return copy().withQueryParam("version", version);
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsByIDDelete addVersion(final long version) {
        return copy().addQueryParam("version", version);
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsByIDDelete withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsByIDDelete addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    @Override
    protected ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsByIDDelete copy() {
        return new ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsByIDDelete(this);
    }
}
