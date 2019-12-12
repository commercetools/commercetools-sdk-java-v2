package com.commercetools.api.generated.models.subscription;

import com.commercetools.api.generated.models.subscription.SubscriptionChangeDestinationAction;
import com.commercetools.api.generated.models.subscription.SubscriptionSetChangesAction;
import com.commercetools.api.generated.models.subscription.SubscriptionSetKeyAction;
import com.commercetools.api.generated.models.subscription.SubscriptionSetMessagesAction;


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

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.subscription.SubscriptionChangeDestinationActionImpl.class, name = "changeDestination"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.subscription.SubscriptionSetChangesActionImpl.class, name = "setChanges"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.subscription.SubscriptionSetKeyActionImpl.class, name = "setKey"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.subscription.SubscriptionSetMessagesActionImpl.class, name = "setMessages")
})
@JsonTypeInfo(
   use = JsonTypeInfo.Id.NAME,
   include = JsonTypeInfo.As.PROPERTY,
   property = "action",
   defaultImpl = SubscriptionUpdateActionImpl.class
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface SubscriptionUpdateAction  {


   


}