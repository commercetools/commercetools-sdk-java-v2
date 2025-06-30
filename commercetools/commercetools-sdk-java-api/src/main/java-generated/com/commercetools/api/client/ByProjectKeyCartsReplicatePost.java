
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
 *  <p>Creates a new Cart by replicating an existing Cart or Order.</p>
 *  <p>The following applies to the new Cart:</p>
 *  <ul>
 *   <li>It contains the same Customer information, Line Items and Custom Line Items, Custom Fields, Discount Codes, and other settings of the originating Cart or Order.</li>
 *   <li>If a Line Item becomes invalid, it is removed from the new Cart. A common reason for this is removed Products or Prices.</li>
 *   <li>Line items and Custom Line Items are reset to their initial state.</li>
 *   <li>It contains no payments or delivery information.</li>
 *   <li>It contains up-to-date Tax Rates, Prices, and Line Item product data.</li>
 *   <li>The CartState is <code>Active</code>.</li>
 *   <li>If using the <code>customerGroup</code> field (for a single Customer Group) and the referenced Customer switched to another Customer Group, the new Cart is automatically updated to reflect the new group and corresponding prices.</li>
 *   <li>If using the <code>customerGroupAssignments</code> field (for multiple Customer Groups), the Cart no longer keeps a direct reference to a Customer Group. If a Customer’s group assignments change, the Cart and its Line Item prices are not updated automatically. Prices are only updated when the Cart is changed via a direct update action.</li>
 *  </ul>
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
 *            .carts()
 *            .replicate()
 *            .post(null)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyCartsReplicatePost extends
        TypeBodyApiMethod<ByProjectKeyCartsReplicatePost, com.commercetools.api.models.cart.Cart, com.commercetools.api.models.cart.ReplicaCartDraft>
        implements com.commercetools.api.client.ErrorableTrait<ByProjectKeyCartsReplicatePost> {

    @Override
    public TypeReference<com.commercetools.api.models.cart.Cart> resultType() {
        return new TypeReference<com.commercetools.api.models.cart.Cart>() {
        };
    }

    private String projectKey;

    private com.commercetools.api.models.cart.ReplicaCartDraft replicaCartDraft;

    public ByProjectKeyCartsReplicatePost(final ApiHttpClient apiHttpClient, String projectKey,
            com.commercetools.api.models.cart.ReplicaCartDraft replicaCartDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.replicaCartDraft = replicaCartDraft;
    }

    public ByProjectKeyCartsReplicatePost(ByProjectKeyCartsReplicatePost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.replicaCartDraft = t.replicaCartDraft;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/carts/replicate", encodePathParam(this.projectKey));
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(replicaCartDraft)));

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

    public com.commercetools.api.models.cart.ReplicaCartDraft getBody() {
        return replicaCartDraft;
    }

    public ByProjectKeyCartsReplicatePost withBody(
            com.commercetools.api.models.cart.ReplicaCartDraft replicaCartDraft) {
        ByProjectKeyCartsReplicatePost t = copy();
        t.replicaCartDraft = replicaCartDraft;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyCartsReplicatePost that = (ByProjectKeyCartsReplicatePost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(replicaCartDraft, that.replicaCartDraft)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(replicaCartDraft).toHashCode();
    }

    @Override
    protected ByProjectKeyCartsReplicatePost copy() {
        return new ByProjectKeyCartsReplicatePost(this);
    }
}
