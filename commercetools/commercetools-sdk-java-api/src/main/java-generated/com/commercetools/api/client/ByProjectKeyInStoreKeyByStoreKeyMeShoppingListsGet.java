
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
 *  <p>Retrieves all ShoppingLists for the authenticated Customer or anonymous user in a Store. Returns <code>200 OK</code> status if successful.</p>
 *  <p>A ResourceNotFound error is returned in the following scenarios:</p>
 *  <ul>
 *   <li>If no ShoppingLists exist in a Store.</li>
 *   <li>If a ShoppingList exists but does not have a <code>store</code> specified, or the <code>store</code> field references a different Store.</li>
 *   <li>If a ShoppingList exists in a Store but does not contain either an <code>anonymousId</code> that matches the anonymous_id:{id} scope, or a <code>customer</code> with <code>id</code> value that matches the customer:{id} scope.</li>
 *  </ul>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.shopping_list.ShoppingListPagedQueryResponse>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .inStoreKeyWithStoreKeyValue("{storeKey}")
 *            .me()
 *            .shoppingLists()
 *            .get()
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet extends
        TypeApiMethod<ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet, com.commercetools.api.models.shopping_list.ShoppingListPagedQueryResponse>
        implements ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGetMixin,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet>,
        com.commercetools.api.client.SortableTrait<ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet>,
        com.commercetools.api.client.PagingTrait<ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet>,
        com.commercetools.api.client.QueryTrait<ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet> {

    @Override
    public TypeReference<com.commercetools.api.models.shopping_list.ShoppingListPagedQueryResponse> resultType() {
        return new TypeReference<com.commercetools.api.models.shopping_list.ShoppingListPagedQueryResponse>() {
        };
    }

    private String projectKey;
    private String storeKey;

    public ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet(final ApiHttpClient apiHttpClient, String projectKey,
            String storeKey) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.storeKey = storeKey;
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet(ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet t) {
        super(t);
        this.projectKey = t.projectKey;
        this.storeKey = t.storeKey;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/in-store/key=%s/me/shopping-lists", encodePathParam(this.projectKey),
            encodePathParam(this.storeKey));
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.shopping_list.ShoppingListPagedQueryResponse> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout,
            com.commercetools.api.models.shopping_list.ShoppingListPagedQueryResponse.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.shopping_list.ShoppingListPagedQueryResponse>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.shopping_list.ShoppingListPagedQueryResponse.class);
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

    public List<String> getSort() {
        return this.getQueryParam("sort");
    }

    public List<String> getLimit() {
        return this.getQueryParam("limit");
    }

    public List<String> getOffset() {
        return this.getQueryParam("offset");
    }

    public List<String> getWithTotal() {
        return this.getQueryParam("withTotal");
    }

    public List<String> getWhere() {
        return this.getQueryParam("where");
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
     * @return ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     * @param expand value to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet withExpand(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet addExpand(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     * @param expand values to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     * @param expand values to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet addExpand(final Collection<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set sort with the specified value
     * @param sort value to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet withSort(final TValue sort) {
        return copy().withQueryParam("sort", sort);
    }

    /**
     * add additional sort query parameter
     * @param sort value to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet addSort(final TValue sort) {
        return copy().addQueryParam("sort", sort);
    }

    /**
     * set sort with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet withSort(final Supplier<String> supplier) {
        return copy().withQueryParam("sort", supplier.get());
    }

    /**
     * add additional sort query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet addSort(final Supplier<String> supplier) {
        return copy().addQueryParam("sort", supplier.get());
    }

    /**
     * set sort with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet withSort(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("sort", op.apply(new StringBuilder()));
    }

    /**
     * add additional sort query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet addSort(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("sort", op.apply(new StringBuilder()));
    }

    /**
     * set sort with the specified values
     * @param sort values to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet withSort(final Collection<TValue> sort) {
        return copy().withoutQueryParam("sort")
                .addQueryParams(
                    sort.stream().map(s -> new ParamEntry<>("sort", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional sort query parameters
     * @param sort values to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet addSort(final Collection<TValue> sort) {
        return copy().addQueryParams(
            sort.stream().map(s -> new ParamEntry<>("sort", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set limit with the specified value
     * @param limit value to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet withLimit(final TValue limit) {
        return copy().withQueryParam("limit", limit);
    }

    /**
     * add additional limit query parameter
     * @param limit value to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet addLimit(final TValue limit) {
        return copy().addQueryParam("limit", limit);
    }

    /**
     * set limit with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet withLimit(final Supplier<Integer> supplier) {
        return copy().withQueryParam("limit", supplier.get());
    }

    /**
     * add additional limit query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet addLimit(final Supplier<Integer> supplier) {
        return copy().addQueryParam("limit", supplier.get());
    }

    /**
     * set limit with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet withLimit(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("limit", op.apply(new StringBuilder()));
    }

    /**
     * add additional limit query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet addLimit(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("limit", op.apply(new StringBuilder()));
    }

    /**
     * set limit with the specified values
     * @param limit values to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet withLimit(final Collection<TValue> limit) {
        return copy().withoutQueryParam("limit")
                .addQueryParams(
                    limit.stream().map(s -> new ParamEntry<>("limit", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional limit query parameters
     * @param limit values to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet addLimit(final Collection<TValue> limit) {
        return copy().addQueryParams(
            limit.stream().map(s -> new ParamEntry<>("limit", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set offset with the specified value
     * @param offset value to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet withOffset(final TValue offset) {
        return copy().withQueryParam("offset", offset);
    }

    /**
     * add additional offset query parameter
     * @param offset value to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet addOffset(final TValue offset) {
        return copy().addQueryParam("offset", offset);
    }

    /**
     * set offset with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet withOffset(final Supplier<Integer> supplier) {
        return copy().withQueryParam("offset", supplier.get());
    }

    /**
     * add additional offset query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet addOffset(final Supplier<Integer> supplier) {
        return copy().addQueryParam("offset", supplier.get());
    }

    /**
     * set offset with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet withOffset(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("offset", op.apply(new StringBuilder()));
    }

    /**
     * add additional offset query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet addOffset(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("offset", op.apply(new StringBuilder()));
    }

    /**
     * set offset with the specified values
     * @param offset values to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet withOffset(final Collection<TValue> offset) {
        return copy().withoutQueryParam("offset")
                .addQueryParams(
                    offset.stream().map(s -> new ParamEntry<>("offset", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional offset query parameters
     * @param offset values to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet addOffset(final Collection<TValue> offset) {
        return copy().addQueryParams(
            offset.stream().map(s -> new ParamEntry<>("offset", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set withTotal with the specified value
     * @param withTotal value to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet withWithTotal(final TValue withTotal) {
        return copy().withQueryParam("withTotal", withTotal);
    }

    /**
     * add additional withTotal query parameter
     * @param withTotal value to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet addWithTotal(final TValue withTotal) {
        return copy().addQueryParam("withTotal", withTotal);
    }

    /**
     * set withTotal with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet withWithTotal(final Supplier<Boolean> supplier) {
        return copy().withQueryParam("withTotal", supplier.get());
    }

    /**
     * add additional withTotal query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet addWithTotal(final Supplier<Boolean> supplier) {
        return copy().addQueryParam("withTotal", supplier.get());
    }

    /**
     * set withTotal with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet withWithTotal(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("withTotal", op.apply(new StringBuilder()));
    }

    /**
     * add additional withTotal query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet addWithTotal(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("withTotal", op.apply(new StringBuilder()));
    }

    /**
     * set withTotal with the specified values
     * @param withTotal values to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet withWithTotal(
            final Collection<TValue> withTotal) {
        return copy().withoutQueryParam("withTotal")
                .addQueryParams(withTotal.stream()
                        .map(s -> new ParamEntry<>("withTotal", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional withTotal query parameters
     * @param withTotal values to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet addWithTotal(
            final Collection<TValue> withTotal) {
        return copy().addQueryParams(
            withTotal.stream().map(s -> new ParamEntry<>("withTotal", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set where with the specified value
     * @param where value to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet withWhere(final TValue where) {
        return copy().withQueryParam("where", where);
    }

    /**
     * add additional where query parameter
     * @param where value to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet addWhere(final TValue where) {
        return copy().addQueryParam("where", where);
    }

    /**
     * set where with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet withWhere(final Supplier<String> supplier) {
        return copy().withQueryParam("where", supplier.get());
    }

    /**
     * add additional where query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet addWhere(final Supplier<String> supplier) {
        return copy().addQueryParam("where", supplier.get());
    }

    /**
     * set where with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet withWhere(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("where", op.apply(new StringBuilder()));
    }

    /**
     * add additional where query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet addWhere(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("where", op.apply(new StringBuilder()));
    }

    /**
     * set where with the specified values
     * @param where values to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet withWhere(final Collection<TValue> where) {
        return copy().withoutQueryParam("where")
                .addQueryParams(
                    where.stream().map(s -> new ParamEntry<>("where", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional where query parameters
     * @param where values to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet addWhere(final Collection<TValue> where) {
        return copy().addQueryParams(
            where.stream().map(s -> new ParamEntry<>("where", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set predicateVar with the specificied value
     * @param <TValue> value type
     * @param varName parameter name
     * @param predicateVar parameter value
     * @return ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet withPredicateVar(final String varName,
            final TValue predicateVar) {
        return copy().withQueryParam(String.format("var.%s", varName), predicateVar);
    }

    /**
     * add additional predicateVar query parameter
     * @param <TValue> value type
     * @param varName parameter name
     * @param predicateVar parameter value
     * @return ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet addPredicateVar(final String varName,
            final TValue predicateVar) {
        return copy().addQueryParam(String.format("var.%s", varName), predicateVar);
    }

    /**
     * set predicateVar with the specificied values
     * @param <TValue> value type
     * @param varName parameter name
     * @param predicateVar parameter values
     * @return ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet withPredicateVar(final String varName,
            final Collection<TValue> predicateVar) {
        final String placeholderName = String.format("var.%s", varName);
        return copy().withoutQueryParam(placeholderName)
                .addQueryParams(predicateVar.stream()
                        .map(s -> new ParamEntry<>(placeholderName, s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional predicateVar query parameters
     * @param <TValue> value type
     * @param varName parameter name
     * @param predicateVar parameter values
     * @return ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet addPredicateVar(final String varName,
            final Collection<TValue> predicateVar) {
        final String placeholderName = String.format("var.%s", varName);
        return copy().addQueryParams(predicateVar.stream()
                .map(s -> new ParamEntry<>(placeholderName, s.toString()))
                .collect(Collectors.toList()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet that = (ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet) o;

        return new EqualsBuilder().append(projectKey, that.projectKey).append(storeKey, that.storeKey).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(storeKey).toHashCode();
    }

    @Override
    protected ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet copy() {
        return new ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet(this);
    }
}
