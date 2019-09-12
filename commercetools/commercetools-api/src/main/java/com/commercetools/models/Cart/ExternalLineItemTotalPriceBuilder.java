package com.commercetools.models.Cart;

import com.commercetools.models.Common.Money;
import com.commercetools.models.Cart.ExternalLineItemTotalPrice;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ExternalLineItemTotalPriceBuilder {
   
   
   private com.commercetools.models.Common.Money totalPrice;
   
   
   private com.commercetools.models.Common.Money price;
   
   public ExternalLineItemTotalPriceBuilder totalPrice( final com.commercetools.models.Common.Money totalPrice) {
      this.totalPrice = totalPrice;
      return this;
   }
   
   public ExternalLineItemTotalPriceBuilder price( final com.commercetools.models.Common.Money price) {
      this.price = price;
      return this;
   }
   
   
   public com.commercetools.models.Common.Money getTotalPrice(){
      return this.totalPrice;
   }
   
   
   public com.commercetools.models.Common.Money getPrice(){
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