package com.commercetools.api.models.extension;

import com.commercetools.api.models.extension.ExtensionUpdateAction;
import com.commercetools.api.models.extension.ExtensionSetTimeoutInMsActionImpl;

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
@JsonDeserialize(as = ExtensionSetTimeoutInMsActionImpl.class)
public interface ExtensionSetTimeoutInMsAction extends ExtensionUpdateAction {

   /**
   *  <p>The maximum time the commercetools platform waits for a response from the extension.
   *  The maximum value is 2000 ms (2 seconds).
   *  This limit can be increased per project after we review the performance impact.
   *  Please contact Support via the support and provide the region, project key and use case.</p>
   */
   
   @JsonProperty("timeoutInMs")
   public Integer getTimeoutInMs();

   public void setTimeoutInMs(final Integer timeoutInMs);
   
   public static ExtensionSetTimeoutInMsActionImpl of(){
      return new ExtensionSetTimeoutInMsActionImpl();
   }
   

   public static ExtensionSetTimeoutInMsActionImpl of(final ExtensionSetTimeoutInMsAction template) {
      ExtensionSetTimeoutInMsActionImpl instance = new ExtensionSetTimeoutInMsActionImpl();
      instance.setTimeoutInMs(template.getTimeoutInMs());
      return instance;
   }

}
