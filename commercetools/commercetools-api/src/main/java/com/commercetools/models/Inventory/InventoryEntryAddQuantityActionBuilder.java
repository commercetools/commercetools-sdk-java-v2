package com.commercetools.models.inventory;

import com.commercetools.models.inventory.InventoryEntryUpdateAction;
import java.lang.Long;
import java.lang.String;
import com.commercetools.models.inventory.InventoryEntryAddQuantityAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class InventoryEntryAddQuantityActionBuilder {
   
   
   private java.lang.Long quantity;
   
   public InventoryEntryAddQuantityActionBuilder quantity( final java.lang.Long quantity) {
      this.quantity = quantity;
      return this;
   }
   
   
   public java.lang.Long getQuantity(){
      return this.quantity;
   }

   public InventoryEntryAddQuantityAction build() {
       return new InventoryEntryAddQuantityActionImpl(quantity);
   }
   
   public static InventoryEntryAddQuantityActionBuilder of() {
      return new InventoryEntryAddQuantityActionBuilder();
   }
   
   public static InventoryEntryAddQuantityActionBuilder of(final InventoryEntryAddQuantityAction template) {
      InventoryEntryAddQuantityActionBuilder builder = new InventoryEntryAddQuantityActionBuilder();
      builder.quantity = template.getQuantity();
      return builder;
   }
   
}