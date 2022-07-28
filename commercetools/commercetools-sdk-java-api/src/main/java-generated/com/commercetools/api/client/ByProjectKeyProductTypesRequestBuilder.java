
package com.commercetools.api.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyProductTypesRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyProductTypesRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyProductTypesGet get() {
        return new ByProjectKeyProductTypesGet(apiHttpClient, projectKey);
    }

    public ByProjectKeyProductTypesHead head() {
        return new ByProjectKeyProductTypesHead(apiHttpClient, projectKey);
    }

    public ByProjectKeyProductTypesPost post(
            com.commercetools.api.models.product_type.ProductTypeDraft productTypeDraft) {
        return new ByProjectKeyProductTypesPost(apiHttpClient, projectKey, productTypeDraft);
    }

    public ByProjectKeyProductTypesKeyByKeyRequestBuilder withKey(String key) {
        return new ByProjectKeyProductTypesKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyProductTypesByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyProductTypesByIDRequestBuilder(apiHttpClient, projectKey, ID);
    }
}
