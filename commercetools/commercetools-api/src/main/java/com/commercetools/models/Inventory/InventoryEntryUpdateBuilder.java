package com.commercetools.models.Inventory;

import com.commercetools.models.Inventory.InventoryEntryUpdateAction;
import java.lang.Long;
import com.commercetools.models.Inventory.InventoryEntryUpdate;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class InventoryEntryUpdateBuilder {
   
   
   private java.util.List<com.commercetools.models.Inventory.InventoryEntryUpdateAction> actions;
   
   
   private java.lang.Long version;
   
   public InventoryEntryUpdateBuilder actions( final java.util.List<com.commercetools.models.Inventory.InventoryEntryUpdateAction> actions) {
      this.actions = actions;
      return this;
   }
   
   public InventoryEntryUpdateBuilder version( final java.lang.Long version) {
      this.version = version;
      return this;
   }
   
   
   public java.util.List<com.commercetools.models.Inventory.InventoryEntryUpdateAction> getActions(){
      return this.actions;
   }
   
   
   public java.lang.Long getVersion(){
      return this.version;
   }

   public InventoryEntryUpdate build() {
       return new InventoryEntryUpdateImpl(actions, version);
   }
   
   public static InventoryEntryUpdateBuilder of() {
      return new InventoryEntryUpdateBuilder();
   }
   
   public static InventoryEntryUpdateBuilder of(final InventoryEntryUpdate template) {
      InventoryEntryUpdateBuilder builder = new InventoryEntryUpdateBuilder();
      builder.actions = template.getActions();
      builder.version = template.getVersion();
      return builder;
   }
   
}