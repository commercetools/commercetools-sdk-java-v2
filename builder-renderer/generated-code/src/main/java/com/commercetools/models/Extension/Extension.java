package com.commercetools.models.Extension;

import com.commercetools.models.Common.LoggedResource;
import com.commercetools.models.Extension.ExtensionDestination;
import com.commercetools.models.Extension.ExtensionTrigger;
import java.lang.Integer;
import java.lang.String;
import com.commercetools.models.Extension.ExtensionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import json.CommercetoolsJsonUtils;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ExtensionImpl.class)
public interface Extension extends LoggedResource {

   
   
   @JsonProperty("key")
   public String getKey();
   
   @NotNull
   @Valid
   @JsonProperty("destination")
   public ExtensionDestination getDestination();
   
   @NotNull
   @Valid
   @JsonProperty("triggers")
   public List<ExtensionTrigger> getTriggers();
   
   
   @JsonProperty("timeoutInMs")
   public Integer getTimeoutInMs();

   public void setKey(final String key);
   
   public void setDestination(final ExtensionDestination destination);
   
   public void setTriggers(final List<ExtensionTrigger> triggers);
   
   public void setTimeoutInMs(final Integer timeoutInMs);
   
   public static ExtensionImpl of(){
      return new ExtensionImpl();
   }
   

   public static ExtensionImpl of(final Extension template) {
      ExtensionImpl instance = new ExtensionImpl();
      instance.setCreatedAt(template.getCreatedAt());
      instance.setLastModifiedAt(template.getLastModifiedAt());
      instance.setId(template.getId());
      instance.setVersion(template.getVersion());
      instance.setCreatedBy(template.getCreatedBy());
      instance.setLastModifiedBy(template.getLastModifiedBy());
      instance.setTimeoutInMs(template.getTimeoutInMs());
      instance.setDestination(template.getDestination());
      instance.setTriggers(template.getTriggers());
      instance.setKey(template.getKey());
      return instance;
   }

}