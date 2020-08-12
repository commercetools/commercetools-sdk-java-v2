package com.commercetools.api.models.inventory;

import com.commercetools.api.models.inventory.InventoryEntryUpdateAction;
import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.api.models.inventory.InventoryEntrySetCustomFieldActionImpl;

import com.fasterxml.jackson.annotation.*;
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
@JsonDeserialize(as = InventoryEntrySetCustomFieldActionImpl.class)
public interface InventoryEntrySetCustomFieldAction extends InventoryEntryUpdateAction {

   
   @NotNull
   @JsonProperty("name")
   public String getName();
   
   
   @JsonProperty("value")
   public JsonNode getValue();

   public void setName(final String name);
   
   public void setValue(final JsonNode value);
   
   public static InventoryEntrySetCustomFieldActionImpl of(){
      return new InventoryEntrySetCustomFieldActionImpl();
   }
   

   public static InventoryEntrySetCustomFieldActionImpl of(final InventoryEntrySetCustomFieldAction template) {
      InventoryEntrySetCustomFieldActionImpl instance = new InventoryEntrySetCustomFieldActionImpl();
      instance.setName(template.getName());
      instance.setValue(template.getValue());
      return instance;
   }

}
