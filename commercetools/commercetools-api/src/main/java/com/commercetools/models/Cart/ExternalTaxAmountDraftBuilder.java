package com.commercetools.models.cart;

import com.commercetools.models.cart.ExternalTaxRateDraft;
import com.commercetools.models.common.Money;
import com.commercetools.models.cart.ExternalTaxAmountDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ExternalTaxAmountDraftBuilder {
   
   
   private com.commercetools.models.cart.ExternalTaxRateDraft taxRate;
   
   
   private com.commercetools.models.common.Money totalGross;
   
   public ExternalTaxAmountDraftBuilder taxRate( final com.commercetools.models.cart.ExternalTaxRateDraft taxRate) {
      this.taxRate = taxRate;
      return this;
   }
   
   public ExternalTaxAmountDraftBuilder totalGross( final com.commercetools.models.common.Money totalGross) {
      this.totalGross = totalGross;
      return this;
   }
   
   
   public com.commercetools.models.cart.ExternalTaxRateDraft getTaxRate(){
      return this.taxRate;
   }
   
   
   public com.commercetools.models.common.Money getTotalGross(){
      return this.totalGross;
   }

   public ExternalTaxAmountDraft build() {
       return new ExternalTaxAmountDraftImpl(taxRate, totalGross);
   }
   
   public static ExternalTaxAmountDraftBuilder of() {
      return new ExternalTaxAmountDraftBuilder();
   }
   
   public static ExternalTaxAmountDraftBuilder of(final ExternalTaxAmountDraft template) {
      ExternalTaxAmountDraftBuilder builder = new ExternalTaxAmountDraftBuilder();
      builder.taxRate = template.getTaxRate();
      builder.totalGross = template.getTotalGross();
      return builder;
   }
   
}