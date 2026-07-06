
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyVariantsByIDRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String ID;

    public ByProjectKeyVariantsByIDRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey,
            final String ID) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.ID = ID;
    }

    public ByProjectKeyVariantsByIDGet get() {
        return new ByProjectKeyVariantsByIDGet(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyVariantsByIDHead head() {
        return new ByProjectKeyVariantsByIDHead(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyVariantsByIDPost post(com.commercetools.api.models.variant.VariantUpdate variantUpdate) {
        return new ByProjectKeyVariantsByIDPost(apiHttpClient, projectKey, ID, variantUpdate);
    }

    public ByProjectKeyVariantsByIDPostString post(final String variantUpdate) {
        return new ByProjectKeyVariantsByIDPostString(apiHttpClient, projectKey, ID, variantUpdate);
    }

    public ByProjectKeyVariantsByIDPost post(
            UnaryOperator<com.commercetools.api.models.variant.VariantUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.variant.VariantUpdateBuilder.of()).build());
    }

    public ByProjectKeyVariantsByIDDelete delete() {
        return new ByProjectKeyVariantsByIDDelete(apiHttpClient, projectKey, ID);
    }

    public <TValue> ByProjectKeyVariantsByIDDelete delete(TValue version) {
        return delete().withVersion(version);
    }

}
