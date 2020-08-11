package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.VariantValues;
import com.commercetools.api.models.error.DuplicateVariantValuesErrorImpl;

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
