
package com.commercetools.api.client;

import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

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
        return blockingWait(
            client.execute(request, com.commercetools.api.models.shipping_method.ShippingMethodPagedQueryResponse.class)
                    .toCompletableFuture(),
            request, timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.shipping_method.ShippingMethodPagedQueryResponse>> execute(
            final ApiHttpClient client) {
        return client
                .execute(this.createHttpRequest(),
                    com.commercetools.api.models.shipping_method.ShippingMethodPagedQueryResponse.class)
                .toCompletableFuture();
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
     * set country with the specificied values
     */
    public ByProjectKeyShippingMethodsMatchingLocationGet withCountry(final List<String> country) {
        return copy().withoutQueryParam("country")
                .addQueryParams(
                    country.stream().map(s -> new ParamEntry<>("country", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional country query parameters
     */
    public ByProjectKeyShippingMethodsMatchingLocationGet addCountry(final List<String> country) {
        return copy().addQueryParams(
            country.stream().map(s -> new ParamEntry<>("country", s.toString())).collect(Collectors.toList()));
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
     * set state with the specificied values
     */
    public ByProjectKeyShippingMethodsMatchingLocationGet withState(final List<String> state) {
        return copy().withoutQueryParam("state")
                .addQueryParams(
                    state.stream().map(s -> new ParamEntry<>("state", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional state query parameters
     */
    public ByProjectKeyShippingMethodsMatchingLocationGet addState(final List<String> state) {
        return copy().addQueryParams(
            state.stream().map(s -> new ParamEntry<>("state", s.toString())).collect(Collectors.toList()));
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
     * set currency with the specificied values
     */
    public ByProjectKeyShippingMethodsMatchingLocationGet withCurrency(final List<String> currency) {
        return copy().withoutQueryParam("currency")
                .addQueryParams(currency.stream()
                        .map(s -> new ParamEntry<>("currency", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional currency query parameters
     */
    public ByProjectKeyShippingMethodsMatchingLocationGet addCurrency(final List<String> currency) {
        return copy().addQueryParams(
            currency.stream().map(s -> new ParamEntry<>("currency", s.toString())).collect(Collectors.toList()));
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

    /**
     * set expand with the specificied values
     */
    public ByProjectKeyShippingMethodsMatchingLocationGet withExpand(final List<String> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     */
    public ByProjectKeyShippingMethodsMatchingLocationGet addExpand(final List<String> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyShippingMethodsMatchingLocationGet that = (ByProjectKeyShippingMethodsMatchingLocationGet) o;

        return new EqualsBuilder().append(projectKey, that.projectKey).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).toHashCode();
    }

    @Override
    protected ByProjectKeyShippingMethodsMatchingLocationGet copy() {
        return new ByProjectKeyShippingMethodsMatchingLocationGet(this);
    }
}
