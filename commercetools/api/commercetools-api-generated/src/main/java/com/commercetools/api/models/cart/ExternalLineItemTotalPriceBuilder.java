package com.commercetools.api.models.cart;

import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.cart.ExternalLineItemTotalPrice;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ExternalLineItemTotalPriceBuilder {


   private com.commercetools.api.models.common.Money totalPrice;


   private com.commercetools.api.models.common.Money price;

   public ExternalLineItemTotalPriceBuilder totalPrice( final com.commercetools.api.models.common.Money totalPrice) {
      this.totalPrice = totalPrice;
      return this;
   }

   public ExternalLineItemTotalPriceBuilder price( final com.commercetools.api.models.common.Money price) {
      this.price = price;
      return this;
   }


   public com.commercetools.api.models.common.Money getTotalPrice(){
      return this.totalPrice;
   }


   public com.commercetools.api.models.common.Money getPrice(){
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
