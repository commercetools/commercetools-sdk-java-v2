
package com.commercetools.api.client;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyShoppingListsPost extends
        BodyApiMethod<ByProjectKeyShoppingListsPost, com.commercetools.api.models.shopping_list.ShoppingList, com.commercetools.api.models.shopping_list.ShoppingListDraft>
        implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyShoppingListsPost>,
        com.commercetools.api.client.Deprecatable201Trait<ByProjectKeyShoppingListsPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyShoppingListsPost> {

    private String projectKey;

    private com.commercetools.api.models.shopping_list.ShoppingListDraft shoppingListDraft;

    public ByProjectKeyShoppingListsPost(final ApiHttpClient apiHttpClient, String projectKey,
            com.commercetools.api.models.shopping_list.ShoppingListDraft shoppingListDraft) {
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
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/shopping-lists", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(shoppingListDraft)));

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
     * set expand with the specified value
     */
    public <TValue> ByProjectKeyShoppingListsPost withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     */
    public <TValue> ByProjectKeyShoppingListsPost addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     */
    public ByProjectKeyShoppingListsPost withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyShoppingListsPost addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     */
    public ByProjectKeyShoppingListsPost withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyShoppingListsPost addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     */
    public <TValue> ByProjectKeyShoppingListsPost withExpand(final List<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     */
    public <TValue> ByProjectKeyShoppingListsPost addExpand(final List<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public com.commercetools.api.models.shopping_list.ShoppingListDraft getBody() {
        return shoppingListDraft;
    }

    public ByProjectKeyShoppingListsPost withBody(
            com.commercetools.api.models.shopping_list.ShoppingListDraft shoppingListDraft) {
        ByProjectKeyShoppingListsPost t = copy();
        t.shoppingListDraft = shoppingListDraft;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyShoppingListsPost that = (ByProjectKeyShoppingListsPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(shoppingListDraft, that.shoppingListDraft)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(shoppingListDraft).toHashCode();
    }

    @Override
    protected ByProjectKeyShoppingListsPost copy() {
        return new ByProjectKeyShoppingListsPost(this);
    }
}
