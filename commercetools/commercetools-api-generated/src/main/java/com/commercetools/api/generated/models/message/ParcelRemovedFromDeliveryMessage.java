package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.message.Message;
import com.commercetools.api.generated.models.order.Parcel;
import com.commercetools.api.generated.models.message.ParcelRemovedFromDeliveryMessageImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
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
@JsonDeserialize(as = ParcelRemovedFromDeliveryMessageImpl.class)
public interface ParcelRemovedFromDeliveryMessage extends Message {

   
   @NotNull
   @JsonProperty("deliveryId")
   public String getDeliveryId();
   
   @NotNull
   @Valid
   @JsonProperty("parcel")
   public Parcel getParcel();

   public void setDeliveryId(final String deliveryId);
   
   public void setParcel(final Parcel parcel);
   
   public static ParcelRemovedFromDeliveryMessageImpl of(){
      return new ParcelRemovedFromDeliveryMessageImpl();
   }
   

   public static ParcelRemovedFromDeliveryMessageImpl of(final ParcelRemovedFromDeliveryMessage template) {
      ParcelRemovedFromDeliveryMessageImpl instance = new ParcelRemovedFromDeliveryMessageImpl();
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
      instance.setParcel(template.getParcel());
      instance.setDeliveryId(template.getDeliveryId());
      return instance;
   }

}