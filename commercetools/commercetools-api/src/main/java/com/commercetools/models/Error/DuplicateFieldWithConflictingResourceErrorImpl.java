package com.commercetools.models.Error;

import com.commercetools.models.Common.Reference;
import com.commercetools.models.Error.ErrorObject;
import java.lang.Object;
import java.lang.String;
import javax.annotation.Generated;
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


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class DuplicateFieldWithConflictingResourceErrorImpl implements DuplicateFieldWithConflictingResourceError {

   private java.lang.String code;
   
   private java.lang.String message;
   
   private com.commercetools.models.Common.Reference conflictingResource;
   
   private java.lang.Object duplicateValue;
   
   private java.lang.String field;

   @JsonCreator
   DuplicateFieldWithConflictingResourceErrorImpl(@JsonProperty("message") final java.lang.String message, @JsonProperty("conflictingResource") final com.commercetools.models.Common.Reference conflictingResource, @JsonProperty("duplicateValue") final java.lang.Object duplicateValue, @JsonProperty("field") final java.lang.String field) {
      this.message = message;
      this.conflictingResource = conflictingResource;
      this.duplicateValue = duplicateValue;
      this.field = field;
      this.code = "DuplicateFieldWithConflictingResource";
   }
   public DuplicateFieldWithConflictingResourceErrorImpl() {
      
   }
   
   
   public java.lang.String getCode(){
      return this.code;
   }
   
   
   public java.lang.String getMessage(){
      return this.message;
   }
   
   
   public com.commercetools.models.Common.Reference getConflictingResource(){
      return this.conflictingResource;
   }
   
   
   public java.lang.Object getDuplicateValue(){
      return this.duplicateValue;
   }
   
   
   public java.lang.String getField(){
      return this.field;
   }

   public void setMessage(final java.lang.String message){
      this.message = message;
   }
   
   public void setConflictingResource(final com.commercetools.models.Common.Reference conflictingResource){
      this.conflictingResource = conflictingResource;
   }
   
   public void setDuplicateValue(final java.lang.Object duplicateValue){
      this.duplicateValue = duplicateValue;
   }
   
   public void setField(final java.lang.String field){
      this.field = field;
   }

}