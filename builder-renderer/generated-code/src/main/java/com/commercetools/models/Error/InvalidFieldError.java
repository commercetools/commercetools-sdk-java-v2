package com.commercetools.models.Error;

import com.commercetools.models.Error.ErrorObject;
import java.lang.Object;
import java.lang.String;
import com.commercetools.models.Error.InvalidFieldErrorImpl;

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
@JsonDeserialize(as = InvalidFieldErrorImpl.class)
public interface InvalidFieldError extends ErrorObject {

   
   @NotNull
   @JsonProperty("field")
   public String getField();
   
   @NotNull
   @JsonProperty("invalidValue")
   public Object getInvalidValue();
   
   
   @JsonProperty("allowedValues")
   public List<Object> getAllowedValues();

   public void setField(final String field);
   
   public void setInvalidValue(final Object invalidValue);
   
   public void setAllowedValues(final List<Object> allowedValues);
   
   public static InvalidFieldErrorImpl of(){
      return new InvalidFieldErrorImpl();
   }
   

   public static InvalidFieldErrorImpl of(final InvalidFieldError template) {
      InvalidFieldErrorImpl instance = new InvalidFieldErrorImpl();
      instance.setMessage(template.getMessage());
      instance.setAllowedValues(template.getAllowedValues());
      instance.setField(template.getField());
      instance.setInvalidValue(template.getInvalidValue());
      return instance;
   }

}