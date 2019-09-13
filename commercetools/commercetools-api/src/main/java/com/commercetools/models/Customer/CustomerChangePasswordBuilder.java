package com.commercetools.models.customer;

import java.lang.Long;
import java.lang.String;
import com.commercetools.models.customer.CustomerChangePassword;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomerChangePasswordBuilder {
   
   
   private java.lang.String newPassword;
   
   
   private java.lang.String id;
   
   
   private java.lang.Long version;
   
   
   private java.lang.String currentPassword;
   
   public CustomerChangePasswordBuilder newPassword( final java.lang.String newPassword) {
      this.newPassword = newPassword;
      return this;
   }
   
   public CustomerChangePasswordBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public CustomerChangePasswordBuilder version( final java.lang.Long version) {
      this.version = version;
      return this;
   }
   
   public CustomerChangePasswordBuilder currentPassword( final java.lang.String currentPassword) {
      this.currentPassword = currentPassword;
      return this;
   }
   
   
   public java.lang.String getNewPassword(){
      return this.newPassword;
   }
   
   
   public java.lang.String getId(){
      return this.id;
   }
   
   
   public java.lang.Long getVersion(){
      return this.version;
   }
   
   
   public java.lang.String getCurrentPassword(){
      return this.currentPassword;
   }

   public CustomerChangePassword build() {
       return new CustomerChangePasswordImpl(newPassword, id, version, currentPassword);
   }
   
   public static CustomerChangePasswordBuilder of() {
      return new CustomerChangePasswordBuilder();
   }
   
   public static CustomerChangePasswordBuilder of(final CustomerChangePassword template) {
      CustomerChangePasswordBuilder builder = new CustomerChangePasswordBuilder();
      builder.newPassword = template.getNewPassword();
      builder.id = template.getId();
      builder.version = template.getVersion();
      builder.currentPassword = template.getCurrentPassword();
      return builder;
   }
   
}