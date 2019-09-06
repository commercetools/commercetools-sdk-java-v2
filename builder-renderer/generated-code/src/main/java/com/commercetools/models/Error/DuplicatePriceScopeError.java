package com.commercetools.models.Error;

import com.commercetools.models.Common.Price;
import com.commercetools.models.Error.ErrorObject;
import java.lang.String;
import com.commercetools.models.Error.DuplicatePriceScopeErrorImpl;

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