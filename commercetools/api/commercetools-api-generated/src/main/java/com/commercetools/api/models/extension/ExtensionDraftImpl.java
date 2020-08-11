package com.commercetools.api.models.extension;

import com.commercetools.api.models.extension.ExtensionDestination;
import com.commercetools.api.models.extension.ExtensionTrigger;
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
public final class ExtensionDraftImpl implements ExtensionDraft {

   private Integer timeoutInMs;

   private com.commercetools.api.models.extension.ExtensionDestination destination;

   private java.util.List<com.commercetools.api.models.extension.ExtensionTrigger> triggers;

   private String key;

   @JsonCreator
   ExtensionDraftImpl(@JsonProperty("timeoutInMs") final Integer timeoutInMs, @JsonProperty("destination") final com.commercetools.api.models.extension.ExtensionDestination destination, @JsonProperty("triggers") final java.util.List<com.commercetools.api.models.extension.ExtensionTrigger> triggers, @JsonProperty("key") final String key) {
      this.timeoutInMs = timeoutInMs;
      this.destination = destination;
      this.triggers = triggers;
      this.key = key;
   }
   public ExtensionDraftImpl() {

   }

   /**
   *  <p>The maximum time the commercetools platform waits for a response from the extension.
   *  The maximum value is 2000 ms (2 seconds).
   *  This limit can be increased per project after we review the performance impact.
   *  Please contact Support via the <a href="https://support.commercetools.com">Support Portal</a> and provide the region, project key and use case.</p>
   */
   public Integer getTimeoutInMs(){
      return this.timeoutInMs;
   }

   /**
   *  <p>Details where the extension can be reached</p>
   */
   public com.commercetools.api.models.extension.ExtensionDestination getDestination(){
      return this.destination;
   }

   /**
   *  <p>Describes what triggers the extension</p>
   */
   public java.util.List<com.commercetools.api.models.extension.ExtensionTrigger> getTriggers(){
      return this.triggers;
   }

   /**
   *  <p>User-specific unique identifier for the extension</p>
   */
   public String getKey(){
      return this.key;
   }

   public void setTimeoutInMs(final Integer timeoutInMs){
      this.timeoutInMs = timeoutInMs;
   }

   public void setDestination(final com.commercetools.api.models.extension.ExtensionDestination destination){
      this.destination = destination;
   }

   public void setTriggers(final java.util.List<com.commercetools.api.models.extension.ExtensionTrigger> triggers){
      this.triggers = triggers;
   }

   public void setKey(final String key){
      this.key = key;
   }

}
