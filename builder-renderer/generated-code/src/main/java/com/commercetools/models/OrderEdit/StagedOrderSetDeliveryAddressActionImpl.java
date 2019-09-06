package com.commercetools.models.OrderEdit;

import com.commercetools.models.Common.Address;
import com.commercetools.models.Order.StagedOrderUpdateAction;
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

import json.CommercetoolsJsonUtils;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class StagedOrderSetDeliveryAddressActionImpl implements StagedOrderSetDeliveryAddressAction {

   private java.lang.String action;
   
   private java.lang.String deliveryId;
   
   private com.commercetools.models.Common.Address address;

   @JsonCreator
   StagedOrderSetDeliveryAddressActionImpl(@JsonProperty("deliveryId") final java.lang.String deliveryId, @JsonProperty("address") final com.commercetools.models.Common.Address address) {
      this.deliveryId = deliveryId;
      this.address = address;
      this.action = "setDeliveryAddress";
   }
   public StagedOrderSetDeliveryAddressActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.String getDeliveryId(){
      return this.deliveryId;
   }
   
   
   public com.commercetools.models.Common.Address getAddress(){
      return this.address;
   }

   public void setDeliveryId(final java.lang.String deliveryId){
      this.deliveryId = deliveryId;
   }
   
   public void setAddress(final com.commercetools.models.Common.Address address){
      this.address = address;
   }

}