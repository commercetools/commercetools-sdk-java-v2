
package com.commercetools.api.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyVariantProjectionsRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyVariantProjectionsRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyVariantProjectionsGet get() {
        return new ByProjectKeyVariantProjectionsGet(apiHttpClient, projectKey);
    }

    public ByProjectKeyVariantProjectionsHead head() {
        return new ByProjectKeyVariantProjectionsHead(apiHttpClient, projectKey);
    }

    public ByProjectKeyVariantProjectionsKeyByKeyRequestBuilder withKey(String key) {
        return new ByProjectKeyVariantProjectionsKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyVariantProjectionsByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyVariantProjectionsByIDRequestBuilder(apiHttpClient, projectKey, ID);
    }

}
