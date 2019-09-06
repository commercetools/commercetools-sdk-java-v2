package com.commercetools.models.Error;

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

import json.CommercetoolsJsonUtils;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MissingTaxRateForCountryErrorImpl implements MissingTaxRateForCountryError {

   private java.lang.String code;
   
   private java.lang.String message;
   
   private java.lang.String country;
   
   private java.lang.String state;
   
   private java.lang.String taxCategoryId;

   @JsonCreator
   MissingTaxRateForCountryErrorImpl(@JsonProperty("message") final java.lang.String message, @JsonProperty("country") final java.lang.String country, @JsonProperty("state") final java.lang.String state, @JsonProperty("taxCategoryId") final java.lang.String taxCategoryId) {
      this.message = message;
      this.country = country;
      this.state = state;
      this.taxCategoryId = taxCategoryId;
      this.code = "MissingTaxRateForCountry";
   }
   public MissingTaxRateForCountryErrorImpl() {
      
   }
   
   
   public java.lang.String getCode(){
      return this.code;
   }
   
   
   public java.lang.String getMessage(){
      return this.message;
   }
   
   
   public java.lang.String getCountry(){
      return this.country;
   }
   
   
   public java.lang.String getState(){
      return this.state;
   }
   
   
   public java.lang.String getTaxCategoryId(){
      return this.taxCategoryId;
   }

   public void setMessage(final java.lang.String message){
      this.message = message;
   }
   
   public void setCountry(final java.lang.String country){
      this.country = country;
   }
   
   public void setState(final java.lang.String state){
      this.state = state;
   }
   
   public void setTaxCategoryId(final java.lang.String taxCategoryId){
      this.taxCategoryId = taxCategoryId;
   }

}