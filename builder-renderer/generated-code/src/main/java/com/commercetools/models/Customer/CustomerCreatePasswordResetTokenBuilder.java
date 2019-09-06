package com.commercetools.models.Customer;

import java.lang.Long;
import java.lang.String;
import com.commercetools.models.Customer.CustomerCreatePasswordResetToken;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomerCreatePasswordResetTokenBuilder {
   
   @Nullable
   private java.lang.Long ttlMinutes;
   
   
   private java.lang.String email;
   
   public CustomerCreatePasswordResetTokenBuilder ttlMinutes(@Nullable final java.lang.Long ttlMinutes) {
      this.ttlMinutes = ttlMinutes;
      return this;
   }
   
   public CustomerCreatePasswordResetTokenBuilder email( final java.lang.String email) {
      this.email = email;
      return this;
   }
   
   @Nullable
   public java.lang.Long getTtlMinutes(){
      return this.ttlMinutes;
   }
   
   
   public java.lang.String getEmail(){
      return this.email;
   }

   public CustomerCreatePasswordResetToken build() {
       return new CustomerCreatePasswordResetTokenImpl(ttlMinutes, email);
   }
   
   public static CustomerCreatePasswordResetTokenBuilder of() {
      return new CustomerCreatePasswordResetTokenBuilder();
   }
   
   public static CustomerCreatePasswordResetTokenBuilder of(final CustomerCreatePasswordResetToken template) {
      CustomerCreatePasswordResetTokenBuilder builder = new CustomerCreatePasswordResetTokenBuilder();
      builder.ttlMinutes = template.getTtlMinutes();
      builder.email = template.getEmail();
      return builder;
   }
   
}