package com.commercetools.models.Cart;

import com.commercetools.models.Cart.Cart;
import java.lang.Long;
import com.commercetools.models.Cart.CartPagedQueryResponse;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartPagedQueryResponseBuilder {
   
   @Nullable
   private java.lang.Long total;
   
   
   private java.lang.Long offset;
   
   
   private java.lang.Long count;
   
   
   private java.util.List<com.commercetools.models.Cart.Cart> results;
   
   public CartPagedQueryResponseBuilder total(@Nullable final java.lang.Long total) {
      this.total = total;
      return this;
   }
   
   public CartPagedQueryResponseBuilder offset( final java.lang.Long offset) {
      this.offset = offset;
      return this;
   }
   
   public CartPagedQueryResponseBuilder count( final java.lang.Long count) {
      this.count = count;
      return this;
   }
   
   public CartPagedQueryResponseBuilder results( final java.util.List<com.commercetools.models.Cart.Cart> results) {
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
   
   
   public java.util.List<com.commercetools.models.Cart.Cart> getResults(){
      return this.results;
   }

   public CartPagedQueryResponse build() {
       return new CartPagedQueryResponseImpl(total, offset, count, results);
   }
   
   public static CartPagedQueryResponseBuilder of() {
      return new CartPagedQueryResponseBuilder();
   }
   
   public static CartPagedQueryResponseBuilder of(final CartPagedQueryResponse template) {
      CartPagedQueryResponseBuilder builder = new CartPagedQueryResponseBuilder();
      builder.total = template.getTotal();
      builder.offset = template.getOffset();
      builder.count = template.getCount();
      builder.results = template.getResults();
      return builder;
   }
   
}