package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
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
public final class MissingTaxRateForCountryErrorImpl implements MissingTaxRateForCountryError {

   private String code;
   
   private String message;
   
   private String taxCategoryId;
   
   private String country;
   
   private String state;

   @JsonCreator
   MissingTaxRateForCountryErrorImpl(@JsonProperty("message") final String message, @JsonProperty("taxCategoryId") final String taxCategoryId, @JsonProperty("country") final String country, @JsonProperty("state") final String state) {
      this.message = message;
      this.taxCategoryId = taxCategoryId;
      this.country = country;
      this.state = state;
      this.code = "MissingTaxRateForCountry";
   }
   public MissingTaxRateForCountryErrorImpl() {
      
   }
   
   
   public String getCode(){
      return this.code;
   }
   
   
   public String getMessage(){
      return this.message;
   }
   
   
   public String getTaxCategoryId(){
      return this.taxCategoryId;
   }
   
   
   public String getCountry(){
      return this.country;
   }
   
   
   public String getState(){
      return this.state;
   }

   public void setMessage(final String message){
      this.message = message;
   }
   
   public void setTaxCategoryId(final String taxCategoryId){
      this.taxCategoryId = taxCategoryId;
   }
   
   public void setCountry(final String country){
      this.country = country;
   }
   
   public void setState(final String state){
      this.state = state;
   }

}
