package com.commercetools.models.Inventory;

import com.commercetools.models.Inventory.InventoryEntryUpdateAction;
import com.commercetools.models.Type.FieldContainer;
import com.commercetools.models.Type.TypeResourceIdentifier;
import java.lang.String;
import com.commercetools.models.Inventory.InventoryEntrySetCustomTypeAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class InventoryEntrySetCustomTypeActionBuilder {
   
   @Nullable
   private com.commercetools.models.Type.FieldContainer fields;
   
   @Nullable
   private com.commercetools.models.Type.TypeResourceIdentifier type;
   
   public InventoryEntrySetCustomTypeActionBuilder fields(@Nullable final com.commercetools.models.Type.FieldContainer fields) {
      this.fields = fields;
      return this;
   }
   
   public InventoryEntrySetCustomTypeActionBuilder type(@Nullable final com.commercetools.models.Type.TypeResourceIdentifier type) {
      this.type = type;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.Type.FieldContainer getFields(){
      return this.fields;
   }
   
   @Nullable
   public com.commercetools.models.Type.TypeResourceIdentifier getType(){
      return this.type;
   }

   public InventoryEntrySetCustomTypeAction build() {
       return new InventoryEntrySetCustomTypeActionImpl(fields, type);
   }
   
   public static InventoryEntrySetCustomTypeActionBuilder of() {
      return new InventoryEntrySetCustomTypeActionBuilder();
   }
   
   public static InventoryEntrySetCustomTypeActionBuilder of(final InventoryEntrySetCustomTypeAction template) {
      InventoryEntrySetCustomTypeActionBuilder builder = new InventoryEntrySetCustomTypeActionBuilder();
      builder.fields = template.getFields();
      builder.type = template.getType();
      return builder;
   }
   
}