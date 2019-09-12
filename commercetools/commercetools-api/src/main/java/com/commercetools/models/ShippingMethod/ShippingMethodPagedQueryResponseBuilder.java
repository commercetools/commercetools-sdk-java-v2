package com.commercetools.models.ShippingMethod;

import com.commercetools.models.ShippingMethod.ShippingMethod;
import java.lang.Long;
import com.commercetools.models.ShippingMethod.ShippingMethodPagedQueryResponse;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ShippingMethodPagedQueryResponseBuilder {
   
   @Nullable
   private java.lang.Long total;
   
   
   private java.lang.Long offset;
   
   
   private java.lang.Long count;
   
   
   private java.util.List<com.commercetools.models.ShippingMethod.ShippingMethod> results;
   
   public ShippingMethodPagedQueryResponseBuilder total(@Nullable final java.lang.Long total) {
      this.total = total;
      return this;
   }
   
   public ShippingMethodPagedQueryResponseBuilder offset( final java.lang.Long offset) {
      this.offset = offset;
      return this;
   }
   
   public ShippingMethodPagedQueryResponseBuilder count( final java.lang.Long count) {
      this.count = count;
      return this;
   }
   
   public ShippingMethodPagedQueryResponseBuilder results( final java.util.List<com.commercetools.models.ShippingMethod.ShippingMethod> results) {
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
   
   
   public java.util.List<com.commercetools.models.ShippingMethod.ShippingMethod> getResults(){
      return this.results;
   }

   public ShippingMethodPagedQueryResponse build() {
       return new ShippingMethodPagedQueryResponseImpl(total, offset, count, results);
   }
   
   public static ShippingMethodPagedQueryResponseBuilder of() {
      return new ShippingMethodPagedQueryResponseBuilder();
   }
   
   public static ShippingMethodPagedQueryResponseBuilder of(final ShippingMethodPagedQueryResponse template) {
      ShippingMethodPagedQueryResponseBuilder builder = new ShippingMethodPagedQueryResponseBuilder();
      builder.total = template.getTotal();
      builder.offset = template.getOffset();
      builder.count = template.getCount();
      builder.results = template.getResults();
      return builder;
   }
   
}