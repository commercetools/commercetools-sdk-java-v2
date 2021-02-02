
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
*  <p>Query api-clients</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyApiClientsGet extends
        ApiMethod<ByProjectKeyApiClientsGet, com.commercetools.api.models.api_client.ApiClientPagedQueryResponse>
        implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyApiClientsGet>,
        com.commercetools.api.client.SortableTrait<ByProjectKeyApiClientsGet>,
        com.commercetools.api.client.PagingTrait<ByProjectKeyApiClientsGet>,
        com.commercetools.api.client.QueryTrait<ByProjectKeyApiClientsGet>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyApiClientsGet>,
        com.commercetools.api.client.DeprecatableTrait<ByProjectKeyApiClientsGet> {

    private String projectKey;

    public ByProjectKeyApiClientsGet(final ApiHttpClient apiHttpClient, String projectKey) {
        super(apiHttpClient);
        this.projectKey = projectKey;
    }

    public ByProjectKeyApiClientsGet(ByProjectKeyApiClientsGet t) {
        super(t);
        this.projectKey = t.projectKey;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/api-clients", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }

        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.api_client.ApiClientPagedQueryResponse> executeBlocking(
            Duration timeout) {
        return blockingWait(execute(), timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.api_client.ApiClientPagedQueryResponse>> execute() {
        return apiHttpClient().execute(this.createHttpRequest(),
            com.commercetools.api.models.api_client.ApiClientPagedQueryResponse.class);
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

    public ByProjectKeyApiClientsGet withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    public ByProjectKeyApiClientsGet addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    public ByProjectKeyApiClientsGet withSort(final String sort) {
        return copy().withQueryParam("sort", sort);
    }

    public ByProjectKeyApiClientsGet addSort(final String sort) {
        return copy().addQueryParam("sort", sort);
    }

    public ByProjectKeyApiClientsGet withLimit(final Integer limit) {
        return copy().withQueryParam("limit", limit);
    }

    public ByProjectKeyApiClientsGet addLimit(final Integer limit) {
        return copy().addQueryParam("limit", limit);
    }

    public ByProjectKeyApiClientsGet withOffset(final Integer offset) {
        return copy().withQueryParam("offset", offset);
    }

    public ByProjectKeyApiClientsGet addOffset(final Integer offset) {
        return copy().addQueryParam("offset", offset);
    }

    public ByProjectKeyApiClientsGet withWithTotal(final Boolean withTotal) {
        return copy().withQueryParam("withTotal", withTotal);
    }

    public ByProjectKeyApiClientsGet addWithTotal(final Boolean withTotal) {
        return copy().addQueryParam("withTotal", withTotal);
    }

    public ByProjectKeyApiClientsGet withWhere(final String where) {
        return copy().withQueryParam("where", where);
    }

    public ByProjectKeyApiClientsGet addWhere(final String where) {
        return copy().addQueryParam("where", where);
    }

    public ByProjectKeyApiClientsGet withPredicateVar(final String varName, final String predicateVar) {
        return copy().withQueryParam(String.format("var.%s", varName), predicateVar);
    }

    public ByProjectKeyApiClientsGet addPredicateVar(final String varName, final String predicateVar) {
        return copy().addQueryParam(String.format("var.%s", varName), predicateVar);
    }

    @Override
    protected ByProjectKeyApiClientsGet copy() {
        return new ByProjectKeyApiClientsGet(this);
    }
}
