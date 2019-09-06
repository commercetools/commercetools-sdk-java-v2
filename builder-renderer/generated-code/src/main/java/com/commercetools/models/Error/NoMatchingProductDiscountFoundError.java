package com.commercetools.models.Error;

import com.commercetools.models.Error.ErrorObject;
import java.lang.String;
import com.commercetools.models.Error.NoMatchingProductDiscountFoundErrorImpl;

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
@JsonDeserialize(as = NoMatchingProductDiscountFoundErrorImpl.class)
public interface NoMatchingProductDiscountFoundError extends ErrorObject {


   
   public static NoMatchingProductDiscountFoundErrorImpl of(){
      return new NoMatchingProductDiscountFoundErrorImpl();
   }
   

   public static NoMatchingProductDiscountFoundErrorImpl of(final NoMatchingProductDiscountFoundError template) {
      NoMatchingProductDiscountFoundErrorImpl instance = new NoMatchingProductDiscountFoundErrorImpl();
      instance.setMessage(template.getMessage());
      return instance;
   }

}