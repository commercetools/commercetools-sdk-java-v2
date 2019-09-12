package com.commercetools.models.Error;

import com.commercetools.models.Error.ErrorObject;
import java.lang.String;
import com.commercetools.models.Error.InvalidSubjectErrorImpl;

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
@JsonDeserialize(as = InvalidSubjectErrorImpl.class)
public interface InvalidSubjectError extends ErrorObject {


   
   public static InvalidSubjectErrorImpl of(){
      return new InvalidSubjectErrorImpl();
   }
   

   public static InvalidSubjectErrorImpl of(final InvalidSubjectError template) {
      InvalidSubjectErrorImpl instance = new InvalidSubjectErrorImpl();
      instance.setMessage(template.getMessage());
      return instance;
   }

}