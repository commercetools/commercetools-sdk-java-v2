package com.commercetools.models.cart;

import com.commercetools.models.cart.ExternalTaxRateDraft;
import com.commercetools.models.common.Money;
import com.commercetools.models.cart.ExternalTaxAmountDraftImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
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