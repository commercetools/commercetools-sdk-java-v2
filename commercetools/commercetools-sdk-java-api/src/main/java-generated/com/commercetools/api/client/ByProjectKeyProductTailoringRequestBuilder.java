
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyProductTailoringRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyProductTailoringRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyProductTailoringGet get() {
        return new ByProjectKeyProductTailoringGet(apiHttpClient, projectKey);
    }

    public ByProjectKeyProductTailoringPost post(
            com.commercetools.api.models.product_tailoring.ProductTailoringDraft productTailoringDraft) {
        return new ByProjectKeyProductTailoringPost(apiHttpClient, projectKey, productTailoringDraft);
    }

    public ByProjectKeyProductTailoringPostString post(final String productTailoringDraft) {
        return new ByProjectKeyProductTailoringPostString(apiHttpClient, projectKey, productTailoringDraft);
    }

    public ByProjectKeyProductTailoringPost post(
            UnaryOperator<com.commercetools.api.models.product_tailoring.ProductTailoringDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.product_tailoring.ProductTailoringDraftBuilder.of()).build());
    }

    public ByProjectKeyProductTailoringKeyByKeyRequestBuilder withKey(String key) {
        return new ByProjectKeyProductTailoringKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyProductTailoringByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyProductTailoringByIDRequestBuilder(apiHttpClient, projectKey, ID);
    }

}
