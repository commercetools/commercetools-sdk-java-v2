package com.commercetools.models.Extension;

import com.commercetools.models.Extension.ExtensionDestination;
import com.commercetools.models.Extension.ExtensionTrigger;
import java.lang.Integer;
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
public final class ExtensionDraftImpl implements ExtensionDraft {

   private java.lang.Integer timeoutInMs;
   
   private com.commercetools.models.Extension.ExtensionDestination destination;
   
   private java.util.List<com.commercetools.models.Extension.ExtensionTrigger> triggers;
   
   private java.lang.String key;

   @JsonCreator
   ExtensionDraftImpl(@JsonProperty("timeoutInMs") final java.lang.Integer timeoutInMs, @JsonProperty("destination") final com.commercetools.models.Extension.ExtensionDestination destination, @JsonProperty("triggers") final java.util.List<com.commercetools.models.Extension.ExtensionTrigger> triggers, @JsonProperty("key") final java.lang.String key) {
      this.timeoutInMs = timeoutInMs;
      this.destination = destination;
      this.triggers = triggers;
      this.key = key;
   }
   public ExtensionDraftImpl() {
      
   }
   
   
   public java.lang.Integer getTimeoutInMs(){
      return this.timeoutInMs;
   }
   
   
   public com.commercetools.models.Extension.ExtensionDestination getDestination(){
      return this.destination;
   }
   
   
   public java.util.List<com.commercetools.models.Extension.ExtensionTrigger> getTriggers(){
      return this.triggers;
   }
   
   
   public java.lang.String getKey(){
      return this.key;
   }

   public void setTimeoutInMs(final java.lang.Integer timeoutInMs){
      this.timeoutInMs = timeoutInMs;
   }
   
   public void setDestination(final com.commercetools.models.Extension.ExtensionDestination destination){
      this.destination = destination;
   }
   
   public void setTriggers(final java.util.List<com.commercetools.models.Extension.ExtensionTrigger> triggers){
      this.triggers = triggers;
   }
   
   public void setKey(final java.lang.String key){
      this.key = key;
   }

}