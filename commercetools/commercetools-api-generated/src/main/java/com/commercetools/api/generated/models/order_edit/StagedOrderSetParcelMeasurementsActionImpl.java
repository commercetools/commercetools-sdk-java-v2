package com.commercetools.api.generated.models.order_edit;

import com.commercetools.api.generated.models.order.ParcelMeasurements;
import com.commercetools.api.generated.models.order.StagedOrderUpdateAction;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class StagedOrderSetParcelMeasurementsActionImpl implements StagedOrderSetParcelMeasurementsAction {

   private String action;
   
   private com.commercetools.api.generated.models.order.ParcelMeasurements measurements;
   
   private String parcelId;

   @JsonCreator
   StagedOrderSetParcelMeasurementsActionImpl(@JsonProperty("measurements") final com.commercetools.api.generated.models.order.ParcelMeasurements measurements, @JsonProperty("parcelId") final String parcelId) {
      this.measurements = measurements;
      this.parcelId = parcelId;
      this.action = "setParcelMeasurements";
   }
   public StagedOrderSetParcelMeasurementsActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.api.generated.models.order.ParcelMeasurements getMeasurements(){
      return this.measurements;
   }
   
   
   public String getParcelId(){
      return this.parcelId;
   }

   public void setMeasurements(final com.commercetools.api.generated.models.order.ParcelMeasurements measurements){
      this.measurements = measurements;
   }
   
   public void setParcelId(final String parcelId){
      this.parcelId = parcelId;
   }

}