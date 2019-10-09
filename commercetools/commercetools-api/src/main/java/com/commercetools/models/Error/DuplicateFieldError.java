package com.commercetools.models.error;

import com.commercetools.models.common.Reference;
import com.commercetools.models.error.ErrorObject;
import com.commercetools.models.error.DuplicateFieldErrorImpl;

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
   
   @Valid
   @JsonProperty("conflictingResource")
   public Reference getConflictingResource();

   public void setField(final String field);
   
   public void setDuplicateValue(final Object duplicateValue);
   
   public void setConflictingResource(final Reference conflictingResource);
   
   public static DuplicateFieldErrorImpl of(){
      return new DuplicateFieldErrorImpl();
   }
   

   public static DuplicateFieldErrorImpl of(final DuplicateFieldError template) {
      DuplicateFieldErrorImpl instance = new DuplicateFieldErrorImpl();
      instance.setMessage(template.getMessage());
      instance.setConflictingResource(template.getConflictingResource());
      instance.setDuplicateValue(template.getDuplicateValue());
      instance.setField(template.getField());
      return instance;
   }

}