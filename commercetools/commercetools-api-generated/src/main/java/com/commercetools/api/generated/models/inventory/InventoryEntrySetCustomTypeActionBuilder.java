package com.commercetools.api.generated.models.inventory;

import com.commercetools.api.generated.models.inventory.InventoryEntryUpdateAction;
import com.commercetools.api.generated.models.type.FieldContainer;
import com.commercetools.api.generated.models.type.TypeResourceIdentifier;
import com.commercetools.api.generated.models.inventory.InventoryEntrySetCustomTypeAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class InventoryEntrySetCustomTypeActionBuilder {
   
   @Nullable
   private com.commercetools.api.generated.models.type.FieldContainer fields;
   
   @Nullable
   private com.commercetools.api.generated.models.type.TypeResourceIdentifier type;
   
   public InventoryEntrySetCustomTypeActionBuilder fields(@Nullable final com.commercetools.api.generated.models.type.FieldContainer fields) {
      this.fields = fields;
      return this;
   }
   
   public InventoryEntrySetCustomTypeActionBuilder type(@Nullable final com.commercetools.api.generated.models.type.TypeResourceIdentifier type) {
      this.type = type;
      return this;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.type.FieldContainer getFields(){
      return this.fields;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.type.TypeResourceIdentifier getType(){
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