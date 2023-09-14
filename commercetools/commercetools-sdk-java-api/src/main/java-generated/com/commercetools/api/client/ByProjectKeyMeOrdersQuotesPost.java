
package com.commercetools.api.client;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>When creating B2B Orders, the Customer must have the <code>CreateMyOrdersFromMyQuotes</code> Permission.</p>
 *  <p>Creating an Order produces the OrderCreated Message.</p>
 *  <p>Specific Error Codes:</p>
 *  <ul>
 *   <li>OutOfStock</li>
 *   <li>PriceChanged</li>
 *   <li>InvalidItemShippingDetails</li>
 *   <li>CountryNotConfiguredInStore</li>
 *   <li>AssociateMissingPermission</li>
 *  </ul>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.order.Order>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .me()
 *            .orders()
 *            .orderQuote()
 *            .post(null)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyMeOrdersQuotesPost extends
        BodyApiMethod<ByProjectKeyMeOrdersQuotesPost, com.commercetools.api.models.order.Order, com.commercetools.api.models.me.MyOrderFromQuoteDraft>
        implements com.commercetools.api.client.ErrorableTrait<ByProjectKeyMeOrdersQuotesPost> {

    private String projectKey;

    private com.commercetools.api.models.me.MyOrderFromQuoteDraft myOrderFromQuoteDraft;

    public ByProjectKeyMeOrdersQuotesPost(final ApiHttpClient apiHttpClient, String projectKey,
            com.commercetools.api.models.me.MyOrderFromQuoteDraft myOrderFromQuoteDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.myOrderFromQuoteDraft = myOrderFromQuoteDraft;
    }

    public ByProjectKeyMeOrdersQuotesPost(ByProjectKeyMeOrdersQuotesPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.myOrderFromQuoteDraft = t.myOrderFromQuoteDraft;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/me/orders/quotes", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(myOrderFromQuoteDraft)));

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

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public com.commercetools.api.models.me.MyOrderFromQuoteDraft getBody() {
        return myOrderFromQuoteDraft;
    }

    public ByProjectKeyMeOrdersQuotesPost withBody(
            com.commercetools.api.models.me.MyOrderFromQuoteDraft myOrderFromQuoteDraft) {
        ByProjectKeyMeOrdersQuotesPost t = copy();
        t.myOrderFromQuoteDraft = myOrderFromQuoteDraft;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyMeOrdersQuotesPost that = (ByProjectKeyMeOrdersQuotesPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(myOrderFromQuoteDraft, that.myOrderFromQuoteDraft)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(myOrderFromQuoteDraft).toHashCode();
    }

    @Override
    protected ByProjectKeyMeOrdersQuotesPost copy() {
        return new ByProjectKeyMeOrdersQuotesPost(this);
    }
}
