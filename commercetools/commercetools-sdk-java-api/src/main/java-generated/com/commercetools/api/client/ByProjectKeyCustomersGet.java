
package com.commercetools.api.client;

import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyCustomersGet extends
        ApiMethod<ByProjectKeyCustomersGet, com.commercetools.api.models.customer.CustomerPagedQueryResponse> implements
        com.commercetools.api.models.PagedQueryResourceRequest<ByProjectKeyCustomersGet, com.commercetools.api.models.customer.CustomerPagedQueryResponse>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyCustomersGet>,
        com.commercetools.api.client.SortableTrait<ByProjectKeyCustomersGet>,
        com.commercetools.api.client.PagingTrait<ByProjectKeyCustomersGet>,
        com.commercetools.api.client.QueryTrait<ByProjectKeyCustomersGet>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyCustomersGet>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyCustomersGet> {

    private String projectKey;

    public ByProjectKeyCustomersGet(final ApiHttpClient apiHttpClient, String projectKey) {
        super(apiHttpClient);
        this.projectKey = projectKey;
    }

    public ByProjectKeyCustomersGet(ByProjectKeyCustomersGet t) {
        super(t);
        this.projectKey = t.projectKey;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/customers", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }

        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.customer.CustomerPagedQueryResponse> executeBlocking(
            final ApiHttpClient client, Duration timeout) {
        ApiHttpRequest request = this.createHttpRequest();
        return blockingWait(
            client.execute(request, com.commercetools.api.models.customer.CustomerPagedQueryResponse.class), request,
            timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.customer.CustomerPagedQueryResponse>> execute(
            final ApiHttpClient client) {
        return client.execute(this.createHttpRequest(),
            com.commercetools.api.models.customer.CustomerPagedQueryResponse.class);
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
    public ByProjectKeyCustomersGet withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyCustomersGet addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set sort with the specificied value
     */
    public ByProjectKeyCustomersGet withSort(final String sort) {
        return copy().withQueryParam("sort", sort);
    }

    /**
     * add additional sort query parameter
     */
    public ByProjectKeyCustomersGet addSort(final String sort) {
        return copy().addQueryParam("sort", sort);
    }

    /**
     * set limit with the specificied value
     */
    public ByProjectKeyCustomersGet withLimit(final int limit) {
        return copy().withQueryParam("limit", limit);
    }

    /**
     * add additional limit query parameter
     */
    public ByProjectKeyCustomersGet addLimit(final int limit) {
        return copy().addQueryParam("limit", limit);
    }

    /**
     * set offset with the specificied value
     */
    public ByProjectKeyCustomersGet withOffset(final int offset) {
        return copy().withQueryParam("offset", offset);
    }

    /**
     * add additional offset query parameter
     */
    public ByProjectKeyCustomersGet addOffset(final int offset) {
        return copy().addQueryParam("offset", offset);
    }

    /**
     * set withTotal with the specificied value
     */
    public ByProjectKeyCustomersGet withWithTotal(final boolean withTotal) {
        return copy().withQueryParam("withTotal", withTotal);
    }

    /**
     * add additional withTotal query parameter
     */
    public ByProjectKeyCustomersGet addWithTotal(final boolean withTotal) {
        return copy().addQueryParam("withTotal", withTotal);
    }

    /**
     * set where with the specificied value
     */
    public ByProjectKeyCustomersGet withWhere(final String where) {
        return copy().withQueryParam("where", where);
    }

    /**
     * add additional where query parameter
     */
    public ByProjectKeyCustomersGet addWhere(final String where) {
        return copy().addQueryParam("where", where);
    }

    /**
     * set predicateVar with the specificied value
     */
    public ByProjectKeyCustomersGet withPredicateVar(final String varName, final String predicateVar) {
        return copy().withQueryParam(String.format("var.%s", varName), predicateVar);
    }

    /**
     * add additional predicateVar query parameter
     */
    public ByProjectKeyCustomersGet addPredicateVar(final String varName, final String predicateVar) {
        return copy().addQueryParam(String.format("var.%s", varName), predicateVar);
    }

    @Override
    protected ByProjectKeyCustomersGet copy() {
        return new ByProjectKeyCustomersGet(this);
    }
}
