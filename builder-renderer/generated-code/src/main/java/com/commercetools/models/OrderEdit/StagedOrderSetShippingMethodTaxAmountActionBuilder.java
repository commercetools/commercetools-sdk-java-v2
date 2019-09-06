package com.commercetools.models.OrderEdit;

import com.commercetools.models.Cart.ExternalTaxAmountDraft;
import com.commercetools.models.Order.StagedOrderUpdateAction;
import java.lang.String;
import com.commercetools.models.OrderEdit.StagedOrderSetShippingMethodTaxAmountAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderSetShippingMethodTaxAmountActionBuilder {
   
   @Nullable
   private com.commercetools.models.Cart.ExternalTaxAmountDraft externalTaxAmount;
   
   public StagedOrderSetShippingMethodTaxAmountActionBuilder externalTaxAmount(@Nullable final com.commercetools.models.Cart.ExternalTaxAmountDraft externalTaxAmount) {
      this.externalTaxAmount = externalTaxAmount;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.Cart.ExternalTaxAmountDraft getExternalTaxAmount(){
      return this.externalTaxAmount;
   }

   public StagedOrderSetShippingMethodTaxAmountAction build() {
       return new StagedOrderSetShippingMethodTaxAmountActionImpl(externalTaxAmount);
   }
   
   public static StagedOrderSetShippingMethodTaxAmountActionBuilder of() {
      return new StagedOrderSetShippingMethodTaxAmountActionBuilder();
   }
   
   public static StagedOrderSetShippingMethodTaxAmountActionBuilder of(final StagedOrderSetShippingMethodTaxAmountAction template) {
      StagedOrderSetShippingMethodTaxAmountActionBuilder builder = new StagedOrderSetShippingMethodTaxAmountActionBuilder();
      builder.externalTaxAmount = template.getExternalTaxAmount();
      return builder;
   }
   
}