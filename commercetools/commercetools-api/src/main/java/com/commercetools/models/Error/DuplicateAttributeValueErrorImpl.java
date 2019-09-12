package com.commercetools.models.Error;

import com.commercetools.models.Error.ErrorObject;
import com.commercetools.models.Product.Attribute;
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
public final class DuplicateAttributeValueErrorImpl implements DuplicateAttributeValueError {

   private java.lang.String code;
   
   private java.lang.String message;
   
   private com.commercetools.models.Product.Attribute attribute;

   @JsonCreator
   DuplicateAttributeValueErrorImpl(@JsonProperty("message") final java.lang.String message, @JsonProperty("attribute") final com.commercetools.models.Product.Attribute attribute) {
      this.message = message;
      this.attribute = attribute;
      this.code = "DuplicateAttributeValue";
   }
   public DuplicateAttributeValueErrorImpl() {
      
   }
   
   
   public java.lang.String getCode(){
      return this.code;
   }
   
   
   public java.lang.String getMessage(){
      return this.message;
   }
   
   
   public com.commercetools.models.Product.Attribute getAttribute(){
      return this.attribute;
   }

   public void setMessage(final java.lang.String message){
      this.message = message;
   }
   
   public void setAttribute(final com.commercetools.models.Product.Attribute attribute){
      this.attribute = attribute;
   }

}