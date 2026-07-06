
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyVariantsBulkRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyVariantsBulkRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyVariantsBulkPost post(com.commercetools.api.models.variant.VariantBulkUpdate variantBulkUpdate) {
        return new ByProjectKeyVariantsBulkPost(apiHttpClient, projectKey, variantBulkUpdate);
    }

    public ByProjectKeyVariantsBulkPostString post(final String variantBulkUpdate) {
        return new ByProjectKeyVariantsBulkPostString(apiHttpClient, projectKey, variantBulkUpdate);
    }

    public ByProjectKeyVariantsBulkPost post(
            UnaryOperator<com.commercetools.api.models.variant.VariantBulkUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.variant.VariantBulkUpdateBuilder.of()).build());
    }

}
