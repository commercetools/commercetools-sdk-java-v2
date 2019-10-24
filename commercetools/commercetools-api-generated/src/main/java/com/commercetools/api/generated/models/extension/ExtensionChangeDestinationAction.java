package com.commercetools.api.generated.models.extension;

import com.commercetools.api.generated.models.extension.ExtensionDestination;
import com.commercetools.api.generated.models.extension.ExtensionUpdateAction;
import com.commercetools.api.generated.models.extension.ExtensionChangeDestinationActionImpl;

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
@JsonDeserialize(as = ExtensionChangeDestinationActionImpl.class)
public interface ExtensionChangeDestinationAction extends ExtensionUpdateAction {

   
   @NotNull
   @Valid
   @JsonProperty("destination")
   public ExtensionDestination getDestination();

   public void setDestination(final ExtensionDestination destination);
   
   public static ExtensionChangeDestinationActionImpl of(){
      return new ExtensionChangeDestinationActionImpl();
   }
   

   public static ExtensionChangeDestinationActionImpl of(final ExtensionChangeDestinationAction template) {
      ExtensionChangeDestinationActionImpl instance = new ExtensionChangeDestinationActionImpl();
      instance.setDestination(template.getDestination());
      return instance;
   }

}