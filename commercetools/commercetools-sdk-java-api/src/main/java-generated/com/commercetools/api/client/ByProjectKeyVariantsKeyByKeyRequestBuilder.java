
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyVariantsKeyByKeyRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String key;

    public ByProjectKeyVariantsKeyByKeyRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey,
            final String key) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.key = key;
    }

    public ByProjectKeyVariantsKeyByKeyGet get() {
        return new ByProjectKeyVariantsKeyByKeyGet(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyVariantsKeyByKeyHead head() {
        return new ByProjectKeyVariantsKeyByKeyHead(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyVariantsKeyByKeyPost post(com.commercetools.api.models.variant.VariantUpdate variantUpdate) {
        return new ByProjectKeyVariantsKeyByKeyPost(apiHttpClient, projectKey, key, variantUpdate);
    }

    public ByProjectKeyVariantsKeyByKeyPostString post(final String variantUpdate) {
        return new ByProjectKeyVariantsKeyByKeyPostString(apiHttpClient, projectKey, key, variantUpdate);
    }

    public ByProjectKeyVariantsKeyByKeyPost post(
            UnaryOperator<com.commercetools.api.models.variant.VariantUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.variant.VariantUpdateBuilder.of()).build());
    }

    public ByProjectKeyVariantsKeyByKeyDelete delete() {
        return new ByProjectKeyVariantsKeyByKeyDelete(apiHttpClient, projectKey, key);
    }

    public <TValue> ByProjectKeyVariantsKeyByKeyDelete delete(TValue version) {
        return delete().withVersion(version);
    }

}
