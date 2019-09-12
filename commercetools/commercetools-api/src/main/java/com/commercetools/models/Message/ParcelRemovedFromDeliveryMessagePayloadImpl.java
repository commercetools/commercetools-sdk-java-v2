package com.commercetools.models.Message;

import com.commercetools.models.Message.MessagePayload;
import com.commercetools.models.Order.Parcel;
import java.lang.String;
import javax.annotation.Generated;
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
public final class ParcelRemovedFromDeliveryMessagePayloadImpl implements ParcelRemovedFromDeliveryMessagePayload {

   private java.lang.String type;
   
   private com.commercetools.models.Order.Parcel parcel;
   
   private java.lang.String deliveryId;

   @JsonCreator
   ParcelRemovedFromDeliveryMessagePayloadImpl(@JsonProperty("parcel") final com.commercetools.models.Order.Parcel parcel, @JsonProperty("deliveryId") final java.lang.String deliveryId) {
      this.parcel = parcel;
      this.deliveryId = deliveryId;
      this.type = "ParcelRemovedFromDelivery";
   }
   public ParcelRemovedFromDeliveryMessagePayloadImpl() {
      
   }
   
   
   public java.lang.String getType(){
      return this.type;
   }
   
   
   public com.commercetools.models.Order.Parcel getParcel(){
      return this.parcel;
   }
   
   
   public java.lang.String getDeliveryId(){
      return this.deliveryId;
   }

   public void setParcel(final com.commercetools.models.Order.Parcel parcel){
      this.parcel = parcel;
   }
   
   public void setDeliveryId(final java.lang.String deliveryId){
      this.deliveryId = deliveryId;
   }

}