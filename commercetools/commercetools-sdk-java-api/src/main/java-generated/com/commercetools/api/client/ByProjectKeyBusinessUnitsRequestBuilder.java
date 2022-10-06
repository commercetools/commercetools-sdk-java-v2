
package com.commercetools.api.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyBusinessUnitsRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyBusinessUnitsRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyBusinessUnitsGet get() {
        return new ByProjectKeyBusinessUnitsGet(apiHttpClient, projectKey);
    }

    public ByProjectKeyBusinessUnitsPost post(
            com.commercetools.api.models.business_unit.BusinessUnitDraft businessUnitDraft) {
        return new ByProjectKeyBusinessUnitsPost(apiHttpClient, projectKey, businessUnitDraft);
    }

    public ByProjectKeyBusinessUnitsKeyByKeyRequestBuilder withKey(String key) {
        return new ByProjectKeyBusinessUnitsKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyBusinessUnitsByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyBusinessUnitsByIDRequestBuilder(apiHttpClient, projectKey, ID);
    }
}
