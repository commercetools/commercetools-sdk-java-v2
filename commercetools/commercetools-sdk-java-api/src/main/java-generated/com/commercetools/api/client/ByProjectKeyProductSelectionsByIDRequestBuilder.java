
package com.commercetools.api.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyProductSelectionsByIDRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String ID;

    public ByProjectKeyProductSelectionsByIDRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey,
            final String ID) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.ID = ID;
    }

    public ByProjectKeyProductSelectionsByIDGet get() {
        return new ByProjectKeyProductSelectionsByIDGet(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyProductSelectionsByIDPost post(
            com.commercetools.api.models.product_selection.ProductSelectionUpdate productSelectionUpdate) {
        return new ByProjectKeyProductSelectionsByIDPost(apiHttpClient, projectKey, ID, productSelectionUpdate);
    }

    public ByProjectKeyProductSelectionsByIDDelete delete() {
        return new ByProjectKeyProductSelectionsByIDDelete(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyProductSelectionsByIDProductsRequestBuilder products() {
        return new ByProjectKeyProductSelectionsByIDProductsRequestBuilder(apiHttpClient, projectKey, ID);
    }
}
