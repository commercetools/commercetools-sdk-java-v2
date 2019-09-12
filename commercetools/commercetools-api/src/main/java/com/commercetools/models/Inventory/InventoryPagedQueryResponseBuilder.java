package com.commercetools.models.Inventory;

import com.commercetools.models.Inventory.InventoryEntry;
import java.lang.Long;
import com.commercetools.models.Inventory.InventoryPagedQueryResponse;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class InventoryPagedQueryResponseBuilder {
   
   @Nullable
   private java.lang.Long total;
   
   
   private java.lang.Long offset;
   
   
   private java.lang.Long count;
   
   
   private java.util.List<com.commercetools.models.Inventory.InventoryEntry> results;
   
   public InventoryPagedQueryResponseBuilder total(@Nullable final java.lang.Long total) {
      this.total = total;
      return this;
   }
   
   public InventoryPagedQueryResponseBuilder offset( final java.lang.Long offset) {
      this.offset = offset;
      return this;
   }
   
   public InventoryPagedQueryResponseBuilder count( final java.lang.Long count) {
      this.count = count;
      return this;
   }
   
   public InventoryPagedQueryResponseBuilder results( final java.util.List<com.commercetools.models.Inventory.InventoryEntry> results) {
      this.results = results;
      return this;
   }
   
   @Nullable
   public java.lang.Long getTotal(){
      return this.total;
   }
   
   
   public java.lang.Long getOffset(){
      return this.offset;
   }
   
   
   public java.lang.Long getCount(){
      return this.count;
   }
   
   
   public java.util.List<com.commercetools.models.Inventory.InventoryEntry> getResults(){
      return this.results;
   }

   public InventoryPagedQueryResponse build() {
       return new InventoryPagedQueryResponseImpl(total, offset, count, results);
   }
   
   public static InventoryPagedQueryResponseBuilder of() {
      return new InventoryPagedQueryResponseBuilder();
   }
   
   public static InventoryPagedQueryResponseBuilder of(final InventoryPagedQueryResponse template) {
      InventoryPagedQueryResponseBuilder builder = new InventoryPagedQueryResponseBuilder();
      builder.total = template.getTotal();
      builder.offset = template.getOffset();
      builder.count = template.getCount();
      builder.results = template.getResults();
      return builder;
   }
   
}