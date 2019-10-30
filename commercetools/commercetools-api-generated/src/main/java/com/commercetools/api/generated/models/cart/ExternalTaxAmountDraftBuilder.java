package com.commercetools.api.generated.models.cart;

import com.commercetools.api.generated.models.cart.ExternalTaxRateDraft;
import com.commercetools.api.generated.models.common.Money;
import com.commercetools.api.generated.models.cart.ExternalTaxAmountDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ExternalTaxAmountDraftBuilder {
   
   
   private com.commercetools.api.generated.models.cart.ExternalTaxRateDraft taxRate;
   
   
   private com.commercetools.api.generated.models.common.Money totalGross;
   
   public ExternalTaxAmountDraftBuilder taxRate( final com.commercetools.api.generated.models.cart.ExternalTaxRateDraft taxRate) {
      this.taxRate = taxRate;
      return this;
   }
   
   public ExternalTaxAmountDraftBuilder totalGross( final com.commercetools.api.generated.models.common.Money totalGross) {
      this.totalGross = totalGross;
      return this;
   }
   
   
   public com.commercetools.api.generated.models.cart.ExternalTaxRateDraft getTaxRate(){
      return this.taxRate;
   }
   
   
   public com.commercetools.api.generated.models.common.Money getTotalGross(){
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