
package com.commercetools.api.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyMeBusinessUnitsKeyByKeyRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String key;

    public ByProjectKeyMeBusinessUnitsKeyByKeyRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey,
            final String key) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.key = key;
    }

    public ByProjectKeyMeBusinessUnitsKeyByKeyGet get() {
        return new ByProjectKeyMeBusinessUnitsKeyByKeyGet(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyMeBusinessUnitsKeyByKeyPost post(
            com.commercetools.api.models.me.MyBusinessUnitUpdate myBusinessUnitUpdate) {
        return new ByProjectKeyMeBusinessUnitsKeyByKeyPost(apiHttpClient, projectKey, key, myBusinessUnitUpdate);
    }

    public ByProjectKeyMeBusinessUnitsKeyByKeyDelete delete() {
        return new ByProjectKeyMeBusinessUnitsKeyByKeyDelete(apiHttpClient, projectKey, key);
    }

}
