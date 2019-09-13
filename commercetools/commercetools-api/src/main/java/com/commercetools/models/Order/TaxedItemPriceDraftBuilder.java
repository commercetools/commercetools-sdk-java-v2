package com.commercetools.models.order;

import com.commercetools.models.common.Money;
import com.commercetools.models.order.TaxedItemPriceDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class TaxedItemPriceDraftBuilder {
   
   
   private com.commercetools.models.common.Money totalGross;
   
   
   private com.commercetools.models.common.Money totalNet;
   
   public TaxedItemPriceDraftBuilder totalGross( final com.commercetools.models.common.Money totalGross) {
      this.totalGross = totalGross;
      return this;
   }
   
   public TaxedItemPriceDraftBuilder totalNet( final com.commercetools.models.common.Money totalNet) {
      this.totalNet = totalNet;
      return this;
   }
   
   
   public com.commercetools.models.common.Money getTotalGross(){
      return this.totalGross;
   }
   
   
   public com.commercetools.models.common.Money getTotalNet(){
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