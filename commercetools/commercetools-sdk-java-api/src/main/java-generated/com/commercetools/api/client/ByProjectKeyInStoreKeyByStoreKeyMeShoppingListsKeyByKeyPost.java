
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

/**
*  <p>Update a shopping list found by its Key.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsKeyByKeyPost extends
        BodyApiMethod<ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsKeyByKeyPost, com.commercetools.api.models.shopping_list.ShoppingList, com.commercetools.api.models.me.MyShoppingListUpdate>
        implements
        com.commercetools.api.client.ConflictingTrait<ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsKeyByKeyPost>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsKeyByKeyPost>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsKeyByKeyPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsKeyByKeyPost> {

    private String projectKey;
    private String storeKey;
    private String key;

    private com.commercetools.api.models.me.MyShoppingListUpdate myShoppingListUpdate;

    public ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsKeyByKeyPost(final ApiHttpClient apiHttpClient,
            String projectKey, String storeKey, String key,
            com.commercetools.api.models.me.MyShoppingListUpdate myShoppingListUpdate) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.key = key;
        this.myShoppingListUpdate = myShoppingListUpdate;
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsKeyByKeyPost(
            ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsKeyByKeyPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.storeKey = t.storeKey;
        this.key = t.key;
        this.myShoppingListUpdate = t.myShoppingListUpdate;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/in-store/key=%s/me/shopping-lists/key=%s", this.projectKey,
            this.storeKey, this.key);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(myShoppingListUpdate)));

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

    public String getStoreKey() {
        return this.storeKey;
    }

    public String getKey() {
        return this.key;
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

    public void setKey(final String key) {
        this.key = key;
    }

    /**
     * set expand with the specified value
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsKeyByKeyPost withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsKeyByKeyPost addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     */
    public ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsKeyByKeyPost withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsKeyByKeyPost addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     */
    public ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsKeyByKeyPost withExpand(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsKeyByKeyPost addExpand(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsKeyByKeyPost withExpand(final List<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsKeyByKeyPost addExpand(final List<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public com.commercetools.api.models.me.MyShoppingListUpdate getBody() {
        return myShoppingListUpdate;
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsKeyByKeyPost withBody(
            com.commercetools.api.models.me.MyShoppingListUpdate myShoppingListUpdate) {
        ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsKeyByKeyPost t = copy();
        t.myShoppingListUpdate = myShoppingListUpdate;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsKeyByKeyPost that = (ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsKeyByKeyPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(storeKey, that.storeKey)
                .append(key, that.key)
                .append(myShoppingListUpdate, that.myShoppingListUpdate)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey)
                .append(storeKey)
                .append(key)
                .append(myShoppingListUpdate)
                .toHashCode();
    }

    @Override
    protected ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsKeyByKeyPost copy() {
        return new ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsKeyByKeyPost(this);
    }
}
