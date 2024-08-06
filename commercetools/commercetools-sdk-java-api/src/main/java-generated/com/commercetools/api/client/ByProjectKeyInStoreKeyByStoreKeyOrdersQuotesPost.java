
package com.commercetools.api.client;

import java.net.URI;
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
 *  <p>Creating an Order produces the OrderCreated Message.</p>
 *  <p>Specific Error Codes:</p>
 *  <ul>
 *   <li>OutOfStock</li>
 *   <li>PriceChanged</li>
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
 *            .post(null)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyOrdersQuotesPost extends
        TypeBodyApiMethod<ByProjectKeyInStoreKeyByStoreKeyOrdersQuotesPost, com.commercetools.api.models.order.Order, com.commercetools.api.models.order.OrderFromQuoteDraft>
        implements com.commercetools.api.client.ErrorableTrait<ByProjectKeyInStoreKeyByStoreKeyOrdersQuotesPost> {

    @Override
    public TypeReference<com.commercetools.api.models.order.Order> resultType() {
        return new TypeReference<com.commercetools.api.models.order.Order>() {
        };
    }

    private String projectKey;
    private String storeKey;

    private com.commercetools.api.models.order.OrderFromQuoteDraft orderFromQuoteDraft;

    public ByProjectKeyInStoreKeyByStoreKeyOrdersQuotesPost(final ApiHttpClient apiHttpClient, String projectKey,
            String storeKey, com.commercetools.api.models.order.OrderFromQuoteDraft orderFromQuoteDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.orderFromQuoteDraft = orderFromQuoteDraft;
    }

    public ByProjectKeyInStoreKeyByStoreKeyOrdersQuotesPost(ByProjectKeyInStoreKeyByStoreKeyOrdersQuotesPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.storeKey = t.storeKey;
        this.orderFromQuoteDraft = t.orderFromQuoteDraft;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/in-store/key=%s/orders/quotes", encodePathParam(this.projectKey),
            encodePathParam(this.storeKey));
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(orderFromQuoteDraft)));

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

    public com.commercetools.api.models.order.OrderFromQuoteDraft getBody() {
        return orderFromQuoteDraft;
    }

    public ByProjectKeyInStoreKeyByStoreKeyOrdersQuotesPost withBody(
            com.commercetools.api.models.order.OrderFromQuoteDraft orderFromQuoteDraft) {
        ByProjectKeyInStoreKeyByStoreKeyOrdersQuotesPost t = copy();
        t.orderFromQuoteDraft = orderFromQuoteDraft;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyInStoreKeyByStoreKeyOrdersQuotesPost that = (ByProjectKeyInStoreKeyByStoreKeyOrdersQuotesPost) o;

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
    protected ByProjectKeyInStoreKeyByStoreKeyOrdersQuotesPost copy() {
        return new ByProjectKeyInStoreKeyByStoreKeyOrdersQuotesPost(this);
    }
}
