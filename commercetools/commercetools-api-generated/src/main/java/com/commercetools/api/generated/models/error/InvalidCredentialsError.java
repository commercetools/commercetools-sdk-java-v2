package com.commercetools.api.generated.models.error;

import com.commercetools.api.generated.models.error.ErrorObject;
import com.commercetools.api.generated.models.error.InvalidCredentialsErrorImpl;

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
@JsonDeserialize(as = InvalidCredentialsErrorImpl.class)
public interface InvalidCredentialsError extends ErrorObject {


   
   public static InvalidCredentialsErrorImpl of(){
      return new InvalidCredentialsErrorImpl();
   }
   

   public static InvalidCredentialsErrorImpl of(final InvalidCredentialsError template) {
      InvalidCredentialsErrorImpl instance = new InvalidCredentialsErrorImpl();
      instance.setMessage(template.getMessage());
      return instance;
   }

}