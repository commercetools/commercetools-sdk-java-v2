package com.commercetools.models.Order;

import com.commercetools.models.Common.Money;
import com.commercetools.models.Order.TaxedItemPriceDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class TaxedItemPriceDraftBuilder {
   
   
   private com.commercetools.models.Common.Money totalGross;
   
   
   private com.commercetools.models.Common.Money totalNet;
   
   public TaxedItemPriceDraftBuilder totalGross( final com.commercetools.models.Common.Money totalGross) {
      this.totalGross = totalGross;
      return this;
   }
   
   public TaxedItemPriceDraftBuilder totalNet( final com.commercetools.models.Common.Money totalNet) {
      this.totalNet = totalNet;
      return this;
   }
   
   
   public com.commercetools.models.Common.Money getTotalGross(){
      return this.totalGross;
   }
   
   
   public com.commercetools.models.Common.Money getTotalNet(){
      return this.totalNet;
   }

   public TaxedItemPriceDraft build() {
       return new TaxedItemPriceDraftImpl(totalGross, totalNet);
   }
   
   public static TaxedItemPriceDraftBuilder of() {
      return new TaxedItemPriceDraftBuilder();
   }
   
   public static TaxedItemPriceDraftBuilder of(final TaxedItemPriceDraft template) {
      TaxedItemPriceDraftBuilder builder = new TaxedItemPriceDraftBuilder();
      builder.totalGross = template.getTotalGross();
      builder.totalNet = template.getTotalNet();
      return builder;
   }
   
}