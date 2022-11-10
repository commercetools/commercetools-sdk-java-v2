
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyMeCartsReplicateRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyMeCartsReplicateRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyMeCartsReplicatePost post(
            com.commercetools.api.models.me.ReplicaMyCartDraft replicaMyCartDraft) {
        return new ByProjectKeyMeCartsReplicatePost(apiHttpClient, projectKey, replicaMyCartDraft);
    }

    public ByProjectKeyMeCartsReplicatePost post(
            UnaryOperator<com.commercetools.api.models.me.ReplicaMyCartDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.me.ReplicaMyCartDraftBuilder.of()).build());
    }

}
