package com.commercetools.models.order_edit;

import com.commercetools.models.cart.ExternalTaxAmountDraft;
import com.commercetools.models.order.StagedOrderUpdateAction;
import java.lang.String;
import com.commercetools.models.order_edit.StagedOrderSetCustomLineItemTaxAmountAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderSetCustomLineItemTaxAmountActionBuilder {
   
   
   private java.lang.String customLineItemId;
   
   @Nullable
   private com.commercetools.models.cart.ExternalTaxAmountDraft externalTaxAmount;
   
   public StagedOrderSetCustomLineItemTaxAmountActionBuilder customLineItemId( final java.lang.String customLineItemId) {
      this.customLineItemId = customLineItemId;
      return this;
   }
   
   public StagedOrderSetCustomLineItemTaxAmountActionBuilder externalTaxAmount(@Nullable final com.commercetools.models.cart.ExternalTaxAmountDraft externalTaxAmount) {
      this.externalTaxAmount = externalTaxAmount;
      return this;
   }
   
   
   public java.lang.String getCustomLineItemId(){
      return this.customLineItemId;
   }
   
   @Nullable
   public com.commercetools.models.cart.ExternalTaxAmountDraft getExternalTaxAmount(){
      return this.externalTaxAmount;
   }

   public StagedOrderSetCustomLineItemTaxAmountAction build() {
       return new StagedOrderSetCustomLineItemTaxAmountActionImpl(customLineItemId, externalTaxAmount);
   }
   
   public static StagedOrderSetCustomLineItemTaxAmountActionBuilder of() {
      return new StagedOrderSetCustomLineItemTaxAmountActionBuilder();
   }
   
   public static StagedOrderSetCustomLineItemTaxAmountActionBuilder of(final StagedOrderSetCustomLineItemTaxAmountAction template) {
      StagedOrderSetCustomLineItemTaxAmountActionBuilder builder = new StagedOrderSetCustomLineItemTaxAmountActionBuilder();
      builder.customLineItemId = template.getCustomLineItemId();
      builder.externalTaxAmount = template.getExternalTaxAmount();
      return builder;
   }
   
}