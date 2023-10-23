
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyStatesByIDRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String ID;

    public ByProjectKeyStatesByIDRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey,
            final String ID) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.ID = ID;
    }

    public ByProjectKeyStatesByIDGet get() {
        return new ByProjectKeyStatesByIDGet(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyStatesByIDHead head() {
        return new ByProjectKeyStatesByIDHead(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyStatesByIDPost post(com.commercetools.api.models.state.StateUpdate stateUpdate) {
        return new ByProjectKeyStatesByIDPost(apiHttpClient, projectKey, ID, stateUpdate);
    }

    public ByProjectKeyStatesByIDPostString post(final String stateUpdate) {
        return new ByProjectKeyStatesByIDPostString(apiHttpClient, projectKey, ID, stateUpdate);
    }

    public ByProjectKeyStatesByIDPost post(UnaryOperator<com.commercetools.api.models.state.StateUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.state.StateUpdateBuilder.of()).build());
    }

    public ByProjectKeyStatesByIDDelete delete() {
        return new ByProjectKeyStatesByIDDelete(apiHttpClient, projectKey, ID);
    }

    public <TValue> ByProjectKeyStatesByIDDelete delete(TValue version) {
        return delete().withVersion(version);
    }

}
