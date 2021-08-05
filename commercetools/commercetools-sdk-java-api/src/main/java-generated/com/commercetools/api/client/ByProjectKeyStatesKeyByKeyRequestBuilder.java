
package com.commercetools.api.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")

public class ByProjectKeyStatesKeyByKeyRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String key;

    public ByProjectKeyStatesKeyByKeyRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey,
            final String key) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.key = key;
    }

    public ByProjectKeyStatesKeyByKeyGet get() {
        return new ByProjectKeyStatesKeyByKeyGet(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyStatesKeyByKeyPost post(com.commercetools.api.models.state.StateUpdate stateUpdate) {
        return new ByProjectKeyStatesKeyByKeyPost(apiHttpClient, projectKey, key, stateUpdate);
    }

    public ByProjectKeyStatesKeyByKeyDelete delete() {
        return new ByProjectKeyStatesKeyByKeyDelete(apiHttpClient, projectKey, key);
    }

}
