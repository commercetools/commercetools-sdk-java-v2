package com.commercetools.models.extension;

import com.commercetools.models.extension.ExtensionUpdateAction;
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
   
   
   public Integer getTimeoutInMs(){
      return this.timeoutInMs;
   }

   public void setTimeoutInMs(final Integer timeoutInMs){
      this.timeoutInMs = timeoutInMs;
   }

}