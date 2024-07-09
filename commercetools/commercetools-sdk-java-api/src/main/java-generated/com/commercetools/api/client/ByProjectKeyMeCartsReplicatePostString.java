
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
 *  <p>Creates a new Cart by replicating an existing Cart or Order of the authenticated Customer. This can be useful in cases where a customer wants to cancel a recent order to make some changes or reorder a previous order.</p>
 *  <p>The replicated Cart preserves Customer information, Line Items and Custom Line Items, Custom Fields, Discount Codes, and other settings of the Cart or Order. If the Line Items become invalid, for example, due to removed Products or Prices, they are removed from the new Cart. If the Customer switches to another Customer Group, the new Cart is updated with the new value. It has up-to-date Tax Rates, Prices, and Line Item product data and is in <code>Active</code> CartState.</p>
 *  <p>The new Cart does not contain Payments or Deliveries. The State of Line Items and Custom Line Items is reset to <code>initial</code>.</p>
 *  <p>If the Cart or Order to be replicated does not belong to the authenticated Customer, the API returns a ResourceNotFound error</p>
 *  <p>Specific Error Codes:</p>
 *  <ul>
 *   <li>MatchingPriceNotFound</li>
 *   <li>MissingTaxRateForCountry</li>
 *  </ul>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.cart.Cart>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .me()
 *            .carts()
 *            .replicate()
 *            .post("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyMeCartsReplicatePostString
        extends StringBodyApiMethod<ByProjectKeyMeCartsReplicatePostString, com.commercetools.api.models.cart.Cart>
        implements com.commercetools.api.client.ErrorableTrait<ByProjectKeyMeCartsReplicatePostString> {

    @Override
    public TypeReference<com.commercetools.api.models.cart.Cart> resultType() {
        return new TypeReference<com.commercetools.api.models.cart.Cart>() {
        };
    }

    private String projectKey;

    private String replicaMyCartDraft;

    public ByProjectKeyMeCartsReplicatePostString(final ApiHttpClient apiHttpClient, String projectKey,
            String replicaMyCartDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.replicaMyCartDraft = replicaMyCartDraft;
    }

    public ByProjectKeyMeCartsReplicatePostString(ByProjectKeyMeCartsReplicatePostString t) {
        super(t);
        this.projectKey = t.projectKey;
        this.replicaMyCartDraft = t.replicaMyCartDraft;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/me/carts/replicate", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            replicaMyCartDraft.getBytes(StandardCharsets.UTF_8));

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

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public String getBody() {
        return replicaMyCartDraft;
    }

    public ByProjectKeyMeCartsReplicatePostString withBody(String replicaMyCartDraft) {
        ByProjectKeyMeCartsReplicatePostString t = copy();
        t.replicaMyCartDraft = replicaMyCartDraft;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyMeCartsReplicatePostString that = (ByProjectKeyMeCartsReplicatePostString) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(replicaMyCartDraft, that.replicaMyCartDraft)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(replicaMyCartDraft).toHashCode();
    }

    @Override
    protected ByProjectKeyMeCartsReplicatePostString copy() {
        return new ByProjectKeyMeCartsReplicatePostString(this);
    }
}
