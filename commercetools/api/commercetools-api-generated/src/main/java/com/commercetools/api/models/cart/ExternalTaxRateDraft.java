package com.commercetools.api.models.cart;

import com.commercetools.api.models.tax_category.SubRate;
import com.commercetools.api.models.cart.ExternalTaxRateDraftImpl;

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
@JsonDeserialize(as = ExternalTaxRateDraftImpl.class)
public interface ExternalTaxRateDraft  {


   @NotNull
   @JsonProperty("name")
   public String getName();
   /**
   *  <p>Percentage in the range of [0..1].
   *  Must be supplied if no <code>subRates</code> are specified.
   *  If <code>subRates</code> are specified
   *  then the <code>amount</code> can be omitted or it must be the sum of the amounts of all <code>subRates</code>.</p>
   */

   @JsonProperty("amount")
   public Integer getAmount();
   /**
   *  <p>A two-digit country code as per <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>.</p>
   */
   @NotNull
   @JsonProperty("country")
   public String getCountry();
   /**
   *  <p>The state in the country</p>
   */

   @JsonProperty("state")
   public String getState();
   /**
   *  <p>For countries (e.g.
   *  the US) where the total tax is a combination of multiple taxes (e.g.
   *  state and local taxes).</p>
   */
   @Valid
   @JsonProperty("subRates")
   public List<SubRate> getSubRates();
   /**
   *  <p>The default value for <code>includedInPrice</code> is FALSE.</p>
   */

   @JsonProperty("includedInPrice")
   public Boolean getIncludedInPrice();

   public void setName(final String name);

   public void setAmount(final Integer amount);

   public void setCountry(final String country);

   public void setState(final String state);

   public void setSubRates(final List<SubRate> subRates);

   public void setIncludedInPrice(final Boolean includedInPrice);

   public static ExternalTaxRateDraftImpl of(){
      return new ExternalTaxRateDraftImpl();
   }


   public static ExternalTaxRateDraftImpl of(final ExternalTaxRateDraft template) {
      ExternalTaxRateDraftImpl instance = new ExternalTaxRateDraftImpl();
      instance.setCountry(template.getCountry());
      instance.setAmount(template.getAmount());
      instance.setIncludedInPrice(template.getIncludedInPrice());
      instance.setName(template.getName());
      instance.setState(template.getState());
      instance.setSubRates(template.getSubRates());
      return instance;
   }

}
