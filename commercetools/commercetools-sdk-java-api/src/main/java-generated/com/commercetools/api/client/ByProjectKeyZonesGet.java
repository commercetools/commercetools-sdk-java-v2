
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
 *  <p>Retrieves all Zones in the Project.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.zone.ZonePagedQueryResponse>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .zones()
 *            .get()
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyZonesGet
        extends TypeApiMethod<ByProjectKeyZonesGet, com.commercetools.api.models.zone.ZonePagedQueryResponse>
        implements ByProjectKeyZonesGetMixin, com.commercetools.api.client.ExpandableTrait<ByProjectKeyZonesGet>,
        com.commercetools.api.client.SortableTrait<ByProjectKeyZonesGet>,
        com.commercetools.api.client.PagingTrait<ByProjectKeyZonesGet>,
        com.commercetools.api.client.QueryTrait<ByProjectKeyZonesGet>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyZonesGet>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyZonesGet> {

    @Override
    public TypeReference<com.commercetools.api.models.zone.ZonePagedQueryResponse> resultType() {
        return new TypeReference<com.commercetools.api.models.zone.ZonePagedQueryResponse>() {
        };
    }

    private String projectKey;

    public ByProjectKeyZonesGet(final ApiHttpClient apiHttpClient, String projectKey) {
        super(apiHttpClient);
        this.projectKey = projectKey;
    }

    public ByProjectKeyZonesGet(ByProjectKeyZonesGet t) {
        super(t);
        this.projectKey = t.projectKey;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/zones", encodePathParam(this.projectKey));
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.zone.ZonePagedQueryResponse> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.zone.ZonePagedQueryResponse.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.zone.ZonePagedQueryResponse>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.zone.ZonePagedQueryResponse.class);
    }

    public String getProjectKey() {
        return this.projectKey;
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

    /**
     * set expand with the specified value
     * @param expand value to be set
     * @param <TValue> value type
     * @return ByProjectKeyZonesGet
     */
    public <TValue> ByProjectKeyZonesGet withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     * @param expand value to be added
     * @param <TValue> value type
     * @return ByProjectKeyZonesGet
     */
    public <TValue> ByProjectKeyZonesGet addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyZonesGet
     */
    public ByProjectKeyZonesGet withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyZonesGet
     */
    public ByProjectKeyZonesGet addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyZonesGet
     */
    public ByProjectKeyZonesGet withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyZonesGet
     */
    public ByProjectKeyZonesGet addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     * @param expand values to be set
     * @param <TValue> value type
     * @return ByProjectKeyZonesGet
     */
    public <TValue> ByProjectKeyZonesGet withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     * @param expand values to be added
     * @param <TValue> value type
     * @return ByProjectKeyZonesGet
     */
    public <TValue> ByProjectKeyZonesGet addExpand(final Collection<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set sort with the specified value
     * @param sort value to be set
     * @param <TValue> value type
     * @return ByProjectKeyZonesGet
     */
    public <TValue> ByProjectKeyZonesGet withSort(final TValue sort) {
        return copy().withQueryParam("sort", sort);
    }

    /**
     * add additional sort query parameter
     * @param sort value to be added
     * @param <TValue> value type
     * @return ByProjectKeyZonesGet
     */
    public <TValue> ByProjectKeyZonesGet addSort(final TValue sort) {
        return copy().addQueryParam("sort", sort);
    }

    /**
     * set sort with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyZonesGet
     */
    public ByProjectKeyZonesGet withSort(final Supplier<String> supplier) {
        return copy().withQueryParam("sort", supplier.get());
    }

    /**
     * add additional sort query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyZonesGet
     */
    public ByProjectKeyZonesGet addSort(final Supplier<String> supplier) {
        return copy().addQueryParam("sort", supplier.get());
    }

    /**
     * set sort with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyZonesGet
     */
    public ByProjectKeyZonesGet withSort(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("sort", op.apply(new StringBuilder()));
    }

    /**
     * add additional sort query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyZonesGet
     */
    public ByProjectKeyZonesGet addSort(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("sort", op.apply(new StringBuilder()));
    }

    /**
     * set sort with the specified values
     * @param sort values to be set
     * @param <TValue> value type
     * @return ByProjectKeyZonesGet
     */
    public <TValue> ByProjectKeyZonesGet withSort(final Collection<TValue> sort) {
        return copy().withoutQueryParam("sort")
                .addQueryParams(
                    sort.stream().map(s -> new ParamEntry<>("sort", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional sort query parameters
     * @param sort values to be added
     * @param <TValue> value type
     * @return ByProjectKeyZonesGet
     */
    public <TValue> ByProjectKeyZonesGet addSort(final Collection<TValue> sort) {
        return copy().addQueryParams(
            sort.stream().map(s -> new ParamEntry<>("sort", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set limit with the specified value
     * @param limit value to be set
     * @param <TValue> value type
     * @return ByProjectKeyZonesGet
     */
    public <TValue> ByProjectKeyZonesGet withLimit(final TValue limit) {
        return copy().withQueryParam("limit", limit);
    }

    /**
     * add additional limit query parameter
     * @param limit value to be added
     * @param <TValue> value type
     * @return ByProjectKeyZonesGet
     */
    public <TValue> ByProjectKeyZonesGet addLimit(final TValue limit) {
        return copy().addQueryParam("limit", limit);
    }

    /**
     * set limit with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyZonesGet
     */
    public ByProjectKeyZonesGet withLimit(final Supplier<Integer> supplier) {
        return copy().withQueryParam("limit", supplier.get());
    }

    /**
     * add additional limit query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyZonesGet
     */
    public ByProjectKeyZonesGet addLimit(final Supplier<Integer> supplier) {
        return copy().addQueryParam("limit", supplier.get());
    }

    /**
     * set limit with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyZonesGet
     */
    public ByProjectKeyZonesGet withLimit(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("limit", op.apply(new StringBuilder()));
    }

    /**
     * add additional limit query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyZonesGet
     */
    public ByProjectKeyZonesGet addLimit(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("limit", op.apply(new StringBuilder()));
    }

    /**
     * set limit with the specified values
     * @param limit values to be set
     * @param <TValue> value type
     * @return ByProjectKeyZonesGet
     */
    public <TValue> ByProjectKeyZonesGet withLimit(final Collection<TValue> limit) {
        return copy().withoutQueryParam("limit")
                .addQueryParams(
                    limit.stream().map(s -> new ParamEntry<>("limit", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional limit query parameters
     * @param limit values to be added
     * @param <TValue> value type
     * @return ByProjectKeyZonesGet
     */
    public <TValue> ByProjectKeyZonesGet addLimit(final Collection<TValue> limit) {
        return copy().addQueryParams(
            limit.stream().map(s -> new ParamEntry<>("limit", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set offset with the specified value
     * @param offset value to be set
     * @param <TValue> value type
     * @return ByProjectKeyZonesGet
     */
    public <TValue> ByProjectKeyZonesGet withOffset(final TValue offset) {
        return copy().withQueryParam("offset", offset);
    }

    /**
     * add additional offset query parameter
     * @param offset value to be added
     * @param <TValue> value type
     * @return ByProjectKeyZonesGet
     */
    public <TValue> ByProjectKeyZonesGet addOffset(final TValue offset) {
        return copy().addQueryParam("offset", offset);
    }

    /**
     * set offset with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyZonesGet
     */
    public ByProjectKeyZonesGet withOffset(final Supplier<Integer> supplier) {
        return copy().withQueryParam("offset", supplier.get());
    }

    /**
     * add additional offset query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyZonesGet
     */
    public ByProjectKeyZonesGet addOffset(final Supplier<Integer> supplier) {
        return copy().addQueryParam("offset", supplier.get());
    }

    /**
     * set offset with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyZonesGet
     */
    public ByProjectKeyZonesGet withOffset(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("offset", op.apply(new StringBuilder()));
    }

    /**
     * add additional offset query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyZonesGet
     */
    public ByProjectKeyZonesGet addOffset(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("offset", op.apply(new StringBuilder()));
    }

    /**
     * set offset with the specified values
     * @param offset values to be set
     * @param <TValue> value type
     * @return ByProjectKeyZonesGet
     */
    public <TValue> ByProjectKeyZonesGet withOffset(final Collection<TValue> offset) {
        return copy().withoutQueryParam("offset")
                .addQueryParams(
                    offset.stream().map(s -> new ParamEntry<>("offset", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional offset query parameters
     * @param offset values to be added
     * @param <TValue> value type
     * @return ByProjectKeyZonesGet
     */
    public <TValue> ByProjectKeyZonesGet addOffset(final Collection<TValue> offset) {
        return copy().addQueryParams(
            offset.stream().map(s -> new ParamEntry<>("offset", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set withTotal with the specified value
     * @param withTotal value to be set
     * @param <TValue> value type
     * @return ByProjectKeyZonesGet
     */
    public <TValue> ByProjectKeyZonesGet withWithTotal(final TValue withTotal) {
        return copy().withQueryParam("withTotal", withTotal);
    }

    /**
     * add additional withTotal query parameter
     * @param withTotal value to be added
     * @param <TValue> value type
     * @return ByProjectKeyZonesGet
     */
    public <TValue> ByProjectKeyZonesGet addWithTotal(final TValue withTotal) {
        return copy().addQueryParam("withTotal", withTotal);
    }

    /**
     * set withTotal with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyZonesGet
     */
    public ByProjectKeyZonesGet withWithTotal(final Supplier<Boolean> supplier) {
        return copy().withQueryParam("withTotal", supplier.get());
    }

    /**
     * add additional withTotal query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyZonesGet
     */
    public ByProjectKeyZonesGet addWithTotal(final Supplier<Boolean> supplier) {
        return copy().addQueryParam("withTotal", supplier.get());
    }

    /**
     * set withTotal with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyZonesGet
     */
    public ByProjectKeyZonesGet withWithTotal(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("withTotal", op.apply(new StringBuilder()));
    }

    /**
     * add additional withTotal query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyZonesGet
     */
    public ByProjectKeyZonesGet addWithTotal(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("withTotal", op.apply(new StringBuilder()));
    }

    /**
     * set withTotal with the specified values
     * @param withTotal values to be set
     * @param <TValue> value type
     * @return ByProjectKeyZonesGet
     */
    public <TValue> ByProjectKeyZonesGet withWithTotal(final Collection<TValue> withTotal) {
        return copy().withoutQueryParam("withTotal")
                .addQueryParams(withTotal.stream()
                        .map(s -> new ParamEntry<>("withTotal", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional withTotal query parameters
     * @param withTotal values to be added
     * @param <TValue> value type
     * @return ByProjectKeyZonesGet
     */
    public <TValue> ByProjectKeyZonesGet addWithTotal(final Collection<TValue> withTotal) {
        return copy().addQueryParams(
            withTotal.stream().map(s -> new ParamEntry<>("withTotal", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set where with the specified value
     * @param where value to be set
     * @param <TValue> value type
     * @return ByProjectKeyZonesGet
     */
    public <TValue> ByProjectKeyZonesGet withWhere(final TValue where) {
        return copy().withQueryParam("where", where);
    }

    /**
     * add additional where query parameter
     * @param where value to be added
     * @param <TValue> value type
     * @return ByProjectKeyZonesGet
     */
    public <TValue> ByProjectKeyZonesGet addWhere(final TValue where) {
        return copy().addQueryParam("where", where);
    }

    /**
     * set where with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyZonesGet
     */
    public ByProjectKeyZonesGet withWhere(final Supplier<String> supplier) {
        return copy().withQueryParam("where", supplier.get());
    }

    /**
     * add additional where query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyZonesGet
     */
    public ByProjectKeyZonesGet addWhere(final Supplier<String> supplier) {
        return copy().addQueryParam("where", supplier.get());
    }

    /**
     * set where with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyZonesGet
     */
    public ByProjectKeyZonesGet withWhere(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("where", op.apply(new StringBuilder()));
    }

    /**
     * add additional where query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyZonesGet
     */
    public ByProjectKeyZonesGet addWhere(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("where", op.apply(new StringBuilder()));
    }

    /**
     * set where with the specified values
     * @param where values to be set
     * @param <TValue> value type
     * @return ByProjectKeyZonesGet
     */
    public <TValue> ByProjectKeyZonesGet withWhere(final Collection<TValue> where) {
        return copy().withoutQueryParam("where")
                .addQueryParams(
                    where.stream().map(s -> new ParamEntry<>("where", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional where query parameters
     * @param where values to be added
     * @param <TValue> value type
     * @return ByProjectKeyZonesGet
     */
    public <TValue> ByProjectKeyZonesGet addWhere(final Collection<TValue> where) {
        return copy().addQueryParams(
            where.stream().map(s -> new ParamEntry<>("where", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set predicateVar with the specificied value
     * @param <TValue> value type
     * @param varName parameter name
     * @param predicateVar parameter value
     * @return ByProjectKeyZonesGet
     */
    public <TValue> ByProjectKeyZonesGet withPredicateVar(final String varName, final TValue predicateVar) {
        return copy().withQueryParam(String.format("var.%s", varName), predicateVar);
    }

    /**
     * add additional predicateVar query parameter
     * @param <TValue> value type
     * @param varName parameter name
     * @param predicateVar parameter value
     * @return ByProjectKeyZonesGet
     */
    public <TValue> ByProjectKeyZonesGet addPredicateVar(final String varName, final TValue predicateVar) {
        return copy().addQueryParam(String.format("var.%s", varName), predicateVar);
    }

    /**
     * set predicateVar with the specificied values
     * @param <TValue> value type
     * @param varName parameter name
     * @param predicateVar parameter values
     * @return ByProjectKeyZonesGet
     */
    public <TValue> ByProjectKeyZonesGet withPredicateVar(final String varName, final Collection<TValue> predicateVar) {
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
     * @return ByProjectKeyZonesGet
     */
    public <TValue> ByProjectKeyZonesGet addPredicateVar(final String varName, final Collection<TValue> predicateVar) {
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

        ByProjectKeyZonesGet that = (ByProjectKeyZonesGet) o;

        return new EqualsBuilder().append(projectKey, that.projectKey).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).toHashCode();
    }

    @Override
    protected ByProjectKeyZonesGet copy() {
        return new ByProjectKeyZonesGet(this);
    }
}
