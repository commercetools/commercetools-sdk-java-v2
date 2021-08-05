
package com.commercetools.api.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")

public class ByProjectKeyZonesRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyZonesRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyZonesGet get() {
        return new ByProjectKeyZonesGet(apiHttpClient, projectKey);
    }

    public ByProjectKeyZonesPost post(com.commercetools.api.models.zone.ZoneDraft zoneDraft) {
        return new ByProjectKeyZonesPost(apiHttpClient, projectKey, zoneDraft);
    }

    public ByProjectKeyZonesKeyByKeyRequestBuilder withKey(String key) {
        return new ByProjectKeyZonesKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyZonesByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyZonesByIDRequestBuilder(apiHttpClient, projectKey, ID);
    }
}
