
package com.commercetools.api.client;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import com.fasterxml.jackson.core.type.TypeReference;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>Checks if an active ShippingMethod that can ship to the provided Location exists. Returns a <code>200 OK</code> status if the ShippingMethod exists or a Not Found error otherwise.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.fasterxml.jackson.databind.JsonNode>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .shippingMethods()
 *            .matchingLocation()
 *            .head()
 *            .withCountry(country)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyShippingMethodsMatchingLocationHead
        extends TypeApiMethod<ByProjectKeyShippingMethodsMatchingLocationHead, com.fasterxml.jackson.databind.JsonNode>
        implements com.commercetools.api.client.ErrorableTrait<ByProjectKeyShippingMethodsMatchingLocationHead>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyShippingMethodsMatchingLocationHead> {

    @Override
    public TypeReference<com.fasterxml.jackson.databind.JsonNode> resultType() {
        return new TypeReference<com.fasterxml.jackson.databind.JsonNode>() {
        };
    }

    private String projectKey;

    public ByProjectKeyShippingMethodsMatchingLocationHead(final ApiHttpClient apiHttpClient, String projectKey) {
        super(apiHttpClient);
        this.projectKey = projectKey;
    }

    public ByProjectKeyShippingMethodsMatchingLocationHead(ByProjectKeyShippingMethodsMatchingLocationHead t) {
        super(t);
        this.projectKey = t.projectKey;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/shipping-methods/matching-location",
            encodePathParam(this.projectKey));
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.HEAD, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.fasterxml.jackson.databind.JsonNode> executeBlocking(final ApiHttpClient client,
            final Duration timeout) {
        return executeBlocking(client, timeout, com.fasterxml.jackson.databind.JsonNode.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.fasterxml.jackson.databind.JsonNode>> execute(
            final ApiHttpClient client) {
        return execute(client, com.fasterxml.jackson.databind.JsonNode.class);
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

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    /**
     * set country with the specified value
     * @param country value to be set
     * @param <TValue> value type
     * @return ByProjectKeyShippingMethodsMatchingLocationHead
     */
    public <TValue> ByProjectKeyShippingMethodsMatchingLocationHead withCountry(final TValue country) {
        return copy().withQueryParam("country", country);
    }

    /**
     * add additional country query parameter
     * @param country value to be added
     * @param <TValue> value type
     * @return ByProjectKeyShippingMethodsMatchingLocationHead
     */
    public <TValue> ByProjectKeyShippingMethodsMatchingLocationHead addCountry(final TValue country) {
        return copy().addQueryParam("country", country);
    }

    /**
     * set country with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyShippingMethodsMatchingLocationHead
     */
    public ByProjectKeyShippingMethodsMatchingLocationHead withCountry(final Supplier<String> supplier) {
        return copy().withQueryParam("country", supplier.get());
    }

    /**
     * add additional country query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyShippingMethodsMatchingLocationHead
     */
    public ByProjectKeyShippingMethodsMatchingLocationHead addCountry(final Supplier<String> supplier) {
        return copy().addQueryParam("country", supplier.get());
    }

    /**
     * set country with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyShippingMethodsMatchingLocationHead
     */
    public ByProjectKeyShippingMethodsMatchingLocationHead withCountry(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("country", op.apply(new StringBuilder()));
    }

    /**
     * add additional country query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyShippingMethodsMatchingLocationHead
     */
    public ByProjectKeyShippingMethodsMatchingLocationHead addCountry(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("country", op.apply(new StringBuilder()));
    }

    /**
     * set country with the specified values
     * @param country values to be set
     * @param <TValue> value type
     * @return ByProjectKeyShippingMethodsMatchingLocationHead
     */
    public <TValue> ByProjectKeyShippingMethodsMatchingLocationHead withCountry(final Collection<TValue> country) {
        return copy().withoutQueryParam("country")
                .addQueryParams(
                    country.stream().map(s -> new ParamEntry<>("country", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional country query parameters
     * @param country values to be added
     * @param <TValue> value type
     * @return ByProjectKeyShippingMethodsMatchingLocationHead
     */
    public <TValue> ByProjectKeyShippingMethodsMatchingLocationHead addCountry(final Collection<TValue> country) {
        return copy().addQueryParams(
            country.stream().map(s -> new ParamEntry<>("country", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set state with the specified value
     * @param state value to be set
     * @param <TValue> value type
     * @return ByProjectKeyShippingMethodsMatchingLocationHead
     */
    public <TValue> ByProjectKeyShippingMethodsMatchingLocationHead withState(final TValue state) {
        return copy().withQueryParam("state", state);
    }

    /**
     * add additional state query parameter
     * @param state value to be added
     * @param <TValue> value type
     * @return ByProjectKeyShippingMethodsMatchingLocationHead
     */
    public <TValue> ByProjectKeyShippingMethodsMatchingLocationHead addState(final TValue state) {
        return copy().addQueryParam("state", state);
    }

    /**
     * set state with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyShippingMethodsMatchingLocationHead
     */
    public ByProjectKeyShippingMethodsMatchingLocationHead withState(final Supplier<String> supplier) {
        return copy().withQueryParam("state", supplier.get());
    }

    /**
     * add additional state query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyShippingMethodsMatchingLocationHead
     */
    public ByProjectKeyShippingMethodsMatchingLocationHead addState(final Supplier<String> supplier) {
        return copy().addQueryParam("state", supplier.get());
    }

    /**
     * set state with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyShippingMethodsMatchingLocationHead
     */
    public ByProjectKeyShippingMethodsMatchingLocationHead withState(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("state", op.apply(new StringBuilder()));
    }

    /**
     * add additional state query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyShippingMethodsMatchingLocationHead
     */
    public ByProjectKeyShippingMethodsMatchingLocationHead addState(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("state", op.apply(new StringBuilder()));
    }

    /**
     * set state with the specified values
     * @param state values to be set
     * @param <TValue> value type
     * @return ByProjectKeyShippingMethodsMatchingLocationHead
     */
    public <TValue> ByProjectKeyShippingMethodsMatchingLocationHead withState(final Collection<TValue> state) {
        return copy().withoutQueryParam("state")
                .addQueryParams(
                    state.stream().map(s -> new ParamEntry<>("state", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional state query parameters
     * @param state values to be added
     * @param <TValue> value type
     * @return ByProjectKeyShippingMethodsMatchingLocationHead
     */
    public <TValue> ByProjectKeyShippingMethodsMatchingLocationHead addState(final Collection<TValue> state) {
        return copy().addQueryParams(
            state.stream().map(s -> new ParamEntry<>("state", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set currency with the specified value
     * @param currency value to be set
     * @param <TValue> value type
     * @return ByProjectKeyShippingMethodsMatchingLocationHead
     */
    public <TValue> ByProjectKeyShippingMethodsMatchingLocationHead withCurrency(final TValue currency) {
        return copy().withQueryParam("currency", currency);
    }

    /**
     * add additional currency query parameter
     * @param currency value to be added
     * @param <TValue> value type
     * @return ByProjectKeyShippingMethodsMatchingLocationHead
     */
    public <TValue> ByProjectKeyShippingMethodsMatchingLocationHead addCurrency(final TValue currency) {
        return copy().addQueryParam("currency", currency);
    }

    /**
     * set currency with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyShippingMethodsMatchingLocationHead
     */
    public ByProjectKeyShippingMethodsMatchingLocationHead withCurrency(final Supplier<String> supplier) {
        return copy().withQueryParam("currency", supplier.get());
    }

    /**
     * add additional currency query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyShippingMethodsMatchingLocationHead
     */
    public ByProjectKeyShippingMethodsMatchingLocationHead addCurrency(final Supplier<String> supplier) {
        return copy().addQueryParam("currency", supplier.get());
    }

    /**
     * set currency with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyShippingMethodsMatchingLocationHead
     */
    public ByProjectKeyShippingMethodsMatchingLocationHead withCurrency(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("currency", op.apply(new StringBuilder()));
    }

    /**
     * add additional currency query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyShippingMethodsMatchingLocationHead
     */
    public ByProjectKeyShippingMethodsMatchingLocationHead addCurrency(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("currency", op.apply(new StringBuilder()));
    }

    /**
     * set currency with the specified values
     * @param currency values to be set
     * @param <TValue> value type
     * @return ByProjectKeyShippingMethodsMatchingLocationHead
     */
    public <TValue> ByProjectKeyShippingMethodsMatchingLocationHead withCurrency(final Collection<TValue> currency) {
        return copy().withoutQueryParam("currency")
                .addQueryParams(currency.stream()
                        .map(s -> new ParamEntry<>("currency", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional currency query parameters
     * @param currency values to be added
     * @param <TValue> value type
     * @return ByProjectKeyShippingMethodsMatchingLocationHead
     */
    public <TValue> ByProjectKeyShippingMethodsMatchingLocationHead addCurrency(final Collection<TValue> currency) {
        return copy().addQueryParams(
            currency.stream().map(s -> new ParamEntry<>("currency", s.toString())).collect(Collectors.toList()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyShippingMethodsMatchingLocationHead that = (ByProjectKeyShippingMethodsMatchingLocationHead) o;

        return new EqualsBuilder().append(projectKey, that.projectKey).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).toHashCode();
    }

    @Override
    protected ByProjectKeyShippingMethodsMatchingLocationHead copy() {
        return new ByProjectKeyShippingMethodsMatchingLocationHead(this);
    }
}
