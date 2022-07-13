
package com.commercetools.api.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyProductTypesByIDRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String ID;

    public ByProjectKeyProductTypesByIDRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey,
            final String ID) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.ID = ID;
    }

    public ByProjectKeyProductTypesByIDGet get() {
        return new ByProjectKeyProductTypesByIDGet(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyProductTypesByIDHead head() {
        return new ByProjectKeyProductTypesByIDHead(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyProductTypesByIDPost post(
            com.commercetools.api.models.product_type.ProductTypeUpdate productTypeUpdate) {
        return new ByProjectKeyProductTypesByIDPost(apiHttpClient, projectKey, ID, productTypeUpdate);
    }

    public ByProjectKeyProductTypesByIDDelete delete() {
        return new ByProjectKeyProductTypesByIDDelete(apiHttpClient, projectKey, ID);
    }

}
