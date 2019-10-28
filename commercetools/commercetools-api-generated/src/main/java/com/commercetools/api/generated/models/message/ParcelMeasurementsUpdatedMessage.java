package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.message.Message;
import com.commercetools.api.generated.models.order.ParcelMeasurements;
import com.commercetools.api.generated.models.message.ParcelMeasurementsUpdatedMessageImpl;

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
@JsonDeserialize(as = ParcelMeasurementsUpdatedMessageImpl.class)
public interface ParcelMeasurementsUpdatedMessage extends Message {

   
   @NotNull
   @JsonProperty("deliveryId")
   public String getDeliveryId();
   
   @NotNull
   @JsonProperty("parcelId")
   public String getParcelId();
   
   @Valid
   @JsonProperty("measurements")
   public ParcelMeasurements getMeasurements();

   public void setDeliveryId(final String deliveryId);
   
   public void setParcelId(final String parcelId);
   
   public void setMeasurements(final ParcelMeasurements measurements);
   
   public static ParcelMeasurementsUpdatedMessageImpl of(){
      return new ParcelMeasurementsUpdatedMessageImpl();
   }
   

   public static ParcelMeasurementsUpdatedMessageImpl of(final ParcelMeasurementsUpdatedMessage template) {
      ParcelMeasurementsUpdatedMessageImpl instance = new ParcelMeasurementsUpdatedMessageImpl();
      instance.setCreatedAt(template.getCreatedAt());
      instance.setLastModifiedAt(template.getLastModifiedAt());
      instance.setId(template.getId());
      instance.setVersion(template.getVersion());
      instance.setCreatedBy(template.getCreatedBy());
      instance.setLastModifiedBy(template.getLastModifiedBy());
      instance.setSequenceNumber(template.getSequenceNumber());
      instance.setResource(template.getResource());
      instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
      instance.setResourceVersion(template.getResourceVersion());
      instance.setDeliveryId(template.getDeliveryId());
      instance.setMeasurements(template.getMeasurements());
      instance.setParcelId(template.getParcelId());
      return instance;
   }

}