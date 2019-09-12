package com.commercetools.models.Message;

import com.commercetools.models.Message.MessagePayload;
import com.commercetools.models.Order.Delivery;
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
public final class ParcelAddedToDeliveryMessagePayloadImpl implements ParcelAddedToDeliveryMessagePayload {

   private java.lang.String type;
   
   private com.commercetools.models.Order.Delivery delivery;
   
   private com.commercetools.models.Order.Parcel parcel;

   @JsonCreator
   ParcelAddedToDeliveryMessagePayloadImpl(@JsonProperty("delivery") final com.commercetools.models.Order.Delivery delivery, @JsonProperty("parcel") final com.commercetools.models.Order.Parcel parcel) {
      this.delivery = delivery;
      this.parcel = parcel;
      this.type = "ParcelAddedToDelivery";
   }
   public ParcelAddedToDeliveryMessagePayloadImpl() {
      
   }
   
   
   public java.lang.String getType(){
      return this.type;
   }
   
   
   public com.commercetools.models.Order.Delivery getDelivery(){
      return this.delivery;
   }
   
   
   public com.commercetools.models.Order.Parcel getParcel(){
      return this.parcel;
   }

   public void setDelivery(final com.commercetools.models.Order.Delivery delivery){
      this.delivery = delivery;
   }
   
   public void setParcel(final com.commercetools.models.Order.Parcel parcel){
      this.parcel = parcel;
   }

}