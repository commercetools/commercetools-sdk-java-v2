
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
*  <p>Query states</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyStatesGet
        extends ApiMethod<ByProjectKeyStatesGet, com.commercetools.api.models.state.StatePagedQueryResponse> implements
        com.commercetools.api.models.PagedQueryResourceRequest<ByProjectKeyStatesGet, com.commercetools.api.models.state.StatePagedQueryResponse>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyStatesGet>,
        com.commercetools.api.client.SortableTrait<ByProjectKeyStatesGet>,
        com.commercetools.api.client.PagingTrait<ByProjectKeyStatesGet>,
        com.commercetools.api.client.QueryTrait<ByProjectKeyStatesGet>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyStatesGet>,
        com.commercetools.api.client.DeprecatableTrait<ByProjectKeyStatesGet> {

    private String projectKey;

    public ByProjectKeyStatesGet(final ApiHttpClient apiHttpClient, String projectKey) {
        super(apiHttpClient);
        this.projectKey = projectKey;
    }

    public ByProjectKeyStatesGet(ByProjectKeyStatesGet t) {
        super(t);
        this.projectKey = t.projectKey;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/states", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }

        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.state.StatePagedQueryResponse> executeBlocking(
            Duration timeout) {
        return blockingWait(execute(), timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.state.StatePagedQueryResponse>> execute() {
        return apiHttpClient().execute(this.createHttpRequest(),
            com.commercetools.api.models.state.StatePagedQueryResponse.class);
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

    public ByProjectKeyStatesGet withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    public ByProjectKeyStatesGet addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    public ByProjectKeyStatesGet withSort(final String sort) {
        return copy().withQueryParam("sort", sort);
    }

    public ByProjectKeyStatesGet addSort(final String sort) {
        return copy().addQueryParam("sort", sort);
    }

    public ByProjectKeyStatesGet withLimit(final Integer limit) {
        return copy().withQueryParam("limit", limit);
    }

    public ByProjectKeyStatesGet addLimit(final Integer limit) {
        return copy().addQueryParam("limit", limit);
    }

    public ByProjectKeyStatesGet withOffset(final Integer offset) {
        return copy().withQueryParam("offset", offset);
    }

    public ByProjectKeyStatesGet addOffset(final Integer offset) {
        return copy().addQueryParam("offset", offset);
    }

    public ByProjectKeyStatesGet withWithTotal(final Boolean withTotal) {
        return copy().withQueryParam("withTotal", withTotal);
    }

    public ByProjectKeyStatesGet addWithTotal(final Boolean withTotal) {
        return copy().addQueryParam("withTotal", withTotal);
    }

    public ByProjectKeyStatesGet withWhere(final String where) {
        return copy().withQueryParam("where", where);
    }

    public ByProjectKeyStatesGet addWhere(final String where) {
        return copy().addQueryParam("where", where);
    }

    public ByProjectKeyStatesGet withPredicateVar(final String varName, final String predicateVar) {
        return copy().withQueryParam(String.format("var.%s", varName), predicateVar);
    }

    public ByProjectKeyStatesGet addPredicateVar(final String varName, final String predicateVar) {
        return copy().addQueryParam(String.format("var.%s", varName), predicateVar);
    }

    @Override
    protected ByProjectKeyStatesGet copy() {
        return new ByProjectKeyStatesGet(this);
    }
}
