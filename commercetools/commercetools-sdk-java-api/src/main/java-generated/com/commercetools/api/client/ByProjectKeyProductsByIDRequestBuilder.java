
package com.commercetools.api.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyProductsByIDRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String ID;

    public ByProjectKeyProductsByIDRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey,
            final String ID) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.ID = ID;
    }

    public ByProjectKeyProductsByIDGet get() {
        return new ByProjectKeyProductsByIDGet(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyProductsByIDHead head() {
        return new ByProjectKeyProductsByIDHead(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyProductsByIDPost post(com.commercetools.api.models.product.ProductUpdate productUpdate) {
        return new ByProjectKeyProductsByIDPost(apiHttpClient, projectKey, ID, productUpdate);
    }

    public ByProjectKeyProductsByIDDelete delete() {
        return new ByProjectKeyProductsByIDDelete(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyProductsByIDImagesRequestBuilder images() {
        return new ByProjectKeyProductsByIDImagesRequestBuilder(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyProductsByIDProductSelectionsRequestBuilder productSelections() {
        return new ByProjectKeyProductsByIDProductSelectionsRequestBuilder(apiHttpClient, projectKey, ID);
    }
}
