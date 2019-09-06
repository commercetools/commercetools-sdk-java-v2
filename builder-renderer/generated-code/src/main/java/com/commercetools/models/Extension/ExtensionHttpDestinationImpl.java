package com.commercetools.models.Extension;

import com.commercetools.models.Extension.ExtensionDestination;
import com.commercetools.models.Extension.ExtensionHttpDestinationAuthentication;
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

import json.CommercetoolsJsonUtils;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ExtensionHttpDestinationImpl implements ExtensionHttpDestination {

   private java.lang.String type;
   
   private java.lang.String url;
   
   private com.commercetools.models.Extension.ExtensionHttpDestinationAuthentication authentication;

   @JsonCreator
   ExtensionHttpDestinationImpl(@JsonProperty("url") final java.lang.String url, @JsonProperty("authentication") final com.commercetools.models.Extension.ExtensionHttpDestinationAuthentication authentication) {
      this.url = url;
      this.authentication = authentication;
      this.type = "HTTP";
   }
   public ExtensionHttpDestinationImpl() {
      
   }
   
   
   public java.lang.String getType(){
      return this.type;
   }
   
   
   public java.lang.String getUrl(){
      return this.url;
   }
   
   
   public com.commercetools.models.Extension.ExtensionHttpDestinationAuthentication getAuthentication(){
      return this.authentication;
   }

   public void setUrl(final java.lang.String url){
      this.url = url;
   }
   
   public void setAuthentication(final com.commercetools.models.Extension.ExtensionHttpDestinationAuthentication authentication){
      this.authentication = authentication;
   }

}