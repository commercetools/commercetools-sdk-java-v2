package com.commercetools.models.error;

import com.commercetools.models.common.Reference;
import com.commercetools.models.error.ErrorObject;
import com.commercetools.models.error.DuplicateFieldWithConflictingResourceErrorImpl;

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
@JsonDeserialize(as = DuplicateFieldWithConflictingResourceErrorImpl.class)
public interface DuplicateFieldWithConflictingResourceError extends ErrorObject {

   
   @NotNull
   @JsonProperty("field")
   public String getField();
   
   @NotNull
   @JsonProperty("duplicateValue")
   public Object getDuplicateValue();
   
   @NotNull
   @Valid
   @JsonProperty("conflictingResource")
   public Reference getConflictingResource();

   public void setField(final String field);
   
   public void setDuplicateValue(final Object duplicateValue);
   
   public void setConflictingResource(final Reference conflictingResource);
   
   public static DuplicateFieldWithConflictingResourceErrorImpl of(){
      return new DuplicateFieldWithConflictingResourceErrorImpl();
   }
   

   public static DuplicateFieldWithConflictingResourceErrorImpl of(final DuplicateFieldWithConflictingResourceError template) {
      DuplicateFieldWithConflictingResourceErrorImpl instance = new DuplicateFieldWithConflictingResourceErrorImpl();
      instance.setMessage(template.getMessage());
      instance.setConflictingResource(template.getConflictingResource());
      instance.setDuplicateValue(template.getDuplicateValue());
      instance.setField(template.getField());
      return instance;
   }

}