package com.commercetools.api.generated.models.extension;

import com.commercetools.api.generated.models.extension.ExtensionTrigger;
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
public final class ExtensionChangeTriggersActionImpl implements ExtensionChangeTriggersAction {

   private String action;
   
   private java.util.List<com.commercetools.api.generated.models.extension.ExtensionTrigger> triggers;

   @JsonCreator
   ExtensionChangeTriggersActionImpl(@JsonProperty("triggers") final java.util.List<com.commercetools.api.generated.models.extension.ExtensionTrigger> triggers) {
      this.triggers = triggers;
      this.action = "changeTriggers";
   }
   public ExtensionChangeTriggersActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.extension.ExtensionTrigger> getTriggers(){
      return this.triggers;
   }

   public void setTriggers(final java.util.List<com.commercetools.api.generated.models.extension.ExtensionTrigger> triggers){
      this.triggers = triggers;
   }

}