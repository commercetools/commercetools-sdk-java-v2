
package com.commercetools.api.client;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyShippingMethodsMatchingOrdereditGet extends
        ApiMethod<ByProjectKeyShippingMethodsMatchingOrdereditGet, com.commercetools.api.models.shipping_method.ShippingMethodPagedQueryResponse>
        implements com.commercetools.api.client.ErrorableTrait<ByProjectKeyShippingMethodsMatchingOrdereditGet>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyShippingMethodsMatchingOrdereditGet> {

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
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/shipping-methods/matching-orderedit", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.shipping_method.ShippingMethodPagedQueryResponse> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout,
            com.commercetools.api.models.shipping_method.ShippingMethodPagedQueryResponse.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.shipping_method.ShippingMethodPagedQueryResponse>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.shipping_method.ShippingMethodPagedQueryResponse.class);
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

    /**
     * set orderEditId with the specified value
     */
    public ByProjectKeyShippingMethodsMatchingOrdereditGet withOrderEditId(final String orderEditId) {
        return copy().withQueryParam("orderEditId", orderEditId);
    }

    /**
     * add additional orderEditId query parameter
     */
    public ByProjectKeyShippingMethodsMatchingOrdereditGet addOrderEditId(final String orderEditId) {
        return copy().addQueryParam("orderEditId", orderEditId);
    }

    /**
     * set orderEditId with the specified value
     */
    public ByProjectKeyShippingMethodsMatchingOrdereditGet withOrderEditId(final Supplier<String> supplier) {
        return copy().withQueryParam("orderEditId", supplier.get());
    }

    /**
     * add additional orderEditId query parameter
     */
    public ByProjectKeyShippingMethodsMatchingOrdereditGet addOrderEditId(final Supplier<String> supplier) {
        return copy().addQueryParam("orderEditId", supplier.get());
    }

    /**
     * set orderEditId with the specified value
     */
    public ByProjectKeyShippingMethodsMatchingOrdereditGet withOrderEditId(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("orderEditId", op.apply(new StringBuilder()));
    }

    /**
     * add additional orderEditId query parameter
     */
    public ByProjectKeyShippingMethodsMatchingOrdereditGet addOrderEditId(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("orderEditId", op.apply(new StringBuilder()));
    }

    /**
     * set orderEditId with the specified values
     */
    public ByProjectKeyShippingMethodsMatchingOrdereditGet withOrderEditId(final List<String> orderEditId) {
        return copy().withoutQueryParam("orderEditId")
                .addQueryParams(orderEditId.stream()
                        .map(s -> new ParamEntry<>("orderEditId", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional orderEditId query parameters
     */
    public ByProjectKeyShippingMethodsMatchingOrdereditGet addOrderEditId(final List<String> orderEditId) {
        return copy().addQueryParams(
            orderEditId.stream().map(s -> new ParamEntry<>("orderEditId", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set country with the specified value
     */
    public ByProjectKeyShippingMethodsMatchingOrdereditGet withCountry(final String country) {
        return copy().withQueryParam("country", country);
    }

    /**
     * add additional country query parameter
     */
    public ByProjectKeyShippingMethodsMatchingOrdereditGet addCountry(final String country) {
        return copy().addQueryParam("country", country);
    }

    /**
     * set country with the specified value
     */
    public ByProjectKeyShippingMethodsMatchingOrdereditGet withCountry(final Supplier<String> supplier) {
        return copy().withQueryParam("country", supplier.get());
    }

    /**
     * add additional country query parameter
     */
    public ByProjectKeyShippingMethodsMatchingOrdereditGet addCountry(final Supplier<String> supplier) {
        return copy().addQueryParam("country", supplier.get());
    }

    /**
     * set country with the specified value
     */
    public ByProjectKeyShippingMethodsMatchingOrdereditGet withCountry(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("country", op.apply(new StringBuilder()));
    }

    /**
     * add additional country query parameter
     */
    public ByProjectKeyShippingMethodsMatchingOrdereditGet addCountry(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("country", op.apply(new StringBuilder()));
    }

    /**
     * set country with the specified values
     */
    public ByProjectKeyShippingMethodsMatchingOrdereditGet withCountry(final List<String> country) {
        return copy().withoutQueryParam("country")
                .addQueryParams(
                    country.stream().map(s -> new ParamEntry<>("country", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional country query parameters
     */
    public ByProjectKeyShippingMethodsMatchingOrdereditGet addCountry(final List<String> country) {
        return copy().addQueryParams(
            country.stream().map(s -> new ParamEntry<>("country", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set state with the specified value
     */
    public ByProjectKeyShippingMethodsMatchingOrdereditGet withState(final String state) {
        return copy().withQueryParam("state", state);
    }

    /**
     * add additional state query parameter
     */
    public ByProjectKeyShippingMethodsMatchingOrdereditGet addState(final String state) {
        return copy().addQueryParam("state", state);
    }

    /**
     * set state with the specified value
     */
    public ByProjectKeyShippingMethodsMatchingOrdereditGet withState(final Supplier<String> supplier) {
        return copy().withQueryParam("state", supplier.get());
    }

    /**
     * add additional state query parameter
     */
    public ByProjectKeyShippingMethodsMatchingOrdereditGet addState(final Supplier<String> supplier) {
        return copy().addQueryParam("state", supplier.get());
    }

    /**
     * set state with the specified value
     */
    public ByProjectKeyShippingMethodsMatchingOrdereditGet withState(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("state", op.apply(new StringBuilder()));
    }

    /**
     * add additional state query parameter
     */
    public ByProjectKeyShippingMethodsMatchingOrdereditGet addState(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("state", op.apply(new StringBuilder()));
    }

    /**
     * set state with the specified values
     */
    public ByProjectKeyShippingMethodsMatchingOrdereditGet withState(final List<String> state) {
        return copy().withoutQueryParam("state")
                .addQueryParams(
                    state.stream().map(s -> new ParamEntry<>("state", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional state query parameters
     */
    public ByProjectKeyShippingMethodsMatchingOrdereditGet addState(final List<String> state) {
        return copy().addQueryParams(
            state.stream().map(s -> new ParamEntry<>("state", s.toString())).collect(Collectors.toList()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyShippingMethodsMatchingOrdereditGet that = (ByProjectKeyShippingMethodsMatchingOrdereditGet) o;

        return new EqualsBuilder().append(projectKey, that.projectKey).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).toHashCode();
    }

    @Override
    protected ByProjectKeyShippingMethodsMatchingOrdereditGet copy() {
        return new ByProjectKeyShippingMethodsMatchingOrdereditGet(this);
    }
}
