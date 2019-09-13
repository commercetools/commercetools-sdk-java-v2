package com.commercetools.models.customer;

import com.commercetools.models.customer.AnonymousCartSignInMode;
import java.lang.String;
import com.commercetools.models.customer.CustomerSignin;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomerSigninBuilder {
   
   @Nullable
   private java.lang.String anonymousId;
   
   
   private java.lang.String password;
   
   @Nullable
   private com.commercetools.models.customer.AnonymousCartSignInMode anonymousCartSignInMode;
   
   @Nullable
   private java.lang.String anonymousCartId;
   
   
   private java.lang.String email;
   
   public CustomerSigninBuilder anonymousId(@Nullable final java.lang.String anonymousId) {
      this.anonymousId = anonymousId;
      return this;
   }
   
   public CustomerSigninBuilder password( final java.lang.String password) {
      this.password = password;
      return this;
   }
   
   public CustomerSigninBuilder anonymousCartSignInMode(@Nullable final com.commercetools.models.customer.AnonymousCartSignInMode anonymousCartSignInMode) {
      this.anonymousCartSignInMode = anonymousCartSignInMode;
      return this;
   }
   
   public CustomerSigninBuilder anonymousCartId(@Nullable final java.lang.String anonymousCartId) {
      this.anonymousCartId = anonymousCartId;
      return this;
   }
   
   public CustomerSigninBuilder email( final java.lang.String email) {
      this.email = email;
      return this;
   }
   
   @Nullable
   public java.lang.String getAnonymousId(){
      return this.anonymousId;
   }
   
   
   public java.lang.String getPassword(){
      return this.password;
   }
   
   @Nullable
   public com.commercetools.models.customer.AnonymousCartSignInMode getAnonymousCartSignInMode(){
      return this.anonymousCartSignInMode;
   }
   
   @Nullable
   public java.lang.String getAnonymousCartId(){
      return this.anonymousCartId;
   }
   
   
   public java.lang.String getEmail(){
      return this.email;
   }

   public CustomerSignin build() {
       return new CustomerSigninImpl(anonymousId, password, anonymousCartSignInMode, anonymousCartId, email);
   }
   
   public static CustomerSigninBuilder of() {
      return new CustomerSigninBuilder();
   }
   
   public static CustomerSigninBuilder of(final CustomerSignin template) {
      CustomerSigninBuilder builder = new CustomerSigninBuilder();
      builder.anonymousId = template.getAnonymousId();
      builder.password = template.getPassword();
      builder.anonymousCartSignInMode = template.getAnonymousCartSignInMode();
      builder.anonymousCartId = template.getAnonymousCartId();
      builder.email = template.getEmail();
      return builder;
   }
   
}