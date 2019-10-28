package com.commercetools.api.generated.models.order_edit;

import com.commercetools.api.generated.models.order.StagedOrderUpdateAction;
import com.commercetools.api.generated.models.order.TrackingData;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetParcelTrackingDataActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = StagedOrderSetParcelTrackingDataActionImpl.class)
public interface StagedOrderSetParcelTrackingDataAction extends StagedOrderUpdateAction {

   
   @NotNull
   @JsonProperty("parcelId")
   public String getParcelId();
   
   @Valid
   @JsonProperty("trackingData")
   public TrackingData getTrackingData();

   public void setParcelId(final String parcelId);
   
   public void setTrackingData(final TrackingData trackingData);
   
   public static StagedOrderSetParcelTrackingDataActionImpl of(){
      return new StagedOrderSetParcelTrackingDataActionImpl();
   }
   

   public static StagedOrderSetParcelTrackingDataActionImpl of(final StagedOrderSetParcelTrackingDataAction template) {
      StagedOrderSetParcelTrackingDataActionImpl instance = new StagedOrderSetParcelTrackingDataActionImpl();
      instance.setTrackingData(template.getTrackingData());
      instance.setParcelId(template.getParcelId());
      return instance;
   }

}