package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.order.Parcel;
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
public final class ParcelRemovedFromDeliveryMessagePayloadImpl implements ParcelRemovedFromDeliveryMessagePayload {

   private String type;
   
   private String deliveryId;
   
   private com.commercetools.api.models.order.Parcel parcel;

   @JsonCreator
   ParcelRemovedFromDeliveryMessagePayloadImpl(@JsonProperty("deliveryId") final String deliveryId, @JsonProperty("parcel") final com.commercetools.api.models.order.Parcel parcel) {
      this.deliveryId = deliveryId;
      this.parcel = parcel;
      this.type = "ParcelRemovedFromDelivery";
   }
   public ParcelRemovedFromDeliveryMessagePayloadImpl() {
      
   }
   
   
   public String getType(){
      return this.type;
   }
   
   
   public String getDeliveryId(){
      return this.deliveryId;
   }
   
   
   public com.commercetools.api.models.order.Parcel getParcel(){
      return this.parcel;
   }

   public void setDeliveryId(final String deliveryId){
      this.deliveryId = deliveryId;
   }
   
   public void setParcel(final com.commercetools.api.models.order.Parcel parcel){
      this.parcel = parcel;
   }

}
