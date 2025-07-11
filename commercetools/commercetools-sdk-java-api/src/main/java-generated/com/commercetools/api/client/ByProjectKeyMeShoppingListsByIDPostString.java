
package com.commercetools.api.client;

import java.net.URI;
import java.nio.charset.StandardCharsets;
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
 *  <p>Updates a ShoppingList for the authenticated Customer or anonymous user using one or more update actions. Returns a <code>200</code> status if successful.</p>
 *  <p>A ResourceNotFound error is returned in the following scenarios:</p>
 *  <ul>
 *   <li>If no ShoppingList exists for the provided <code>id</code>.</li>
 *   <li>If a ShoppingList exists but does not contain either an <code>anonymousId</code> that matches the anonymous_id:{id} scope, or a <code>customer</code> with <code>id</code> value that matches the customer:{id} scope.</li>
 *  </ul>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.shopping_list.ShoppingList>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .me()
 *            .shoppingLists()
 *            .withId("{ID}")
 *            .post("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyMeShoppingListsByIDPostString extends
        StringBodyApiMethod<ByProjectKeyMeShoppingListsByIDPostString, com.commercetools.api.models.shopping_list.ShoppingList>
        implements com.commercetools.api.client.ConflictingTrait<ByProjectKeyMeShoppingListsByIDPostString>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyMeShoppingListsByIDPostString>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyMeShoppingListsByIDPostString>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyMeShoppingListsByIDPostString> {

    @Override
    public TypeReference<com.commercetools.api.models.shopping_list.ShoppingList> resultType() {
        return new TypeReference<com.commercetools.api.models.shopping_list.ShoppingList>() {
        };
    }

    private String projectKey;
    private String ID;

    private String myShoppingListUpdate;

    public ByProjectKeyMeShoppingListsByIDPostString(final ApiHttpClient apiHttpClient, String projectKey, String ID,
            String myShoppingListUpdate) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.ID = ID;
        this.myShoppingListUpdate = myShoppingListUpdate;
    }

    public ByProjectKeyMeShoppingListsByIDPostString(ByProjectKeyMeShoppingListsByIDPostString t) {
        super(t);
        this.projectKey = t.projectKey;
        this.ID = t.ID;
        this.myShoppingListUpdate = t.myShoppingListUpdate;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/me/shopping-lists/%s", this.projectKey, this.ID);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            myShoppingListUpdate.getBytes(StandardCharsets.UTF_8));

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
     * set expand with the specified value
     * @param <TValue> value type
     * @param expand value to be set
     * @return ByProjectKeyMeShoppingListsByIDPostString
     */
    public <TValue> ByProjectKeyMeShoppingListsByIDPostString withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     * @param <TValue> value type
     * @param expand value to be added
     * @return ByProjectKeyMeShoppingListsByIDPostString
     */
    public <TValue> ByProjectKeyMeShoppingListsByIDPostString addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyMeShoppingListsByIDPostString
     */
    public ByProjectKeyMeShoppingListsByIDPostString withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyMeShoppingListsByIDPostString
     */
    public ByProjectKeyMeShoppingListsByIDPostString addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyMeShoppingListsByIDPostString
     */
    public ByProjectKeyMeShoppingListsByIDPostString withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyMeShoppingListsByIDPostString
     */
    public ByProjectKeyMeShoppingListsByIDPostString addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     * @param <TValue> value type
     * @param expand values to be set
     * @return ByProjectKeyMeShoppingListsByIDPostString
     */
    public <TValue> ByProjectKeyMeShoppingListsByIDPostString withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     * @param <TValue> value type
     * @param expand values to be added
     * @return ByProjectKeyMeShoppingListsByIDPostString
     */
    public <TValue> ByProjectKeyMeShoppingListsByIDPostString addExpand(final Collection<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public String getBody() {
        return myShoppingListUpdate;
    }

    public ByProjectKeyMeShoppingListsByIDPostString withBody(String myShoppingListUpdate) {
        ByProjectKeyMeShoppingListsByIDPostString t = copy();
        t.myShoppingListUpdate = myShoppingListUpdate;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyMeShoppingListsByIDPostString that = (ByProjectKeyMeShoppingListsByIDPostString) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(ID, that.ID)
                .append(myShoppingListUpdate, that.myShoppingListUpdate)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(ID).append(myShoppingListUpdate).toHashCode();
    }

    @Override
    protected ByProjectKeyMeShoppingListsByIDPostString copy() {
        return new ByProjectKeyMeShoppingListsByIDPostString(this);
    }
}
