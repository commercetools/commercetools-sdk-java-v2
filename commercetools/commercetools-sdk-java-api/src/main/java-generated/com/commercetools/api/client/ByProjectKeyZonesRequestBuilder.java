
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
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

    public ByProjectKeyZonesPost post(UnaryOperator<com.commercetools.api.models.zone.ZoneDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.zone.ZoneDraftBuilder.of()).build());
    }

    public ByProjectKeyZonesKeyByKeyRequestBuilder withKey(String key) {
        return new ByProjectKeyZonesKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyZonesByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyZonesByIDRequestBuilder(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyZonesByIDPost update(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.zone.Zone> zone,
            java.util.List<com.commercetools.api.models.zone.ZoneUpdateAction> actions) {
        return withId(zone.getId()).post(builder -> com.commercetools.api.models.zone.ZoneUpdate.builder()
                .version(zone.getVersion())
                .actions(actions));
    }

    public ByProjectKeyZonesByIDPost update(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.zone.Zone> zone,
            UnaryOperator<UpdateActionBuilder<com.commercetools.api.models.zone.ZoneUpdateAction, com.commercetools.api.models.zone.ZoneUpdateActionBuilder>> op) {
        return withId(zone.getId()).post(builder -> com.commercetools.api.models.zone.ZoneUpdate.builder()
                .version(zone.getVersion())
                .actions(op.apply(
                    UpdateActionBuilder.of(com.commercetools.api.models.zone.ZoneUpdateActionBuilder::of)).actions));
    }

    public WithUpdateActionBuilder<com.commercetools.api.models.zone.ZoneUpdateAction, com.commercetools.api.models.zone.ZoneUpdateActionBuilder, ByProjectKeyZonesByIDPost> update(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.zone.Zone> zone) {
        return builder -> withId(zone.getId()).post(b -> com.commercetools.api.models.zone.ZoneUpdate.builder()
                .version(zone.getVersion())
                .actions(builder.apply(
                    UpdateActionBuilder.of(com.commercetools.api.models.zone.ZoneUpdateActionBuilder::of)).actions));
    }

    public ByProjectKeyZonesByIDDelete delete(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.zone.Zone> zone) {
        return withId(zone.getId()).delete().withVersion(zone.getVersion());
    }

    public ByProjectKeyZonesPost create(com.commercetools.api.models.zone.ZoneDraft zoneDraft) {
        return post(zoneDraft);
    }

    public ByProjectKeyZonesPost create(UnaryOperator<com.commercetools.api.models.zone.ZoneDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.zone.ZoneDraftBuilder.of()).build());
    }

}
