
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
 *  <p>Merges items from an anonymous Cart into the most recently modified active Cart of a Customer. If no active Cart exists, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ResourceNotFoundError" rel="nofollow">ResourceNotFound</a> error is returned.</p>
 *  <p>If the Cart exists in the Project but does not have a <code>store</code> specified, or the <code>store</code> field references a different Store, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ResourceNotFoundError" rel="nofollow">ResourceNotFound</a> error is returned.</p>
 *  <p>For more information, see <span>Merge behavior</span>.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.cart.Cart>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .inStoreKeyWithStoreKeyValue("{storeKey}")
 *            .carts()
 *            .customerIdWithCustomerIdValueMerge("{customerId}")
 *            .post("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyCartsCustomerIdByCustomerIdMergePostString extends
        StringBodyApiMethod<ByProjectKeyInStoreKeyByStoreKeyCartsCustomerIdByCustomerIdMergePostString, com.commercetools.api.models.cart.Cart>
        implements
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyInStoreKeyByStoreKeyCartsCustomerIdByCustomerIdMergePostString> {

    @Override
    public TypeReference<com.commercetools.api.models.cart.Cart> resultType() {
        return new TypeReference<com.commercetools.api.models.cart.Cart>() {
        };
    }

    private String projectKey;
    private String storeKey;
    private String customerId;

    private String mergeCartDraft;

    public ByProjectKeyInStoreKeyByStoreKeyCartsCustomerIdByCustomerIdMergePostString(final ApiHttpClient apiHttpClient,
            String projectKey, String storeKey, String customerId, String mergeCartDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.customerId = customerId;
        this.mergeCartDraft = mergeCartDraft;
    }

    public ByProjectKeyInStoreKeyByStoreKeyCartsCustomerIdByCustomerIdMergePostString(
            ByProjectKeyInStoreKeyByStoreKeyCartsCustomerIdByCustomerIdMergePostString t) {
        super(t);
        this.projectKey = t.projectKey;
        this.storeKey = t.storeKey;
        this.customerId = t.customerId;
        this.mergeCartDraft = t.mergeCartDraft;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/in-store/key=%s/carts/customer-id=%s/merge", this.projectKey,
            this.storeKey, this.customerId);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            mergeCartDraft.getBytes(StandardCharsets.UTF_8));

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

    public String getCustomerId() {
        return this.customerId;
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setStoreKey(final String storeKey) {
        this.storeKey = storeKey;
    }

    public void setCustomerId(final String customerId) {
        this.customerId = customerId;
    }

    public String getBody() {
        return mergeCartDraft;
    }

    public ByProjectKeyInStoreKeyByStoreKeyCartsCustomerIdByCustomerIdMergePostString withBody(String mergeCartDraft) {
        ByProjectKeyInStoreKeyByStoreKeyCartsCustomerIdByCustomerIdMergePostString t = copy();
        t.mergeCartDraft = mergeCartDraft;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyInStoreKeyByStoreKeyCartsCustomerIdByCustomerIdMergePostString that = (ByProjectKeyInStoreKeyByStoreKeyCartsCustomerIdByCustomerIdMergePostString) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(storeKey, that.storeKey)
                .append(customerId, that.customerId)
                .append(mergeCartDraft, that.mergeCartDraft)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey)
                .append(storeKey)
                .append(customerId)
                .append(mergeCartDraft)
                .toHashCode();
    }

    @Override
    protected ByProjectKeyInStoreKeyByStoreKeyCartsCustomerIdByCustomerIdMergePostString copy() {
        return new ByProjectKeyInStoreKeyByStoreKeyCartsCustomerIdByCustomerIdMergePostString(this);
    }
}
