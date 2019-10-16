package com.commercetools.api.generated.models.error;

import com.commercetools.api.generated.models.common.ReferenceTypeId;
import com.commercetools.api.generated.models.error.ErrorObject;
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

   private String code;
   
   private String message;
   
   private com.commercetools.api.generated.models.common.ReferenceTypeId referencedBy;

   @JsonCreator
   ReferenceExistsErrorImpl(@JsonProperty("message") final String message, @JsonProperty("referencedBy") final com.commercetools.api.generated.models.common.ReferenceTypeId referencedBy) {
      this.message = message;
      this.referencedBy = referencedBy;
      this.code = "ReferenceExists";
   }
   public ReferenceExistsErrorImpl() {
      
   }
   
   
   public String getCode(){
      return this.code;
   }
   
   
   public String getMessage(){
      return this.message;
   }
   
   
   public com.commercetools.api.generated.models.common.ReferenceTypeId getReferencedBy(){
      return this.referencedBy;
   }

   public void setMessage(final String message){
      this.message = message;
   }
   
   public void setReferencedBy(final com.commercetools.api.generated.models.common.ReferenceTypeId referencedBy){
      this.referencedBy = referencedBy;
   }

}