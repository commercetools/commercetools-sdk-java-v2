package com.commercetools.models.ShoppingList;

import com.commercetools.models.ShoppingList.ShoppingList;
import java.lang.Long;
import com.commercetools.models.ShoppingList.ShoppingListPagedQueryResponse;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ShoppingListPagedQueryResponseBuilder {
   
   @Nullable
   private java.lang.Long total;
   
   
   private java.lang.Long offset;
   
   
   private java.lang.Long count;
   
   
   private java.util.List<com.commercetools.models.ShoppingList.ShoppingList> results;
   
   public ShoppingListPagedQueryResponseBuilder total(@Nullable final java.lang.Long total) {
      this.total = total;
      return this;
   }
   
   public ShoppingListPagedQueryResponseBuilder offset( final java.lang.Long offset) {
      this.offset = offset;
      return this;
   }
   
   public ShoppingListPagedQueryResponseBuilder count( final java.lang.Long count) {
      this.count = count;
      return this;
   }
   
   public ShoppingListPagedQueryResponseBuilder results( final java.util.List<com.commercetools.models.ShoppingList.ShoppingList> results) {
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
   
   
   public java.util.List<com.commercetools.models.ShoppingList.ShoppingList> getResults(){
      return this.results;
   }

   public ShoppingListPagedQueryResponse build() {
       return new ShoppingListPagedQueryResponseImpl(total, offset, count, results);
   }
   
   public static ShoppingListPagedQueryResponseBuilder of() {
      return new ShoppingListPagedQueryResponseBuilder();
   }
   
   public static ShoppingListPagedQueryResponseBuilder of(final ShoppingListPagedQueryResponse template) {
      ShoppingListPagedQueryResponseBuilder builder = new ShoppingListPagedQueryResponseBuilder();
      builder.total = template.getTotal();
      builder.offset = template.getOffset();
      builder.count = template.getCount();
      builder.results = template.getResults();
      return builder;
   }
   
}