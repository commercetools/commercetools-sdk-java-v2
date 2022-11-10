
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyZonesKeyByKeyRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String key;

    public ByProjectKeyZonesKeyByKeyRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey,
            final String key) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.key = key;
    }

    public ByProjectKeyZonesKeyByKeyGet get() {
        return new ByProjectKeyZonesKeyByKeyGet(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyZonesKeyByKeyPost post(com.commercetools.api.models.zone.ZoneUpdate zoneUpdate) {
        return new ByProjectKeyZonesKeyByKeyPost(apiHttpClient, projectKey, key, zoneUpdate);
    }

    public ByProjectKeyZonesKeyByKeyPost post(UnaryOperator<com.commercetools.api.models.zone.ZoneUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.zone.ZoneUpdateBuilder.of()).build());
    }

    public ByProjectKeyZonesKeyByKeyDelete delete() {
        return new ByProjectKeyZonesKeyByKeyDelete(apiHttpClient, projectKey, key);
    }

    public <TValue> ByProjectKeyZonesKeyByKeyDelete delete(TValue version) {
        return delete().withVersion(version);
    }

}
