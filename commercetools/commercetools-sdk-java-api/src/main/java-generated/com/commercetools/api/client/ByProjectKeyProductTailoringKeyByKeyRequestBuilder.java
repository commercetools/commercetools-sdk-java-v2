
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyProductTailoringKeyByKeyRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String key;

    public ByProjectKeyProductTailoringKeyByKeyRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey, final String key) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.key = key;
    }

    public ByProjectKeyProductTailoringKeyByKeyGet get() {
        return new ByProjectKeyProductTailoringKeyByKeyGet(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyProductTailoringKeyByKeyPost post(
            com.commercetools.api.models.cart.ProductTailoringUpdate productTailoringUpdate) {
        return new ByProjectKeyProductTailoringKeyByKeyPost(apiHttpClient, projectKey, key, productTailoringUpdate);
    }

    public ByProjectKeyProductTailoringKeyByKeyPostString post(final String productTailoringUpdate) {
        return new ByProjectKeyProductTailoringKeyByKeyPostString(apiHttpClient, projectKey, key,
            productTailoringUpdate);
    }

    public ByProjectKeyProductTailoringKeyByKeyPost post(
            UnaryOperator<com.commercetools.api.models.cart.ProductTailoringUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.cart.ProductTailoringUpdateBuilder.of()).build());
    }

    public ByProjectKeyProductTailoringKeyByKeyDelete delete() {
        return new ByProjectKeyProductTailoringKeyByKeyDelete(apiHttpClient, projectKey, key);
    }

    public <TValue> ByProjectKeyProductTailoringKeyByKeyDelete delete(TValue version) {
        return delete().withVersion(version);
    }

}
