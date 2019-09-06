package com.commercetools.models.Subscription;

import com.commercetools.models.Subscription.SubscriptionChangeDestinationAction;
import com.commercetools.models.Subscription.SubscriptionSetChangesAction;
import com.commercetools.models.Subscription.SubscriptionSetKeyAction;
import com.commercetools.models.Subscription.SubscriptionSetMessagesAction;
import java.lang.String;


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

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.models.Subscription.SubscriptionChangeDestinationActionImpl.class, name = "changeDestination"),
   @JsonSubTypes.Type(value = com.commercetools.models.Subscription.SubscriptionSetChangesActionImpl.class, name = "setChanges"),
   @JsonSubTypes.Type(value = com.commercetools.models.Subscription.SubscriptionSetKeyActionImpl.class, name = "setKey"),
   @JsonSubTypes.Type(value = com.commercetools.models.Subscription.SubscriptionSetMessagesActionImpl.class, name = "setMessages")
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