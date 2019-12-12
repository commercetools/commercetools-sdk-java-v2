package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.common.Address;
import com.commercetools.api.generated.models.message.MessagePayload;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class DeliveryAddressSetMessagePayloadImpl implements DeliveryAddressSetMessagePayload {

   private String type;
   
   private com.commercetools.api.generated.models.common.Address oldAddress;
   
   private String deliveryId;
   
   private com.commercetools.api.generated.models.common.Address address;

   @JsonCreator
   DeliveryAddressSetMessagePayloadImpl(@JsonProperty("oldAddress") final com.commercetools.api.generated.models.common.Address oldAddress, @JsonProperty("deliveryId") final String deliveryId, @JsonProperty("address") final com.commercetools.api.generated.models.common.Address address) {
      this.oldAddress = oldAddress;
      this.deliveryId = deliveryId;
      this.address = address;
      this.type = "DeliveryAddressSet";
   }
   public DeliveryAddressSetMessagePayloadImpl() {
      
   }
   
   
   public String getType(){
      return this.type;
   }
   
   
   public com.commercetools.api.generated.models.common.Address getOldAddress(){
      return this.oldAddress;
   }
   
   
   public String getDeliveryId(){
      return this.deliveryId;
   }
   
   
   public com.commercetools.api.generated.models.common.Address getAddress(){
      return this.address;
   }

   public void setOldAddress(final com.commercetools.api.generated.models.common.Address oldAddress){
      this.oldAddress = oldAddress;
   }
   
   public void setDeliveryId(final String deliveryId){
      this.deliveryId = deliveryId;
   }
   
   public void setAddress(final com.commercetools.api.generated.models.common.Address address){
      this.address = address;
   }

}