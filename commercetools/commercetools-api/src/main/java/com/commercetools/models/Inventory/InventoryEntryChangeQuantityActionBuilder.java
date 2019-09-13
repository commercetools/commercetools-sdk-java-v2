package com.commercetools.models.inventory;

import com.commercetools.models.inventory.InventoryEntryUpdateAction;
import java.lang.Long;
import java.lang.String;
import com.commercetools.models.inventory.InventoryEntryChangeQuantityAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class InventoryEntryChangeQuantityActionBuilder {
   
   
   private java.lang.Long quantity;
   
   public InventoryEntryChangeQuantityActionBuilder quantity( final java.lang.Long quantity) {
      this.quantity = quantity;
      return this;
   }
   
   
   public java.lang.Long getQuantity(){
      return this.quantity;
   }

   public InventoryEntryChangeQuantityAction build() {
       return new InventoryEntryChangeQuantityActionImpl(quantity);
   }
   
   public static InventoryEntryChangeQuantityActionBuilder of() {
      return new InventoryEntryChangeQuantityActionBuilder();
   }
   
   public static InventoryEntryChangeQuantityActionBuilder of(final InventoryEntryChangeQuantityAction template) {
      InventoryEntryChangeQuantityActionBuilder builder = new InventoryEntryChangeQuantityActionBuilder();
      builder.quantity = template.getQuantity();
      return builder;
   }
   
}