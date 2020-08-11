package com.commercetools.api.models.order;

import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.order.TaxedItemPriceDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class TaxedItemPriceDraftBuilder {


   private com.commercetools.api.models.common.Money totalGross;


   private com.commercetools.api.models.common.Money totalNet;

   public TaxedItemPriceDraftBuilder totalGross( final com.commercetools.api.models.common.Money totalGross) {
      this.totalGross = totalGross;
      return this;
   }

   public TaxedItemPriceDraftBuilder totalNet( final com.commercetools.api.models.common.Money totalNet) {
      this.totalNet = totalNet;
      return this;
   }


   public com.commercetools.api.models.common.Money getTotalGross(){
      return this.totalGross;
   }


   public com.commercetools.api.models.common.Money getTotalNet(){
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
