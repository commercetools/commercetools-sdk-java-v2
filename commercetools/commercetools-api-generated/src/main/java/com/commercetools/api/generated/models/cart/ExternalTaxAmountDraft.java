package com.commercetools.api.generated.models.cart;

import com.commercetools.api.generated.models.cart.ExternalTaxRateDraft;
import com.commercetools.api.generated.models.common.Money;
import com.commercetools.api.generated.models.cart.ExternalTaxAmountDraftImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ExternalTaxAmountDraftImpl.class)
public interface ExternalTaxAmountDraft  {

   /**
   *  <p>The total gross amount of the item (totalNet + taxes).</p>
   */
   @NotNull
   @Valid
   @JsonProperty("totalGross")
   public Money getTotalGross();
   
   @NotNull
   @Valid
   @JsonProperty("taxRate")
   public ExternalTaxRateDraft getTaxRate();

   public void setTotalGross(final Money totalGross);
   
   public void setTaxRate(final ExternalTaxRateDraft taxRate);
   
   public static ExternalTaxAmountDraftImpl of(){
      return new ExternalTaxAmountDraftImpl();
   }
   

   public static ExternalTaxAmountDraftImpl of(final ExternalTaxAmountDraft template) {
      ExternalTaxAmountDraftImpl instance = new ExternalTaxAmountDraftImpl();
      instance.setTaxRate(template.getTaxRate());
      instance.setTotalGross(template.getTotalGross());
      return instance;
   }

}