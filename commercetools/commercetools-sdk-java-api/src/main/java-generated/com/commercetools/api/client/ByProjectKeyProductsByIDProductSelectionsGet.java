
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
public class ByProjectKeyProductsByIDProductSelectionsGet extends
        ApiMethod<ByProjectKeyProductsByIDProductSelectionsGet, com.commercetools.api.models.product_selection.AssignedProductSelectionPagedQueryResponse>
        implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyProductsByIDProductSelectionsGet>,
        com.commercetools.api.client.SortableTrait<ByProjectKeyProductsByIDProductSelectionsGet>,
        com.commercetools.api.client.PagingTrait<ByProjectKeyProductsByIDProductSelectionsGet>,
        com.commercetools.api.client.QueryTrait<ByProjectKeyProductsByIDProductSelectionsGet>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyProductsByIDProductSelectionsGet>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyProductsByIDProductSelectionsGet> {

    private String projectKey;
    private String ID;

    public ByProjectKeyProductsByIDProductSelectionsGet(final ApiHttpClient apiHttpClient, String projectKey,
            String ID) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.ID = ID;
    }

    public ByProjectKeyProductsByIDProductSelectionsGet(ByProjectKeyProductsByIDProductSelectionsGet t) {
        super(t);
        this.projectKey = t.projectKey;
        this.ID = t.ID;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/products/%s/product-selections", this.projectKey, this.ID);
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

    public String getID() {
        return this.ID;
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

    public void setID(final String ID) {
        this.ID = ID;
    }

    /**
     * set expand with the specified value
     */
    public <TValue> ByProjectKeyProductsByIDProductSelectionsGet withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     */
    public <TValue> ByProjectKeyProductsByIDProductSelectionsGet addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     */
    public ByProjectKeyProductsByIDProductSelectionsGet withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyProductsByIDProductSelectionsGet addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     */
    public ByProjectKeyProductsByIDProductSelectionsGet withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyProductsByIDProductSelectionsGet addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     */
    public <TValue> ByProjectKeyProductsByIDProductSelectionsGet withExpand(final List<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     */
    public <TValue> ByProjectKeyProductsByIDProductSelectionsGet addExpand(final List<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set sort with the specified value
     */
    public <TValue> ByProjectKeyProductsByIDProductSelectionsGet withSort(final TValue sort) {
        return copy().withQueryParam("sort", sort);
    }

    /**
     * add additional sort query parameter
     */
    public <TValue> ByProjectKeyProductsByIDProductSelectionsGet addSort(final TValue sort) {
        return copy().addQueryParam("sort", sort);
    }

    /**
     * set sort with the specified value
     */
    public ByProjectKeyProductsByIDProductSelectionsGet withSort(final Supplier<String> supplier) {
        return copy().withQueryParam("sort", supplier.get());
    }

    /**
     * add additional sort query parameter
     */
    public ByProjectKeyProductsByIDProductSelectionsGet addSort(final Supplier<String> supplier) {
        return copy().addQueryParam("sort", supplier.get());
    }

    /**
     * set sort with the specified value
     */
    public ByProjectKeyProductsByIDProductSelectionsGet withSort(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("sort", op.apply(new StringBuilder()));
    }

    /**
     * add additional sort query parameter
     */
    public ByProjectKeyProductsByIDProductSelectionsGet addSort(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("sort", op.apply(new StringBuilder()));
    }

    /**
     * set sort with the specified values
     */
    public <TValue> ByProjectKeyProductsByIDProductSelectionsGet withSort(final List<TValue> sort) {
        return copy().withoutQueryParam("sort")
                .addQueryParams(
                    sort.stream().map(s -> new ParamEntry<>("sort", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional sort query parameters
     */
    public <TValue> ByProjectKeyProductsByIDProductSelectionsGet addSort(final List<TValue> sort) {
        return copy().addQueryParams(
            sort.stream().map(s -> new ParamEntry<>("sort", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set limit with the specified value
     */
    public <TValue> ByProjectKeyProductsByIDProductSelectionsGet withLimit(final TValue limit) {
        return copy().withQueryParam("limit", limit);
    }

    /**
     * add additional limit query parameter
     */
    public <TValue> ByProjectKeyProductsByIDProductSelectionsGet addLimit(final TValue limit) {
        return copy().addQueryParam("limit", limit);
    }

    /**
     * set limit with the specified value
     */
    public ByProjectKeyProductsByIDProductSelectionsGet withLimit(final Supplier<Integer> supplier) {
        return copy().withQueryParam("limit", supplier.get());
    }

    /**
     * add additional limit query parameter
     */
    public ByProjectKeyProductsByIDProductSelectionsGet addLimit(final Supplier<Integer> supplier) {
        return copy().addQueryParam("limit", supplier.get());
    }

    /**
     * set limit with the specified value
     */
    public ByProjectKeyProductsByIDProductSelectionsGet withLimit(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("limit", op.apply(new StringBuilder()));
    }

    /**
     * add additional limit query parameter
     */
    public ByProjectKeyProductsByIDProductSelectionsGet addLimit(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("limit", op.apply(new StringBuilder()));
    }

    /**
     * set limit with the specified values
     */
    public <TValue> ByProjectKeyProductsByIDProductSelectionsGet withLimit(final List<TValue> limit) {
        return copy().withoutQueryParam("limit")
                .addQueryParams(
                    limit.stream().map(s -> new ParamEntry<>("limit", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional limit query parameters
     */
    public <TValue> ByProjectKeyProductsByIDProductSelectionsGet addLimit(final List<TValue> limit) {
        return copy().addQueryParams(
            limit.stream().map(s -> new ParamEntry<>("limit", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set offset with the specified value
     */
    public <TValue> ByProjectKeyProductsByIDProductSelectionsGet withOffset(final TValue offset) {
        return copy().withQueryParam("offset", offset);
    }

    /**
     * add additional offset query parameter
     */
    public <TValue> ByProjectKeyProductsByIDProductSelectionsGet addOffset(final TValue offset) {
        return copy().addQueryParam("offset", offset);
    }

    /**
     * set offset with the specified value
     */
    public ByProjectKeyProductsByIDProductSelectionsGet withOffset(final Supplier<Integer> supplier) {
        return copy().withQueryParam("offset", supplier.get());
    }

    /**
     * add additional offset query parameter
     */
    public ByProjectKeyProductsByIDProductSelectionsGet addOffset(final Supplier<Integer> supplier) {
        return copy().addQueryParam("offset", supplier.get());
    }

    /**
     * set offset with the specified value
     */
    public ByProjectKeyProductsByIDProductSelectionsGet withOffset(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("offset", op.apply(new StringBuilder()));
    }

    /**
     * add additional offset query parameter
     */
    public ByProjectKeyProductsByIDProductSelectionsGet addOffset(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("offset", op.apply(new StringBuilder()));
    }

    /**
     * set offset with the specified values
     */
    public <TValue> ByProjectKeyProductsByIDProductSelectionsGet withOffset(final List<TValue> offset) {
        return copy().withoutQueryParam("offset")
                .addQueryParams(
                    offset.stream().map(s -> new ParamEntry<>("offset", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional offset query parameters
     */
    public <TValue> ByProjectKeyProductsByIDProductSelectionsGet addOffset(final List<TValue> offset) {
        return copy().addQueryParams(
            offset.stream().map(s -> new ParamEntry<>("offset", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set withTotal with the specified value
     */
    public <TValue> ByProjectKeyProductsByIDProductSelectionsGet withWithTotal(final TValue withTotal) {
        return copy().withQueryParam("withTotal", withTotal);
    }

    /**
     * add additional withTotal query parameter
     */
    public <TValue> ByProjectKeyProductsByIDProductSelectionsGet addWithTotal(final TValue withTotal) {
        return copy().addQueryParam("withTotal", withTotal);
    }

    /**
     * set withTotal with the specified value
     */
    public ByProjectKeyProductsByIDProductSelectionsGet withWithTotal(final Supplier<Boolean> supplier) {
        return copy().withQueryParam("withTotal", supplier.get());
    }

    /**
     * add additional withTotal query parameter
     */
    public ByProjectKeyProductsByIDProductSelectionsGet addWithTotal(final Supplier<Boolean> supplier) {
        return copy().addQueryParam("withTotal", supplier.get());
    }

    /**
     * set withTotal with the specified value
     */
    public ByProjectKeyProductsByIDProductSelectionsGet withWithTotal(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("withTotal", op.apply(new StringBuilder()));
    }

    /**
     * add additional withTotal query parameter
     */
    public ByProjectKeyProductsByIDProductSelectionsGet addWithTotal(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("withTotal", op.apply(new StringBuilder()));
    }

    /**
     * set withTotal with the specified values
     */
    public <TValue> ByProjectKeyProductsByIDProductSelectionsGet withWithTotal(final List<TValue> withTotal) {
        return copy().withoutQueryParam("withTotal")
                .addQueryParams(withTotal.stream()
                        .map(s -> new ParamEntry<>("withTotal", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional withTotal query parameters
     */
    public <TValue> ByProjectKeyProductsByIDProductSelectionsGet addWithTotal(final List<TValue> withTotal) {
        return copy().addQueryParams(
            withTotal.stream().map(s -> new ParamEntry<>("withTotal", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set where with the specified value
     */
    public <TValue> ByProjectKeyProductsByIDProductSelectionsGet withWhere(final TValue where) {
        return copy().withQueryParam("where", where);
    }

    /**
     * add additional where query parameter
     */
    public <TValue> ByProjectKeyProductsByIDProductSelectionsGet addWhere(final TValue where) {
        return copy().addQueryParam("where", where);
    }

    /**
     * set where with the specified value
     */
    public ByProjectKeyProductsByIDProductSelectionsGet withWhere(final Supplier<String> supplier) {
        return copy().withQueryParam("where", supplier.get());
    }

    /**
     * add additional where query parameter
     */
    public ByProjectKeyProductsByIDProductSelectionsGet addWhere(final Supplier<String> supplier) {
        return copy().addQueryParam("where", supplier.get());
    }

    /**
     * set where with the specified value
     */
    public ByProjectKeyProductsByIDProductSelectionsGet withWhere(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("where", op.apply(new StringBuilder()));
    }

    /**
     * add additional where query parameter
     */
    public ByProjectKeyProductsByIDProductSelectionsGet addWhere(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("where", op.apply(new StringBuilder()));
    }

    /**
     * set where with the specified values
     */
    public <TValue> ByProjectKeyProductsByIDProductSelectionsGet withWhere(final List<TValue> where) {
        return copy().withoutQueryParam("where")
                .addQueryParams(
                    where.stream().map(s -> new ParamEntry<>("where", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional where query parameters
     */
    public <TValue> ByProjectKeyProductsByIDProductSelectionsGet addWhere(final List<TValue> where) {
        return copy().addQueryParams(
            where.stream().map(s -> new ParamEntry<>("where", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set predicateVar with the specificied value
     */
    public <TValue> ByProjectKeyProductsByIDProductSelectionsGet withPredicateVar(final String varName,
            final TValue predicateVar) {
        return copy().withQueryParam(String.format("var.%s", varName), predicateVar);
    }

    /**
     * add additional predicateVar query parameter
     */
    public <TValue> ByProjectKeyProductsByIDProductSelectionsGet addPredicateVar(final String varName,
            final TValue predicateVar) {
        return copy().addQueryParam(String.format("var.%s", varName), predicateVar);
    }

    /**
     * set predicateVar with the specificied values
     */
    public <TValue> ByProjectKeyProductsByIDProductSelectionsGet withPredicateVar(final String varName,
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
    public <TValue> ByProjectKeyProductsByIDProductSelectionsGet addPredicateVar(final String varName,
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

        ByProjectKeyProductsByIDProductSelectionsGet that = (ByProjectKeyProductsByIDProductSelectionsGet) o;

        return new EqualsBuilder().append(projectKey, that.projectKey).append(ID, that.ID).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(ID).toHashCode();
    }

    @Override
    protected ByProjectKeyProductsByIDProductSelectionsGet copy() {
        return new ByProjectKeyProductsByIDProductSelectionsGet(this);
    }
}
