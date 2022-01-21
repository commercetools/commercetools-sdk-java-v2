
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
public class ByProjectKeyPaymentsGet extends
        ApiMethod<ByProjectKeyPaymentsGet, com.commercetools.api.models.payment.PaymentPagedQueryResponse> implements
        com.commercetools.api.models.PagedQueryResourceRequest<ByProjectKeyPaymentsGet, com.commercetools.api.models.payment.PaymentPagedQueryResponse>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyPaymentsGet>,
        com.commercetools.api.client.SortableTrait<ByProjectKeyPaymentsGet>,
        com.commercetools.api.client.PagingTrait<ByProjectKeyPaymentsGet>,
        com.commercetools.api.client.QueryTrait<ByProjectKeyPaymentsGet>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyPaymentsGet>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyPaymentsGet> {

    private String projectKey;

    public ByProjectKeyPaymentsGet(final ApiHttpClient apiHttpClient, String projectKey) {
        super(apiHttpClient);
        this.projectKey = projectKey;
    }

    public ByProjectKeyPaymentsGet(ByProjectKeyPaymentsGet t) {
        super(t);
        this.projectKey = t.projectKey;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/payments", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }

        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.payment.PaymentPagedQueryResponse> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.payment.PaymentPagedQueryResponse.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.payment.PaymentPagedQueryResponse>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.payment.PaymentPagedQueryResponse.class);
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
     * set expand with the specificied value
     */
    public ByProjectKeyPaymentsGet withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyPaymentsGet addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specificied values
     */
    public ByProjectKeyPaymentsGet withExpand(final List<String> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     */
    public ByProjectKeyPaymentsGet addExpand(final List<String> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set sort with the specificied value
     */
    public ByProjectKeyPaymentsGet withSort(final String sort) {
        return copy().withQueryParam("sort", sort);
    }

    /**
     * add additional sort query parameter
     */
    public ByProjectKeyPaymentsGet addSort(final String sort) {
        return copy().addQueryParam("sort", sort);
    }

    /**
     * set sort with the specificied values
     */
    public ByProjectKeyPaymentsGet withSort(final List<String> sort) {
        return copy().withoutQueryParam("sort")
                .addQueryParams(
                    sort.stream().map(s -> new ParamEntry<>("sort", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional sort query parameters
     */
    public ByProjectKeyPaymentsGet addSort(final List<String> sort) {
        return copy().addQueryParams(
            sort.stream().map(s -> new ParamEntry<>("sort", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set limit with the specificied value
     */
    public ByProjectKeyPaymentsGet withLimit(final int limit) {
        return copy().withQueryParam("limit", limit);
    }

    /**
     * add additional limit query parameter
     */
    public ByProjectKeyPaymentsGet addLimit(final int limit) {
        return copy().addQueryParam("limit", limit);
    }

    /**
     * set limit with the specificied values
     */
    public ByProjectKeyPaymentsGet withLimit(final List<Integer> limit) {
        return copy().withoutQueryParam("limit")
                .addQueryParams(
                    limit.stream().map(s -> new ParamEntry<>("limit", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional limit query parameters
     */
    public ByProjectKeyPaymentsGet addLimit(final List<Integer> limit) {
        return copy().addQueryParams(
            limit.stream().map(s -> new ParamEntry<>("limit", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set offset with the specificied value
     */
    public ByProjectKeyPaymentsGet withOffset(final int offset) {
        return copy().withQueryParam("offset", offset);
    }

    /**
     * add additional offset query parameter
     */
    public ByProjectKeyPaymentsGet addOffset(final int offset) {
        return copy().addQueryParam("offset", offset);
    }

    /**
     * set offset with the specificied values
     */
    public ByProjectKeyPaymentsGet withOffset(final List<Integer> offset) {
        return copy().withoutQueryParam("offset")
                .addQueryParams(
                    offset.stream().map(s -> new ParamEntry<>("offset", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional offset query parameters
     */
    public ByProjectKeyPaymentsGet addOffset(final List<Integer> offset) {
        return copy().addQueryParams(
            offset.stream().map(s -> new ParamEntry<>("offset", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set withTotal with the specificied value
     */
    public ByProjectKeyPaymentsGet withWithTotal(final boolean withTotal) {
        return copy().withQueryParam("withTotal", withTotal);
    }

    /**
     * add additional withTotal query parameter
     */
    public ByProjectKeyPaymentsGet addWithTotal(final boolean withTotal) {
        return copy().addQueryParam("withTotal", withTotal);
    }

    /**
     * set withTotal with the specificied values
     */
    public ByProjectKeyPaymentsGet withWithTotal(final List<Boolean> withTotal) {
        return copy().withoutQueryParam("withTotal")
                .addQueryParams(withTotal.stream()
                        .map(s -> new ParamEntry<>("withTotal", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional withTotal query parameters
     */
    public ByProjectKeyPaymentsGet addWithTotal(final List<Boolean> withTotal) {
        return copy().addQueryParams(
            withTotal.stream().map(s -> new ParamEntry<>("withTotal", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set where with the specificied value
     */
    public ByProjectKeyPaymentsGet withWhere(final String where) {
        return copy().withQueryParam("where", where);
    }

    /**
     * add additional where query parameter
     */
    public ByProjectKeyPaymentsGet addWhere(final String where) {
        return copy().addQueryParam("where", where);
    }

    /**
     * set where with the specificied values
     */
    public ByProjectKeyPaymentsGet withWhere(final List<String> where) {
        return copy().withoutQueryParam("where")
                .addQueryParams(
                    where.stream().map(s -> new ParamEntry<>("where", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional where query parameters
     */
    public ByProjectKeyPaymentsGet addWhere(final List<String> where) {
        return copy().addQueryParams(
            where.stream().map(s -> new ParamEntry<>("where", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set predicateVar with the specificied value
     */
    public ByProjectKeyPaymentsGet withPredicateVar(final String varName, final String predicateVar) {
        return copy().withQueryParam(String.format("var.%s", varName), predicateVar);
    }

    /**
     * add additional predicateVar query parameter
     */
    public ByProjectKeyPaymentsGet addPredicateVar(final String varName, final String predicateVar) {
        return copy().addQueryParam(String.format("var.%s", varName), predicateVar);
    }

    /**
     * set predicateVar with the specificied values
     */
    public ByProjectKeyPaymentsGet withPredicateVar(final String varName, final List<String> predicateVar) {
        final String placeholderName = String.format("var.%s", varName);
        return copy().withoutQueryParam(placeholderName)
                .addQueryParams(
                    predicateVar.stream().map(s -> new ParamEntry<>(placeholderName, s)).collect(Collectors.toList()));
    }

    /**
     * add additional predicateVar query parameters
     */
    public ByProjectKeyPaymentsGet addPredicateVar(final String varName, final List<String> predicateVar) {
        final String placeholderName = String.format("var.%s", varName);
        return copy().addQueryParams(
            predicateVar.stream().map(s -> new ParamEntry<>(placeholderName, s)).collect(Collectors.toList()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyPaymentsGet that = (ByProjectKeyPaymentsGet) o;

        return new EqualsBuilder().append(projectKey, that.projectKey).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).toHashCode();
    }

    @Override
    protected ByProjectKeyPaymentsGet copy() {
        return new ByProjectKeyPaymentsGet(this);
    }
}
