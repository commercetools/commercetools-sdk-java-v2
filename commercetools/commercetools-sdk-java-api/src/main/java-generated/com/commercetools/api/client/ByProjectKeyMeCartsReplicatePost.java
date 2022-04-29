
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyMeCartsReplicatePost extends
        BodyApiMethod<ByProjectKeyMeCartsReplicatePost, com.commercetools.api.models.cart.Cart, com.commercetools.api.models.me.ReplicaMyCartDraft>
        implements com.commercetools.api.client.ErrorableTrait<ByProjectKeyMeCartsReplicatePost> {

    private String projectKey;

    private com.commercetools.api.models.me.ReplicaMyCartDraft replicaMyCartDraft;

    public ByProjectKeyMeCartsReplicatePost(final ApiHttpClient apiHttpClient, String projectKey,
            com.commercetools.api.models.me.ReplicaMyCartDraft replicaMyCartDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.replicaMyCartDraft = replicaMyCartDraft;
    }

    public ByProjectKeyMeCartsReplicatePost(ByProjectKeyMeCartsReplicatePost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.replicaMyCartDraft = t.replicaMyCartDraft;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/me/carts/replicate", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(replicaMyCartDraft)));

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

    public com.commercetools.api.models.me.ReplicaMyCartDraft getBody() {
        return replicaMyCartDraft;
    }

    public ByProjectKeyMeCartsReplicatePost withBody(
            com.commercetools.api.models.me.ReplicaMyCartDraft replicaMyCartDraft) {
        ByProjectKeyMeCartsReplicatePost t = copy();
        t.replicaMyCartDraft = replicaMyCartDraft;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyMeCartsReplicatePost that = (ByProjectKeyMeCartsReplicatePost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(replicaMyCartDraft, that.replicaMyCartDraft)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(replicaMyCartDraft).toHashCode();
    }

    @Override
    protected ByProjectKeyMeCartsReplicatePost copy() {
        return new ByProjectKeyMeCartsReplicatePost(this);
    }
}
