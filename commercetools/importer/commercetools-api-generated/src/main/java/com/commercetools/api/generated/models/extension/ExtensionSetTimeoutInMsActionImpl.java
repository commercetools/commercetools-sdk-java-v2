package com.commercetools.api.generated.models.extension;

import com.commercetools.api.generated.models.extension.ExtensionUpdateAction;
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
public final class ExtensionSetTimeoutInMsActionImpl implements ExtensionSetTimeoutInMsAction {

   private String action;
   
   private Integer timeoutInMs;

   @JsonCreator
   ExtensionSetTimeoutInMsActionImpl(@JsonProperty("timeoutInMs") final Integer timeoutInMs) {
      this.timeoutInMs = timeoutInMs;
      this.action = "setTimeoutInMs";
   }
   public ExtensionSetTimeoutInMsActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   /**
   *  <p>The maximum time the commercetools platform waits for a response from the extension.
   *  The maximum value is 2000 ms (2 seconds).
   *  This limit can be increased per project after we review the performance impact.
   *  Please contact Support via the support and provide the region, project key and use case.</p>
   */
   public Integer getTimeoutInMs(){
      return this.timeoutInMs;
   }

   public void setTimeoutInMs(final Integer timeoutInMs){
      this.timeoutInMs = timeoutInMs;
   }

}