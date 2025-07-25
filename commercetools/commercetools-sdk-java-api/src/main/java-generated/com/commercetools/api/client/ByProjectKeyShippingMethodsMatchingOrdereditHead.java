
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
 *  <p>Checks if an active ShippingMethod that can ship to the provided Location exists for the provided OrderEdit. Returns a <code>200 OK</code> status if the ShippingMethod exists or a Not Found error otherwise.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.fasterxml.jackson.databind.JsonNode>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .shippingMethods()
 *            .matchingOrderedit()
 *            .head()
 *            .withOrderEditId(orderEditId)
 *            .withCountry(country)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyShippingMethodsMatchingOrdereditHead
        extends TypeApiMethod<ByProjectKeyShippingMethodsMatchingOrdereditHead, com.fasterxml.jackson.databind.JsonNode>
        implements com.commercetools.api.client.ErrorableTrait<ByProjectKeyShippingMethodsMatchingOrdereditHead>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyShippingMethodsMatchingOrdereditHead> {

    @Override
    public TypeReference<com.fasterxml.jackson.databind.JsonNode> resultType() {
        return new TypeReference<com.fasterxml.jackson.databind.JsonNode>() {
        };
    }

    private String projectKey;

    public ByProjectKeyShippingMethodsMatchingOrdereditHead(final ApiHttpClient apiHttpClient, String projectKey) {
        super(apiHttpClient);
        this.projectKey = projectKey;
    }

    public ByProjectKeyShippingMethodsMatchingOrdereditHead(ByProjectKeyShippingMethodsMatchingOrdereditHead t) {
        super(t);
        this.projectKey = t.projectKey;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/shipping-methods/matching-orderedit",
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
     * @param orderEditId value to be set
     * @param <TValue> value type
     * @return ByProjectKeyShippingMethodsMatchingOrdereditHead
     */
    public <TValue> ByProjectKeyShippingMethodsMatchingOrdereditHead withOrderEditId(final TValue orderEditId) {
        return copy().withQueryParam("orderEditId", orderEditId);
    }

    /**
     * add additional orderEditId query parameter
     * @param orderEditId value to be added
     * @param <TValue> value type
     * @return ByProjectKeyShippingMethodsMatchingOrdereditHead
     */
    public <TValue> ByProjectKeyShippingMethodsMatchingOrdereditHead addOrderEditId(final TValue orderEditId) {
        return copy().addQueryParam("orderEditId", orderEditId);
    }

    /**
     * set orderEditId with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyShippingMethodsMatchingOrdereditHead
     */
    public ByProjectKeyShippingMethodsMatchingOrdereditHead withOrderEditId(final Supplier<String> supplier) {
        return copy().withQueryParam("orderEditId", supplier.get());
    }

    /**
     * add additional orderEditId query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyShippingMethodsMatchingOrdereditHead
     */
    public ByProjectKeyShippingMethodsMatchingOrdereditHead addOrderEditId(final Supplier<String> supplier) {
        return copy().addQueryParam("orderEditId", supplier.get());
    }

    /**
     * set orderEditId with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyShippingMethodsMatchingOrdereditHead
     */
    public ByProjectKeyShippingMethodsMatchingOrdereditHead withOrderEditId(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("orderEditId", op.apply(new StringBuilder()));
    }

    /**
     * add additional orderEditId query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyShippingMethodsMatchingOrdereditHead
     */
    public ByProjectKeyShippingMethodsMatchingOrdereditHead addOrderEditId(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("orderEditId", op.apply(new StringBuilder()));
    }

    /**
     * set orderEditId with the specified values
     * @param orderEditId values to be set
     * @param <TValue> value type
     * @return ByProjectKeyShippingMethodsMatchingOrdereditHead
     */
    public <TValue> ByProjectKeyShippingMethodsMatchingOrdereditHead withOrderEditId(
            final Collection<TValue> orderEditId) {
        return copy().withoutQueryParam("orderEditId")
                .addQueryParams(orderEditId.stream()
                        .map(s -> new ParamEntry<>("orderEditId", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional orderEditId query parameters
     * @param orderEditId values to be added
     * @param <TValue> value type
     * @return ByProjectKeyShippingMethodsMatchingOrdereditHead
     */
    public <TValue> ByProjectKeyShippingMethodsMatchingOrdereditHead addOrderEditId(
            final Collection<TValue> orderEditId) {
        return copy().addQueryParams(
            orderEditId.stream().map(s -> new ParamEntry<>("orderEditId", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set country with the specified value
     * @param country value to be set
     * @param <TValue> value type
     * @return ByProjectKeyShippingMethodsMatchingOrdereditHead
     */
    public <TValue> ByProjectKeyShippingMethodsMatchingOrdereditHead withCountry(final TValue country) {
        return copy().withQueryParam("country", country);
    }

    /**
     * add additional country query parameter
     * @param country value to be added
     * @param <TValue> value type
     * @return ByProjectKeyShippingMethodsMatchingOrdereditHead
     */
    public <TValue> ByProjectKeyShippingMethodsMatchingOrdereditHead addCountry(final TValue country) {
        return copy().addQueryParam("country", country);
    }

    /**
     * set country with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyShippingMethodsMatchingOrdereditHead
     */
    public ByProjectKeyShippingMethodsMatchingOrdereditHead withCountry(final Supplier<String> supplier) {
        return copy().withQueryParam("country", supplier.get());
    }

    /**
     * add additional country query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyShippingMethodsMatchingOrdereditHead
     */
    public ByProjectKeyShippingMethodsMatchingOrdereditHead addCountry(final Supplier<String> supplier) {
        return copy().addQueryParam("country", supplier.get());
    }

    /**
     * set country with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyShippingMethodsMatchingOrdereditHead
     */
    public ByProjectKeyShippingMethodsMatchingOrdereditHead withCountry(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("country", op.apply(new StringBuilder()));
    }

    /**
     * add additional country query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyShippingMethodsMatchingOrdereditHead
     */
    public ByProjectKeyShippingMethodsMatchingOrdereditHead addCountry(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("country", op.apply(new StringBuilder()));
    }

    /**
     * set country with the specified values
     * @param country values to be set
     * @param <TValue> value type
     * @return ByProjectKeyShippingMethodsMatchingOrdereditHead
     */
    public <TValue> ByProjectKeyShippingMethodsMatchingOrdereditHead withCountry(final Collection<TValue> country) {
        return copy().withoutQueryParam("country")
                .addQueryParams(
                    country.stream().map(s -> new ParamEntry<>("country", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional country query parameters
     * @param country values to be added
     * @param <TValue> value type
     * @return ByProjectKeyShippingMethodsMatchingOrdereditHead
     */
    public <TValue> ByProjectKeyShippingMethodsMatchingOrdereditHead addCountry(final Collection<TValue> country) {
        return copy().addQueryParams(
            country.stream().map(s -> new ParamEntry<>("country", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set state with the specified value
     * @param state value to be set
     * @param <TValue> value type
     * @return ByProjectKeyShippingMethodsMatchingOrdereditHead
     */
    public <TValue> ByProjectKeyShippingMethodsMatchingOrdereditHead withState(final TValue state) {
        return copy().withQueryParam("state", state);
    }

    /**
     * add additional state query parameter
     * @param state value to be added
     * @param <TValue> value type
     * @return ByProjectKeyShippingMethodsMatchingOrdereditHead
     */
    public <TValue> ByProjectKeyShippingMethodsMatchingOrdereditHead addState(final TValue state) {
        return copy().addQueryParam("state", state);
    }

    /**
     * set state with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyShippingMethodsMatchingOrdereditHead
     */
    public ByProjectKeyShippingMethodsMatchingOrdereditHead withState(final Supplier<String> supplier) {
        return copy().withQueryParam("state", supplier.get());
    }

    /**
     * add additional state query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyShippingMethodsMatchingOrdereditHead
     */
    public ByProjectKeyShippingMethodsMatchingOrdereditHead addState(final Supplier<String> supplier) {
        return copy().addQueryParam("state", supplier.get());
    }

    /**
     * set state with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyShippingMethodsMatchingOrdereditHead
     */
    public ByProjectKeyShippingMethodsMatchingOrdereditHead withState(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("state", op.apply(new StringBuilder()));
    }

    /**
     * add additional state query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyShippingMethodsMatchingOrdereditHead
     */
    public ByProjectKeyShippingMethodsMatchingOrdereditHead addState(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("state", op.apply(new StringBuilder()));
    }

    /**
     * set state with the specified values
     * @param state values to be set
     * @param <TValue> value type
     * @return ByProjectKeyShippingMethodsMatchingOrdereditHead
     */
    public <TValue> ByProjectKeyShippingMethodsMatchingOrdereditHead withState(final Collection<TValue> state) {
        return copy().withoutQueryParam("state")
                .addQueryParams(
                    state.stream().map(s -> new ParamEntry<>("state", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional state query parameters
     * @param state values to be added
     * @param <TValue> value type
     * @return ByProjectKeyShippingMethodsMatchingOrdereditHead
     */
    public <TValue> ByProjectKeyShippingMethodsMatchingOrdereditHead addState(final Collection<TValue> state) {
        return copy().addQueryParams(
            state.stream().map(s -> new ParamEntry<>("state", s.toString())).collect(Collectors.toList()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyShippingMethodsMatchingOrdereditHead that = (ByProjectKeyShippingMethodsMatchingOrdereditHead) o;

        return new EqualsBuilder().append(projectKey, that.projectKey).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).toHashCode();
    }

    @Override
    protected ByProjectKeyShippingMethodsMatchingOrdereditHead copy() {
        return new ByProjectKeyShippingMethodsMatchingOrdereditHead(this);
    }
}
