package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.TaxPortionDraft;
import com.commercetools.api.models.common.TypedMoneyDraft;
import com.commercetools.api.models.cart.TaxedPriceDraftImpl;

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
@JsonDeserialize(as = TaxedPriceDraftImpl.class)
public interface TaxedPriceDraft  {


   @NotNull
   @Valid
   @JsonProperty("totalNet")
   public TypedMoneyDraft getTotalNet();

   @NotNull
   @Valid
   @JsonProperty("totalGross")
   public TypedMoneyDraft getTotalGross();

   @NotNull
   @Valid
   @JsonProperty("taxPortions")
   public List<TaxPortionDraft> getTaxPortions();

   public void setTotalNet(final TypedMoneyDraft totalNet);

   public void setTotalGross(final TypedMoneyDraft totalGross);

   public void setTaxPortions(final List<TaxPortionDraft> taxPortions);

   public static TaxedPriceDraftImpl of(){
      return new TaxedPriceDraftImpl();
   }


   public static TaxedPriceDraftImpl of(final TaxedPriceDraft template) {
      TaxedPriceDraftImpl instance = new TaxedPriceDraftImpl();
      instance.setTaxPortions(template.getTaxPortions());
      instance.setTotalGross(template.getTotalGross());
      instance.setTotalNet(template.getTotalNet());
      return instance;
   }

}
