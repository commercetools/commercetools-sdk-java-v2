package com.commercetools.models.order_edit;

import com.commercetools.models.cart.TaxedPrice;
import com.commercetools.models.common.Money;
import java.lang.Integer;
import com.commercetools.models.order_edit.OrderExcerpt;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderExcerptBuilder {
   
   
   private com.commercetools.models.common.Money totalPrice;
   
   @Nullable
   private com.commercetools.models.cart.TaxedPrice taxedPrice;
   
   
   private java.lang.Integer version;
   
   public OrderExcerptBuilder totalPrice( final com.commercetools.models.common.Money totalPrice) {
      this.totalPrice = totalPrice;
      return this;
   }
   
   public OrderExcerptBuilder taxedPrice(@Nullable final com.commercetools.models.cart.TaxedPrice taxedPrice) {
      this.taxedPrice = taxedPrice;
      return this;
   }
   
   public OrderExcerptBuilder version( final java.lang.Integer version) {
      this.version = version;
      return this;
   }
   
   
   public com.commercetools.models.common.Money getTotalPrice(){
      return this.totalPrice;
   }
   
   @Nullable
   public com.commercetools.models.cart.TaxedPrice getTaxedPrice(){
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