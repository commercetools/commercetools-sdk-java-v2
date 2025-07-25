
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
 *  <p>Retrieves the active ShippingMethods that can ship to the shipping address of the provided Cart.</p>
 *  <p>Each ShippingMethod contains exactly one ShippingRate with the flag <code>isMatching</code> set to <code>true</code>. This ShippingRate is used when the ShippingMethod is added to the Cart.</p>
 *  <p>If a matching ShippingMethod has <code>isDefault</code> set to <code>true</code>, it is returned as the first item in the array.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.shipping_method.ShippingMethodPagedQueryResponse>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .shippingMethods()
 *            .matchingCart()
 *            .get()
 *            .withCartId(cartId)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyShippingMethodsMatchingCartGet extends
        TypeApiMethod<ByProjectKeyShippingMethodsMatchingCartGet, com.commercetools.api.models.shipping_method.ShippingMethodPagedQueryResponse>
        implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyShippingMethodsMatchingCartGet>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyShippingMethodsMatchingCartGet>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyShippingMethodsMatchingCartGet> {

    @Override
    public TypeReference<com.commercetools.api.models.shipping_method.ShippingMethodPagedQueryResponse> resultType() {
        return new TypeReference<com.commercetools.api.models.shipping_method.ShippingMethodPagedQueryResponse>() {
        };
    }

    private String projectKey;

    public ByProjectKeyShippingMethodsMatchingCartGet(final ApiHttpClient apiHttpClient, String projectKey) {
        super(apiHttpClient);
        this.projectKey = projectKey;
    }

    public ByProjectKeyShippingMethodsMatchingCartGet(ByProjectKeyShippingMethodsMatchingCartGet t) {
        super(t);
        this.projectKey = t.projectKey;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/shipping-methods/matching-cart", encodePathParam(this.projectKey));
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
     * set cartId with the specified value
     * @param cartId value to be set
     * @param <TValue> value type
     * @return ByProjectKeyShippingMethodsMatchingCartGet
     */
    public <TValue> ByProjectKeyShippingMethodsMatchingCartGet withCartId(final TValue cartId) {
        return copy().withQueryParam("cartId", cartId);
    }

    /**
     * add additional cartId query parameter
     * @param cartId value to be added
     * @param <TValue> value type
     * @return ByProjectKeyShippingMethodsMatchingCartGet
     */
    public <TValue> ByProjectKeyShippingMethodsMatchingCartGet addCartId(final TValue cartId) {
        return copy().addQueryParam("cartId", cartId);
    }

    /**
     * set cartId with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyShippingMethodsMatchingCartGet
     */
    public ByProjectKeyShippingMethodsMatchingCartGet withCartId(final Supplier<String> supplier) {
        return copy().withQueryParam("cartId", supplier.get());
    }

    /**
     * add additional cartId query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyShippingMethodsMatchingCartGet
     */
    public ByProjectKeyShippingMethodsMatchingCartGet addCartId(final Supplier<String> supplier) {
        return copy().addQueryParam("cartId", supplier.get());
    }

    /**
     * set cartId with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyShippingMethodsMatchingCartGet
     */
    public ByProjectKeyShippingMethodsMatchingCartGet withCartId(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("cartId", op.apply(new StringBuilder()));
    }

    /**
     * add additional cartId query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyShippingMethodsMatchingCartGet
     */
    public ByProjectKeyShippingMethodsMatchingCartGet addCartId(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("cartId", op.apply(new StringBuilder()));
    }

    /**
     * set cartId with the specified values
     * @param cartId values to be set
     * @param <TValue> value type
     * @return ByProjectKeyShippingMethodsMatchingCartGet
     */
    public <TValue> ByProjectKeyShippingMethodsMatchingCartGet withCartId(final Collection<TValue> cartId) {
        return copy().withoutQueryParam("cartId")
                .addQueryParams(
                    cartId.stream().map(s -> new ParamEntry<>("cartId", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional cartId query parameters
     * @param cartId values to be added
     * @param <TValue> value type
     * @return ByProjectKeyShippingMethodsMatchingCartGet
     */
    public <TValue> ByProjectKeyShippingMethodsMatchingCartGet addCartId(final Collection<TValue> cartId) {
        return copy().addQueryParams(
            cartId.stream().map(s -> new ParamEntry<>("cartId", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set expand with the specified value
     * @param expand value to be set
     * @param <TValue> value type
     * @return ByProjectKeyShippingMethodsMatchingCartGet
     */
    public <TValue> ByProjectKeyShippingMethodsMatchingCartGet withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     * @param expand value to be added
     * @param <TValue> value type
     * @return ByProjectKeyShippingMethodsMatchingCartGet
     */
    public <TValue> ByProjectKeyShippingMethodsMatchingCartGet addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyShippingMethodsMatchingCartGet
     */
    public ByProjectKeyShippingMethodsMatchingCartGet withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyShippingMethodsMatchingCartGet
     */
    public ByProjectKeyShippingMethodsMatchingCartGet addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyShippingMethodsMatchingCartGet
     */
    public ByProjectKeyShippingMethodsMatchingCartGet withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyShippingMethodsMatchingCartGet
     */
    public ByProjectKeyShippingMethodsMatchingCartGet addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     * @param expand values to be set
     * @param <TValue> value type
     * @return ByProjectKeyShippingMethodsMatchingCartGet
     */
    public <TValue> ByProjectKeyShippingMethodsMatchingCartGet withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     * @param expand values to be added
     * @param <TValue> value type
     * @return ByProjectKeyShippingMethodsMatchingCartGet
     */
    public <TValue> ByProjectKeyShippingMethodsMatchingCartGet addExpand(final Collection<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyShippingMethodsMatchingCartGet that = (ByProjectKeyShippingMethodsMatchingCartGet) o;

        return new EqualsBuilder().append(projectKey, that.projectKey).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).toHashCode();
    }

    @Override
    protected ByProjectKeyShippingMethodsMatchingCartGet copy() {
        return new ByProjectKeyShippingMethodsMatchingCartGet(this);
    }
}
