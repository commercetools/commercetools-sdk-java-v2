package com.commercetools.api.generated.models.customer;

import com.commercetools.api.generated.models.customer.AnonymousCartSignInMode;
import com.commercetools.api.generated.models.customer.CustomerSignin;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomerSigninBuilder {
   
   @Nullable
   private Boolean updateProductData;
   
   @Nullable
   private String anonymousId;
   
   
   private String password;
   
   @Nullable
   private com.commercetools.api.generated.models.customer.AnonymousCartSignInMode anonymousCartSignInMode;
   
   @Nullable
   private String anonymousCartId;
   
   
   private String email;
   
   public CustomerSigninBuilder updateProductData(@Nullable final Boolean updateProductData) {
      this.updateProductData = updateProductData;
      return this;
   }
   
   public CustomerSigninBuilder anonymousId(@Nullable final String anonymousId) {
      this.anonymousId = anonymousId;
      return this;
   }
   
   public CustomerSigninBuilder password( final String password) {
      this.password = password;
      return this;
   }
   
   public CustomerSigninBuilder anonymousCartSignInMode(@Nullable final com.commercetools.api.generated.models.customer.AnonymousCartSignInMode anonymousCartSignInMode) {
      this.anonymousCartSignInMode = anonymousCartSignInMode;
      return this;
   }
   
   public CustomerSigninBuilder anonymousCartId(@Nullable final String anonymousCartId) {
      this.anonymousCartId = anonymousCartId;
      return this;
   }
   
   public CustomerSigninBuilder email( final String email) {
      this.email = email;
      return this;
   }
   
   @Nullable
   public Boolean getUpdateProductData(){
      return this.updateProductData;
   }
   
   @Nullable
   public String getAnonymousId(){
      return this.anonymousId;
   }
   
   
   public String getPassword(){
      return this.password;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.customer.AnonymousCartSignInMode getAnonymousCartSignInMode(){
      return this.anonymousCartSignInMode;
   }
   
   @Nullable
   public String getAnonymousCartId(){
      return this.anonymousCartId;
   }
   
   
   public String getEmail(){
      return this.email;
   }

   public CustomerSignin build() {
       return new CustomerSigninImpl(updateProductData, anonymousId, password, anonymousCartSignInMode, anonymousCartId, email);
   }
   
   public static CustomerSigninBuilder of() {
      return new CustomerSigninBuilder();
   }
   
   public static CustomerSigninBuilder of(final CustomerSignin template) {
      CustomerSigninBuilder builder = new CustomerSigninBuilder();
      builder.updateProductData = template.getUpdateProductData();
      builder.anonymousId = template.getAnonymousId();
      builder.password = template.getPassword();
      builder.anonymousCartSignInMode = template.getAnonymousCartSignInMode();
      builder.anonymousCartId = template.getAnonymousCartId();
      builder.email = template.getEmail();
      return builder;
   }
   
}