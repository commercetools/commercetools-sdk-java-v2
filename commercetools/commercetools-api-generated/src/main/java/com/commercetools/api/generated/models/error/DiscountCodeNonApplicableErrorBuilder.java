package com.commercetools.api.generated.models.error;

import com.commercetools.api.generated.models.error.ErrorObject;
import java.time.ZonedDateTime;
import com.commercetools.api.generated.models.error.DiscountCodeNonApplicableError;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class DiscountCodeNonApplicableErrorBuilder {
   
   
   private String message;
   
   @Nullable
   private String reason;
   
   @Nullable
   private java.time.ZonedDateTime validityCheckTime;
   
   @Nullable
   private String discountCode;
   
   @Nullable
   private java.time.ZonedDateTime validUntil;
   
   @Nullable
   private java.time.ZonedDateTime validFrom;
   
   @Nullable
   private String dicountCodeId;
   
   public DiscountCodeNonApplicableErrorBuilder message( final String message) {
      this.message = message;
      return this;
   }
   
   public DiscountCodeNonApplicableErrorBuilder reason(@Nullable final String reason) {
      this.reason = reason;
      return this;
   }
   
   public DiscountCodeNonApplicableErrorBuilder validityCheckTime(@Nullable final java.time.ZonedDateTime validityCheckTime) {
      this.validityCheckTime = validityCheckTime;
      return this;
   }
   
   public DiscountCodeNonApplicableErrorBuilder discountCode(@Nullable final String discountCode) {
      this.discountCode = discountCode;
      return this;
   }
   
   public DiscountCodeNonApplicableErrorBuilder validUntil(@Nullable final java.time.ZonedDateTime validUntil) {
      this.validUntil = validUntil;
      return this;
   }
   
   public DiscountCodeNonApplicableErrorBuilder validFrom(@Nullable final java.time.ZonedDateTime validFrom) {
      this.validFrom = validFrom;
      return this;
   }
   
   public DiscountCodeNonApplicableErrorBuilder dicountCodeId(@Nullable final String dicountCodeId) {
      this.dicountCodeId = dicountCodeId;
      return this;
   }
   
   
   public String getMessage(){
      return this.message;
   }
   
   @Nullable
   public String getReason(){
      return this.reason;
   }
   
   @Nullable
   public java.time.ZonedDateTime getValidityCheckTime(){
      return this.validityCheckTime;
   }
   
   @Nullable
   public String getDiscountCode(){
      return this.discountCode;
   }
   
   @Nullable
   public java.time.ZonedDateTime getValidUntil(){
      return this.validUntil;
   }
   
   @Nullable
   public java.time.ZonedDateTime getValidFrom(){
      return this.validFrom;
   }
   
   @Nullable
   public String getDicountCodeId(){
      return this.dicountCodeId;
   }

   public DiscountCodeNonApplicableError build() {
       return new DiscountCodeNonApplicableErrorImpl(message, reason, validityCheckTime, discountCode, validUntil, validFrom, dicountCodeId);
   }
   
   public static DiscountCodeNonApplicableErrorBuilder of() {
      return new DiscountCodeNonApplicableErrorBuilder();
   }
   
   public static DiscountCodeNonApplicableErrorBuilder of(final DiscountCodeNonApplicableError template) {
      DiscountCodeNonApplicableErrorBuilder builder = new DiscountCodeNonApplicableErrorBuilder();
      builder.message = template.getMessage();
      builder.reason = template.getReason();
      builder.validityCheckTime = template.getValidityCheckTime();
      builder.discountCode = template.getDiscountCode();
      builder.validUntil = template.getValidUntil();
      builder.validFrom = template.getValidFrom();
      builder.dicountCodeId = template.getDicountCodeId();
      return builder;
   }
   
}