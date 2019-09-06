package com.commercetools.models.Cart;

import com.commercetools.models.Common.TypedMoney;
import com.commercetools.models.Cart.TaxedItemPrice;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class TaxedItemPriceBuilder {
   
   
   private com.commercetools.models.Common.TypedMoney totalGross;
   
   
   private com.commercetools.models.Common.TypedMoney totalNet;
   
   public TaxedItemPriceBuilder totalGross( final com.commercetools.models.Common.TypedMoney totalGross) {
      this.totalGross = totalGross;
      return this;
   }
   
   public TaxedItemPriceBuilder totalNet( final com.commercetools.models.Common.TypedMoney totalNet) {
      this.totalNet = totalNet;
      return this;
   }
   
   
   public com.commercetools.models.Common.TypedMoney getTotalGross(){
      return this.totalGross;
   }
   
   
   public com.commercetools.models.Common.TypedMoney getTotalNet(){
      return this.totalNet;
   }

   public TaxedItemPrice build() {
       return new TaxedItemPriceImpl(totalGross, totalNet);
   }
   
   public static TaxedItemPriceBuilder of() {
      return new TaxedItemPriceBuilder();
   }
   
   public static TaxedItemPriceBuilder of(final TaxedItemPrice template) {
      TaxedItemPriceBuilder builder = new TaxedItemPriceBuilder();
      builder.totalGross = template.getTotalGross();
      builder.totalNet = template.getTotalNet();
      return builder;
   }
   
}