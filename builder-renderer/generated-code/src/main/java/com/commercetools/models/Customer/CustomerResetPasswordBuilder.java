package com.commercetools.models.Customer;

import java.lang.Long;
import java.lang.String;
import com.commercetools.models.Customer.CustomerResetPassword;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomerResetPasswordBuilder {
   
   
   private java.lang.String newPassword;
   
   @Nullable
   private java.lang.Long version;
   
   
   private java.lang.String tokenValue;
   
   public CustomerResetPasswordBuilder newPassword( final java.lang.String newPassword) {
      this.newPassword = newPassword;
      return this;
   }
   
   public CustomerResetPasswordBuilder version(@Nullable final java.lang.Long version) {
      this.version = version;
      return this;
   }
   
   public CustomerResetPasswordBuilder tokenValue( final java.lang.String tokenValue) {
      this.tokenValue = tokenValue;
      return this;
   }
   
   
   public java.lang.String getNewPassword(){
      return this.newPassword;
   }
   
   @Nullable
   public java.lang.Long getVersion(){
      return this.version;
   }
   
   
   public java.lang.String getTokenValue(){
      return this.tokenValue;
   }

   public CustomerResetPassword build() {
       return new CustomerResetPasswordImpl(newPassword, version, tokenValue);
   }
   
   public static CustomerResetPasswordBuilder of() {
      return new CustomerResetPasswordBuilder();
   }
   
   public static CustomerResetPasswordBuilder of(final CustomerResetPassword template) {
      CustomerResetPasswordBuilder builder = new CustomerResetPasswordBuilder();
      builder.newPassword = template.getNewPassword();
      builder.version = template.getVersion();
      builder.tokenValue = template.getTokenValue();
      return builder;
   }
   
}