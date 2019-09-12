package com.commercetools.models.Error;

import com.commercetools.models.Common.ReferenceTypeId;
import com.commercetools.models.Error.ErrorObject;
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
public final class ReferenceExistsErrorImpl implements ReferenceExistsError {

   private java.lang.String code;
   
   private java.lang.String message;
   
   private com.commercetools.models.Common.ReferenceTypeId referencedBy;

   @JsonCreator
   ReferenceExistsErrorImpl(@JsonProperty("message") final java.lang.String message, @JsonProperty("referencedBy") final com.commercetools.models.Common.ReferenceTypeId referencedBy) {
      this.message = message;
      this.referencedBy = referencedBy;
      this.code = "ReferenceExists";
   }
   public ReferenceExistsErrorImpl() {
      
   }
   
   
   public java.lang.String getCode(){
      return this.code;
   }
   
   
   public java.lang.String getMessage(){
      return this.message;
   }
   
   
   public com.commercetools.models.Common.ReferenceTypeId getReferencedBy(){
      return this.referencedBy;
   }

   public void setMessage(final java.lang.String message){
      this.message = message;
   }
   
   public void setReferencedBy(final com.commercetools.models.Common.ReferenceTypeId referencedBy){
      this.referencedBy = referencedBy;
   }

}