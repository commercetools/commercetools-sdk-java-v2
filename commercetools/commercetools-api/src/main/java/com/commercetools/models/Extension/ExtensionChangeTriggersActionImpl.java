package com.commercetools.models.extension;

import com.commercetools.models.extension.ExtensionTrigger;
import com.commercetools.models.extension.ExtensionUpdateAction;
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
public final class ExtensionChangeTriggersActionImpl implements ExtensionChangeTriggersAction {

   private java.lang.String action;
   
   private java.util.List<com.commercetools.models.extension.ExtensionTrigger> triggers;

   @JsonCreator
   ExtensionChangeTriggersActionImpl(@JsonProperty("triggers") final java.util.List<com.commercetools.models.extension.ExtensionTrigger> triggers) {
      this.triggers = triggers;
      this.action = "changeTriggers";
   }
   public ExtensionChangeTriggersActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.util.List<com.commercetools.models.extension.ExtensionTrigger> getTriggers(){
      return this.triggers;
   }

   public void setTriggers(final java.util.List<com.commercetools.models.extension.ExtensionTrigger> triggers){
      this.triggers = triggers;
   }

}