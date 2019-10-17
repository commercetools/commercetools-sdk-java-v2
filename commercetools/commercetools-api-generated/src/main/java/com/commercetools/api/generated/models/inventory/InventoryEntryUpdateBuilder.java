package com.commercetools.api.generated.models.inventory;

import com.commercetools.api.generated.models.inventory.InventoryEntryUpdateAction;
import com.commercetools.api.generated.models.inventory.InventoryEntryUpdate;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class InventoryEntryUpdateBuilder {
   
   
   private java.util.List<com.commercetools.api.generated.models.inventory.InventoryEntryUpdateAction> actions;
   
   
   private Long version;
   
   public InventoryEntryUpdateBuilder actions( final java.util.List<com.commercetools.api.generated.models.inventory.InventoryEntryUpdateAction> actions) {
      this.actions = actions;
      return this;
   }
   
   public InventoryEntryUpdateBuilder version( final Long version) {
      this.version = version;
      return this;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.inventory.InventoryEntryUpdateAction> getActions(){
      return this.actions;
   }
   
   
   public Long getVersion(){
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