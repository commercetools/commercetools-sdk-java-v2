
package com.commercetools.api.client;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyMeShoppingListsPost
        extends ApiMethod<ByProjectKeyMeShoppingListsPost, com.commercetools.api.models.shopping_list.ShoppingList>
        implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyMeShoppingListsPost>,
        com.commercetools.api.client.Deprecatable201Trait<ByProjectKeyMeShoppingListsPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyMeShoppingListsPost> {

    private String projectKey;

    private com.commercetools.api.models.me.MyShoppingListDraft myShoppingListDraft;

    public ByProjectKeyMeShoppingListsPost(final ApiHttpClient apiHttpClient, String projectKey,
            com.commercetools.api.models.me.MyShoppingListDraft myShoppingListDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.myShoppingListDraft = myShoppingListDraft;
    }

    public ByProjectKeyMeShoppingListsPost(ByProjectKeyMeShoppingListsPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.myShoppingListDraft = t.myShoppingListDraft;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/me/shopping-lists", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        try {
            final byte[] body = apiHttpClient().getSerializerService().toJsonByteArray(myShoppingListDraft);
            return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), body);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.shopping_list.ShoppingList> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.shopping_list.ShoppingList.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.shopping_list.ShoppingList>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.shopping_list.ShoppingList.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    /**
     * set expand with the specificied value
     */
    public ByProjectKeyMeShoppingListsPost withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyMeShoppingListsPost addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specificied values
     */
    public ByProjectKeyMeShoppingListsPost withExpand(final List<String> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     */
    public ByProjectKeyMeShoppingListsPost addExpand(final List<String> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyMeShoppingListsPost that = (ByProjectKeyMeShoppingListsPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(myShoppingListDraft, that.myShoppingListDraft)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(myShoppingListDraft).toHashCode();
    }

    @Override
    protected ByProjectKeyMeShoppingListsPost copy() {
        return new ByProjectKeyMeShoppingListsPost(this);
    }
}
