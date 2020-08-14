package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderUpdateAction;
import com.commercetools.api.models.order.ParcelMeasurements;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderSetParcelMeasurementsActionImpl implements OrderSetParcelMeasurementsAction {

    private String action;
    
    private String parcelId;
    
    private com.commercetools.api.models.order.ParcelMeasurements measurements;

    @JsonCreator
    OrderSetParcelMeasurementsActionImpl(@JsonProperty("parcelId") final String parcelId, @JsonProperty("measurements") final com.commercetools.api.models.order.ParcelMeasurements measurements) {
        this.parcelId = parcelId;
        this.measurements = measurements;
        this.action = "setParcelMeasurements";
    }
    public OrderSetParcelMeasurementsActionImpl() {
       
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public String getParcelId(){
        return this.parcelId;
    }
    
    
    public com.commercetools.api.models.order.ParcelMeasurements getMeasurements(){
        return this.measurements;
    }

    public void setParcelId(final String parcelId){
        this.parcelId = parcelId;
    }
    
    public void setMeasurements(final com.commercetools.api.models.order.ParcelMeasurements measurements){
        this.measurements = measurements;
    }

}
