package com.commercetools.models.inventory;

import com.commercetools.models.inventory.InventoryEntryUpdateAction;
import java.time.ZonedDateTime;
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
public final class InventoryEntrySetExpectedDeliveryActionImpl implements InventoryEntrySetExpectedDeliveryAction {

   private String action;
   
   private java.time.ZonedDateTime expectedDelivery;

   @JsonCreator
   InventoryEntrySetExpectedDeliveryActionImpl(@JsonProperty("expectedDelivery") final java.time.ZonedDateTime expectedDelivery) {
      this.expectedDelivery = expectedDelivery;
      this.action = "setExpectedDelivery";
   }
   public InventoryEntrySetExpectedDeliveryActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public java.time.ZonedDateTime getExpectedDelivery(){
      return this.expectedDelivery;
   }

   public void setExpectedDelivery(final java.time.ZonedDateTime expectedDelivery){
      this.expectedDelivery = expectedDelivery;
   }

}