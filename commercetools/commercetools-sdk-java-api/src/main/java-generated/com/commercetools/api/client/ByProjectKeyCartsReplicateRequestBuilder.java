
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyCartsReplicateRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyCartsReplicateRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyCartsReplicatePost post(com.commercetools.api.models.cart.ReplicaCartDraft replicaCartDraft) {
        return new ByProjectKeyCartsReplicatePost(apiHttpClient, projectKey, replicaCartDraft);
    }

    public ByProjectKeyCartsReplicatePost post(
            UnaryOperator<com.commercetools.api.models.cart.ReplicaCartDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.cart.ReplicaCartDraftBuilder.of()).build());
    }

}
