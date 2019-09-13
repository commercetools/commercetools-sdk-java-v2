package com.commercetools.models.error;

import com.commercetools.models.error.ErrorObject;
import java.lang.String;
import com.commercetools.models.error.InvalidInputErrorImpl;

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
@JsonDeserialize(as = InvalidInputErrorImpl.class)
public interface InvalidInputError extends ErrorObject {


   
   public static InvalidInputErrorImpl of(){
      return new InvalidInputErrorImpl();
   }
   

   public static InvalidInputErrorImpl of(final InvalidInputError template) {
      InvalidInputErrorImpl instance = new InvalidInputErrorImpl();
      instance.setMessage(template.getMessage());
      return instance;
   }

}