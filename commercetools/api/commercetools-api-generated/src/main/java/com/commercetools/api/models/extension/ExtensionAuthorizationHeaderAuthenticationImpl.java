package com.commercetools.api.models.extension;

import com.commercetools.api.models.extension.ExtensionHttpDestinationAuthentication;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ExtensionAuthorizationHeaderAuthenticationImpl implements ExtensionAuthorizationHeaderAuthentication {

   private String type;

   private String headerValue;

   @JsonCreator
   ExtensionAuthorizationHeaderAuthenticationImpl(@JsonProperty("headerValue") final String headerValue) {
      this.headerValue = headerValue;
      this.type = "AuthorizationHeader";
   }
   public ExtensionAuthorizationHeaderAuthenticationImpl() {

   }


   public String getType(){
      return this.type;
   }


   public String getHeaderValue(){
      return this.headerValue;
   }

   public void setHeaderValue(final String headerValue){
      this.headerValue = headerValue;
   }

}
