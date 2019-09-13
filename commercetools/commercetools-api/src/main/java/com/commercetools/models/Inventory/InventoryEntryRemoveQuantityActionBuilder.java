package com.commercetools.models.inventory;

import com.commercetools.models.inventory.InventoryEntryUpdateAction;
import java.lang.Long;
import java.lang.String;
import com.commercetools.models.inventory.InventoryEntryRemoveQuantityAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class InventoryEntryRemoveQuantityActionBuilder {
   
   
   private java.lang.Long quantity;
   
   public InventoryEntryRemoveQuantityActionBuilder quantity( final java.lang.Long quantity) {
      this.quantity = quantity;
      return this;
   }
   
   
   public java.lang.Long getQuantity(){
      return this.quantity;
   }

   public InventoryEntryRemoveQuantityAction build() {
       return new InventoryEntryRemoveQuantityActionImpl(quantity);
   }
   
   public static InventoryEntryRemoveQuantityActionBuilder of() {
      return new InventoryEntryRemoveQuantityActionBuilder();
   }
   
   public static InventoryEntryRemoveQuantityActionBuilder of(final InventoryEntryRemoveQuantityAction template) {
      InventoryEntryRemoveQuantityActionBuilder builder = new InventoryEntryRemoveQuantityActionBuilder();
      builder.quantity = template.getQuantity();
      return builder;
   }
   
}