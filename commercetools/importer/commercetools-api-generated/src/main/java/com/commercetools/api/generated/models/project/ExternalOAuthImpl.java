package com.commercetools.api.generated.models.project;


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
public final class ExternalOAuthImpl implements ExternalOAuth {

   private String authorizationHeader;
   
   private String url;

   @JsonCreator
   ExternalOAuthImpl(@JsonProperty("authorizationHeader") final String authorizationHeader, @JsonProperty("url") final String url) {
      this.authorizationHeader = authorizationHeader;
      this.url = url;
   }
   public ExternalOAuthImpl() {
      
   }
   
   
   public String getAuthorizationHeader(){
      return this.authorizationHeader;
   }
   
   
   public String getUrl(){
      return this.url;
   }

   public void setAuthorizationHeader(final String authorizationHeader){
      this.authorizationHeader = authorizationHeader;
   }
   
   public void setUrl(final String url){
      this.url = url;
   }

}