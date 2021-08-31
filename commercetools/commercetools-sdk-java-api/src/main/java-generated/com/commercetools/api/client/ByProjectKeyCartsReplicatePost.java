
package com.commercetools.api.client;

import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

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
public class ByProjectKeyCartsReplicatePost
        extends ApiMethod<ByProjectKeyCartsReplicatePost, com.commercetools.api.models.cart.Cart>
        implements com.commercetools.api.client.ErrorableTrait<ByProjectKeyCartsReplicatePost> {

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
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/carts/replicate", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        try {
            final byte[] body = apiHttpClient().getSerializerService().toJsonByteArray(replicaCartDraft);
            return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), body);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.cart.Cart> executeBlocking(final ApiHttpClient client,
            Duration timeout) {
        ApiHttpRequest request = this.createHttpRequest();
        return blockingWait(client.execute(request, com.commercetools.api.models.cart.Cart.class), request, timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.cart.Cart>> execute(
            final ApiHttpClient client) {
        return client.execute(this.createHttpRequest(), com.commercetools.api.models.cart.Cart.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
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
