
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
public class ByProjectKeyShoppingListsByIDDelete
        extends ApiMethod<ByProjectKeyShoppingListsByIDDelete, com.commercetools.api.models.shopping_list.ShoppingList>
        implements com.commercetools.api.client.DataerasureTrait<ByProjectKeyShoppingListsByIDDelete>,
        com.commercetools.api.client.VersionedTrait<ByProjectKeyShoppingListsByIDDelete>,
        com.commercetools.api.client.ConflictingTrait<ByProjectKeyShoppingListsByIDDelete>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyShoppingListsByIDDelete>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyShoppingListsByIDDelete>,
        com.commercetools.api.client.DeprecatableTrait<ByProjectKeyShoppingListsByIDDelete> {

    private String projectKey;
    private String ID;

    public ByProjectKeyShoppingListsByIDDelete(final ApiHttpClient apiHttpClient, String projectKey, String ID) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.ID = ID;
    }

    public ByProjectKeyShoppingListsByIDDelete(ByProjectKeyShoppingListsByIDDelete t) {
        super(t);
        this.projectKey = t.projectKey;
        this.ID = t.ID;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/shopping-lists/%s", this.projectKey, this.ID);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }

        return new ApiHttpRequest(ApiHttpMethod.DELETE, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.shopping_list.ShoppingList> executeBlocking(Duration timeout) {
        return blockingWait(execute(), timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.shopping_list.ShoppingList>> execute() {
        return apiHttpClient().execute(this.createHttpRequest(),
            com.commercetools.api.models.shopping_list.ShoppingList.class);
    }

    public String getProjectKey() {
        return this.projectKey;
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

    public void setID(final String ID) {
        this.ID = ID;
    }

    public ByProjectKeyShoppingListsByIDDelete withDataErasure(final Boolean dataErasure) {
        return copy().withQueryParam("dataErasure", dataErasure);
    }

    public ByProjectKeyShoppingListsByIDDelete addDataErasure(final Boolean dataErasure) {
        return copy().addQueryParam("dataErasure", dataErasure);
    }

    public ByProjectKeyShoppingListsByIDDelete withVersion(final Long version) {
        return copy().withQueryParam("version", version);
    }

    public ByProjectKeyShoppingListsByIDDelete addVersion(final Long version) {
        return copy().addQueryParam("version", version);
    }

    public ByProjectKeyShoppingListsByIDDelete withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    public ByProjectKeyShoppingListsByIDDelete addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    @Override
    protected ByProjectKeyShoppingListsByIDDelete copy() {
        return new ByProjectKeyShoppingListsByIDDelete(this);
    }
}
