
package com.commercetools.api.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyInBusinessUnitKeyByBusinessUnitKeyMeCustomersRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String businessUnitKey;

    public ByProjectKeyInBusinessUnitKeyByBusinessUnitKeyMeCustomersRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey, final String businessUnitKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.businessUnitKey = businessUnitKey;
    }

    public ByProjectKeyInBusinessUnitKeyByBusinessUnitKeyMeCustomersPost post(
            com.commercetools.api.models.me.MyBusinessUnitAssociateDraft myBusinessUnitAssociateDraft) {
        return new ByProjectKeyInBusinessUnitKeyByBusinessUnitKeyMeCustomersPost(apiHttpClient, projectKey,
            businessUnitKey, myBusinessUnitAssociateDraft);
    }

}
