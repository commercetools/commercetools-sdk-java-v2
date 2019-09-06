package com.commercetools.models.Inventory;

import com.commercetools.models.Common.ReferenceTypeId;
import com.commercetools.models.Common.ResourceIdentifier;
import com.commercetools.models.Inventory.InventoryEntryResourceIdentifier;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class InventoryEntryResourceIdentifierBuilder {
   
   @Nullable
   private java.lang.String id;
   
   @Nullable
   private java.lang.String key;
   
   public InventoryEntryResourceIdentifierBuilder id(@Nullable final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public InventoryEntryResourceIdentifierBuilder key(@Nullable final java.lang.String key) {
      this.key = key;
      return this;
   }
   
   @Nullable
   public java.lang.String getId(){
      return this.id;
   }
   
   @Nullable
   public java.lang.String getKey(){
      return this.key;
   }

   public InventoryEntryResourceIdentifier build() {
       return new InventoryEntryResourceIdentifierImpl(id, key);
   }
   
   public static InventoryEntryResourceIdentifierBuilder of() {
      return new InventoryEntryResourceIdentifierBuilder();
   }
   
   public static InventoryEntryResourceIdentifierBuilder of(final InventoryEntryResourceIdentifier template) {
      InventoryEntryResourceIdentifierBuilder builder = new InventoryEntryResourceIdentifierBuilder();
      builder.id = template.getId();
      builder.key = template.getKey();
      return builder;
   }
   
}