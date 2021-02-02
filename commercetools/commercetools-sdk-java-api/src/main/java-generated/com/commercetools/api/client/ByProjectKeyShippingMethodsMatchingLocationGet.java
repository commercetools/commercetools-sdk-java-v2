
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
public class ByProjectKeyShippingMethodsMatchingLocationGet extends
        ApiMethod<ByProjectKeyShippingMethodsMatchingLocationGet, com.commercetools.api.models.shipping_method.ShippingMethodPagedQueryResponse>
        implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyShippingMethodsMatchingLocationGet>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyShippingMethodsMatchingLocationGet>,
        com.commercetools.api.client.DeprecatableTrait<ByProjectKeyShippingMethodsMatchingLocationGet> {

    private String projectKey;

    public ByProjectKeyShippingMethodsMatchingLocationGet(final ApiHttpClient apiHttpClient, String projectKey) {
        super(apiHttpClient);
        this.projectKey = projectKey;
    }

    public ByProjectKeyShippingMethodsMatchingLocationGet(ByProjectKeyShippingMethodsMatchingLocationGet t) {
        super(t);
        this.projectKey = t.projectKey;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/shipping-methods/matching-location", this.projectKey);
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

    public List<String> getCountry() {
        return this.getQueryParam("country");
    }

    public List<String> getState() {
        return this.getQueryParam("state");
    }

    public List<String> getCurrency() {
        return this.getQueryParam("currency");
    }

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public ByProjectKeyShippingMethodsMatchingLocationGet withCountry(final String country) {
        return copy().withQueryParam("country", country);
    }

    public ByProjectKeyShippingMethodsMatchingLocationGet addCountry(final String country) {
        return copy().addQueryParam("country", country);
    }

    public ByProjectKeyShippingMethodsMatchingLocationGet withState(final String state) {
        return copy().withQueryParam("state", state);
    }

    public ByProjectKeyShippingMethodsMatchingLocationGet addState(final String state) {
        return copy().addQueryParam("state", state);
    }

    public ByProjectKeyShippingMethodsMatchingLocationGet withCurrency(final String currency) {
        return copy().withQueryParam("currency", currency);
    }

    public ByProjectKeyShippingMethodsMatchingLocationGet addCurrency(final String currency) {
        return copy().addQueryParam("currency", currency);
    }

    public ByProjectKeyShippingMethodsMatchingLocationGet withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    public ByProjectKeyShippingMethodsMatchingLocationGet addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    @Override
    protected ByProjectKeyShippingMethodsMatchingLocationGet copy() {
        return new ByProjectKeyShippingMethodsMatchingLocationGet(this);
    }
}
