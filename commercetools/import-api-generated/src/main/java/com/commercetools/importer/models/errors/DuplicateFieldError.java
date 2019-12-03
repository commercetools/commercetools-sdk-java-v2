package com.commercetools.importer.models.errors;

import com.commercetools.importer.models.errors.ErrorObject;
import com.commercetools.importer.models.errors.DuplicateFieldErrorImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

/**
*  <p>A value for a field conflicts with an existing duplicate value.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = DuplicateFieldErrorImpl.class)
public interface DuplicateFieldError extends ErrorObject {

   /**
   *  <p>The name of the field.</p>
   */
   
   @JsonProperty("field")
   public String getField();
   /**
   *  <p>The offending duplicate value.</p>
   */
   
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