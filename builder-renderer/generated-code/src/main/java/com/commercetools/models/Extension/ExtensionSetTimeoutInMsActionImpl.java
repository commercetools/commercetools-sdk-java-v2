package com.commercetools.models.Extension;

import com.commercetools.models.Extension.ExtensionUpdateAction;
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
public final class ExtensionSetTimeoutInMsActionImpl implements ExtensionSetTimeoutInMsAction {

   private java.lang.String action;
   
   private java.lang.Integer timeoutInMs;

   @JsonCreator
   ExtensionSetTimeoutInMsActionImpl(@JsonProperty("timeoutInMs") final java.lang.Integer timeoutInMs) {
      this.timeoutInMs = timeoutInMs;
      this.action = "setTimeoutInMs";
   }
   public ExtensionSetTimeoutInMsActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.Integer getTimeoutInMs(){
      return this.timeoutInMs;
   }

   public void setTimeoutInMs(final java.lang.Integer timeoutInMs){
      this.timeoutInMs = timeoutInMs;
   }

}