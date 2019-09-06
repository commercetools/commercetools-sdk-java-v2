package com.commercetools.models.Extension;

import com.commercetools.models.Extension.ExtensionAction;
import com.commercetools.models.Extension.ExtensionResourceTypeId;
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
public final class ExtensionTriggerImpl implements ExtensionTrigger {

   private com.commercetools.models.Extension.ExtensionResourceTypeId resourceTypeId;
   
   private java.util.List<com.commercetools.models.Extension.ExtensionAction> actions;

   @JsonCreator
   ExtensionTriggerImpl(@JsonProperty("resourceTypeId") final com.commercetools.models.Extension.ExtensionResourceTypeId resourceTypeId, @JsonProperty("actions") final java.util.List<com.commercetools.models.Extension.ExtensionAction> actions) {
      this.resourceTypeId = resourceTypeId;
      this.actions = actions;
   }
   public ExtensionTriggerImpl() {
      
   }
   
   
   public com.commercetools.models.Extension.ExtensionResourceTypeId getResourceTypeId(){
      return this.resourceTypeId;
   }
   
   
   public java.util.List<com.commercetools.models.Extension.ExtensionAction> getActions(){
      return this.actions;
   }

   public void setResourceTypeId(final com.commercetools.models.Extension.ExtensionResourceTypeId resourceTypeId){
      this.resourceTypeId = resourceTypeId;
   }
   
   public void setActions(final java.util.List<com.commercetools.models.Extension.ExtensionAction> actions){
      this.actions = actions;
   }

}