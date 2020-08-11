package com.commercetools.api.models.inventory;

import com.commercetools.api.models.inventory.InventoryEntryUpdateAction;
import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.commercetools.api.models.inventory.InventoryEntrySetCustomTypeActionImpl;

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
@JsonDeserialize(as = InventoryEntrySetCustomTypeActionImpl.class)
public interface InventoryEntrySetCustomTypeAction extends InventoryEntryUpdateAction {

   /**
   *  <p>If absent, the custom type and any existing CustomFields are removed.</p>
   */
   @Valid
   @JsonProperty("type")
   public TypeResourceIdentifier getType();
   /**
   *  <p>A valid JSON object, based on the FieldDefinitions of the Type.
   *  Sets the custom fields to this value.</p>
   */
   @Valid
   @JsonProperty("fields")
   public FieldContainer getFields();

   public void setType(final TypeResourceIdentifier type);

   public void setFields(final FieldContainer fields);

   public static InventoryEntrySetCustomTypeActionImpl of(){
      return new InventoryEntrySetCustomTypeActionImpl();
   }


   public static InventoryEntrySetCustomTypeActionImpl of(final InventoryEntrySetCustomTypeAction template) {
      InventoryEntrySetCustomTypeActionImpl instance = new InventoryEntrySetCustomTypeActionImpl();
      instance.setFields(template.getFields());
      instance.setType(template.getType());
      return instance;
   }

}
