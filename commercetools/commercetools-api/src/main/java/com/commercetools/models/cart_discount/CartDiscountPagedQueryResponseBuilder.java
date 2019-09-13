package com.commercetools.models.cart_discount;

import com.commercetools.models.cart_discount.CartDiscount;
import java.lang.Long;
import com.commercetools.models.cart_discount.CartDiscountPagedQueryResponse;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartDiscountPagedQueryResponseBuilder {
   
   @Nullable
   private java.lang.Long total;
   
   
   private java.lang.Long offset;
   
   
   private java.lang.Long count;
   
   
   private java.util.List<com.commercetools.models.cart_discount.CartDiscount> results;
   
   public CartDiscountPagedQueryResponseBuilder total(@Nullable final java.lang.Long total) {
      this.total = total;
      return this;
   }
   
   public CartDiscountPagedQueryResponseBuilder offset( final java.lang.Long offset) {
      this.offset = offset;
      return this;
   }
   
   public CartDiscountPagedQueryResponseBuilder count( final java.lang.Long count) {
      this.count = count;
      return this;
   }
   
   public CartDiscountPagedQueryResponseBuilder results( final java.util.List<com.commercetools.models.cart_discount.CartDiscount> results) {
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
   
   
   public java.util.List<com.commercetools.models.cart_discount.CartDiscount> getResults(){
      return this.results;
   }

   public CartDiscountPagedQueryResponse build() {
       return new CartDiscountPagedQueryResponseImpl(total, offset, count, results);
   }
   
   public static CartDiscountPagedQueryResponseBuilder of() {
      return new CartDiscountPagedQueryResponseBuilder();
   }
   
   public static CartDiscountPagedQueryResponseBuilder of(final CartDiscountPagedQueryResponse template) {
      CartDiscountPagedQueryResponseBuilder builder = new CartDiscountPagedQueryResponseBuilder();
      builder.total = template.getTotal();
      builder.offset = template.getOffset();
      builder.count = template.getCount();
      builder.results = template.getResults();
      return builder;
   }
   
}