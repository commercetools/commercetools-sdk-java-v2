
package com.commercetools.api.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")

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

}
