
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderSetParcelTrackingDataActionImpl.class)
public interface OrderSetParcelTrackingDataAction extends OrderUpdateAction {

    String SET_PARCEL_TRACKING_DATA = "setParcelTrackingData";

    @NotNull
    @JsonProperty("parcelId")
    public String getParcelId();

    @Valid
    @JsonProperty("trackingData")
    public TrackingData getTrackingData();

    public void setParcelId(final String parcelId);

    public void setTrackingData(final TrackingData trackingData);

    public static OrderSetParcelTrackingDataAction of() {
        return new OrderSetParcelTrackingDataActionImpl();
    }

    public static OrderSetParcelTrackingDataAction of(final OrderSetParcelTrackingDataAction template) {
        OrderSetParcelTrackingDataActionImpl instance = new OrderSetParcelTrackingDataActionImpl();
        instance.setParcelId(template.getParcelId());
        instance.setTrackingData(template.getTrackingData());
        return instance;
    }

    public static OrderSetParcelTrackingDataActionBuilder builder() {
        return OrderSetParcelTrackingDataActionBuilder.of();
    }

    public static OrderSetParcelTrackingDataActionBuilder builder(final OrderSetParcelTrackingDataAction template) {
        return OrderSetParcelTrackingDataActionBuilder.of(template);
    }

    default <T> T withOrderSetParcelTrackingDataAction(Function<OrderSetParcelTrackingDataAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderSetParcelTrackingDataAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderSetParcelTrackingDataAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSetParcelTrackingDataAction>";
            }
        };
    }
}
