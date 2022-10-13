
package com.commercetools.api.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyInBusinessUnitKeyByBusinessUnitKeyMeRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String businessUnitKey;

    public ByProjectKeyInBusinessUnitKeyByBusinessUnitKeyMeRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey, final String businessUnitKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.businessUnitKey = businessUnitKey;
    }

    public ByProjectKeyInBusinessUnitKeyByBusinessUnitKeyMeCustomersRequestBuilder customers() {
        return new ByProjectKeyInBusinessUnitKeyByBusinessUnitKeyMeCustomersRequestBuilder(apiHttpClient, projectKey,
            businessUnitKey);
    }
}
