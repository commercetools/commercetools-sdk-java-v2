
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
 *  <p>Merges items from an anonymous Cart into the most recently modified active Cart of a Customer. If no active Cart exists, the anonymous Cart becomes the Customer's active Cart. For more information about merge mode behaviors, merge rules, and tax recalculation, see <span>Merge a Cart</span>.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.cart.Cart>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .carts()
 *            .customerIdWithCustomerIdValueMerge("{customerId}")
 *            .post("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyCartsCustomerIdByCustomerIdMergePostString extends
        StringBodyApiMethod<ByProjectKeyCartsCustomerIdByCustomerIdMergePostString, com.commercetools.api.models.cart.Cart>
        implements com.commercetools.api.client.ErrorableTrait<ByProjectKeyCartsCustomerIdByCustomerIdMergePostString> {

    @Override
    public TypeReference<com.commercetools.api.models.cart.Cart> resultType() {
        return new TypeReference<com.commercetools.api.models.cart.Cart>() {
        };
    }

    private String projectKey;
    private String customerId;

    private String mergeCartDraft;

    public ByProjectKeyCartsCustomerIdByCustomerIdMergePostString(final ApiHttpClient apiHttpClient, String projectKey,
            String customerId, String mergeCartDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.customerId = customerId;
        this.mergeCartDraft = mergeCartDraft;
    }

    public ByProjectKeyCartsCustomerIdByCustomerIdMergePostString(
            ByProjectKeyCartsCustomerIdByCustomerIdMergePostString t) {
        super(t);
        this.projectKey = t.projectKey;
        this.customerId = t.customerId;
        this.mergeCartDraft = t.mergeCartDraft;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/carts/customer-id=%s/merge", this.projectKey, this.customerId);
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

    public String getCustomerId() {
        return this.customerId;
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setCustomerId(final String customerId) {
        this.customerId = customerId;
    }

    public String getBody() {
        return mergeCartDraft;
    }

    public ByProjectKeyCartsCustomerIdByCustomerIdMergePostString withBody(String mergeCartDraft) {
        ByProjectKeyCartsCustomerIdByCustomerIdMergePostString t = copy();
        t.mergeCartDraft = mergeCartDraft;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyCartsCustomerIdByCustomerIdMergePostString that = (ByProjectKeyCartsCustomerIdByCustomerIdMergePostString) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(customerId, that.customerId)
                .append(mergeCartDraft, that.mergeCartDraft)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(customerId).append(mergeCartDraft).toHashCode();
    }

    @Override
    protected ByProjectKeyCartsCustomerIdByCustomerIdMergePostString copy() {
        return new ByProjectKeyCartsCustomerIdByCustomerIdMergePostString(this);
    }
}
