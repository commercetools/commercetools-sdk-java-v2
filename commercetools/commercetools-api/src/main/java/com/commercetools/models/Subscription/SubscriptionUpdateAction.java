package com.commercetools.models.subscription;

import com.commercetools.models.subscription.SubscriptionChangeDestinationAction;
import com.commercetools.models.subscription.SubscriptionSetChangesAction;
import com.commercetools.models.subscription.SubscriptionSetKeyAction;
import com.commercetools.models.subscription.SubscriptionSetMessagesAction;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.models.subscription.SubscriptionChangeDestinationActionImpl.class, name = "changeDestination"),
   @JsonSubTypes.Type(value = com.commercetools.models.subscription.SubscriptionSetChangesActionImpl.class, name = "setChanges"),
   @JsonSubTypes.Type(value = com.commercetools.models.subscription.SubscriptionSetKeyActionImpl.class, name = "setKey"),
   @JsonSubTypes.Type(value = com.commercetools.models.subscription.SubscriptionSetMessagesActionImpl.class, name = "setMessages")
})
@JsonTypeInfo(
   use = JsonTypeInfo.Id.NAME,
   include = JsonTypeInfo.As.PROPERTY,
   property = "action"
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface SubscriptionUpdateAction  {


   


}