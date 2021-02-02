
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.order.TrackingData;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetParcelTrackingDataActionImpl.class)
public interface StagedOrderSetParcelTrackingDataAction extends StagedOrderUpdateAction {

    String SET_PARCEL_TRACKING_DATA = "setParcelTrackingData";

    @NotNull
    @JsonProperty("parcelId")
    public String getParcelId();

    @Valid
    @JsonProperty("trackingData")
    public TrackingData getTrackingData();

    public void setParcelId(final String parcelId);

    public void setTrackingData(final TrackingData trackingData);

    public static StagedOrderSetParcelTrackingDataAction of() {
        return new StagedOrderSetParcelTrackingDataActionImpl();
    }

    public static StagedOrderSetParcelTrackingDataAction of(final StagedOrderSetParcelTrackingDataAction template) {
        StagedOrderSetParcelTrackingDataActionImpl instance = new StagedOrderSetParcelTrackingDataActionImpl();
        instance.setParcelId(template.getParcelId());
        instance.setTrackingData(template.getTrackingData());
        return instance;
    }

    public static StagedOrderSetParcelTrackingDataActionBuilder builder() {
        return StagedOrderSetParcelTrackingDataActionBuilder.of();
    }

    public static StagedOrderSetParcelTrackingDataActionBuilder builder(
            final StagedOrderSetParcelTrackingDataAction template) {
        return StagedOrderSetParcelTrackingDataActionBuilder.of(template);
    }

    default <T> T withStagedOrderSetParcelTrackingDataAction(
            Function<StagedOrderSetParcelTrackingDataAction, T> helper) {
        return helper.apply(this);
    }
}
