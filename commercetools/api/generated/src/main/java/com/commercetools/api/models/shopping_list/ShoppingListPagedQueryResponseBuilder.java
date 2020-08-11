package com.commercetools.api.models.shopping_list;

import com.commercetools.api.models.shopping_list.ShoppingList;
import com.commercetools.api.models.shopping_list.ShoppingListPagedQueryResponse;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ShoppingListPagedQueryResponseBuilder {

   @Nullable
   private Long total;


   private Long offset;


   private Long count;


   private Long limit;


   private java.util.List<com.commercetools.api.models.shopping_list.ShoppingList> results;

   public ShoppingListPagedQueryResponseBuilder total(@Nullable final Long total) {
      this.total = total;
      return this;
   }

   public ShoppingListPagedQueryResponseBuilder offset( final Long offset) {
      this.offset = offset;
      return this;
   }

   public ShoppingListPagedQueryResponseBuilder count( final Long count) {
      this.count = count;
      return this;
   }

   public ShoppingListPagedQueryResponseBuilder limit( final Long limit) {
      this.limit = limit;
      return this;
   }

   public ShoppingListPagedQueryResponseBuilder results( final java.util.List<com.commercetools.api.models.shopping_list.ShoppingList> results) {
      this.results = results;
      return this;
   }

   @Nullable
   public Long getTotal(){
      return this.total;
   }


   public Long getOffset(){
      return this.offset;
   }


   public Long getCount(){
      return this.count;
   }


   public Long getLimit(){
      return this.limit;
   }


   public java.util.List<com.commercetools.api.models.shopping_list.ShoppingList> getResults(){
      return this.results;
   }

   public ShoppingListPagedQueryResponse build() {
       return new ShoppingListPagedQueryResponseImpl(total, offset, count, limit, results);
   }

   public static ShoppingListPagedQueryResponseBuilder of() {
      return new ShoppingListPagedQueryResponseBuilder();
   }

   public static ShoppingListPagedQueryResponseBuilder of(final ShoppingListPagedQueryResponse template) {
      ShoppingListPagedQueryResponseBuilder builder = new ShoppingListPagedQueryResponseBuilder();
      builder.total = template.getTotal();
      builder.offset = template.getOffset();
      builder.count = template.getCount();
      builder.limit = template.getLimit();
      builder.results = template.getResults();
      return builder;
   }

}
