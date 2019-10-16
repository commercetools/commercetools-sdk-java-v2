package com.commercetools.api.generated.models.inventory;

import com.commercetools.api.generated.models.inventory.InventoryEntryUpdateAction;
import java.time.ZonedDateTime;
import com.commercetools.api.generated.models.inventory.InventoryEntrySetExpectedDeliveryAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class InventoryEntrySetExpectedDeliveryActionBuilder {
   
   @Nullable
   private java.time.ZonedDateTime expectedDelivery;
   
   public InventoryEntrySetExpectedDeliveryActionBuilder expectedDelivery(@Nullable final java.time.ZonedDateTime expectedDelivery) {
      this.expectedDelivery = expectedDelivery;
      return this;
   }
   
   @Nullable
   public java.time.ZonedDateTime getExpectedDelivery(){
      return this.expectedDelivery;
   }

   public InventoryEntrySetExpectedDeliveryAction build() {
       return new InventoryEntrySetExpectedDeliveryActionImpl(expectedDelivery);
   }
   
   public static InventoryEntrySetExpectedDeliveryActionBuilder of() {
      return new InventoryEntrySetExpectedDeliveryActionBuilder();
   }
   
   public static InventoryEntrySetExpectedDeliveryActionBuilder of(final InventoryEntrySetExpectedDeliveryAction template) {
      InventoryEntrySetExpectedDeliveryActionBuilder builder = new InventoryEntrySetExpectedDeliveryActionBuilder();
      builder.expectedDelivery = template.getExpectedDelivery();
      return builder;
   }
   
}