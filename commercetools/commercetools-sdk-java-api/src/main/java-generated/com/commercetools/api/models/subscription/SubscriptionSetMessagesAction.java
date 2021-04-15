
package com.commercetools.api.models.subscription;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SubscriptionSetMessagesActionImpl.class)
public interface SubscriptionSetMessagesAction extends SubscriptionUpdateAction {

    String SET_MESSAGES = "setMessages";

    @Valid
    @JsonProperty("messages")
    public List<MessageSubscription> getMessages();

    @JsonIgnore
    public void setMessages(final MessageSubscription... messages);

    public void setMessages(final List<MessageSubscription> messages);

    public static SubscriptionSetMessagesAction of() {
        return new SubscriptionSetMessagesActionImpl();
    }

    public static SubscriptionSetMessagesAction of(final SubscriptionSetMessagesAction template) {
        SubscriptionSetMessagesActionImpl instance = new SubscriptionSetMessagesActionImpl();
        instance.setMessages(template.getMessages());
        return instance;
    }

    public static SubscriptionSetMessagesActionBuilder builder() {
        return SubscriptionSetMessagesActionBuilder.of();
    }

    public static SubscriptionSetMessagesActionBuilder builder(final SubscriptionSetMessagesAction template) {
        return SubscriptionSetMessagesActionBuilder.of(template);
    }

    default <T> T withSubscriptionSetMessagesAction(Function<SubscriptionSetMessagesAction, T> helper) {
        return helper.apply(this);
    }
}
