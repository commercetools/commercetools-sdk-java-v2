
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
 *  <p>Deletes a ShoppingList in the Project.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.shopping_list.ShoppingList>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .shoppingLists()
 *            .withKey("{key}")
 *            .delete()
 *            .withVersion(version)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyShoppingListsKeyByKeyDelete extends
        TypeApiMethod<ByProjectKeyShoppingListsKeyByKeyDelete, com.commercetools.api.models.shopping_list.ShoppingList>
        implements
        com.commercetools.api.client.ApiDeleteMethod<ByProjectKeyShoppingListsKeyByKeyDelete, com.commercetools.api.models.shopping_list.ShoppingList>,
        com.commercetools.api.client.DataerasureTrait<ByProjectKeyShoppingListsKeyByKeyDelete>,
        com.commercetools.api.client.VersionedTrait<ByProjectKeyShoppingListsKeyByKeyDelete>,
        com.commercetools.api.client.ConflictingTrait<ByProjectKeyShoppingListsKeyByKeyDelete>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyShoppingListsKeyByKeyDelete>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyShoppingListsKeyByKeyDelete>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyShoppingListsKeyByKeyDelete> {

    @Override
    public TypeReference<com.commercetools.api.models.shopping_list.ShoppingList> resultType() {
        return new TypeReference<com.commercetools.api.models.shopping_list.ShoppingList>() {
        };
    }

    private String projectKey;
    private String key;

    public ByProjectKeyShoppingListsKeyByKeyDelete(final ApiHttpClient apiHttpClient, String projectKey, String key) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.key = key;
    }

    public ByProjectKeyShoppingListsKeyByKeyDelete(ByProjectKeyShoppingListsKeyByKeyDelete t) {
        super(t);
        this.projectKey = t.projectKey;
        this.key = t.key;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/shopping-lists/key=%s", encodePathParam(this.projectKey),
            encodePathParam(this.key));
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.DELETE, URI.create(httpRequestPath), getHeaders(), null);
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

    public String getKey() {
        return this.key;
    }

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public List<String> getDataErasure() {
        return this.getQueryParam("dataErasure");
    }

    public List<String> getVersion() {
        return this.getQueryParam("version");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    /**
     * set expand with the specified value
     * @param expand value to be set
     * @param <TValue> value type
     * @return ByProjectKeyShoppingListsKeyByKeyDelete
     */
    public <TValue> ByProjectKeyShoppingListsKeyByKeyDelete withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     * @param expand value to be added
     * @param <TValue> value type
     * @return ByProjectKeyShoppingListsKeyByKeyDelete
     */
    public <TValue> ByProjectKeyShoppingListsKeyByKeyDelete addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyShoppingListsKeyByKeyDelete
     */
    public ByProjectKeyShoppingListsKeyByKeyDelete withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyShoppingListsKeyByKeyDelete
     */
    public ByProjectKeyShoppingListsKeyByKeyDelete addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyShoppingListsKeyByKeyDelete
     */
    public ByProjectKeyShoppingListsKeyByKeyDelete withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyShoppingListsKeyByKeyDelete
     */
    public ByProjectKeyShoppingListsKeyByKeyDelete addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     * @param expand values to be set
     * @param <TValue> value type
     * @return ByProjectKeyShoppingListsKeyByKeyDelete
     */
    public <TValue> ByProjectKeyShoppingListsKeyByKeyDelete withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     * @param expand values to be added
     * @param <TValue> value type
     * @return ByProjectKeyShoppingListsKeyByKeyDelete
     */
    public <TValue> ByProjectKeyShoppingListsKeyByKeyDelete addExpand(final Collection<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set dataErasure with the specified value
     * @param dataErasure value to be set
     * @param <TValue> value type
     * @return ByProjectKeyShoppingListsKeyByKeyDelete
     */
    public <TValue> ByProjectKeyShoppingListsKeyByKeyDelete withDataErasure(final TValue dataErasure) {
        return copy().withQueryParam("dataErasure", dataErasure);
    }

    /**
     * add additional dataErasure query parameter
     * @param dataErasure value to be added
     * @param <TValue> value type
     * @return ByProjectKeyShoppingListsKeyByKeyDelete
     */
    public <TValue> ByProjectKeyShoppingListsKeyByKeyDelete addDataErasure(final TValue dataErasure) {
        return copy().addQueryParam("dataErasure", dataErasure);
    }

    /**
     * set dataErasure with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyShoppingListsKeyByKeyDelete
     */
    public ByProjectKeyShoppingListsKeyByKeyDelete withDataErasure(final Supplier<Boolean> supplier) {
        return copy().withQueryParam("dataErasure", supplier.get());
    }

    /**
     * add additional dataErasure query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyShoppingListsKeyByKeyDelete
     */
    public ByProjectKeyShoppingListsKeyByKeyDelete addDataErasure(final Supplier<Boolean> supplier) {
        return copy().addQueryParam("dataErasure", supplier.get());
    }

    /**
     * set dataErasure with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyShoppingListsKeyByKeyDelete
     */
    public ByProjectKeyShoppingListsKeyByKeyDelete withDataErasure(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("dataErasure", op.apply(new StringBuilder()));
    }

    /**
     * add additional dataErasure query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyShoppingListsKeyByKeyDelete
     */
    public ByProjectKeyShoppingListsKeyByKeyDelete addDataErasure(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("dataErasure", op.apply(new StringBuilder()));
    }

    /**
     * set dataErasure with the specified values
     * @param dataErasure values to be set
     * @param <TValue> value type
     * @return ByProjectKeyShoppingListsKeyByKeyDelete
     */
    public <TValue> ByProjectKeyShoppingListsKeyByKeyDelete withDataErasure(final Collection<TValue> dataErasure) {
        return copy().withoutQueryParam("dataErasure")
                .addQueryParams(dataErasure.stream()
                        .map(s -> new ParamEntry<>("dataErasure", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional dataErasure query parameters
     * @param dataErasure values to be added
     * @param <TValue> value type
     * @return ByProjectKeyShoppingListsKeyByKeyDelete
     */
    public <TValue> ByProjectKeyShoppingListsKeyByKeyDelete addDataErasure(final Collection<TValue> dataErasure) {
        return copy().addQueryParams(
            dataErasure.stream().map(s -> new ParamEntry<>("dataErasure", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set version with the specified value
     * @param version value to be set
     * @param <TValue> value type
     * @return ByProjectKeyShoppingListsKeyByKeyDelete
     */
    public <TValue> ByProjectKeyShoppingListsKeyByKeyDelete withVersion(final TValue version) {
        return copy().withQueryParam("version", version);
    }

    /**
     * add additional version query parameter
     * @param version value to be added
     * @param <TValue> value type
     * @return ByProjectKeyShoppingListsKeyByKeyDelete
     */
    public <TValue> ByProjectKeyShoppingListsKeyByKeyDelete addVersion(final TValue version) {
        return copy().addQueryParam("version", version);
    }

    /**
     * set version with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyShoppingListsKeyByKeyDelete
     */
    public ByProjectKeyShoppingListsKeyByKeyDelete withVersion(final Supplier<Long> supplier) {
        return copy().withQueryParam("version", supplier.get());
    }

    /**
     * add additional version query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyShoppingListsKeyByKeyDelete
     */
    public ByProjectKeyShoppingListsKeyByKeyDelete addVersion(final Supplier<Long> supplier) {
        return copy().addQueryParam("version", supplier.get());
    }

    /**
     * set version with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyShoppingListsKeyByKeyDelete
     */
    public ByProjectKeyShoppingListsKeyByKeyDelete withVersion(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("version", op.apply(new StringBuilder()));
    }

    /**
     * add additional version query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyShoppingListsKeyByKeyDelete
     */
    public ByProjectKeyShoppingListsKeyByKeyDelete addVersion(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("version", op.apply(new StringBuilder()));
    }

    /**
     * set version with the specified values
     * @param version values to be set
     * @param <TValue> value type
     * @return ByProjectKeyShoppingListsKeyByKeyDelete
     */
    public <TValue> ByProjectKeyShoppingListsKeyByKeyDelete withVersion(final Collection<TValue> version) {
        return copy().withoutQueryParam("version")
                .addQueryParams(
                    version.stream().map(s -> new ParamEntry<>("version", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional version query parameters
     * @param version values to be added
     * @param <TValue> value type
     * @return ByProjectKeyShoppingListsKeyByKeyDelete
     */
    public <TValue> ByProjectKeyShoppingListsKeyByKeyDelete addVersion(final Collection<TValue> version) {
        return copy().addQueryParams(
            version.stream().map(s -> new ParamEntry<>("version", s.toString())).collect(Collectors.toList()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyShoppingListsKeyByKeyDelete that = (ByProjectKeyShoppingListsKeyByKeyDelete) o;

        return new EqualsBuilder().append(projectKey, that.projectKey).append(key, that.key).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(key).toHashCode();
    }

    @Override
    protected ByProjectKeyShoppingListsKeyByKeyDelete copy() {
        return new ByProjectKeyShoppingListsKeyByKeyDelete(this);
    }
}
