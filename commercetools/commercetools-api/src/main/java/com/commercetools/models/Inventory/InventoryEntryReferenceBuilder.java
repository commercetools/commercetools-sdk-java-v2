package com.commercetools.models.inventory;

import com.commercetools.models.common.Reference;
import com.commercetools.models.common.ReferenceTypeId;
import com.commercetools.models.inventory.InventoryEntry;
import com.commercetools.models.inventory.InventoryEntryReference;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class InventoryEntryReferenceBuilder {
   
   
   private java.lang.String id;
   
   @Nullable
   private com.commercetools.models.inventory.InventoryEntry obj;
   
   public InventoryEntryReferenceBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public InventoryEntryReferenceBuilder obj(@Nullable final com.commercetools.models.inventory.InventoryEntry obj) {
      this.obj = obj;
      return this;
   }
   
   
   public java.lang.String getId(){
      return this.id;
   }
   
   @Nullable
   public com.commercetools.models.inventory.InventoryEntry getObj(){
      return this.obj;
   }

   public InventoryEntryReference build() {
       return new InventoryEntryReferenceImpl(id, obj);
   }
   
   public static InventoryEntryReferenceBuilder of() {
      return new InventoryEntryReferenceBuilder();
   }
   
   public static InventoryEntryReferenceBuilder of(final InventoryEntryReference template) {
      InventoryEntryReferenceBuilder builder = new InventoryEntryReferenceBuilder();
      builder.id = template.getId();
      builder.obj = template.getObj();
      return builder;
   }
   
}