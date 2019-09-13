package com.commercetools.models.inventory;

import com.commercetools.models.inventory.InventoryEntryUpdateAction;
import java.lang.Long;
import java.lang.String;
import com.commercetools.models.inventory.InventoryEntrySetRestockableInDaysAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class InventoryEntrySetRestockableInDaysActionBuilder {
   
   @Nullable
   private java.lang.Long restockableInDays;
   
   public InventoryEntrySetRestockableInDaysActionBuilder restockableInDays(@Nullable final java.lang.Long restockableInDays) {
      this.restockableInDays = restockableInDays;
      return this;
   }
   
   @Nullable
   public java.lang.Long getRestockableInDays(){
      return this.restockableInDays;
   }

   public InventoryEntrySetRestockableInDaysAction build() {
       return new InventoryEntrySetRestockableInDaysActionImpl(restockableInDays);
   }
   
   public static InventoryEntrySetRestockableInDaysActionBuilder of() {
      return new InventoryEntrySetRestockableInDaysActionBuilder();
   }
   
   public static InventoryEntrySetRestockableInDaysActionBuilder of(final InventoryEntrySetRestockableInDaysAction template) {
      InventoryEntrySetRestockableInDaysActionBuilder builder = new InventoryEntrySetRestockableInDaysActionBuilder();
      builder.restockableInDays = template.getRestockableInDays();
      return builder;
   }
   
}