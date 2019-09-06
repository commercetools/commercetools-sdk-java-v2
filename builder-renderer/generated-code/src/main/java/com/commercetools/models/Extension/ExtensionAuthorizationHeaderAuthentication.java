package com.commercetools.models.Extension;

import com.commercetools.models.Extension.ExtensionHttpDestinationAuthentication;
import java.lang.String;
import com.commercetools.models.Extension.ExtensionAuthorizationHeaderAuthenticationImpl;

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
@JsonDeserialize(as = ExtensionAuthorizationHeaderAuthenticationImpl.class)
public interface ExtensionAuthorizationHeaderAuthentication extends ExtensionHttpDestinationAuthentication {

   
   @NotNull
   @JsonProperty("headerValue")
   public String getHeaderValue();

   public void setHeaderValue(final String headerValue);
   
   public static ExtensionAuthorizationHeaderAuthenticationImpl of(){
      return new ExtensionAuthorizationHeaderAuthenticationImpl();
   }
   

   public static ExtensionAuthorizationHeaderAuthenticationImpl of(final ExtensionAuthorizationHeaderAuthentication template) {
      ExtensionAuthorizationHeaderAuthenticationImpl instance = new ExtensionAuthorizationHeaderAuthenticationImpl();
      instance.setHeaderValue(template.getHeaderValue());
      return instance;
   }

}