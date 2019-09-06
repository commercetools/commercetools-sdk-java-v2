package com.commercetools.models.OrderEdit;

import com.commercetools.models.Cart.TaxedPrice;
import com.commercetools.models.Common.Money;
import java.lang.Integer;
import com.commercetools.models.OrderEdit.OrderExcerpt;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderExcerptBuilder {
   
   
   private com.commercetools.models.Common.Money totalPrice;
   
   @Nullable
   private com.commercetools.models.Cart.TaxedPrice taxedPrice;
   
   
   private java.lang.Integer version;
   
   public OrderExcerptBuilder totalPrice( final com.commercetools.models.Common.Money totalPrice) {
      this.totalPrice = totalPrice;
      return this;
   }
   
   public OrderExcerptBuilder taxedPrice(@Nullable final com.commercetools.models.Cart.TaxedPrice taxedPrice) {
      this.taxedPrice = taxedPrice;
      return this;
   }
   
   public OrderExcerptBuilder version( final java.lang.Integer version) {
      this.version = version;
      return this;
   }
   
   
   public com.commercetools.models.Common.Money getTotalPrice(){
      return this.totalPrice;
   }
   
   @Nullable
   public com.commercetools.models.Cart.TaxedPrice getTaxedPrice(){
      return this.taxedPrice;
   }
   
   
   public java.lang.Integer getVersion(){
      return this.version;
   }

   public OrderExcerpt build() {
       return new OrderExcerptImpl(totalPrice, taxedPrice, version);
   }
   
   public static OrderExcerptBuilder of() {
      return new OrderExcerptBuilder();
   }
   
   public static OrderExcerptBuilder of(final OrderExcerpt template) {
      OrderExcerptBuilder builder = new OrderExcerptBuilder();
      builder.totalPrice = template.getTotalPrice();
      builder.taxedPrice = template.getTaxedPrice();
      builder.version = template.getVersion();
      return builder;
   }
   
}