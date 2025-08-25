
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
 *  <p>Checks if an active ShippingMethod that can ship to the shipping address of the provided Cart exists in a <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a>. Returns a <code>200 OK</code> status if the ShippingMethod exists or a <span>Not Found</span> error otherwise.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.fasterxml.jackson.databind.JsonNode>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .inStoreKeyWithStoreKeyValue("{storeKey}")
 *            .shippingMethods()
 *            .matchingCart()
 *            .head()
 *            .withCartId(cartId)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyShippingMethodsMatchingCartHead extends
        TypeApiMethod<ByProjectKeyInStoreKeyByStoreKeyShippingMethodsMatchingCartHead, com.fasterxml.jackson.databind.JsonNode>
        implements
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyInStoreKeyByStoreKeyShippingMethodsMatchingCartHead>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyInStoreKeyByStoreKeyShippingMethodsMatchingCartHead> {

    @Override
    public TypeReference<com.fasterxml.jackson.databind.JsonNode> resultType() {
        return new TypeReference<com.fasterxml.jackson.databind.JsonNode>() {
        };
    }

    private String projectKey;
    private String storeKey;

    public ByProjectKeyInStoreKeyByStoreKeyShippingMethodsMatchingCartHead(final ApiHttpClient apiHttpClient,
            String projectKey, String storeKey) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.storeKey = storeKey;
    }

    public ByProjectKeyInStoreKeyByStoreKeyShippingMethodsMatchingCartHead(
            ByProjectKeyInStoreKeyByStoreKeyShippingMethodsMatchingCartHead t) {
        super(t);
        this.projectKey = t.projectKey;
        this.storeKey = t.storeKey;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/in-store/key=%s/shipping-methods/matching-cart",
            encodePathParam(this.projectKey), encodePathParam(this.storeKey));
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

    public String getStoreKey() {
        return this.storeKey;
    }

    public List<String> getCartId() {
        return this.getQueryParam("cartId");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setStoreKey(final String storeKey) {
        this.storeKey = storeKey;
    }

    /**
     * set cartId with the specified value
     * @param cartId value to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyShippingMethodsMatchingCartHead
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyShippingMethodsMatchingCartHead withCartId(final TValue cartId) {
        return copy().withQueryParam("cartId", cartId);
    }

    /**
     * add additional cartId query parameter
     * @param cartId value to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyShippingMethodsMatchingCartHead
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyShippingMethodsMatchingCartHead addCartId(final TValue cartId) {
        return copy().addQueryParam("cartId", cartId);
    }

    /**
     * set cartId with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyShippingMethodsMatchingCartHead
     */
    public ByProjectKeyInStoreKeyByStoreKeyShippingMethodsMatchingCartHead withCartId(final Supplier<String> supplier) {
        return copy().withQueryParam("cartId", supplier.get());
    }

    /**
     * add additional cartId query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyShippingMethodsMatchingCartHead
     */
    public ByProjectKeyInStoreKeyByStoreKeyShippingMethodsMatchingCartHead addCartId(final Supplier<String> supplier) {
        return copy().addQueryParam("cartId", supplier.get());
    }

    /**
     * set cartId with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyShippingMethodsMatchingCartHead
     */
    public ByProjectKeyInStoreKeyByStoreKeyShippingMethodsMatchingCartHead withCartId(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("cartId", op.apply(new StringBuilder()));
    }

    /**
     * add additional cartId query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyShippingMethodsMatchingCartHead
     */
    public ByProjectKeyInStoreKeyByStoreKeyShippingMethodsMatchingCartHead addCartId(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("cartId", op.apply(new StringBuilder()));
    }

    /**
     * set cartId with the specified values
     * @param cartId values to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyShippingMethodsMatchingCartHead
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyShippingMethodsMatchingCartHead withCartId(
            final Collection<TValue> cartId) {
        return copy().withoutQueryParam("cartId")
                .addQueryParams(
                    cartId.stream().map(s -> new ParamEntry<>("cartId", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional cartId query parameters
     * @param cartId values to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyShippingMethodsMatchingCartHead
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyShippingMethodsMatchingCartHead addCartId(
            final Collection<TValue> cartId) {
        return copy().addQueryParams(
            cartId.stream().map(s -> new ParamEntry<>("cartId", s.toString())).collect(Collectors.toList()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyInStoreKeyByStoreKeyShippingMethodsMatchingCartHead that = (ByProjectKeyInStoreKeyByStoreKeyShippingMethodsMatchingCartHead) o;

        return new EqualsBuilder().append(projectKey, that.projectKey).append(storeKey, that.storeKey).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(storeKey).toHashCode();
    }

    @Override
    protected ByProjectKeyInStoreKeyByStoreKeyShippingMethodsMatchingCartHead copy() {
        return new ByProjectKeyInStoreKeyByStoreKeyShippingMethodsMatchingCartHead(this);
    }
}
