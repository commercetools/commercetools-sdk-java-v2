package com.commercetools.api.models.inventory;

import com.commercetools.api.models.inventory.InventoryEntryUpdateAction;
import com.commercetools.api.models.inventory.InventoryEntryRemoveQuantityAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class InventoryEntryRemoveQuantityActionBuilder {
   
   
   private Long quantity;
   
   public InventoryEntryRemoveQuantityActionBuilder quantity( final Long quantity) {
      this.quantity = quantity;
      return this;
   }
   
   
   public Long getQuantity(){
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
