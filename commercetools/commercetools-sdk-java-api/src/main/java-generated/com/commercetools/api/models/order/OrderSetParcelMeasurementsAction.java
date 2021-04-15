
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
@JsonDeserialize(as = OrderSetParcelMeasurementsActionImpl.class)
public interface OrderSetParcelMeasurementsAction extends OrderUpdateAction {

    String SET_PARCEL_MEASUREMENTS = "setParcelMeasurements";

    @NotNull
    @JsonProperty("parcelId")
    public String getParcelId();

    @Valid
    @JsonProperty("measurements")
    public ParcelMeasurements getMeasurements();

    public void setParcelId(final String parcelId);

    public void setMeasurements(final ParcelMeasurements measurements);

    public static OrderSetParcelMeasurementsAction of() {
        return new OrderSetParcelMeasurementsActionImpl();
    }

    public static OrderSetParcelMeasurementsAction of(final OrderSetParcelMeasurementsAction template) {
        OrderSetParcelMeasurementsActionImpl instance = new OrderSetParcelMeasurementsActionImpl();
        instance.setParcelId(template.getParcelId());
        instance.setMeasurements(template.getMeasurements());
        return instance;
    }

    public static OrderSetParcelMeasurementsActionBuilder builder() {
        return OrderSetParcelMeasurementsActionBuilder.of();
    }

    public static OrderSetParcelMeasurementsActionBuilder builder(final OrderSetParcelMeasurementsAction template) {
        return OrderSetParcelMeasurementsActionBuilder.of(template);
    }

    default <T> T withOrderSetParcelMeasurementsAction(Function<OrderSetParcelMeasurementsAction, T> helper) {
        return helper.apply(this);
    }
}
