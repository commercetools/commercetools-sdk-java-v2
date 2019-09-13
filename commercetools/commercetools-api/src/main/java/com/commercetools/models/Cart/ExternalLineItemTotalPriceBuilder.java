package com.commercetools.models.cart;

import com.commercetools.models.common.Money;
import com.commercetools.models.cart.ExternalLineItemTotalPrice;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ExternalLineItemTotalPriceBuilder {
   
   
   private com.commercetools.models.common.Money totalPrice;
   
   
   private com.commercetools.models.common.Money price;
   
   public ExternalLineItemTotalPriceBuilder totalPrice( final com.commercetools.models.common.Money totalPrice) {
      this.totalPrice = totalPrice;
      return this;
   }
   
   public ExternalLineItemTotalPriceBuilder price( final com.commercetools.models.common.Money price) {
      this.price = price;
      return this;
   }
   
   
   public com.commercetools.models.common.Money getTotalPrice(){
      return this.totalPrice;
   }
   
   
   public com.commercetools.models.common.Money getPrice(){
      return this.price;
   }

   public ExternalLineItemTotalPrice build() {
       return new ExternalLineItemTotalPriceImpl(totalPrice, price);
   }
   
   public static ExternalLineItemTotalPriceBuilder of() {
      return new ExternalLineItemTotalPriceBuilder();
   }
   
   public static ExternalLineItemTotalPriceBuilder of(final ExternalLineItemTotalPrice template) {
      ExternalLineItemTotalPriceBuilder builder = new ExternalLineItemTotalPriceBuilder();
      builder.totalPrice = template.getTotalPrice();
      builder.price = template.getPrice();
      return builder;
   }
   
}