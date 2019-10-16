package com.commercetools.api.generated.models.extension;

import com.commercetools.api.generated.models.extension.ExtensionDestination;
import com.commercetools.api.generated.models.extension.ExtensionTrigger;
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
public final class ExtensionDraftImpl implements ExtensionDraft {

   private Integer timeoutInMs;
   
   private com.commercetools.api.generated.models.extension.ExtensionDestination destination;
   
   private java.util.List<com.commercetools.api.generated.models.extension.ExtensionTrigger> triggers;
   
   private String key;

   @JsonCreator
   ExtensionDraftImpl(@JsonProperty("timeoutInMs") final Integer timeoutInMs, @JsonProperty("destination") final com.commercetools.api.generated.models.extension.ExtensionDestination destination, @JsonProperty("triggers") final java.util.List<com.commercetools.api.generated.models.extension.ExtensionTrigger> triggers, @JsonProperty("key") final String key) {
      this.timeoutInMs = timeoutInMs;
      this.destination = destination;
      this.triggers = triggers;
      this.key = key;
   }
   public ExtensionDraftImpl() {
      
   }
   
   
   public Integer getTimeoutInMs(){
      return this.timeoutInMs;
   }
   
   
   public com.commercetools.api.generated.models.extension.ExtensionDestination getDestination(){
      return this.destination;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.extension.ExtensionTrigger> getTriggers(){
      return this.triggers;
   }
   
   
   public String getKey(){
      return this.key;
   }

   public void setTimeoutInMs(final Integer timeoutInMs){
      this.timeoutInMs = timeoutInMs;
   }
   
   public void setDestination(final com.commercetools.api.generated.models.extension.ExtensionDestination destination){
      this.destination = destination;
   }
   
   public void setTriggers(final java.util.List<com.commercetools.api.generated.models.extension.ExtensionTrigger> triggers){
      this.triggers = triggers;
   }
   
   public void setKey(final String key){
      this.key = key;
   }

}