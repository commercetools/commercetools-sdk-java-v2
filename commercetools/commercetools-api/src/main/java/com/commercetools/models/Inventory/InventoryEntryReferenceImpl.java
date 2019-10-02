package com.commercetools.models.inventory;

import com.commercetools.models.common.Reference;
import com.commercetools.models.common.ReferenceTypeId;
import com.commercetools.models.inventory.InventoryEntry;
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
public final class InventoryEntryReferenceImpl implements InventoryEntryReference {

   private com.commercetools.models.common.ReferenceTypeId typeId;
   
   private String id;
   
   private com.commercetools.models.inventory.InventoryEntry obj;

   @JsonCreator
   InventoryEntryReferenceImpl(@JsonProperty("id") final String id, @JsonProperty("obj") final com.commercetools.models.inventory.InventoryEntry obj) {
      this.id = id;
      this.obj = obj;
      this.typeId = ReferenceTypeId.findEnumViaJsonName("inventory-entry").get();
   }
   public InventoryEntryReferenceImpl() {
      
   }
   
   
   public com.commercetools.models.common.ReferenceTypeId getTypeId(){
      return this.typeId;
   }
   
   
   public String getId(){
      return this.id;
   }
   
   
   public com.commercetools.models.inventory.InventoryEntry getObj(){
      return this.obj;
   }

   public void setId(final String id){
      this.id = id;
   }
   
   public void setObj(final com.commercetools.models.inventory.InventoryEntry obj){
      this.obj = obj;
   }

}