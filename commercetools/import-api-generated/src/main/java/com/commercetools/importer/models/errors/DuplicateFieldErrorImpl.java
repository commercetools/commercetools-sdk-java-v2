package com.commercetools.importer.models.errors;

import com.commercetools.importer.models.errors.ErrorObject;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
*  <p>A value for a field conflicts with an existing duplicate value.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class DuplicateFieldErrorImpl implements DuplicateFieldError {

   private String code;
   
   private String message;
   
   private Object duplicateValue;
   
   private String field;

   @JsonCreator
   DuplicateFieldErrorImpl(@JsonProperty("message") final String message, @JsonProperty("duplicateValue") final Object duplicateValue, @JsonProperty("field") final String field) {
      this.message = message;
      this.duplicateValue = duplicateValue;
      this.field = field;
      this.code = "DuplicateField";
   }
   public DuplicateFieldErrorImpl() {
      
   }
   
   
   public String getCode(){
      return this.code;
   }
   
   /**
   *  <p>The error's description.</p>
   */
   public String getMessage(){
      return this.message;
   }
   
   /**
   *  <p>The offending duplicate value.</p>
   */
   public Object getDuplicateValue(){
      return this.duplicateValue;
   }
   
   /**
   *  <p>The name of the field.</p>
   */
   public String getField(){
      return this.field;
   }

   public void setMessage(final String message){
      this.message = message;
   }
   
   public void setDuplicateValue(final Object duplicateValue){
      this.duplicateValue = duplicateValue;
   }
   
   public void setField(final String field){
      this.field = field;
   }

}