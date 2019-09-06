package com.commercetools.models.Order;

import com.commercetools.models.Order.OrderUpdateAction;
import com.commercetools.models.Order.ParcelMeasurements;
import java.lang.String;
import com.commercetools.models.Order.OrderSetParcelMeasurementsActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import json.CommercetoolsJsonUtils;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = OrderSetParcelMeasurementsActionImpl.class)
public interface OrderSetParcelMeasurementsAction extends OrderUpdateAction {

   
   @NotNull
   @JsonProperty("parcelId")
   public String getParcelId();
   
   @Valid
   @JsonProperty("measurements")
   public ParcelMeasurements getMeasurements();

   public void setParcelId(final String parcelId);
   
   public void setMeasurements(final ParcelMeasurements measurements);
   
   public static OrderSetParcelMeasurementsActionImpl of(){
      return new OrderSetParcelMeasurementsActionImpl();
   }
   

   public static OrderSetParcelMeasurementsActionImpl of(final OrderSetParcelMeasurementsAction template) {
      OrderSetParcelMeasurementsActionImpl instance = new OrderSetParcelMeasurementsActionImpl();
      instance.setMeasurements(template.getMeasurements());
      instance.setParcelId(template.getParcelId());
      return instance;
   }

}