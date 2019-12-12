package com.commercetools.api.generated.models.subscription;

import com.commercetools.api.generated.models.subscription.Destination;
import com.commercetools.api.generated.models.subscription.SubscriptionUpdateAction;
import com.commercetools.api.generated.models.subscription.SubscriptionChangeDestinationActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;
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
@JsonDeserialize(as = SubscriptionChangeDestinationActionImpl.class)
public interface SubscriptionChangeDestinationAction extends SubscriptionUpdateAction {

   
   @NotNull
   @Valid
   @JsonProperty("destination")
   public Destination getDestination();

   public void setDestination(final Destination destination);
   
   public static SubscriptionChangeDestinationActionImpl of(){
      return new SubscriptionChangeDestinationActionImpl();
   }
   

   public static SubscriptionChangeDestinationActionImpl of(final SubscriptionChangeDestinationAction template) {
      SubscriptionChangeDestinationActionImpl instance = new SubscriptionChangeDestinationActionImpl();
      instance.setDestination(template.getDestination());
      return instance;
   }

}