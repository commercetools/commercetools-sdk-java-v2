package com.commercetools.api.generated.models.customer;


import com.commercetools.api.generated.models.customer.CustomerResetPasswordImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = CustomerResetPasswordImpl.class)
public interface CustomerResetPassword  {

   
   @NotNull
   @JsonProperty("tokenValue")
   public String getTokenValue();
   
   @NotNull
   @JsonProperty("newPassword")
   public String getNewPassword();
   
   
   @JsonProperty("version")
   public Long getVersion();

   public void setTokenValue(final String tokenValue);
   
   public void setNewPassword(final String newPassword);
   
   public void setVersion(final Long version);
   
   public static CustomerResetPasswordImpl of(){
      return new CustomerResetPasswordImpl();
   }
   

   public static CustomerResetPasswordImpl of(final CustomerResetPassword template) {
      CustomerResetPasswordImpl instance = new CustomerResetPasswordImpl();
      instance.setNewPassword(template.getNewPassword());
      instance.setVersion(template.getVersion());
      instance.setTokenValue(template.getTokenValue());
      return instance;
   }

}