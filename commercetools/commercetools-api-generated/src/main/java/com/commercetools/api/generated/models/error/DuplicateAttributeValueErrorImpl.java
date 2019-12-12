package com.commercetools.api.generated.models.error;

import com.commercetools.api.generated.models.error.ErrorObject;
import com.commercetools.api.generated.models.product.Attribute;
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
public final class DuplicateAttributeValueErrorImpl implements DuplicateAttributeValueError {

   private String code;
   
   private String message;
   
   private com.commercetools.api.generated.models.product.Attribute attribute;

   @JsonCreator
   DuplicateAttributeValueErrorImpl(@JsonProperty("message") final String message, @JsonProperty("attribute") final com.commercetools.api.generated.models.product.Attribute attribute) {
      this.message = message;
      this.attribute = attribute;
      this.code = "DuplicateAttributeValue";
   }
   public DuplicateAttributeValueErrorImpl() {
      
   }
   
   
   public String getCode(){
      return this.code;
   }
   
   
   public String getMessage(){
      return this.message;
   }
   
   
   public com.commercetools.api.generated.models.product.Attribute getAttribute(){
      return this.attribute;
   }

   public void setMessage(final String message){
      this.message = message;
   }
   
   public void setAttribute(final com.commercetools.api.generated.models.product.Attribute attribute){
      this.attribute = attribute;
   }

}