
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyZonesByIDRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String ID;

    public ByProjectKeyZonesByIDRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey,
            final String ID) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.ID = ID;
    }

    public ByProjectKeyZonesByIDGet get() {
        return new ByProjectKeyZonesByIDGet(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyZonesByIDHead head() {
        return new ByProjectKeyZonesByIDHead(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyZonesByIDPost post(com.commercetools.api.models.zone.ZoneUpdate zoneUpdate) {
        return new ByProjectKeyZonesByIDPost(apiHttpClient, projectKey, ID, zoneUpdate);
    }

    public ByProjectKeyZonesByIDPostString post(final String zoneUpdate) {
        return new ByProjectKeyZonesByIDPostString(apiHttpClient, projectKey, ID, zoneUpdate);
    }

    public ByProjectKeyZonesByIDPost post(UnaryOperator<com.commercetools.api.models.zone.ZoneUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.zone.ZoneUpdateBuilder.of()).build());
    }

    public ByProjectKeyZonesByIDDelete delete() {
        return new ByProjectKeyZonesByIDDelete(apiHttpClient, projectKey, ID);
    }

    public <TValue> ByProjectKeyZonesByIDDelete delete(TValue version) {
        return delete().withVersion(version);
    }

}
