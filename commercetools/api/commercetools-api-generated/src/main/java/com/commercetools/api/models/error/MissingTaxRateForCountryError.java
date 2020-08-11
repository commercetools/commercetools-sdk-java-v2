package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.MissingTaxRateForCountryErrorImpl;

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
@JsonDeserialize(as = MissingTaxRateForCountryErrorImpl.class)
public interface MissingTaxRateForCountryError extends ErrorObject {


   @NotNull
   @JsonProperty("taxCategoryId")
   public String getTaxCategoryId();


   @JsonProperty("country")
   public String getCountry();


   @JsonProperty("state")
   public String getState();

   public void setTaxCategoryId(final String taxCategoryId);

   public void setCountry(final String country);

   public void setState(final String state);

   public static MissingTaxRateForCountryErrorImpl of(){
      return new MissingTaxRateForCountryErrorImpl();
   }


   public static MissingTaxRateForCountryErrorImpl of(final MissingTaxRateForCountryError template) {
      MissingTaxRateForCountryErrorImpl instance = new MissingTaxRateForCountryErrorImpl();
      instance.setMessage(template.getMessage());
      instance.setCountry(template.getCountry());
      instance.setState(template.getState());
      instance.setTaxCategoryId(template.getTaxCategoryId());
      return instance;
   }

}
