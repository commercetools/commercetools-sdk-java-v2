
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
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyShippingMethodsMatchingLocationGet> {

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
            final ApiHttpClient client, Duration timeout) {
        ApiHttpRequest request = this.createHttpRequest();
        return blockingWait(client.execute(request,
            com.commercetools.api.models.shipping_method.ShippingMethodPagedQueryResponse.class), request, timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.shipping_method.ShippingMethodPagedQueryResponse>> execute(
            final ApiHttpClient client) {
        return client.execute(this.createHttpRequest(),
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

    /**
     * set country with the specificied value
     */
    public ByProjectKeyShippingMethodsMatchingLocationGet withCountry(final String country) {
        return copy().withQueryParam("country", country);
    }

    /**
     * add additional country query parameter
     */
    public ByProjectKeyShippingMethodsMatchingLocationGet addCountry(final String country) {
        return copy().addQueryParam("country", country);
    }

    /**
     * set state with the specificied value
     */
    public ByProjectKeyShippingMethodsMatchingLocationGet withState(final String state) {
        return copy().withQueryParam("state", state);
    }

    /**
     * add additional state query parameter
     */
    public ByProjectKeyShippingMethodsMatchingLocationGet addState(final String state) {
        return copy().addQueryParam("state", state);
    }

    /**
     * set currency with the specificied value
     */
    public ByProjectKeyShippingMethodsMatchingLocationGet withCurrency(final String currency) {
        return copy().withQueryParam("currency", currency);
    }

    /**
     * add additional currency query parameter
     */
    public ByProjectKeyShippingMethodsMatchingLocationGet addCurrency(final String currency) {
        return copy().addQueryParam("currency", currency);
    }

    /**
     * set expand with the specificied value
     */
    public ByProjectKeyShippingMethodsMatchingLocationGet withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyShippingMethodsMatchingLocationGet addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    @Override
    protected ByProjectKeyShippingMethodsMatchingLocationGet copy() {
        return new ByProjectKeyShippingMethodsMatchingLocationGet(this);
    }
}
