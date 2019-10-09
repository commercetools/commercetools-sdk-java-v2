package com.commercetools.models.inventory;

import com.commercetools.models.inventory.InventoryEntryUpdateAction;
import com.commercetools.models.inventory.InventoryEntryAddQuantityAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class InventoryEntryAddQuantityActionBuilder {
   
   
   private Long quantity;
   
   public InventoryEntryAddQuantityActionBuilder quantity( final Long quantity) {
      this.quantity = quantity;
      return this;
   }
   
   
   public Long getQuantity(){
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