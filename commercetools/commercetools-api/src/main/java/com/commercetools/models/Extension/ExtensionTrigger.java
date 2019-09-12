package com.commercetools.models.Extension;

import com.commercetools.models.Extension.ExtensionAction;
import com.commercetools.models.Extension.ExtensionResourceTypeId;
import com.commercetools.models.Extension.ExtensionTriggerImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ExtensionTriggerImpl.class)
public interface ExtensionTrigger  {

   
   @NotNull
   @JsonProperty("resourceTypeId")
   public ExtensionResourceTypeId getResourceTypeId();
   
   @NotNull
   @JsonProperty("actions")
   public List<ExtensionAction> getActions();

   public void setResourceTypeId(final ExtensionResourceTypeId resourceTypeId);
   
   public void setActions(final List<ExtensionAction> actions);
   
   public static ExtensionTriggerImpl of(){
      return new ExtensionTriggerImpl();
   }
   

   public static ExtensionTriggerImpl of(final ExtensionTrigger template) {
      ExtensionTriggerImpl instance = new ExtensionTriggerImpl();
      instance.setResourceTypeId(template.getResourceTypeId());
      instance.setActions(template.getActions());
      return instance;
   }

}