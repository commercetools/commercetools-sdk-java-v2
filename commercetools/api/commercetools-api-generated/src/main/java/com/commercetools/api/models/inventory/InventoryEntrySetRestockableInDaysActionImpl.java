package com.commercetools.api.models.inventory;

import com.commercetools.api.models.inventory.InventoryEntryUpdateAction;
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
public final class InventoryEntrySetRestockableInDaysActionImpl implements InventoryEntrySetRestockableInDaysAction {

   private String action;
   
   private Long restockableInDays;

   @JsonCreator
   InventoryEntrySetRestockableInDaysActionImpl(@JsonProperty("restockableInDays") final Long restockableInDays) {
      this.restockableInDays = restockableInDays;
      this.action = "setRestockableInDays";
   }
   public InventoryEntrySetRestockableInDaysActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public Long getRestockableInDays(){
      return this.restockableInDays;
   }

   public void setRestockableInDays(final Long restockableInDays){
      this.restockableInDays = restockableInDays;
   }

}
