package com.commercetools.models.OrderEdit;

import com.commercetools.models.Cart.ExternalTaxAmountDraft;
import com.commercetools.models.Order.StagedOrderUpdateAction;
import java.lang.String;
import com.commercetools.models.OrderEdit.StagedOrderSetLineItemTaxAmountAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderSetLineItemTaxAmountActionBuilder {
   
   
   private java.lang.String lineItemId;
   
   @Nullable
   private com.commercetools.models.Cart.ExternalTaxAmountDraft externalTaxAmount;
   
   public StagedOrderSetLineItemTaxAmountActionBuilder lineItemId( final java.lang.String lineItemId) {
      this.lineItemId = lineItemId;
      return this;
   }
   
   public StagedOrderSetLineItemTaxAmountActionBuilder externalTaxAmount(@Nullable final com.commercetools.models.Cart.ExternalTaxAmountDraft externalTaxAmount) {
      this.externalTaxAmount = externalTaxAmount;
      return this;
   }
   
   
   public java.lang.String getLineItemId(){
      return this.lineItemId;
   }
   
   @Nullable
   public com.commercetools.models.Cart.ExternalTaxAmountDraft getExternalTaxAmount(){
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