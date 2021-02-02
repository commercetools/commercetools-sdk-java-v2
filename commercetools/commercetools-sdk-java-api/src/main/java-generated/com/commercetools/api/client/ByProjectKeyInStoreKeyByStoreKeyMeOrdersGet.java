
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
*  <p>Query orders</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyMeOrdersGet extends
        ApiMethod<ByProjectKeyInStoreKeyByStoreKeyMeOrdersGet, com.commercetools.api.models.order.OrderPagedQueryResponse>
        implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyInStoreKeyByStoreKeyMeOrdersGet>,
        com.commercetools.api.client.SortableTrait<ByProjectKeyInStoreKeyByStoreKeyMeOrdersGet>,
        com.commercetools.api.client.PagingTrait<ByProjectKeyInStoreKeyByStoreKeyMeOrdersGet>,
        com.commercetools.api.client.QueryTrait<ByProjectKeyInStoreKeyByStoreKeyMeOrdersGet>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyInStoreKeyByStoreKeyMeOrdersGet>,
        com.commercetools.api.client.DeprecatableTrait<ByProjectKeyInStoreKeyByStoreKeyMeOrdersGet> {

    private String projectKey;
    private String storeKey;

    public ByProjectKeyInStoreKeyByStoreKeyMeOrdersGet(final ApiHttpClient apiHttpClient, String projectKey,
            String storeKey) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.storeKey = storeKey;
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeOrdersGet(ByProjectKeyInStoreKeyByStoreKeyMeOrdersGet t) {
        super(t);
        this.projectKey = t.projectKey;
        this.storeKey = t.storeKey;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/in-store/key=%s/me/orders", this.projectKey, this.storeKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }

        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.order.OrderPagedQueryResponse> executeBlocking(
            Duration timeout) {
        return blockingWait(execute(), timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.order.OrderPagedQueryResponse>> execute() {
        return apiHttpClient().execute(this.createHttpRequest(),
            com.commercetools.api.models.order.OrderPagedQueryResponse.class);
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

    public ByProjectKeyInStoreKeyByStoreKeyMeOrdersGet withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeOrdersGet addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeOrdersGet withSort(final String sort) {
        return copy().withQueryParam("sort", sort);
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeOrdersGet addSort(final String sort) {
        return copy().addQueryParam("sort", sort);
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeOrdersGet withLimit(final Integer limit) {
        return copy().withQueryParam("limit", limit);
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeOrdersGet addLimit(final Integer limit) {
        return copy().addQueryParam("limit", limit);
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeOrdersGet withOffset(final Integer offset) {
        return copy().withQueryParam("offset", offset);
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeOrdersGet addOffset(final Integer offset) {
        return copy().addQueryParam("offset", offset);
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeOrdersGet withWithTotal(final Boolean withTotal) {
        return copy().withQueryParam("withTotal", withTotal);
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeOrdersGet addWithTotal(final Boolean withTotal) {
        return copy().addQueryParam("withTotal", withTotal);
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeOrdersGet withWhere(final String where) {
        return copy().withQueryParam("where", where);
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeOrdersGet addWhere(final String where) {
        return copy().addQueryParam("where", where);
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeOrdersGet withPredicateVar(final String varName,
            final String predicateVar) {
        return copy().withQueryParam(String.format("var.%s", varName), predicateVar);
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeOrdersGet addPredicateVar(final String varName,
            final String predicateVar) {
        return copy().addQueryParam(String.format("var.%s", varName), predicateVar);
    }

    @Override
    protected ByProjectKeyInStoreKeyByStoreKeyMeOrdersGet copy() {
        return new ByProjectKeyInStoreKeyByStoreKeyMeOrdersGet(this);
    }
}
