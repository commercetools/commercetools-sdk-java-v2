package com.commercetools.api.generated.models.error;

import com.commercetools.api.generated.models.common.Reference;
import com.commercetools.api.generated.models.error.ErrorObject;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class DuplicateFieldWithConflictingResourceErrorImpl implements DuplicateFieldWithConflictingResourceError {

   private String code;
   
   private String message;
   
   private com.commercetools.api.generated.models.common.Reference conflictingResource;
   
   private JsonNode duplicateValue;
   
   private String field;

   @JsonCreator
   DuplicateFieldWithConflictingResourceErrorImpl(@JsonProperty("message") final String message, @JsonProperty("conflictingResource") final com.commercetools.api.generated.models.common.Reference conflictingResource, @JsonProperty("duplicateValue") final JsonNode duplicateValue, @JsonProperty("field") final String field) {
      this.message = message;
      this.conflictingResource = conflictingResource;
      this.duplicateValue = duplicateValue;
      this.field = field;
      this.code = "DuplicateFieldWithConflictingResource";
   }
   public DuplicateFieldWithConflictingResourceErrorImpl() {
      
   }
   
   
   public String getCode(){
      return this.code;
   }
   
   
   public String getMessage(){
      return this.message;
   }
   
   
   public com.commercetools.api.generated.models.common.Reference getConflictingResource(){
      return this.conflictingResource;
   }
   
   
   public JsonNode getDuplicateValue(){
      return this.duplicateValue;
   }
   
   
   public String getField(){
      return this.field;
   }

   public void setMessage(final String message){
      this.message = message;
   }
   
   public void setConflictingResource(final com.commercetools.api.generated.models.common.Reference conflictingResource){
      this.conflictingResource = conflictingResource;
   }
   
   public void setDuplicateValue(final JsonNode duplicateValue){
      this.duplicateValue = duplicateValue;
   }
   
   public void setField(final String field){
      this.field = field;
   }

}