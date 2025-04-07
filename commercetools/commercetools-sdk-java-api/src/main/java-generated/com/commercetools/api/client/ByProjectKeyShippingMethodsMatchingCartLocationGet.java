
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
 *  <p>Retrieves the active ShippingMethods that can ship to the given Location with a <code>predicate</code> that matches the given Cart. Each ShippingMethod contains exactly one ShippingRate with the flag <code>isMatching</code> set to <code>true</code>. This ShippingRate is used when the ShippingMethod is added to the Cart. If a matching ShippingMethod has <code>isDefault</code> set to <code>true</code>, it is returned as the first item in the array.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.shipping_method.ShippingMethodPagedQueryResponse>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .shippingMethods()
 *            .matchingCartLocation()
 *            .get()
 *            .withCountry(country)
 *            .withCartId(cartId)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyShippingMethodsMatchingCartLocationGet extends
        TypeApiMethod<ByProjectKeyShippingMethodsMatchingCartLocationGet, com.commercetools.api.models.shipping_method.ShippingMethodPagedQueryResponse>
        implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyShippingMethodsMatchingCartLocationGet>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyShippingMethodsMatchingCartLocationGet>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyShippingMethodsMatchingCartLocationGet> {

    @Override
    public TypeReference<com.commercetools.api.models.shipping_method.ShippingMethodPagedQueryResponse> resultType() {
        return new TypeReference<com.commercetools.api.models.shipping_method.ShippingMethodPagedQueryResponse>() {
        };
    }

    private String projectKey;

    public ByProjectKeyShippingMethodsMatchingCartLocationGet(final ApiHttpClient apiHttpClient, String projectKey) {
        super(apiHttpClient);
        this.projectKey = projectKey;
    }

    public ByProjectKeyShippingMethodsMatchingCartLocationGet(ByProjectKeyShippingMethodsMatchingCartLocationGet t) {
        super(t);
        this.projectKey = t.projectKey;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/shipping-methods/matching-cart-location",
            encodePathParam(this.projectKey));
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

    public List<String> getCountry() {
        return this.getQueryParam("country");
    }

    public List<String> getState() {
        return this.getQueryParam("state");
    }

    public List<String> getCartId() {
        return this.getQueryParam("cartId");
    }

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    /**
     * set country with the specified value
     * @param country value to be set
     * @param <TValue> value type
     * @return ByProjectKeyShippingMethodsMatchingCartLocationGet
     */
    public <TValue> ByProjectKeyShippingMethodsMatchingCartLocationGet withCountry(final TValue country) {
        return copy().withQueryParam("country", country);
    }

    /**
     * add additional country query parameter
     * @param country value to be added
     * @param <TValue> value type
     * @return ByProjectKeyShippingMethodsMatchingCartLocationGet
     */
    public <TValue> ByProjectKeyShippingMethodsMatchingCartLocationGet addCountry(final TValue country) {
        return copy().addQueryParam("country", country);
    }

    /**
     * set country with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyShippingMethodsMatchingCartLocationGet
     */
    public ByProjectKeyShippingMethodsMatchingCartLocationGet withCountry(final Supplier<String> supplier) {
        return copy().withQueryParam("country", supplier.get());
    }

    /**
     * add additional country query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyShippingMethodsMatchingCartLocationGet
     */
    public ByProjectKeyShippingMethodsMatchingCartLocationGet addCountry(final Supplier<String> supplier) {
        return copy().addQueryParam("country", supplier.get());
    }

    /**
     * set country with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyShippingMethodsMatchingCartLocationGet
     */
    public ByProjectKeyShippingMethodsMatchingCartLocationGet withCountry(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("country", op.apply(new StringBuilder()));
    }

    /**
     * add additional country query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyShippingMethodsMatchingCartLocationGet
     */
    public ByProjectKeyShippingMethodsMatchingCartLocationGet addCountry(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("country", op.apply(new StringBuilder()));
    }

    /**
     * set country with the specified values
     * @param country values to be set
     * @param <TValue> value type
     * @return ByProjectKeyShippingMethodsMatchingCartLocationGet
     */
    public <TValue> ByProjectKeyShippingMethodsMatchingCartLocationGet withCountry(final Collection<TValue> country) {
        return copy().withoutQueryParam("country")
                .addQueryParams(
                    country.stream().map(s -> new ParamEntry<>("country", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional country query parameters
     * @param country values to be added
     * @param <TValue> value type
     * @return ByProjectKeyShippingMethodsMatchingCartLocationGet
     */
    public <TValue> ByProjectKeyShippingMethodsMatchingCartLocationGet addCountry(final Collection<TValue> country) {
        return copy().addQueryParams(
            country.stream().map(s -> new ParamEntry<>("country", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set state with the specified value
     * @param state value to be set
     * @param <TValue> value type
     * @return ByProjectKeyShippingMethodsMatchingCartLocationGet
     */
    public <TValue> ByProjectKeyShippingMethodsMatchingCartLocationGet withState(final TValue state) {
        return copy().withQueryParam("state", state);
    }

    /**
     * add additional state query parameter
     * @param state value to be added
     * @param <TValue> value type
     * @return ByProjectKeyShippingMethodsMatchingCartLocationGet
     */
    public <TValue> ByProjectKeyShippingMethodsMatchingCartLocationGet addState(final TValue state) {
        return copy().addQueryParam("state", state);
    }

    /**
     * set state with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyShippingMethodsMatchingCartLocationGet
     */
    public ByProjectKeyShippingMethodsMatchingCartLocationGet withState(final Supplier<String> supplier) {
        return copy().withQueryParam("state", supplier.get());
    }

    /**
     * add additional state query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyShippingMethodsMatchingCartLocationGet
     */
    public ByProjectKeyShippingMethodsMatchingCartLocationGet addState(final Supplier<String> supplier) {
        return copy().addQueryParam("state", supplier.get());
    }

    /**
     * set state with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyShippingMethodsMatchingCartLocationGet
     */
    public ByProjectKeyShippingMethodsMatchingCartLocationGet withState(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("state", op.apply(new StringBuilder()));
    }

    /**
     * add additional state query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyShippingMethodsMatchingCartLocationGet
     */
    public ByProjectKeyShippingMethodsMatchingCartLocationGet addState(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("state", op.apply(new StringBuilder()));
    }

    /**
     * set state with the specified values
     * @param state values to be set
     * @param <TValue> value type
     * @return ByProjectKeyShippingMethodsMatchingCartLocationGet
     */
    public <TValue> ByProjectKeyShippingMethodsMatchingCartLocationGet withState(final Collection<TValue> state) {
        return copy().withoutQueryParam("state")
                .addQueryParams(
                    state.stream().map(s -> new ParamEntry<>("state", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional state query parameters
     * @param state values to be added
     * @param <TValue> value type
     * @return ByProjectKeyShippingMethodsMatchingCartLocationGet
     */
    public <TValue> ByProjectKeyShippingMethodsMatchingCartLocationGet addState(final Collection<TValue> state) {
        return copy().addQueryParams(
            state.stream().map(s -> new ParamEntry<>("state", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set cartId with the specified value
     * @param cartId value to be set
     * @param <TValue> value type
     * @return ByProjectKeyShippingMethodsMatchingCartLocationGet
     */
    public <TValue> ByProjectKeyShippingMethodsMatchingCartLocationGet withCartId(final TValue cartId) {
        return copy().withQueryParam("cartId", cartId);
    }

    /**
     * add additional cartId query parameter
     * @param cartId value to be added
     * @param <TValue> value type
     * @return ByProjectKeyShippingMethodsMatchingCartLocationGet
     */
    public <TValue> ByProjectKeyShippingMethodsMatchingCartLocationGet addCartId(final TValue cartId) {
        return copy().addQueryParam("cartId", cartId);
    }

    /**
     * set cartId with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyShippingMethodsMatchingCartLocationGet
     */
    public ByProjectKeyShippingMethodsMatchingCartLocationGet withCartId(final Supplier<String> supplier) {
        return copy().withQueryParam("cartId", supplier.get());
    }

    /**
     * add additional cartId query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyShippingMethodsMatchingCartLocationGet
     */
    public ByProjectKeyShippingMethodsMatchingCartLocationGet addCartId(final Supplier<String> supplier) {
        return copy().addQueryParam("cartId", supplier.get());
    }

    /**
     * set cartId with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyShippingMethodsMatchingCartLocationGet
     */
    public ByProjectKeyShippingMethodsMatchingCartLocationGet withCartId(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("cartId", op.apply(new StringBuilder()));
    }

    /**
     * add additional cartId query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyShippingMethodsMatchingCartLocationGet
     */
    public ByProjectKeyShippingMethodsMatchingCartLocationGet addCartId(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("cartId", op.apply(new StringBuilder()));
    }

    /**
     * set cartId with the specified values
     * @param cartId values to be set
     * @param <TValue> value type
     * @return ByProjectKeyShippingMethodsMatchingCartLocationGet
     */
    public <TValue> ByProjectKeyShippingMethodsMatchingCartLocationGet withCartId(final Collection<TValue> cartId) {
        return copy().withoutQueryParam("cartId")
                .addQueryParams(
                    cartId.stream().map(s -> new ParamEntry<>("cartId", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional cartId query parameters
     * @param cartId values to be added
     * @param <TValue> value type
     * @return ByProjectKeyShippingMethodsMatchingCartLocationGet
     */
    public <TValue> ByProjectKeyShippingMethodsMatchingCartLocationGet addCartId(final Collection<TValue> cartId) {
        return copy().addQueryParams(
            cartId.stream().map(s -> new ParamEntry<>("cartId", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set expand with the specified value
     * @param expand value to be set
     * @param <TValue> value type
     * @return ByProjectKeyShippingMethodsMatchingCartLocationGet
     */
    public <TValue> ByProjectKeyShippingMethodsMatchingCartLocationGet withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     * @param expand value to be added
     * @param <TValue> value type
     * @return ByProjectKeyShippingMethodsMatchingCartLocationGet
     */
    public <TValue> ByProjectKeyShippingMethodsMatchingCartLocationGet addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyShippingMethodsMatchingCartLocationGet
     */
    public ByProjectKeyShippingMethodsMatchingCartLocationGet withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyShippingMethodsMatchingCartLocationGet
     */
    public ByProjectKeyShippingMethodsMatchingCartLocationGet addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyShippingMethodsMatchingCartLocationGet
     */
    public ByProjectKeyShippingMethodsMatchingCartLocationGet withExpand(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyShippingMethodsMatchingCartLocationGet
     */
    public ByProjectKeyShippingMethodsMatchingCartLocationGet addExpand(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     * @param expand values to be set
     * @param <TValue> value type
     * @return ByProjectKeyShippingMethodsMatchingCartLocationGet
     */
    public <TValue> ByProjectKeyShippingMethodsMatchingCartLocationGet withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     * @param expand values to be added
     * @param <TValue> value type
     * @return ByProjectKeyShippingMethodsMatchingCartLocationGet
     */
    public <TValue> ByProjectKeyShippingMethodsMatchingCartLocationGet addExpand(final Collection<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyShippingMethodsMatchingCartLocationGet that = (ByProjectKeyShippingMethodsMatchingCartLocationGet) o;

        return new EqualsBuilder().append(projectKey, that.projectKey).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).toHashCode();
    }

    @Override
    protected ByProjectKeyShippingMethodsMatchingCartLocationGet copy() {
        return new ByProjectKeyShippingMethodsMatchingCartLocationGet(this);
    }
}
