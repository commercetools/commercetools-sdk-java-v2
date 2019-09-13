package com.commercetools.models.project;

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
public final class ExternalOAuthImpl implements ExternalOAuth {

   private java.lang.String authorizationHeader;
   
   private java.lang.String url;

   @JsonCreator
   ExternalOAuthImpl(@JsonProperty("authorizationHeader") final java.lang.String authorizationHeader, @JsonProperty("url") final java.lang.String url) {
      this.authorizationHeader = authorizationHeader;
      this.url = url;
   }
   public ExternalOAuthImpl() {
      
   }
   
   
   public java.lang.String getAuthorizationHeader(){
      return this.authorizationHeader;
   }
   
   
   public java.lang.String getUrl(){
      return this.url;
   }

   public void setAuthorizationHeader(final java.lang.String authorizationHeader){
      this.authorizationHeader = authorizationHeader;
   }
   
   public void setUrl(final java.lang.String url){
      this.url = url;
   }

}