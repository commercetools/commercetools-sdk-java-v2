package com.commercetools.api.generated.models.extension;

import com.commercetools.api.generated.models.extension.ExtensionAction;
import com.commercetools.api.generated.models.extension.ExtensionResourceTypeId;
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
public final class ExtensionTriggerImpl implements ExtensionTrigger {

   private com.commercetools.api.generated.models.extension.ExtensionResourceTypeId resourceTypeId;
   
   private java.util.List<com.commercetools.api.generated.models.extension.ExtensionAction> actions;

   @JsonCreator
   ExtensionTriggerImpl(@JsonProperty("resourceTypeId") final com.commercetools.api.generated.models.extension.ExtensionResourceTypeId resourceTypeId, @JsonProperty("actions") final java.util.List<com.commercetools.api.generated.models.extension.ExtensionAction> actions) {
      this.resourceTypeId = resourceTypeId;
      this.actions = actions;
   }
   public ExtensionTriggerImpl() {
      
   }
   
   
   public com.commercetools.api.generated.models.extension.ExtensionResourceTypeId getResourceTypeId(){
      return this.resourceTypeId;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.extension.ExtensionAction> getActions(){
      return this.actions;
   }

   public void setResourceTypeId(final com.commercetools.api.generated.models.extension.ExtensionResourceTypeId resourceTypeId){
      this.resourceTypeId = resourceTypeId;
   }
   
   public void setActions(final java.util.List<com.commercetools.api.generated.models.extension.ExtensionAction> actions){
      this.actions = actions;
   }

}