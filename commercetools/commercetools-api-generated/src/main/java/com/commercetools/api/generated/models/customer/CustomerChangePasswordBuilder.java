package com.commercetools.api.generated.models.customer;


import com.commercetools.api.generated.models.customer.CustomerChangePassword;
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
public final class CustomerChangePasswordBuilder {
   
   
   private String newPassword;
   
   
   private String id;
   
   
   private Long version;
   
   
   private String currentPassword;
   
   public CustomerChangePasswordBuilder newPassword( final String newPassword) {
      this.newPassword = newPassword;
      return this;
   }
   
   public CustomerChangePasswordBuilder id( final String id) {
      this.id = id;
      return this;
   }
   
   public CustomerChangePasswordBuilder version( final Long version) {
      this.version = version;
      return this;
   }
   
   public CustomerChangePasswordBuilder currentPassword( final String currentPassword) {
      this.currentPassword = currentPassword;
      return this;
   }
   
   
   public String getNewPassword(){
      return this.newPassword;
   }
   
   
   public String getId(){
      return this.id;
   }
   
   
   public Long getVersion(){
      return this.version;
   }
   
   
   public String getCurrentPassword(){
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