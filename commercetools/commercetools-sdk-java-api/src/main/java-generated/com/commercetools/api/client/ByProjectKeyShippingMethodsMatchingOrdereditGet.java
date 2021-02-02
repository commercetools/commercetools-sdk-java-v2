
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
public class ByProjectKeyShippingMethodsMatchingOrdereditGet extends
        ApiMethod<ByProjectKeyShippingMethodsMatchingOrdereditGet, com.commercetools.api.models.shipping_method.ShippingMethodPagedQueryResponse>
        implements com.commercetools.api.client.ErrorableTrait<ByProjectKeyShippingMethodsMatchingOrdereditGet>,
        com.commercetools.api.client.DeprecatableTrait<ByProjectKeyShippingMethodsMatchingOrdereditGet> {

    private String projectKey;

    public ByProjectKeyShippingMethodsMatchingOrdereditGet(final ApiHttpClient apiHttpClient, String projectKey) {
        super(apiHttpClient);
        this.projectKey = projectKey;
    }

    public ByProjectKeyShippingMethodsMatchingOrdereditGet(ByProjectKeyShippingMethodsMatchingOrdereditGet t) {
        super(t);
        this.projectKey = t.projectKey;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/shipping-methods/matching-orderedit", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }

        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.shipping_method.ShippingMethodPagedQueryResponse> executeBlocking(
            Duration timeout) {
        return blockingWait(execute(), timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.shipping_method.ShippingMethodPagedQueryResponse>> execute() {
        return apiHttpClient().execute(this.createHttpRequest(),
            com.commercetools.api.models.shipping_method.ShippingMethodPagedQueryResponse.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public List<String> getOrderEditId() {
        return this.getQueryParam("orderEditId");
    }

    public List<String> getCountry() {
        return this.getQueryParam("country");
    }

    public List<String> getState() {
        return this.getQueryParam("state");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public ByProjectKeyShippingMethodsMatchingOrdereditGet withOrderEditId(final String orderEditId) {
        return copy().withQueryParam("orderEditId", orderEditId);
    }

    public ByProjectKeyShippingMethodsMatchingOrdereditGet addOrderEditId(final String orderEditId) {
        return copy().addQueryParam("orderEditId", orderEditId);
    }

    public ByProjectKeyShippingMethodsMatchingOrdereditGet withCountry(final String country) {
        return copy().withQueryParam("country", country);
    }

    public ByProjectKeyShippingMethodsMatchingOrdereditGet addCountry(final String country) {
        return copy().addQueryParam("country", country);
    }

    public ByProjectKeyShippingMethodsMatchingOrdereditGet withState(final String state) {
        return copy().withQueryParam("state", state);
    }

    public ByProjectKeyShippingMethodsMatchingOrdereditGet addState(final String state) {
        return copy().addQueryParam("state", state);
    }

    @Override
    protected ByProjectKeyShippingMethodsMatchingOrdereditGet copy() {
        return new ByProjectKeyShippingMethodsMatchingOrdereditGet(this);
    }
}
