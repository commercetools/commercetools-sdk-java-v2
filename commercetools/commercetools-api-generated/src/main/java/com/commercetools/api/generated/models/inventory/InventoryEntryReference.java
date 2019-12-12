package com.commercetools.api.generated.models.inventory;

import com.commercetools.api.generated.models.common.Reference;
import com.commercetools.api.generated.models.common.ReferenceTypeId;
import com.commercetools.api.generated.models.inventory.InventoryEntry;
import com.commercetools.api.generated.models.inventory.InventoryEntryReferenceImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = InventoryEntryReferenceImpl.class)
public interface InventoryEntryReference extends Reference {

   
   @Valid
   @JsonProperty("obj")
   public InventoryEntry getObj();

   public void setObj(final InventoryEntry obj);
   
   public static InventoryEntryReferenceImpl of(){
      return new InventoryEntryReferenceImpl();
   }
   

   public static InventoryEntryReferenceImpl of(final InventoryEntryReference template) {
      InventoryEntryReferenceImpl instance = new InventoryEntryReferenceImpl();
      instance.setId(template.getId());
      instance.setObj(template.getObj());
      return instance;
   }

}