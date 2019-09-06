package com.commercetools.models.Error;

import com.commercetools.models.Error.ErrorObject;
import java.lang.String;
import java.time.ZonedDateTime;
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
public final class DiscountCodeNonApplicableErrorImpl implements DiscountCodeNonApplicableError {

   private java.lang.String code;
   
   private java.lang.String message;
   
   private java.lang.String reason;
   
   private java.time.ZonedDateTime validityCheckTime;
   
   private java.lang.String discountCode;
   
   private java.time.ZonedDateTime validUntil;
   
   private java.time.ZonedDateTime validFrom;
   
   private java.lang.String dicountCodeId;

   @JsonCreator
   DiscountCodeNonApplicableErrorImpl(@JsonProperty("message") final java.lang.String message, @JsonProperty("reason") final java.lang.String reason, @JsonProperty("validityCheckTime") final java.time.ZonedDateTime validityCheckTime, @JsonProperty("discountCode") final java.lang.String discountCode, @JsonProperty("validUntil") final java.time.ZonedDateTime validUntil, @JsonProperty("validFrom") final java.time.ZonedDateTime validFrom, @JsonProperty("dicountCodeId") final java.lang.String dicountCodeId) {
      this.message = message;
      this.reason = reason;
      this.validityCheckTime = validityCheckTime;
      this.discountCode = discountCode;
      this.validUntil = validUntil;
      this.validFrom = validFrom;
      this.dicountCodeId = dicountCodeId;
      this.code = "DiscountCodeNonApplicable";
   }
   public DiscountCodeNonApplicableErrorImpl() {
      
   }
   
   
   public java.lang.String getCode(){
      return this.code;
   }
   
   
   public java.lang.String getMessage(){
      return this.message;
   }
   
   
   public java.lang.String getReason(){
      return this.reason;
   }
   
   
   public java.time.ZonedDateTime getValidityCheckTime(){
      return this.validityCheckTime;
   }
   
   
   public java.lang.String getDiscountCode(){
      return this.discountCode;
   }
   
   
   public java.time.ZonedDateTime getValidUntil(){
      return this.validUntil;
   }
   
   
   public java.time.ZonedDateTime getValidFrom(){
      return this.validFrom;
   }
   
   
   public java.lang.String getDicountCodeId(){
      return this.dicountCodeId;
   }

   public void setMessage(final java.lang.String message){
      this.message = message;
   }
   
   public void setReason(final java.lang.String reason){
      this.reason = reason;
   }
   
   public void setValidityCheckTime(final java.time.ZonedDateTime validityCheckTime){
      this.validityCheckTime = validityCheckTime;
   }
   
   public void setDiscountCode(final java.lang.String discountCode){
      this.discountCode = discountCode;
   }
   
   public void setValidUntil(final java.time.ZonedDateTime validUntil){
      this.validUntil = validUntil;
   }
   
   public void setValidFrom(final java.time.ZonedDateTime validFrom){
      this.validFrom = validFrom;
   }
   
   public void setDicountCodeId(final java.lang.String dicountCodeId){
      this.dicountCodeId = dicountCodeId;
   }

}