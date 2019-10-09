package com.commercetools.models.order_edit;

import com.commercetools.models.cart.ExternalTaxAmountDraft;
import com.commercetools.models.order.StagedOrderUpdateAction;
import com.commercetools.models.order_edit.StagedOrderSetLineItemTaxAmountAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderSetLineItemTaxAmountActionBuilder {
   
   
   private String lineItemId;
   
   @Nullable
   private com.commercetools.models.cart.ExternalTaxAmountDraft externalTaxAmount;
   
   public StagedOrderSetLineItemTaxAmountActionBuilder lineItemId( final String lineItemId) {
      this.lineItemId = lineItemId;
      return this;
   }
   
   public StagedOrderSetLineItemTaxAmountActionBuilder externalTaxAmount(@Nullable final com.commercetools.models.cart.ExternalTaxAmountDraft externalTaxAmount) {
      this.externalTaxAmount = externalTaxAmount;
      return this;
   }
   
   
   public String getLineItemId(){
      return this.lineItemId;
   }
   
   @Nullable
   public com.commercetools.models.cart.ExternalTaxAmountDraft getExternalTaxAmount(){
      return this.externalTaxAmount;
   }

   public StagedOrderSetLineItemTaxAmountAction build() {
       return new StagedOrderSetLineItemTaxAmountActionImpl(lineItemId, externalTaxAmount);
   }
   
   public static StagedOrderSetLineItemTaxAmountActionBuilder of() {
      return new StagedOrderSetLineItemTaxAmountActionBuilder();
   }
   
   public static StagedOrderSetLineItemTaxAmountActionBuilder of(final StagedOrderSetLineItemTaxAmountAction template) {
      StagedOrderSetLineItemTaxAmountActionBuilder builder = new StagedOrderSetLineItemTaxAmountActionBuilder();
      builder.lineItemId = template.getLineItemId();
      builder.externalTaxAmount = template.getExternalTaxAmount();
      return builder;
   }
   
}