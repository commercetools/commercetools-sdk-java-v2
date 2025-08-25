
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
 *  <p>Creates a new Cart in a <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> by replicating an existing Cart or Order.</p>
 *  <p>The following applies to the new Cart:</p>
 *  <ul>
 *   <li>It contains the same Customer information, Line Items and Custom Line Items, Custom Fields, Discount Codes, and other settings of the originating Cart or Order.</li>
 *   <li>If a Line Item becomes invalid, it is removed from the new Cart. A common reason for this is removed Products or Prices.</li>
 *   <li>Line items and Custom Line Items are reset to their initial <span>state</span>.</li>
 *   <li>It contains no payments or delivery information.</li>
 *   <li>It contains up-to-date Tax Rates, Prices, and Line Item product data.</li>
 *   <li>The <span>CartState</span> is <code>Active</code>.</li>
 *   <li>If using the <code>customerGroup</code> field (for a single Customer Group) and the referenced Customer switched to another Customer Group, the new Cart is automatically updated to reflect the new group and corresponding prices.</li>
 *   <li>If using the <code>customerGroupAssignments</code> field (for multiple Customer Groups), the Cart no longer keeps a direct reference to a Customer Group. If a Customer’s group assignments change, the Cart and its Line Item prices are not updated automatically. Prices are only updated when the Cart is changed via a <span>direct update action</span>.</li>
 *  </ul>
 *  <p>Specific Error Codes:</p>
 *  <ul>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:MatchingPriceNotFoundError" rel="nofollow">MatchingPriceNotFound</a></li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:MissingTaxRateForCountryError" rel="nofollow">MissingTaxRateForCountry</a></li>
 *  </ul>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.cart.Cart>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .inStoreKeyWithStoreKeyValue("{storeKey}")
 *            .carts()
 *            .replicate()
 *            .post("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyCartsReplicatePostString extends
        StringBodyApiMethod<ByProjectKeyInStoreKeyByStoreKeyCartsReplicatePostString, com.commercetools.api.models.cart.Cart>
        implements
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyInStoreKeyByStoreKeyCartsReplicatePostString> {

    @Override
    public TypeReference<com.commercetools.api.models.cart.Cart> resultType() {
        return new TypeReference<com.commercetools.api.models.cart.Cart>() {
        };
    }

    private String projectKey;
    private String storeKey;

    private String replicaCartDraft;

    public ByProjectKeyInStoreKeyByStoreKeyCartsReplicatePostString(final ApiHttpClient apiHttpClient,
            String projectKey, String storeKey, String replicaCartDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.replicaCartDraft = replicaCartDraft;
    }

    public ByProjectKeyInStoreKeyByStoreKeyCartsReplicatePostString(
            ByProjectKeyInStoreKeyByStoreKeyCartsReplicatePostString t) {
        super(t);
        this.projectKey = t.projectKey;
        this.storeKey = t.storeKey;
        this.replicaCartDraft = t.replicaCartDraft;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/in-store/key=%s/carts/replicate", this.projectKey, this.storeKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            replicaCartDraft.getBytes(StandardCharsets.UTF_8));

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

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setStoreKey(final String storeKey) {
        this.storeKey = storeKey;
    }

    public String getBody() {
        return replicaCartDraft;
    }

    public ByProjectKeyInStoreKeyByStoreKeyCartsReplicatePostString withBody(String replicaCartDraft) {
        ByProjectKeyInStoreKeyByStoreKeyCartsReplicatePostString t = copy();
        t.replicaCartDraft = replicaCartDraft;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyInStoreKeyByStoreKeyCartsReplicatePostString that = (ByProjectKeyInStoreKeyByStoreKeyCartsReplicatePostString) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(storeKey, that.storeKey)
                .append(replicaCartDraft, that.replicaCartDraft)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(storeKey).append(replicaCartDraft).toHashCode();
    }

    @Override
    protected ByProjectKeyInStoreKeyByStoreKeyCartsReplicatePostString copy() {
        return new ByProjectKeyInStoreKeyByStoreKeyCartsReplicatePostString(this);
    }
}
