package com.commercetools.models.Extension;

import com.commercetools.models.Extension.ExtensionDestination;
import com.commercetools.models.Extension.ExtensionTrigger;
import java.lang.Integer;
import java.lang.String;
import com.commercetools.models.Extension.ExtensionDraftImpl;

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
@JsonDeserialize(as = ExtensionDraftImpl.class)
public interface ExtensionDraft  {

   
   
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
   
   public static ExtensionDraftImpl of(){
      return new ExtensionDraftImpl();
   }
   

   public static ExtensionDraftImpl of(final ExtensionDraft template) {
      ExtensionDraftImpl instance = new ExtensionDraftImpl();
      instance.setTimeoutInMs(template.getTimeoutInMs());
      instance.setDestination(template.getDestination());
      instance.setTriggers(template.getTriggers());
      instance.setKey(template.getKey());
      return instance;
   }

}