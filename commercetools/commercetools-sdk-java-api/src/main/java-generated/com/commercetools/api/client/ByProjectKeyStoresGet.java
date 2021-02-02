
package com.commercetools.api.client;

import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>Query stores</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyStoresGet
        extends ApiMethod<ByProjectKeyStoresGet, com.commercetools.api.models.store.StorePagedQueryResponse> implements
        com.commercetools.api.models.PagedQueryResourceRequest<ByProjectKeyStoresGet, com.commercetools.api.models.store.StorePagedQueryResponse>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyStoresGet>,
        com.commercetools.api.client.SortableTrait<ByProjectKeyStoresGet>,
        com.commercetools.api.client.PagingTrait<ByProjectKeyStoresGet>,
        com.commercetools.api.client.QueryTrait<ByProjectKeyStoresGet>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyStoresGet>,
        com.commercetools.api.client.DeprecatableTrait<ByProjectKeyStoresGet> {

    private String projectKey;

    public ByProjectKeyStoresGet(final ApiHttpClient apiHttpClient, String projectKey) {
        super(apiHttpClient);
        this.projectKey = projectKey;
    }

    public ByProjectKeyStoresGet(ByProjectKeyStoresGet t) {
        super(t);
        this.projectKey = t.projectKey;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/stores", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }

        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.store.StorePagedQueryResponse> executeBlocking(
            Duration timeout) {
        return blockingWait(execute(), timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.store.StorePagedQueryResponse>> execute() {
        return apiHttpClient().execute(this.createHttpRequest(),
            com.commercetools.api.models.store.StorePagedQueryResponse.class);
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

    public ByProjectKeyStoresGet withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    public ByProjectKeyStoresGet addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    public ByProjectKeyStoresGet withSort(final String sort) {
        return copy().withQueryParam("sort", sort);
    }

    public ByProjectKeyStoresGet addSort(final String sort) {
        return copy().addQueryParam("sort", sort);
    }

    public ByProjectKeyStoresGet withLimit(final Integer limit) {
        return copy().withQueryParam("limit", limit);
    }

    public ByProjectKeyStoresGet addLimit(final Integer limit) {
        return copy().addQueryParam("limit", limit);
    }

    public ByProjectKeyStoresGet withOffset(final Integer offset) {
        return copy().withQueryParam("offset", offset);
    }

    public ByProjectKeyStoresGet addOffset(final Integer offset) {
        return copy().addQueryParam("offset", offset);
    }

    public ByProjectKeyStoresGet withWithTotal(final Boolean withTotal) {
        return copy().withQueryParam("withTotal", withTotal);
    }

    public ByProjectKeyStoresGet addWithTotal(final Boolean withTotal) {
        return copy().addQueryParam("withTotal", withTotal);
    }

    public ByProjectKeyStoresGet withWhere(final String where) {
        return copy().withQueryParam("where", where);
    }

    public ByProjectKeyStoresGet addWhere(final String where) {
        return copy().addQueryParam("where", where);
    }

    public ByProjectKeyStoresGet withPredicateVar(final String varName, final String predicateVar) {
        return copy().withQueryParam(String.format("var.%s", varName), predicateVar);
    }

    public ByProjectKeyStoresGet addPredicateVar(final String varName, final String predicateVar) {
        return copy().addQueryParam(String.format("var.%s", varName), predicateVar);
    }

    @Override
    protected ByProjectKeyStoresGet copy() {
        return new ByProjectKeyStoresGet(this);
    }
}
