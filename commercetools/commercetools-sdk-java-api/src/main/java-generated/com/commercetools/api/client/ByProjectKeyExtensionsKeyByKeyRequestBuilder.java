
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyExtensionsKeyByKeyRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String key;

    public ByProjectKeyExtensionsKeyByKeyRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey,
            final String key) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.key = key;
    }

    public ByProjectKeyExtensionsKeyByKeyGet get() {
        return new ByProjectKeyExtensionsKeyByKeyGet(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyExtensionsKeyByKeyPost post(
            com.commercetools.api.models.extension.ExtensionUpdate extensionUpdate) {
        return new ByProjectKeyExtensionsKeyByKeyPost(apiHttpClient, projectKey, key, extensionUpdate);
    }

    public ByProjectKeyExtensionsKeyByKeyPost post(
            UnaryOperator<com.commercetools.api.models.extension.ExtensionUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.extension.ExtensionUpdateBuilder.of()).build());
    }

    public ByProjectKeyExtensionsKeyByKeyDelete delete() {
        return new ByProjectKeyExtensionsKeyByKeyDelete(apiHttpClient, projectKey, key);
    }

    public <TValue> ByProjectKeyExtensionsKeyByKeyDelete delete(TValue version) {
        return delete().withVersion(version);
    }

}
