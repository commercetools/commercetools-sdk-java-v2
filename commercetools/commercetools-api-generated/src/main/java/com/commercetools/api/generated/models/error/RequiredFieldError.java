package com.commercetools.api.generated.models.error;

import com.commercetools.api.generated.models.error.ErrorObject;
import com.commercetools.api.generated.models.error.RequiredFieldErrorImpl;

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
@JsonDeserialize(as = RequiredFieldErrorImpl.class)
public interface RequiredFieldError extends ErrorObject {

   
   @NotNull
   @JsonProperty("field")
   public String getField();

   public void setField(final String field);
   
   public static RequiredFieldErrorImpl of(){
      return new RequiredFieldErrorImpl();
   }
   

   public static RequiredFieldErrorImpl of(final RequiredFieldError template) {
      RequiredFieldErrorImpl instance = new RequiredFieldErrorImpl();
      instance.setMessage(template.getMessage());
      instance.setField(template.getField());
      return instance;
   }

}