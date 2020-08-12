package com.commercetools.api.models.extension;

import com.commercetools.api.models.extension.ExtensionDestination;
import com.commercetools.api.models.extension.ExtensionTrigger;
import com.commercetools.api.models.extension.ExtensionDraftImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
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

   /**
   *  <p>User-specific unique identifier for the extension</p>
   */
   
   @JsonProperty("key")
   public String getKey();
   /**
   *  <p>Details where the extension can be reached</p>
   */
   @NotNull
   @Valid
   @JsonProperty("destination")
   public ExtensionDestination getDestination();
   /**
   *  <p>Describes what triggers the extension</p>
   */
   @NotNull
   @Valid
   @JsonProperty("triggers")
   public List<ExtensionTrigger> getTriggers();
   /**
   *  <p>The maximum time the commercetools platform waits for a response from the extension.
   *  The maximum value is 2000 ms (2 seconds).
   *  This limit can be increased per project after we review the performance impact.
   *  Please contact Support via the <a href="https://support.commercetools.com">Support Portal</a> and provide the region, project key and use case.</p>
   */
   
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
      instance.setKey(template.getKey());
      instance.setDestination(template.getDestination());
      instance.setTriggers(template.getTriggers());
      instance.setTimeoutInMs(template.getTimeoutInMs());
      return instance;
   }

}
