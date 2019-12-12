package com.commercetools.api.generated.models.error;

import com.commercetools.api.generated.models.error.ErrorObject;
import java.time.ZonedDateTime;
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
public final class DiscountCodeNonApplicableErrorImpl implements DiscountCodeNonApplicableError {

   private String code;
   
   private String message;
   
   private String reason;
   
   private java.time.ZonedDateTime validityCheckTime;
   
   private String discountCode;
   
   private java.time.ZonedDateTime validUntil;
   
   private java.time.ZonedDateTime validFrom;
   
   private String dicountCodeId;

   @JsonCreator
   DiscountCodeNonApplicableErrorImpl(@JsonProperty("message") final String message, @JsonProperty("reason") final String reason, @JsonProperty("validityCheckTime") final java.time.ZonedDateTime validityCheckTime, @JsonProperty("discountCode") final String discountCode, @JsonProperty("validUntil") final java.time.ZonedDateTime validUntil, @JsonProperty("validFrom") final java.time.ZonedDateTime validFrom, @JsonProperty("dicountCodeId") final String dicountCodeId) {
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
   
   
   public String getCode(){
      return this.code;
   }
   
   
   public String getMessage(){
      return this.message;
   }
   
   
   public String getReason(){
      return this.reason;
   }
   
   
   public java.time.ZonedDateTime getValidityCheckTime(){
      return this.validityCheckTime;
   }
   
   
   public String getDiscountCode(){
      return this.discountCode;
   }
   
   
   public java.time.ZonedDateTime getValidUntil(){
      return this.validUntil;
   }
   
   
   public java.time.ZonedDateTime getValidFrom(){
      return this.validFrom;
   }
   
   
   public String getDicountCodeId(){
      return this.dicountCodeId;
   }

   public void setMessage(final String message){
      this.message = message;
   }
   
   public void setReason(final String reason){
      this.reason = reason;
   }
   
   public void setValidityCheckTime(final java.time.ZonedDateTime validityCheckTime){
      this.validityCheckTime = validityCheckTime;
   }
   
   public void setDiscountCode(final String discountCode){
      this.discountCode = discountCode;
   }
   
   public void setValidUntil(final java.time.ZonedDateTime validUntil){
      this.validUntil = validUntil;
   }
   
   public void setValidFrom(final java.time.ZonedDateTime validFrom){
      this.validFrom = validFrom;
   }
   
   public void setDicountCodeId(final String dicountCodeId){
      this.dicountCodeId = dicountCodeId;
   }

}