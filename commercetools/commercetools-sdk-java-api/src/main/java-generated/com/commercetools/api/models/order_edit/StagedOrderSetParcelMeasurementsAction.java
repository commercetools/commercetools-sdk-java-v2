package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order.ParcelMeasurements;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.order_edit.StagedOrderSetParcelMeasurementsActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = StagedOrderSetParcelMeasurementsActionImpl.class)
public interface StagedOrderSetParcelMeasurementsAction extends StagedOrderUpdateAction {

    
    @NotNull
    @JsonProperty("parcelId")
    public String getParcelId();
    
    @Valid
    @JsonProperty("measurements")
    public ParcelMeasurements getMeasurements();

    public void setParcelId(final String parcelId);
    
    public void setMeasurements(final ParcelMeasurements measurements);

    public static StagedOrderSetParcelMeasurementsActionImpl of(){
        return new StagedOrderSetParcelMeasurementsActionImpl();
    }
    

    public static StagedOrderSetParcelMeasurementsActionImpl of(final StagedOrderSetParcelMeasurementsAction template) {
        StagedOrderSetParcelMeasurementsActionImpl instance = new StagedOrderSetParcelMeasurementsActionImpl();
        instance.setParcelId(template.getParcelId());
        instance.setMeasurements(template.getMeasurements());
        return instance;
    }

    default <T> T withStagedOrderSetParcelMeasurementsAction(Function<StagedOrderSetParcelMeasurementsAction, T> helper) {
        return helper.apply(this);
    }
}
