
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
 *  <p>Merges items from an anonymous Cart into the most recently modified active Cart of a Customer. If no active Cart exists, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ResourceNotFoundError" rel="nofollow">ResourceNotFound</a> error is returned.</p>
 *  <p>For more information, see <span>Merge behavior</span>.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.cart.Cart>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .carts()
 *            .customerIdWithCustomerIdValueMerge("{customerId}")
 *            .post(null)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyCartsCustomerIdByCustomerIdMergePost extends
        TypeBodyApiMethod<ByProjectKeyCartsCustomerIdByCustomerIdMergePost, com.commercetools.api.models.cart.Cart, com.commercetools.api.models.cart.MergeCartDraft>
        implements com.commercetools.api.client.ErrorableTrait<ByProjectKeyCartsCustomerIdByCustomerIdMergePost> {

    @Override
    public TypeReference<com.commercetools.api.models.cart.Cart> resultType() {
        return new TypeReference<com.commercetools.api.models.cart.Cart>() {
        };
    }

    private String projectKey;
    private String customerId;

    private com.commercetools.api.models.cart.MergeCartDraft mergeCartDraft;

    public ByProjectKeyCartsCustomerIdByCustomerIdMergePost(final ApiHttpClient apiHttpClient, String projectKey,
            String customerId, com.commercetools.api.models.cart.MergeCartDraft mergeCartDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.customerId = customerId;
        this.mergeCartDraft = mergeCartDraft;
    }

    public ByProjectKeyCartsCustomerIdByCustomerIdMergePost(ByProjectKeyCartsCustomerIdByCustomerIdMergePost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.customerId = t.customerId;
        this.mergeCartDraft = t.mergeCartDraft;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/carts/customer-id=%s/merge", encodePathParam(this.projectKey),
            encodePathParam(this.customerId));
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(mergeCartDraft)));

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

    public com.commercetools.api.models.cart.MergeCartDraft getBody() {
        return mergeCartDraft;
    }

    public ByProjectKeyCartsCustomerIdByCustomerIdMergePost withBody(
            com.commercetools.api.models.cart.MergeCartDraft mergeCartDraft) {
        ByProjectKeyCartsCustomerIdByCustomerIdMergePost t = copy();
        t.mergeCartDraft = mergeCartDraft;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyCartsCustomerIdByCustomerIdMergePost that = (ByProjectKeyCartsCustomerIdByCustomerIdMergePost) o;

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
    protected ByProjectKeyCartsCustomerIdByCustomerIdMergePost copy() {
        return new ByProjectKeyCartsCustomerIdByCustomerIdMergePost(this);
    }
}
