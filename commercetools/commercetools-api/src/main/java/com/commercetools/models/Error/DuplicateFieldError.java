package com.commercetools.models.Error;

import com.commercetools.models.Error.ErrorObject;
import java.lang.Object;
import java.lang.String;
import com.commercetools.models.Error.DuplicateFieldErrorImpl;

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
@JsonDeserialize(as = DuplicateFieldErrorImpl.class)
public interface DuplicateFieldError extends ErrorObject {

   
   
   @JsonProperty("field")
   public String getField();
   
   
   @JsonProperty("duplicateValue")
   public Object getDuplicateValue();

   public void setField(final String field);
   
   public void setDuplicateValue(final Object duplicateValue);
   
   public static DuplicateFieldErrorImpl of(){
      return new DuplicateFieldErrorImpl();
   }
   

   public static DuplicateFieldErrorImpl of(final DuplicateFieldError template) {
      DuplicateFieldErrorImpl instance = new DuplicateFieldErrorImpl();
      instance.setMessage(template.getMessage());
      instance.setDuplicateValue(template.getDuplicateValue());
      instance.setField(template.getField());
      return instance;
   }

}