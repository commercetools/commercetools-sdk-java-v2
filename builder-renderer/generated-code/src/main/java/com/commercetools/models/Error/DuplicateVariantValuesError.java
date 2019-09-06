package com.commercetools.models.Error;

import com.commercetools.models.Error.ErrorObject;
import com.commercetools.models.Error.VariantValues;
import java.lang.String;
import com.commercetools.models.Error.DuplicateVariantValuesErrorImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import json.CommercetoolsJsonUtils;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = DuplicateVariantValuesErrorImpl.class)
public interface DuplicateVariantValuesError extends ErrorObject {

   
   @NotNull
   @Valid
   @JsonProperty("variantValues")
   public VariantValues getVariantValues();

   public void setVariantValues(final VariantValues variantValues);
   
   public static DuplicateVariantValuesErrorImpl of(){
      return new DuplicateVariantValuesErrorImpl();
   }
   

   public static DuplicateVariantValuesErrorImpl of(final DuplicateVariantValuesError template) {
      DuplicateVariantValuesErrorImpl instance = new DuplicateVariantValuesErrorImpl();
      instance.setMessage(template.getMessage());
      instance.setVariantValues(template.getVariantValues());
      return instance;
   }

}