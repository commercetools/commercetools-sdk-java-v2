package com.commercetools.api.generated.models.customer;


import com.commercetools.api.generated.models.customer.CustomerResetPassword;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomerResetPasswordBuilder {
   
   
   private String newPassword;
   
   @Nullable
   private Long version;
   
   
   private String tokenValue;
   
   public CustomerResetPasswordBuilder newPassword( final String newPassword) {
      this.newPassword = newPassword;
      return this;
   }
   
   public CustomerResetPasswordBuilder version(@Nullable final Long version) {
      this.version = version;
      return this;
   }
   
   public CustomerResetPasswordBuilder tokenValue( final String tokenValue) {
      this.tokenValue = tokenValue;
      return this;
   }
   
   
   public String getNewPassword(){
      return this.newPassword;
   }
   
   @Nullable
   public Long getVersion(){
      return this.version;
   }
   
   
   public String getTokenValue(){
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