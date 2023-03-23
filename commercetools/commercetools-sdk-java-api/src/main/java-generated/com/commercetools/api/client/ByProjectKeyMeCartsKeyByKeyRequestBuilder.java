
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyMeCartsKeyByKeyRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String key;

    public ByProjectKeyMeCartsKeyByKeyRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey,
            final String key) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.key = key;
    }

    public ByProjectKeyMeCartsKeyByKeyGet get() {
        return new ByProjectKeyMeCartsKeyByKeyGet(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyMeCartsKeyByKeyPost post(com.commercetools.api.models.me.MyCartUpdate myCartUpdate) {
        return new ByProjectKeyMeCartsKeyByKeyPost(apiHttpClient, projectKey, key, myCartUpdate);
    }

    public ByProjectKeyMeCartsKeyByKeyPostString post(final String myCartUpdate) {
        return new ByProjectKeyMeCartsKeyByKeyPostString(apiHttpClient, projectKey, key, myCartUpdate);
    }

    public ByProjectKeyMeCartsKeyByKeyPost post(UnaryOperator<com.commercetools.api.models.me.MyCartUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.me.MyCartUpdateBuilder.of()).build());
    }

    public ByProjectKeyMeCartsKeyByKeyDelete delete() {
        return new ByProjectKeyMeCartsKeyByKeyDelete(apiHttpClient, projectKey, key);
    }

    public <TValue> ByProjectKeyMeCartsKeyByKeyDelete delete(TValue version) {
        return delete().withVersion(version);
    }

}
