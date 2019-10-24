package com.commercetools.api.generated.models.inventory;

import com.commercetools.api.generated.models.inventory.InventoryEntryUpdateAction;
import com.commercetools.api.generated.models.inventory.InventoryEntrySetCustomFieldAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class InventoryEntrySetCustomFieldActionBuilder {
   
   
   private String name;
   
   @Nullable
   private Object value;
   
   public InventoryEntrySetCustomFieldActionBuilder name( final String name) {
      this.name = name;
      return this;
   }
   
   public InventoryEntrySetCustomFieldActionBuilder value(@Nullable final Object value) {
      this.value = value;
      return this;
   }
   
   
   public String getName(){
      return this.name;
   }
   
   @Nullable
   public Object getValue(){
      return this.value;
   }

   public InventoryEntrySetCustomFieldAction build() {
       return new InventoryEntrySetCustomFieldActionImpl(name, value);
   }
   
   public static InventoryEntrySetCustomFieldActionBuilder of() {
      return new InventoryEntrySetCustomFieldActionBuilder();
   }
   
   public static InventoryEntrySetCustomFieldActionBuilder of(final InventoryEntrySetCustomFieldAction template) {
      InventoryEntrySetCustomFieldActionBuilder builder = new InventoryEntrySetCustomFieldActionBuilder();
      builder.name = template.getName();
      builder.value = template.getValue();
      return builder;
   }
   
}