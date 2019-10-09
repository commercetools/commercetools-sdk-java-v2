package com.commercetools.models.message;

import com.commercetools.models.message.MessagePayload;
import com.commercetools.models.order.Delivery;
import com.commercetools.models.order.Parcel;
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

   private String type;
   
   private com.commercetools.models.order.Delivery delivery;
   
   private com.commercetools.models.order.Parcel parcel;

   @JsonCreator
   ParcelAddedToDeliveryMessagePayloadImpl(@JsonProperty("delivery") final com.commercetools.models.order.Delivery delivery, @JsonProperty("parcel") final com.commercetools.models.order.Parcel parcel) {
      this.delivery = delivery;
      this.parcel = parcel;
      this.type = "ParcelAddedToDelivery";
   }
   public ParcelAddedToDeliveryMessagePayloadImpl() {
      
   }
   
   
   public String getType(){
      return this.type;
   }
   
   
   public com.commercetools.models.order.Delivery getDelivery(){
      return this.delivery;
   }
   
   
   public com.commercetools.models.order.Parcel getParcel(){
      return this.parcel;
   }

   public void setDelivery(final com.commercetools.models.order.Delivery delivery){
      this.delivery = delivery;
   }
   
   public void setParcel(final com.commercetools.models.order.Parcel parcel){
      this.parcel = parcel;
   }

}