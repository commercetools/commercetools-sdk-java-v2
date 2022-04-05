
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
public class ByProjectKeyProductsKeyByKeyProductSelectionsGet extends
        ApiMethod<ByProjectKeyProductsKeyByKeyProductSelectionsGet, com.commercetools.api.models.product_selection.AssignedProductSelectionPagedQueryResponse>
        implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyProductsKeyByKeyProductSelectionsGet>,
        com.commercetools.api.client.SortableTrait<ByProjectKeyProductsKeyByKeyProductSelectionsGet>,
        com.commercetools.api.client.PagingTrait<ByProjectKeyProductsKeyByKeyProductSelectionsGet>,
        com.commercetools.api.client.QueryTrait<ByProjectKeyProductsKeyByKeyProductSelectionsGet>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyProductsKeyByKeyProductSelectionsGet>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyProductsKeyByKeyProductSelectionsGet> {

    private String projectKey;
    private String key;

    public ByProjectKeyProductsKeyByKeyProductSelectionsGet(final ApiHttpClient apiHttpClient, String projectKey,
            String key) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.key = key;
    }

    public ByProjectKeyProductsKeyByKeyProductSelectionsGet(ByProjectKeyProductsKeyByKeyProductSelectionsGet t) {
        super(t);
        this.projectKey = t.projectKey;
        this.key = t.key;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/products/key=%s/product-selections", this.projectKey, this.key);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.product_selection.AssignedProductSelectionPagedQueryResponse> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout,
            com.commercetools.api.models.product_selection.AssignedProductSelectionPagedQueryResponse.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.product_selection.AssignedProductSelectionPagedQueryResponse>> execute(
            final ApiHttpClient client) {
        return execute(client,
            com.commercetools.api.models.product_selection.AssignedProductSelectionPagedQueryResponse.class);
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

    public void setKey(final String key) {
        this.key = key;
    }

    /**
     * set expand with the specified value
     */
    public <TValue> ByProjectKeyProductsKeyByKeyProductSelectionsGet withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     */
    public <TValue> ByProjectKeyProductsKeyByKeyProductSelectionsGet addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     */
    public ByProjectKeyProductsKeyByKeyProductSelectionsGet withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyProductsKeyByKeyProductSelectionsGet addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     */
    public ByProjectKeyProductsKeyByKeyProductSelectionsGet withExpand(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyProductsKeyByKeyProductSelectionsGet addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     */
    public <TValue> ByProjectKeyProductsKeyByKeyProductSelectionsGet withExpand(final List<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     */
    public <TValue> ByProjectKeyProductsKeyByKeyProductSelectionsGet addExpand(final List<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set sort with the specified value
     */
    public <TValue> ByProjectKeyProductsKeyByKeyProductSelectionsGet withSort(final TValue sort) {
        return copy().withQueryParam("sort", sort);
    }

    /**
     * add additional sort query parameter
     */
    public <TValue> ByProjectKeyProductsKeyByKeyProductSelectionsGet addSort(final TValue sort) {
        return copy().addQueryParam("sort", sort);
    }

    /**
     * set sort with the specified value
     */
    public ByProjectKeyProductsKeyByKeyProductSelectionsGet withSort(final Supplier<String> supplier) {
        return copy().withQueryParam("sort", supplier.get());
    }

    /**
     * add additional sort query parameter
     */
    public ByProjectKeyProductsKeyByKeyProductSelectionsGet addSort(final Supplier<String> supplier) {
        return copy().addQueryParam("sort", supplier.get());
    }

    /**
     * set sort with the specified value
     */
    public ByProjectKeyProductsKeyByKeyProductSelectionsGet withSort(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("sort", op.apply(new StringBuilder()));
    }

    /**
     * add additional sort query parameter
     */
    public ByProjectKeyProductsKeyByKeyProductSelectionsGet addSort(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("sort", op.apply(new StringBuilder()));
    }

    /**
     * set sort with the specified values
     */
    public <TValue> ByProjectKeyProductsKeyByKeyProductSelectionsGet withSort(final List<TValue> sort) {
        return copy().withoutQueryParam("sort")
                .addQueryParams(
                    sort.stream().map(s -> new ParamEntry<>("sort", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional sort query parameters
     */
    public <TValue> ByProjectKeyProductsKeyByKeyProductSelectionsGet addSort(final List<TValue> sort) {
        return copy().addQueryParams(
            sort.stream().map(s -> new ParamEntry<>("sort", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set limit with the specified value
     */
    public <TValue> ByProjectKeyProductsKeyByKeyProductSelectionsGet withLimit(final TValue limit) {
        return copy().withQueryParam("limit", limit);
    }

    /**
     * add additional limit query parameter
     */
    public <TValue> ByProjectKeyProductsKeyByKeyProductSelectionsGet addLimit(final TValue limit) {
        return copy().addQueryParam("limit", limit);
    }

    /**
     * set limit with the specified value
     */
    public ByProjectKeyProductsKeyByKeyProductSelectionsGet withLimit(final Supplier<Integer> supplier) {
        return copy().withQueryParam("limit", supplier.get());
    }

    /**
     * add additional limit query parameter
     */
    public ByProjectKeyProductsKeyByKeyProductSelectionsGet addLimit(final Supplier<Integer> supplier) {
        return copy().addQueryParam("limit", supplier.get());
    }

    /**
     * set limit with the specified value
     */
    public ByProjectKeyProductsKeyByKeyProductSelectionsGet withLimit(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("limit", op.apply(new StringBuilder()));
    }

    /**
     * add additional limit query parameter
     */
    public ByProjectKeyProductsKeyByKeyProductSelectionsGet addLimit(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("limit", op.apply(new StringBuilder()));
    }

    /**
     * set limit with the specified values
     */
    public <TValue> ByProjectKeyProductsKeyByKeyProductSelectionsGet withLimit(final List<TValue> limit) {
        return copy().withoutQueryParam("limit")
                .addQueryParams(
                    limit.stream().map(s -> new ParamEntry<>("limit", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional limit query parameters
     */
    public <TValue> ByProjectKeyProductsKeyByKeyProductSelectionsGet addLimit(final List<TValue> limit) {
        return copy().addQueryParams(
            limit.stream().map(s -> new ParamEntry<>("limit", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set offset with the specified value
     */
    public <TValue> ByProjectKeyProductsKeyByKeyProductSelectionsGet withOffset(final TValue offset) {
        return copy().withQueryParam("offset", offset);
    }

    /**
     * add additional offset query parameter
     */
    public <TValue> ByProjectKeyProductsKeyByKeyProductSelectionsGet addOffset(final TValue offset) {
        return copy().addQueryParam("offset", offset);
    }

    /**
     * set offset with the specified value
     */
    public ByProjectKeyProductsKeyByKeyProductSelectionsGet withOffset(final Supplier<Integer> supplier) {
        return copy().withQueryParam("offset", supplier.get());
    }

    /**
     * add additional offset query parameter
     */
    public ByProjectKeyProductsKeyByKeyProductSelectionsGet addOffset(final Supplier<Integer> supplier) {
        return copy().addQueryParam("offset", supplier.get());
    }

    /**
     * set offset with the specified value
     */
    public ByProjectKeyProductsKeyByKeyProductSelectionsGet withOffset(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("offset", op.apply(new StringBuilder()));
    }

    /**
     * add additional offset query parameter
     */
    public ByProjectKeyProductsKeyByKeyProductSelectionsGet addOffset(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("offset", op.apply(new StringBuilder()));
    }

    /**
     * set offset with the specified values
     */
    public <TValue> ByProjectKeyProductsKeyByKeyProductSelectionsGet withOffset(final List<TValue> offset) {
        return copy().withoutQueryParam("offset")
                .addQueryParams(
                    offset.stream().map(s -> new ParamEntry<>("offset", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional offset query parameters
     */
    public <TValue> ByProjectKeyProductsKeyByKeyProductSelectionsGet addOffset(final List<TValue> offset) {
        return copy().addQueryParams(
            offset.stream().map(s -> new ParamEntry<>("offset", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set withTotal with the specified value
     */
    public <TValue> ByProjectKeyProductsKeyByKeyProductSelectionsGet withWithTotal(final TValue withTotal) {
        return copy().withQueryParam("withTotal", withTotal);
    }

    /**
     * add additional withTotal query parameter
     */
    public <TValue> ByProjectKeyProductsKeyByKeyProductSelectionsGet addWithTotal(final TValue withTotal) {
        return copy().addQueryParam("withTotal", withTotal);
    }

    /**
     * set withTotal with the specified value
     */
    public ByProjectKeyProductsKeyByKeyProductSelectionsGet withWithTotal(final Supplier<Boolean> supplier) {
        return copy().withQueryParam("withTotal", supplier.get());
    }

    /**
     * add additional withTotal query parameter
     */
    public ByProjectKeyProductsKeyByKeyProductSelectionsGet addWithTotal(final Supplier<Boolean> supplier) {
        return copy().addQueryParam("withTotal", supplier.get());
    }

    /**
     * set withTotal with the specified value
     */
    public ByProjectKeyProductsKeyByKeyProductSelectionsGet withWithTotal(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("withTotal", op.apply(new StringBuilder()));
    }

    /**
     * add additional withTotal query parameter
     */
    public ByProjectKeyProductsKeyByKeyProductSelectionsGet addWithTotal(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("withTotal", op.apply(new StringBuilder()));
    }

    /**
     * set withTotal with the specified values
     */
    public <TValue> ByProjectKeyProductsKeyByKeyProductSelectionsGet withWithTotal(final List<TValue> withTotal) {
        return copy().withoutQueryParam("withTotal")
                .addQueryParams(withTotal.stream()
                        .map(s -> new ParamEntry<>("withTotal", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional withTotal query parameters
     */
    public <TValue> ByProjectKeyProductsKeyByKeyProductSelectionsGet addWithTotal(final List<TValue> withTotal) {
        return copy().addQueryParams(
            withTotal.stream().map(s -> new ParamEntry<>("withTotal", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set where with the specified value
     */
    public <TValue> ByProjectKeyProductsKeyByKeyProductSelectionsGet withWhere(final TValue where) {
        return copy().withQueryParam("where", where);
    }

    /**
     * add additional where query parameter
     */
    public <TValue> ByProjectKeyProductsKeyByKeyProductSelectionsGet addWhere(final TValue where) {
        return copy().addQueryParam("where", where);
    }

    /**
     * set where with the specified value
     */
    public ByProjectKeyProductsKeyByKeyProductSelectionsGet withWhere(final Supplier<String> supplier) {
        return copy().withQueryParam("where", supplier.get());
    }

    /**
     * add additional where query parameter
     */
    public ByProjectKeyProductsKeyByKeyProductSelectionsGet addWhere(final Supplier<String> supplier) {
        return copy().addQueryParam("where", supplier.get());
    }

    /**
     * set where with the specified value
     */
    public ByProjectKeyProductsKeyByKeyProductSelectionsGet withWhere(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("where", op.apply(new StringBuilder()));
    }

    /**
     * add additional where query parameter
     */
    public ByProjectKeyProductsKeyByKeyProductSelectionsGet addWhere(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("where", op.apply(new StringBuilder()));
    }

    /**
     * set where with the specified values
     */
    public <TValue> ByProjectKeyProductsKeyByKeyProductSelectionsGet withWhere(final List<TValue> where) {
        return copy().withoutQueryParam("where")
                .addQueryParams(
                    where.stream().map(s -> new ParamEntry<>("where", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional where query parameters
     */
    public <TValue> ByProjectKeyProductsKeyByKeyProductSelectionsGet addWhere(final List<TValue> where) {
        return copy().addQueryParams(
            where.stream().map(s -> new ParamEntry<>("where", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set predicateVar with the specificied value
     */
    public <TValue> ByProjectKeyProductsKeyByKeyProductSelectionsGet withPredicateVar(final String varName,
            final TValue predicateVar) {
        return copy().withQueryParam(String.format("var.%s", varName), predicateVar);
    }

    /**
     * add additional predicateVar query parameter
     */
    public <TValue> ByProjectKeyProductsKeyByKeyProductSelectionsGet addPredicateVar(final String varName,
            final TValue predicateVar) {
        return copy().addQueryParam(String.format("var.%s", varName), predicateVar);
    }

    /**
     * set predicateVar with the specificied values
     */
    public <TValue> ByProjectKeyProductsKeyByKeyProductSelectionsGet withPredicateVar(final String varName,
            final List<TValue> predicateVar) {
        final String placeholderName = String.format("var.%s", varName);
        return copy().withoutQueryParam(placeholderName)
                .addQueryParams(predicateVar.stream()
                        .map(s -> new ParamEntry<>(placeholderName, s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional predicateVar query parameters
     */
    public <TValue> ByProjectKeyProductsKeyByKeyProductSelectionsGet addPredicateVar(final String varName,
            final List<TValue> predicateVar) {
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

        ByProjectKeyProductsKeyByKeyProductSelectionsGet that = (ByProjectKeyProductsKeyByKeyProductSelectionsGet) o;

        return new EqualsBuilder().append(projectKey, that.projectKey).append(key, that.key).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(key).toHashCode();
    }

    @Override
    protected ByProjectKeyProductsKeyByKeyProductSelectionsGet copy() {
        return new ByProjectKeyProductsKeyByKeyProductSelectionsGet(this);
    }
}
