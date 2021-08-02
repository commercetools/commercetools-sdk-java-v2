
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
public class ByProjectKeyTypesGet
        extends ApiMethod<ByProjectKeyTypesGet, com.commercetools.api.models.type.TypePagedQueryResponse> implements
        com.commercetools.api.models.PagedQueryResourceRequest<ByProjectKeyTypesGet, com.commercetools.api.models.type.TypePagedQueryResponse>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyTypesGet>,
        com.commercetools.api.client.SortableTrait<ByProjectKeyTypesGet>,
        com.commercetools.api.client.PagingTrait<ByProjectKeyTypesGet>,
        com.commercetools.api.client.QueryTrait<ByProjectKeyTypesGet>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyTypesGet>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyTypesGet> {

    private String projectKey;

    public ByProjectKeyTypesGet(final ApiHttpClient apiHttpClient, String projectKey) {
        super(apiHttpClient);
        this.projectKey = projectKey;
    }

    public ByProjectKeyTypesGet(ByProjectKeyTypesGet t) {
        super(t);
        this.projectKey = t.projectKey;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/types", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }

        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.type.TypePagedQueryResponse> executeBlocking(
            final ApiHttpClient client, Duration timeout) {
        ApiHttpRequest request = this.createHttpRequest();
        return blockingWait(client.execute(request, com.commercetools.api.models.type.TypePagedQueryResponse.class),
            request, timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.type.TypePagedQueryResponse>> execute(
            final ApiHttpClient client) {
        return client.execute(this.createHttpRequest(), com.commercetools.api.models.type.TypePagedQueryResponse.class);
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

    public ByProjectKeyTypesGet withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    public ByProjectKeyTypesGet addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    public ByProjectKeyTypesGet withSort(final String sort) {
        return copy().withQueryParam("sort", sort);
    }

    public ByProjectKeyTypesGet addSort(final String sort) {
        return copy().addQueryParam("sort", sort);
    }

    public ByProjectKeyTypesGet withLimit(final int limit) {
        return copy().withQueryParam("limit", limit);
    }

    public ByProjectKeyTypesGet addLimit(final int limit) {
        return copy().addQueryParam("limit", limit);
    }

    public ByProjectKeyTypesGet withOffset(final int offset) {
        return copy().withQueryParam("offset", offset);
    }

    public ByProjectKeyTypesGet addOffset(final int offset) {
        return copy().addQueryParam("offset", offset);
    }

    public ByProjectKeyTypesGet withWithTotal(final boolean withTotal) {
        return copy().withQueryParam("withTotal", withTotal);
    }

    public ByProjectKeyTypesGet addWithTotal(final boolean withTotal) {
        return copy().addQueryParam("withTotal", withTotal);
    }

    public ByProjectKeyTypesGet withWhere(final String where) {
        return copy().withQueryParam("where", where);
    }

    public ByProjectKeyTypesGet addWhere(final String where) {
        return copy().addQueryParam("where", where);
    }

    public ByProjectKeyTypesGet withPredicateVar(final String varName, final String predicateVar) {
        return copy().withQueryParam(String.format("var.%s", varName), predicateVar);
    }

    public ByProjectKeyTypesGet addPredicateVar(final String varName, final String predicateVar) {
        return copy().addQueryParam(String.format("var.%s", varName), predicateVar);
    }

    @Override
    protected ByProjectKeyTypesGet copy() {
        return new ByProjectKeyTypesGet(this);
    }
}
