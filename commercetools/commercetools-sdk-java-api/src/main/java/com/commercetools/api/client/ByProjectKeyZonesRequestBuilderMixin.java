
package com.commercetools.api.client;

import java.util.List;
import java.util.function.UnaryOperator;

import com.commercetools.api.models.Versioned;
import com.commercetools.api.models.zone.Zone;
import com.commercetools.api.models.zone.ZoneDraft;
import com.commercetools.api.models.zone.ZoneDraftBuilder;
import com.commercetools.api.models.zone.ZoneUpdate;
import com.commercetools.api.models.zone.ZoneUpdateAction;
import com.commercetools.api.models.zone.ZoneUpdateActionBuilder;

public interface ByProjectKeyZonesRequestBuilderMixin {
    public ByProjectKeyZonesPost post(ZoneDraft zoneDraft);

    public ByProjectKeyZonesByIDRequestBuilder withId(String ID);

    public default ByProjectKeyZonesByIDPost update(Versioned<Zone> zone, List<ZoneUpdateAction> actions) {
        return withId(zone.getId()).post(builder -> ZoneUpdate.builder().version(zone.getVersion()).actions(actions));
    }

    public default ByProjectKeyZonesByIDPost update(Versioned<Zone> zone,
            UnaryOperator<UpdateActionBuilder<ZoneUpdateAction, ZoneUpdateActionBuilder>> op) {
        return withId(zone.getId()).post(builder -> ZoneUpdate.builder()
                .version(zone.getVersion())
                .actions(op.apply(UpdateActionBuilder.of(ZoneUpdateActionBuilder::of)).actions));
    }

    public default WithUpdateActionBuilder<ZoneUpdateAction, ZoneUpdateActionBuilder, ByProjectKeyZonesByIDPost> update(
            Versioned<Zone> zone) {
        return builder -> withId(zone.getId()).post(b -> ZoneUpdate.builder()
                .version(zone.getVersion())
                .actions(builder.apply(UpdateActionBuilder.of(ZoneUpdateActionBuilder::of)).actions));
    }

    public default ByProjectKeyZonesByIDDelete delete(Versioned<Zone> zone) {
        return withId(zone.getId()).delete().withVersion(zone.getVersion());
    }

    public default ByProjectKeyZonesPost create(ZoneDraft zoneDraft) {
        return post(zoneDraft);
    }

    public default ByProjectKeyZonesPost create(UnaryOperator<ZoneDraftBuilder> op) {
        return post(op.apply(ZoneDraftBuilder.of()).build());
    }

}
