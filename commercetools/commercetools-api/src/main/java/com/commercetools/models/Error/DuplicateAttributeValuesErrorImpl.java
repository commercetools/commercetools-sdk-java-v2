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
public final class DuplicateAttributeValuesErrorImpl implements DuplicateAttributeValuesError {

   private java.lang.String code;
   
   private java.lang.String message;
   
   private java.util.List<com.commercetools.models.Product.Attribute> attributes;

   @JsonCreator
   DuplicateAttributeValuesErrorImpl(@JsonProperty("message") final java.lang.String message, @JsonProperty("attributes") final java.util.List<com.commercetools.models.Product.Attribute> attributes) {
      this.message = message;
      this.attributes = attributes;
      this.code = "DuplicateAttributeValues";
   }
   public DuplicateAttributeValuesErrorImpl() {
      
   }
   
   
   public java.lang.String getCode(){
      return this.code;
   }
   
   
   public java.lang.String getMessage(){
      return this.message;
   }
   
   
   public java.util.List<com.commercetools.models.Product.Attribute> getAttributes(){
      return this.attributes;
   }

   public void setMessage(final java.lang.String message){
      this.message = message;
   }
   
   public void setAttributes(final java.util.List<com.commercetools.models.Product.Attribute> attributes){
      this.attributes = attributes;
   }

}