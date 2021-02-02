
package com.commercetools.api.models.subscription;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.subscription.SubscriptionChangeDestinationActionImpl.class, name = SubscriptionChangeDestinationAction.CHANGE_DESTINATION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.subscription.SubscriptionSetChangesActionImpl.class, name = SubscriptionSetChangesAction.SET_CHANGES),
        @JsonSubTypes.Type(value = com.commercetools.api.models.subscription.SubscriptionSetKeyActionImpl.class, name = SubscriptionSetKeyAction.SET_KEY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.subscription.SubscriptionSetMessagesActionImpl.class, name = SubscriptionSetMessagesAction.SET_MESSAGES) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = SubscriptionUpdateActionImpl.class, visible = true)
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface SubscriptionUpdateAction
        extends com.commercetools.api.models.ResourceUpdateAction<SubscriptionUpdateAction> {

    @NotNull
    @JsonProperty("action")
    public String getAction();

    default <T> T withSubscriptionUpdateAction(Function<SubscriptionUpdateAction, T> helper) {
        return helper.apply(this);
    }
}
