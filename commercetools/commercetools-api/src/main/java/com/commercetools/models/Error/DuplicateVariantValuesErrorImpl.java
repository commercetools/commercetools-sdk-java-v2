package com.commercetools.models.Error;

import com.commercetools.models.Error.ErrorObject;
import com.commercetools.models.Error.VariantValues;
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
public final class DuplicateVariantValuesErrorImpl implements DuplicateVariantValuesError {

   private java.lang.String code;
   
   private java.lang.String message;
   
   private com.commercetools.models.Error.VariantValues variantValues;

   @JsonCreator
   DuplicateVariantValuesErrorImpl(@JsonProperty("message") final java.lang.String message, @JsonProperty("variantValues") final com.commercetools.models.Error.VariantValues variantValues) {
      this.message = message;
      this.variantValues = variantValues;
      this.code = "DuplicateVariantValues";
   }
   public DuplicateVariantValuesErrorImpl() {
      
   }
   
   
   public java.lang.String getCode(){
      return this.code;
   }
   
   
   public java.lang.String getMessage(){
      return this.message;
   }
   
   
   public com.commercetools.models.Error.VariantValues getVariantValues(){
      return this.variantValues;
   }

   public void setMessage(final java.lang.String message){
      this.message = message;
   }
   
   public void setVariantValues(final com.commercetools.models.Error.VariantValues variantValues){
      this.variantValues = variantValues;
   }

}