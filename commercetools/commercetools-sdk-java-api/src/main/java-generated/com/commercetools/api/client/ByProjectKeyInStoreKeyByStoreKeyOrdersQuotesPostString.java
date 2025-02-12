
package com.commercetools.api.client;

import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import com.fasterxml.jackson.core.type.TypeReference;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>Creates an Order from a Quote in a Store. The referenced Quote must have the <code>Pending</code> state and must be valid (not past the <code>validTo</code> date); otherwise, an InvalidOperation error is returned.</p>
 *  <p>Produces the OrderCreated Message.</p>
 *  <p>Specific Error Codes:</p>
 *  <ul>
 *   <li>OutOfStock</li>
 *   <li>InvalidItemShippingDetails</li>
 *   <li>InvalidOperation</li>
 *   <li>CountryNotConfiguredInStore</li>
 *  </ul>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.order.Order>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .inStoreKeyWithStoreKeyValue("{storeKey}")
 *            .orders()
 *            .orderQuote()
 *            .post("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyOrdersQuotesPostString extends
        StringBodyApiMethod<ByProjectKeyInStoreKeyByStoreKeyOrdersQuotesPostString, com.commercetools.api.models.order.Order>
        implements com.commercetools.api.client.ErrorableTrait<ByProjectKeyInStoreKeyByStoreKeyOrdersQuotesPostString> {

    @Override
    public TypeReference<com.commercetools.api.models.order.Order> resultType() {
        return new TypeReference<com.commercetools.api.models.order.Order>() {
        };
    }

    private String projectKey;
    private String storeKey;

    private String orderFromQuoteDraft;

    public ByProjectKeyInStoreKeyByStoreKeyOrdersQuotesPostString(final ApiHttpClient apiHttpClient, String projectKey,
            String storeKey, String orderFromQuoteDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.orderFromQuoteDraft = orderFromQuoteDraft;
    }

    public ByProjectKeyInStoreKeyByStoreKeyOrdersQuotesPostString(
            ByProjectKeyInStoreKeyByStoreKeyOrdersQuotesPostString t) {
        super(t);
        this.projectKey = t.projectKey;
        this.storeKey = t.storeKey;
        this.orderFromQuoteDraft = t.orderFromQuoteDraft;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/in-store/key=%s/orders/quotes", this.projectKey, this.storeKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            orderFromQuoteDraft.getBytes(StandardCharsets.UTF_8));

    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.order.Order> executeBlocking(final ApiHttpClient client,
            final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.order.Order.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.order.Order>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.order.Order.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getStoreKey() {
        return this.storeKey;
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setStoreKey(final String storeKey) {
        this.storeKey = storeKey;
    }

    public String getBody() {
        return orderFromQuoteDraft;
    }

    public ByProjectKeyInStoreKeyByStoreKeyOrdersQuotesPostString withBody(String orderFromQuoteDraft) {
        ByProjectKeyInStoreKeyByStoreKeyOrdersQuotesPostString t = copy();
        t.orderFromQuoteDraft = orderFromQuoteDraft;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyInStoreKeyByStoreKeyOrdersQuotesPostString that = (ByProjectKeyInStoreKeyByStoreKeyOrdersQuotesPostString) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(storeKey, that.storeKey)
                .append(orderFromQuoteDraft, that.orderFromQuoteDraft)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(storeKey).append(orderFromQuoteDraft).toHashCode();
    }

    @Override
    protected ByProjectKeyInStoreKeyByStoreKeyOrdersQuotesPostString copy() {
        return new ByProjectKeyInStoreKeyByStoreKeyOrdersQuotesPostString(this);
    }
}
