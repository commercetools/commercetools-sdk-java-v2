package com.commercetools.models.extension;

import com.commercetools.models.extension.ExtensionHttpDestinationAuthentication;
import java.lang.String;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ExtensionAuthorizationHeaderAuthenticationImpl implements ExtensionAuthorizationHeaderAuthentication {

   private java.lang.String type;
   
   private java.lang.String headerValue;

   @JsonCreator
   ExtensionAuthorizationHeaderAuthenticationImpl(@JsonProperty("headerValue") final java.lang.String headerValue) {
      this.headerValue = headerValue;
      this.type = "AuthorizationHeader";
   }
   public ExtensionAuthorizationHeaderAuthenticationImpl() {
      
   }
   
   
   public java.lang.String getType(){
      return this.type;
   }
   
   
   public java.lang.String getHeaderValue(){
      return this.headerValue;
   }

   public void setHeaderValue(final java.lang.String headerValue){
      this.headerValue = headerValue;
   }

}