
package com.commercetools.api.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyStatesRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyStatesRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyStatesGet get() {
        return new ByProjectKeyStatesGet(apiHttpClient, projectKey);
    }

    public ByProjectKeyStatesPost post(com.commercetools.api.models.state.StateDraft stateDraft) {
        return new ByProjectKeyStatesPost(apiHttpClient, projectKey, stateDraft);
    }

    public ByProjectKeyStatesKeyByKeyRequestBuilder withKey(String key) {
        return new ByProjectKeyStatesKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyStatesByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyStatesByIDRequestBuilder(apiHttpClient, projectKey, ID);
    }
}
