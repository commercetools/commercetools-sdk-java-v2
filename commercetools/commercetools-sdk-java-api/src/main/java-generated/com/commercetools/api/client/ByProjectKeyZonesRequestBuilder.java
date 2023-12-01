
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyZonesRequestBuilder implements ByProjectKeyZonesRequestBuilderMixin {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyZonesRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyZonesGet get() {
        return new ByProjectKeyZonesGet(apiHttpClient, projectKey);
    }

    public ByProjectKeyZonesHead head() {
        return new ByProjectKeyZonesHead(apiHttpClient, projectKey);
    }

    public ByProjectKeyZonesPost post(com.commercetools.api.models.zone.ZoneDraft zoneDraft) {
        return new ByProjectKeyZonesPost(apiHttpClient, projectKey, zoneDraft);
    }

    public ByProjectKeyZonesPostString post(final String zoneDraft) {
        return new ByProjectKeyZonesPostString(apiHttpClient, projectKey, zoneDraft);
    }

    public ByProjectKeyZonesPost post(UnaryOperator<com.commercetools.api.models.zone.ZoneDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.zone.ZoneDraftBuilder.of()).build());
    }

    public ByProjectKeyZonesKeyByKeyRequestBuilder withKey(String key) {
        return new ByProjectKeyZonesKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyZonesByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyZonesByIDRequestBuilder(apiHttpClient, projectKey, ID);
    }

}
