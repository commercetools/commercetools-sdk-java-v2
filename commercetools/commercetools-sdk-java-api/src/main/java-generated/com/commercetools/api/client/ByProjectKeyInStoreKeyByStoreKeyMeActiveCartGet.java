
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
 *  <p>Retrieves the Customer's most recently modified active Cart in a Store. Returns a <code>200 OK</code> status if successful.</p>
 *  <p>Carts with <code>Merchant</code> or <code>Quote</code> CartOrigin are ignored.</p>
 *  <p>A ResourceNotFound error is returned in the following scenarios:</p>
 *  <ul>
 *   <li>If no active Cart exists.</li>
 *   <li>If an active Cart exists but does not have a <code>store</code> specified, or the <code>store</code> field references a different Store.</li>
 *   <li>If an active Cart exists but does not have a <code>customerId</code> that matches the customer:{id} scope, or <code>anonymousId</code> that matches the anonymous_id:{id} scope.</li>
 *  </ul>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.cart.Cart>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .inStoreKeyWithStoreKeyValue("{storeKey}")
 *            .me()
 *            .activeCart()
 *            .get()
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyMeActiveCartGet
        extends TypeApiMethod<ByProjectKeyInStoreKeyByStoreKeyMeActiveCartGet, com.commercetools.api.models.cart.Cart>
        implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyInStoreKeyByStoreKeyMeActiveCartGet>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyInStoreKeyByStoreKeyMeActiveCartGet>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyInStoreKeyByStoreKeyMeActiveCartGet> {

    @Override
    public TypeReference<com.commercetools.api.models.cart.Cart> resultType() {
        return new TypeReference<com.commercetools.api.models.cart.Cart>() {
        };
    }

    private String projectKey;
    private String storeKey;

    public ByProjectKeyInStoreKeyByStoreKeyMeActiveCartGet(final ApiHttpClient apiHttpClient, String projectKey,
            String storeKey) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.storeKey = storeKey;
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeActiveCartGet(ByProjectKeyInStoreKeyByStoreKeyMeActiveCartGet t) {
        super(t);
        this.projectKey = t.projectKey;
        this.storeKey = t.storeKey;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/in-store/key=%s/me/active-cart", encodePathParam(this.projectKey),
            encodePathParam(this.storeKey));
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.cart.Cart> executeBlocking(final ApiHttpClient client,
            final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.cart.Cart.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.cart.Cart>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.cart.Cart.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getStoreKey() {
        return this.storeKey;
    }

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setStoreKey(final String storeKey) {
        this.storeKey = storeKey;
    }

    /**
     * set expand with the specified value
     * @param expand value to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyMeActiveCartGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyMeActiveCartGet withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     * @param expand value to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyMeActiveCartGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyMeActiveCartGet addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyMeActiveCartGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyMeActiveCartGet withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyMeActiveCartGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyMeActiveCartGet addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyMeActiveCartGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyMeActiveCartGet withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyMeActiveCartGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyMeActiveCartGet addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     * @param expand values to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyMeActiveCartGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyMeActiveCartGet withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     * @param expand values to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyMeActiveCartGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyMeActiveCartGet addExpand(final Collection<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyInStoreKeyByStoreKeyMeActiveCartGet that = (ByProjectKeyInStoreKeyByStoreKeyMeActiveCartGet) o;

        return new EqualsBuilder().append(projectKey, that.projectKey).append(storeKey, that.storeKey).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(storeKey).toHashCode();
    }

    @Override
    protected ByProjectKeyInStoreKeyByStoreKeyMeActiveCartGet copy() {
        return new ByProjectKeyInStoreKeyByStoreKeyMeActiveCartGet(this);
    }
}
