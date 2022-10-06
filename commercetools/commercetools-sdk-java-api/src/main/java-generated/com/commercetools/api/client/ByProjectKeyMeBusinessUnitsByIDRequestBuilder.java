
package com.commercetools.api.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyMeBusinessUnitsByIDRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String ID;

    public ByProjectKeyMeBusinessUnitsByIDRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey,
            final String ID) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.ID = ID;
    }

    public ByProjectKeyMeBusinessUnitsByIDGet get() {
        return new ByProjectKeyMeBusinessUnitsByIDGet(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyMeBusinessUnitsByIDPost post(
            com.commercetools.api.models.me.MyBusinessUnitUpdate myBusinessUnitUpdate) {
        return new ByProjectKeyMeBusinessUnitsByIDPost(apiHttpClient, projectKey, ID, myBusinessUnitUpdate);
    }

    public ByProjectKeyMeBusinessUnitsByIDDelete delete() {
        return new ByProjectKeyMeBusinessUnitsByIDDelete(apiHttpClient, projectKey, ID);
    }

}
