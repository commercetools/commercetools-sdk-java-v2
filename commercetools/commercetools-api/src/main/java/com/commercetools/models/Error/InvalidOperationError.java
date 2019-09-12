package com.commercetools.models.Error;

import com.commercetools.models.Error.ErrorObject;
import java.lang.String;
import com.commercetools.models.Error.InvalidOperationErrorImpl;

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
@JsonDeserialize(as = InvalidOperationErrorImpl.class)
public interface InvalidOperationError extends ErrorObject {


   
   public static InvalidOperationErrorImpl of(){
      return new InvalidOperationErrorImpl();
   }
   

   public static InvalidOperationErrorImpl of(final InvalidOperationError template) {
      InvalidOperationErrorImpl instance = new InvalidOperationErrorImpl();
      instance.setMessage(template.getMessage());
      return instance;
   }

}