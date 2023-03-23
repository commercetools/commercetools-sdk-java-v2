
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyTypesByIDRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String ID;

    public ByProjectKeyTypesByIDRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey,
            final String ID) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.ID = ID;
    }

    public ByProjectKeyTypesByIDGet get() {
        return new ByProjectKeyTypesByIDGet(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyTypesByIDPost post(com.commercetools.api.models.type.TypeUpdate typeUpdate) {
        return new ByProjectKeyTypesByIDPost(apiHttpClient, projectKey, ID, typeUpdate);
    }

    public ByProjectKeyTypesByIDPostString post(final String typeUpdate) {
        return new ByProjectKeyTypesByIDPostString(apiHttpClient, projectKey, ID, typeUpdate);
    }

    public ByProjectKeyTypesByIDPost post(UnaryOperator<com.commercetools.api.models.type.TypeUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.type.TypeUpdateBuilder.of()).build());
    }

    public ByProjectKeyTypesByIDDelete delete() {
        return new ByProjectKeyTypesByIDDelete(apiHttpClient, projectKey, ID);
    }

    public <TValue> ByProjectKeyTypesByIDDelete delete(TValue version) {
        return delete().withVersion(version);
    }

}
