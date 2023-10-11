
package com.commercetools.api.client;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import com.fasterxml.jackson.core.type.TypeReference;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>When using this endpoint, the <code>store</code> field of a ShoppingList is always set to the Store specified in the path parameter.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.shopping_list.ShoppingList>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .inStoreKeyWithStoreKeyValue("{storeKey}")
 *            .me()
 *            .shoppingLists()
 *            .post(null)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsPost extends
        BodyApiMethod<ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsPost, com.commercetools.api.models.shopping_list.ShoppingList, com.commercetools.api.models.me.MyShoppingListDraft>
        implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsPost>,
        com.commercetools.api.client.Deprecatable201Trait<ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsPost> {

    public TypeReference<com.commercetools.api.models.shopping_list.ShoppingList> resultType() {
        return new TypeReference<com.commercetools.api.models.shopping_list.ShoppingList>() {
        };
    }

    private String projectKey;
    private String storeKey;

    private com.commercetools.api.models.me.MyShoppingListDraft myShoppingListDraft;

    public ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsPost(final ApiHttpClient apiHttpClient, String projectKey,
            String storeKey, com.commercetools.api.models.me.MyShoppingListDraft myShoppingListDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.myShoppingListDraft = myShoppingListDraft;
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsPost(ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.storeKey = t.storeKey;
        this.myShoppingListDraft = t.myShoppingListDraft;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/in-store/key=%s/me/shopping-lists", this.projectKey, this.storeKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(myShoppingListDraft)));

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

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setStoreKey(final String storeKey) {
        this.storeKey = storeKey;
    }

    /**
     * set expand with the specified value
     * @param expand value to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsPost
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsPost withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     * @param expand value to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsPost
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsPost addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsPost
     */
    public ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsPost withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsPost
     */
    public ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsPost addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsPost
     */
    public ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsPost withExpand(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsPost
     */
    public ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsPost addExpand(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     * @param expand values to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsPost
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsPost withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     * @param expand values to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsPost
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsPost addExpand(final Collection<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public com.commercetools.api.models.me.MyShoppingListDraft getBody() {
        return myShoppingListDraft;
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsPost withBody(
            com.commercetools.api.models.me.MyShoppingListDraft myShoppingListDraft) {
        ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsPost t = copy();
        t.myShoppingListDraft = myShoppingListDraft;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsPost that = (ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(storeKey, that.storeKey)
                .append(myShoppingListDraft, that.myShoppingListDraft)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(storeKey).append(myShoppingListDraft).toHashCode();
    }

    @Override
    protected ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsPost copy() {
        return new ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsPost(this);
    }
}
