package com.commercetools.models.Inventory;

import com.commercetools.models.Inventory.InventoryEntryUpdateAction;
import java.lang.Long;
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
public final class InventoryEntryAddQuantityActionImpl implements InventoryEntryAddQuantityAction {

   private java.lang.String action;
   
   private java.lang.Long quantity;

   @JsonCreator
   InventoryEntryAddQuantityActionImpl(@JsonProperty("quantity") final java.lang.Long quantity) {
      this.quantity = quantity;
      this.action = "addQuantity";
   }
   public InventoryEntryAddQuantityActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.Long getQuantity(){
      return this.quantity;
   }

   public void setQuantity(final java.lang.Long quantity){
      this.quantity = quantity;
   }

}