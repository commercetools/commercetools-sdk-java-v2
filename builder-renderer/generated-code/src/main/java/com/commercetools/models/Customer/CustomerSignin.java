package com.commercetools.models.Customer;

import com.commercetools.models.Customer.AnonymousCartSignInMode;
import java.lang.String;
import com.commercetools.models.Customer.CustomerSigninImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import json.CommercetoolsJsonUtils;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = CustomerSigninImpl.class)
public interface CustomerSignin  {

   
   @NotNull
   @JsonProperty("email")
   public String getEmail();
   
   @NotNull
   @JsonProperty("password")
   public String getPassword();
   
   
   @JsonProperty("anonymousCartId")
   public String getAnonymousCartId();
   
   
   @JsonProperty("anonymousCartSignInMode")
   public AnonymousCartSignInMode getAnonymousCartSignInMode();
   
   
   @JsonProperty("anonymousId")
   public String getAnonymousId();

   public void setEmail(final String email);
   
   public void setPassword(final String password);
   
   public void setAnonymousCartId(final String anonymousCartId);
   
   public void setAnonymousCartSignInMode(final AnonymousCartSignInMode anonymousCartSignInMode);
   
   public void setAnonymousId(final String anonymousId);
   
   public static CustomerSigninImpl of(){
      return new CustomerSigninImpl();
   }
   

   public static CustomerSigninImpl of(final CustomerSignin template) {
      CustomerSigninImpl instance = new CustomerSigninImpl();
      instance.setAnonymousId(template.getAnonymousId());
      instance.setPassword(template.getPassword());
      instance.setAnonymousCartSignInMode(template.getAnonymousCartSignInMode());
      instance.setAnonymousCartId(template.getAnonymousCartId());
      instance.setEmail(template.getEmail());
      return instance;
   }

}