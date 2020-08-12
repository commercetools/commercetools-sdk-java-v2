package com.commercetools.api.models.project;


import com.commercetools.api.models.project.CartsConfigurationImpl;

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
@JsonDeserialize(as = CartsConfigurationImpl.class)
public interface CartsConfiguration  {

   /**
   *  <p>if country - no state tax rate fallback should be used when a shipping address state is not explicitly covered in the rates lists of all tax categories of a cart line items. Default value 'false'</p>
   */
   
   @JsonProperty("countryTaxRateFallbackEnabled")
   public Boolean getCountryTaxRateFallbackEnabled();

   public void setCountryTaxRateFallbackEnabled(final Boolean countryTaxRateFallbackEnabled);
   
   public static CartsConfigurationImpl of(){
      return new CartsConfigurationImpl();
   }
   

   public static CartsConfigurationImpl of(final CartsConfiguration template) {
      CartsConfigurationImpl instance = new CartsConfigurationImpl();
      instance.setCountryTaxRateFallbackEnabled(template.getCountryTaxRateFallbackEnabled());
      return instance;
   }

}
