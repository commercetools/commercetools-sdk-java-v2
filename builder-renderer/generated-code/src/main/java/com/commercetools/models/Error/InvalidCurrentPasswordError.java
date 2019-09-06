package com.commercetools.models.Error;

import com.commercetools.models.Error.ErrorObject;
import java.lang.String;
import com.commercetools.models.Error.InvalidCurrentPasswordErrorImpl;

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
@JsonDeserialize(as = InvalidCurrentPasswordErrorImpl.class)
public interface InvalidCurrentPasswordError extends ErrorObject {


   
   public static InvalidCurrentPasswordErrorImpl of(){
      return new InvalidCurrentPasswordErrorImpl();
   }
   

   public static InvalidCurrentPasswordErrorImpl of(final InvalidCurrentPasswordError template) {
      InvalidCurrentPasswordErrorImpl instance = new InvalidCurrentPasswordErrorImpl();
      instance.setMessage(template.getMessage());
      return instance;
   }

}