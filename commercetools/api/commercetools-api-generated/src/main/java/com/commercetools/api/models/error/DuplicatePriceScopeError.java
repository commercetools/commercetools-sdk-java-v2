package com.commercetools.api.models.error;

import com.commercetools.api.models.common.Price;
import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.DuplicatePriceScopeErrorImpl;

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
@JsonDeserialize(as = DuplicatePriceScopeErrorImpl.class)
public interface DuplicatePriceScopeError extends ErrorObject {


   @NotNull
   @Valid
   @JsonProperty("conflictingPrices")
   public List<Price> getConflictingPrices();

   public void setConflictingPrices(final List<Price> conflictingPrices);

   public static DuplicatePriceScopeErrorImpl of(){
      return new DuplicatePriceScopeErrorImpl();
   }


   public static DuplicatePriceScopeErrorImpl of(final DuplicatePriceScopeError template) {
      DuplicatePriceScopeErrorImpl instance = new DuplicatePriceScopeErrorImpl();
      instance.setMessage(template.getMessage());
      instance.setConflictingPrices(template.getConflictingPrices());
      return instance;
   }

}
