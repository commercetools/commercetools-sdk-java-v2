package com.commercetools.api.generated.models.shipping_method;

import com.commercetools.api.generated.models.shipping_method.ShippingMethod;
import com.commercetools.api.generated.models.shipping_method.ShippingMethodPagedQueryResponse;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ShippingMethodPagedQueryResponseBuilder {
   
   @Nullable
   private Long total;
   
   
   private Long offset;
   
   
   private Long count;
   
   
   private Long limit;
   
   
   private java.util.List<com.commercetools.api.generated.models.shipping_method.ShippingMethod> results;
   
   public ShippingMethodPagedQueryResponseBuilder total(@Nullable final Long total) {
      this.total = total;
      return this;
   }
   
   public ShippingMethodPagedQueryResponseBuilder offset( final Long offset) {
      this.offset = offset;
      return this;
   }
   
   public ShippingMethodPagedQueryResponseBuilder count( final Long count) {
      this.count = count;
      return this;
   }
   
   public ShippingMethodPagedQueryResponseBuilder limit( final Long limit) {
      this.limit = limit;
      return this;
   }
   
   public ShippingMethodPagedQueryResponseBuilder results( final java.util.List<com.commercetools.api.generated.models.shipping_method.ShippingMethod> results) {
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
   
   
   public java.util.List<com.commercetools.api.generated.models.shipping_method.ShippingMethod> getResults(){
      return this.results;
   }

   public ShippingMethodPagedQueryResponse build() {
       return new ShippingMethodPagedQueryResponseImpl(total, offset, count, limit, results);
   }
   
   public static ShippingMethodPagedQueryResponseBuilder of() {
      return new ShippingMethodPagedQueryResponseBuilder();
   }
   
   public static ShippingMethodPagedQueryResponseBuilder of(final ShippingMethodPagedQueryResponse template) {
      ShippingMethodPagedQueryResponseBuilder builder = new ShippingMethodPagedQueryResponseBuilder();
      builder.total = template.getTotal();
      builder.offset = template.getOffset();
      builder.count = template.getCount();
      builder.limit = template.getLimit();
      builder.results = template.getResults();
      return builder;
   }
   
}