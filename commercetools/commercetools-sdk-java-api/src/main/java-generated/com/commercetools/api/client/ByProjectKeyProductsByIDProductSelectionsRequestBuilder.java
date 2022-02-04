
package com.commercetools.api.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyProductsByIDProductSelectionsRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String ID;

    public ByProjectKeyProductsByIDProductSelectionsRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey, final String ID) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.ID = ID;
    }

    public ByProjectKeyProductsByIDProductSelectionsGet get() {
        return new ByProjectKeyProductsByIDProductSelectionsGet(apiHttpClient, projectKey, ID);
    }

}
