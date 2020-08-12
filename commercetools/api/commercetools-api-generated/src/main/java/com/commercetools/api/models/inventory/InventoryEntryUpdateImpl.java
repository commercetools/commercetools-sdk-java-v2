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
public final class InventoryEntryUpdateImpl implements InventoryEntryUpdate {

   private Long version;
   
   private java.util.List<com.commercetools.api.models.inventory.InventoryEntryUpdateAction> actions;

   @JsonCreator
   InventoryEntryUpdateImpl(@JsonProperty("version") final Long version, @JsonProperty("actions") final java.util.List<com.commercetools.api.models.inventory.InventoryEntryUpdateAction> actions) {
      this.version = version;
      this.actions = actions;
   }
   public InventoryEntryUpdateImpl() {
      
   }
   
   
   public Long getVersion(){
      return this.version;
   }
   
   
   public java.util.List<com.commercetools.api.models.inventory.InventoryEntryUpdateAction> getActions(){
      return this.actions;
   }

   public void setVersion(final Long version){
      this.version = version;
   }
   
   public void setActions(final java.util.List<com.commercetools.api.models.inventory.InventoryEntryUpdateAction> actions){
      this.actions = actions;
   }

}
