package com.commercetools.models.Message;

import com.commercetools.models.Message.MessagePayload;
import com.commercetools.models.Order.Parcel;
import java.lang.String;
import com.commercetools.models.Message.ParcelRemovedFromDeliveryMessagePayloadImpl;

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
@JsonDeserialize(as = ParcelRemovedFromDeliveryMessagePayloadImpl.class)
public interface ParcelRemovedFromDeliveryMessagePayload extends MessagePayload {

   
   @NotNull
   @JsonProperty("deliveryId")
   public String getDeliveryId();
   
   @NotNull
   @Valid
   @JsonProperty("parcel")
   public Parcel getParcel();

   public void setDeliveryId(final String deliveryId);
   
   public void setParcel(final Parcel parcel);
   
   public static ParcelRemovedFromDeliveryMessagePayloadImpl of(){
      return new ParcelRemovedFromDeliveryMessagePayloadImpl();
   }
   

   public static ParcelRemovedFromDeliveryMessagePayloadImpl of(final ParcelRemovedFromDeliveryMessagePayload template) {
      ParcelRemovedFromDeliveryMessagePayloadImpl instance = new ParcelRemovedFromDeliveryMessagePayloadImpl();
      instance.setParcel(template.getParcel());
      instance.setDeliveryId(template.getDeliveryId());
      return instance;
   }

}