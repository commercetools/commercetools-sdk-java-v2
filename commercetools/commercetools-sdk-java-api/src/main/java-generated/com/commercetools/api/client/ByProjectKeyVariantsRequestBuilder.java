
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyVariantsRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyVariantsRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyVariantsGet get() {
        return new ByProjectKeyVariantsGet(apiHttpClient, projectKey);
    }

    public ByProjectKeyVariantsPost post(com.commercetools.api.models.variant.VariantDraft variantDraft) {
        return new ByProjectKeyVariantsPost(apiHttpClient, projectKey, variantDraft);
    }

    public ByProjectKeyVariantsPostString post(final String variantDraft) {
        return new ByProjectKeyVariantsPostString(apiHttpClient, projectKey, variantDraft);
    }

    public ByProjectKeyVariantsPost post(UnaryOperator<com.commercetools.api.models.variant.VariantDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.variant.VariantDraftBuilder.of()).build());
    }

    public ByProjectKeyVariantsHead head() {
        return new ByProjectKeyVariantsHead(apiHttpClient, projectKey);
    }

    public ByProjectKeyVariantsBulkRequestBuilder bulk() {
        return new ByProjectKeyVariantsBulkRequestBuilder(apiHttpClient, projectKey);
    }

    public ByProjectKeyVariantsKeyByKeyRequestBuilder withKey(String key) {
        return new ByProjectKeyVariantsKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyVariantsByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyVariantsByIDRequestBuilder(apiHttpClient, projectKey, ID);
    }

}
