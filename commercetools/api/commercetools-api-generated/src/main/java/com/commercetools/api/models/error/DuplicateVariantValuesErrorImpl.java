package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.VariantValues;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class DuplicateVariantValuesErrorImpl implements DuplicateVariantValuesError {

   private String code;
   
   private String message;
   
   private com.commercetools.api.models.error.VariantValues variantValues;

   @JsonCreator
   DuplicateVariantValuesErrorImpl(@JsonProperty("message") final String message, @JsonProperty("variantValues") final com.commercetools.api.models.error.VariantValues variantValues) {
      this.message = message;
      this.variantValues = variantValues;
      this.code = "DuplicateVariantValues";
   }
   public DuplicateVariantValuesErrorImpl() {
      
   }
   
   
   public String getCode(){
      return this.code;
   }
   
   
   public String getMessage(){
      return this.message;
   }
   
   
   public com.commercetools.api.models.error.VariantValues getVariantValues(){
      return this.variantValues;
   }

   public void setMessage(final String message){
      this.message = message;
   }
   
   public void setVariantValues(final com.commercetools.api.models.error.VariantValues variantValues){
      this.variantValues = variantValues;
   }

}
