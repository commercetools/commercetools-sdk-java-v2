
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order.ParcelMeasurements;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetParcelMeasurementsActionImpl.class)
public interface StagedOrderSetParcelMeasurementsAction extends StagedOrderUpdateAction {

    String SET_PARCEL_MEASUREMENTS = "setParcelMeasurements";

    @NotNull
    @JsonProperty("parcelId")
    public String getParcelId();

    @Valid
    @JsonProperty("measurements")
    public ParcelMeasurements getMeasurements();

    public void setParcelId(final String parcelId);

    public void setMeasurements(final ParcelMeasurements measurements);

    public static StagedOrderSetParcelMeasurementsAction of() {
        return new StagedOrderSetParcelMeasurementsActionImpl();
    }

    public static StagedOrderSetParcelMeasurementsAction of(final StagedOrderSetParcelMeasurementsAction template) {
        StagedOrderSetParcelMeasurementsActionImpl instance = new StagedOrderSetParcelMeasurementsActionImpl();
        instance.setParcelId(template.getParcelId());
        instance.setMeasurements(template.getMeasurements());
        return instance;
    }

    public static StagedOrderSetParcelMeasurementsActionBuilder builder() {
        return StagedOrderSetParcelMeasurementsActionBuilder.of();
    }

    public static StagedOrderSetParcelMeasurementsActionBuilder builder(
            final StagedOrderSetParcelMeasurementsAction template) {
        return StagedOrderSetParcelMeasurementsActionBuilder.of(template);
    }

    default <T> T withStagedOrderSetParcelMeasurementsAction(
            Function<StagedOrderSetParcelMeasurementsAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetParcelMeasurementsAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetParcelMeasurementsAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetParcelMeasurementsAction>";
            }
        };
    }
}
