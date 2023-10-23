
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyTypesKeyByKeyRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String key;

    public ByProjectKeyTypesKeyByKeyRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey,
            final String key) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.key = key;
    }

    public ByProjectKeyTypesKeyByKeyGet get() {
        return new ByProjectKeyTypesKeyByKeyGet(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyTypesKeyByKeyHead head() {
        return new ByProjectKeyTypesKeyByKeyHead(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyTypesKeyByKeyPost post(com.commercetools.api.models.type.TypeUpdate typeUpdate) {
        return new ByProjectKeyTypesKeyByKeyPost(apiHttpClient, projectKey, key, typeUpdate);
    }

    public ByProjectKeyTypesKeyByKeyPostString post(final String typeUpdate) {
        return new ByProjectKeyTypesKeyByKeyPostString(apiHttpClient, projectKey, key, typeUpdate);
    }

    public ByProjectKeyTypesKeyByKeyPost post(UnaryOperator<com.commercetools.api.models.type.TypeUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.type.TypeUpdateBuilder.of()).build());
    }

    public ByProjectKeyTypesKeyByKeyDelete delete() {
        return new ByProjectKeyTypesKeyByKeyDelete(apiHttpClient, projectKey, key);
    }

    public <TValue> ByProjectKeyTypesKeyByKeyDelete delete(TValue version) {
        return delete().withVersion(version);
    }

}
