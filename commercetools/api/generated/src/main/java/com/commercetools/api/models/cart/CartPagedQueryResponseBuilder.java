package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.Cart;
import com.commercetools.api.models.cart.CartPagedQueryResponse;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartPagedQueryResponseBuilder {
   
   @Nullable
   private Long total;
   
   
   private Long offset;
   
   
   private Long count;
   
   
   private Long limit;
   
   
   private java.util.List<com.commercetools.api.models.cart.Cart> results;
   
   public CartPagedQueryResponseBuilder total(@Nullable final Long total) {
      this.total = total;
      return this;
   }
   
   public CartPagedQueryResponseBuilder offset( final Long offset) {
      this.offset = offset;
      return this;
   }
   
   public CartPagedQueryResponseBuilder count( final Long count) {
      this.count = count;
      return this;
   }
   
   public CartPagedQueryResponseBuilder limit( final Long limit) {
      this.limit = limit;
      return this;
   }
   
   public CartPagedQueryResponseBuilder results( final java.util.List<com.commercetools.api.models.cart.Cart> results) {
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
   
   
   public java.util.List<com.commercetools.api.models.cart.Cart> getResults(){
      return this.results;
   }

   public CartPagedQueryResponse build() {
       return new CartPagedQueryResponseImpl(total, offset, count, limit, results);
   }
   
   public static CartPagedQueryResponseBuilder of() {
      return new CartPagedQueryResponseBuilder();
   }
   
   public static CartPagedQueryResponseBuilder of(final CartPagedQueryResponse template) {
      CartPagedQueryResponseBuilder builder = new CartPagedQueryResponseBuilder();
      builder.total = template.getTotal();
      builder.offset = template.getOffset();
      builder.count = template.getCount();
      builder.limit = template.getLimit();
      builder.results = template.getResults();
      return builder;
   }
   
}
