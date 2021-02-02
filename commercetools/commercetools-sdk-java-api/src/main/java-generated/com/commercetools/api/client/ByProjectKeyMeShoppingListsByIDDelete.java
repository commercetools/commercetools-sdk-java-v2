
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
*  <p>Delete MyShoppingList by ID</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyMeShoppingListsByIDDelete extends
        ApiMethod<ByProjectKeyMeShoppingListsByIDDelete, com.commercetools.api.models.shopping_list.MyShoppingList>
        implements com.commercetools.api.client.VersionedTrait<ByProjectKeyMeShoppingListsByIDDelete>,
        com.commercetools.api.client.ConflictingTrait<ByProjectKeyMeShoppingListsByIDDelete>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyMeShoppingListsByIDDelete>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyMeShoppingListsByIDDelete>,
        com.commercetools.api.client.DeprecatableTrait<ByProjectKeyMeShoppingListsByIDDelete> {

    private String projectKey;
    private String ID;

    public ByProjectKeyMeShoppingListsByIDDelete(final ApiHttpClient apiHttpClient, String projectKey, String ID) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.ID = ID;
    }

    public ByProjectKeyMeShoppingListsByIDDelete(ByProjectKeyMeShoppingListsByIDDelete t) {
        super(t);
        this.projectKey = t.projectKey;
        this.ID = t.ID;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/me/shopping-lists/%s", this.projectKey, this.ID);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }

        return new ApiHttpRequest(ApiHttpMethod.DELETE, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.shopping_list.MyShoppingList> executeBlocking(
            Duration timeout) {
        return blockingWait(execute(), timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.shopping_list.MyShoppingList>> execute() {
        return apiHttpClient().execute(this.createHttpRequest(),
            com.commercetools.api.models.shopping_list.MyShoppingList.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getID() {
        return this.ID;
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

    public ByProjectKeyMeShoppingListsByIDDelete withVersion(final Long version) {
        return copy().withQueryParam("version", version);
    }

    public ByProjectKeyMeShoppingListsByIDDelete addVersion(final Long version) {
        return copy().addQueryParam("version", version);
    }

    public ByProjectKeyMeShoppingListsByIDDelete withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    public ByProjectKeyMeShoppingListsByIDDelete addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    @Override
    protected ByProjectKeyMeShoppingListsByIDDelete copy() {
        return new ByProjectKeyMeShoppingListsByIDDelete(this);
    }
}
