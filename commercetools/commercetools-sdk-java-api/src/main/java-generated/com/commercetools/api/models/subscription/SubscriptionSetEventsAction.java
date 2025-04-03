
package com.commercetools.api.models.subscription;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 * SubscriptionSetEventsAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SubscriptionSetEventsAction subscriptionSetEventsAction = SubscriptionSetEventsAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SubscriptionSetEventsActionImpl.class)
public interface SubscriptionSetEventsAction extends SubscriptionUpdateAction {

    /**
     * discriminator value for SubscriptionSetEventsAction
     */
    String SET_EVENTS = "setEvents";

    /**
     *  <p>Value to set. Can only be unset if either <code>messages</code> or <code>changes</code> is set.</p>
     * @return messages
     */
    @Valid
    @JsonProperty("messages")
    public List<EventSubscription> getMessages();

    /**
     *  <p>Value to set. Can only be unset if either <code>messages</code> or <code>changes</code> is set.</p>
     * @param messages values to be set
     */

    @JsonIgnore
    public void setMessages(final EventSubscription... messages);

    /**
     *  <p>Value to set. Can only be unset if either <code>messages</code> or <code>changes</code> is set.</p>
     * @param messages values to be set
     */

    public void setMessages(final List<EventSubscription> messages);

    /**
     * factory method
     * @return instance of SubscriptionSetEventsAction
     */
    public static SubscriptionSetEventsAction of() {
        return new SubscriptionSetEventsActionImpl();
    }

    /**
     * factory method to create a shallow copy SubscriptionSetEventsAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static SubscriptionSetEventsAction of(final SubscriptionSetEventsAction template) {
        SubscriptionSetEventsActionImpl instance = new SubscriptionSetEventsActionImpl();
        instance.setMessages(template.getMessages());
        return instance;
    }

    /**
     * factory method to create a deep copy of SubscriptionSetEventsAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SubscriptionSetEventsAction deepCopy(@Nullable final SubscriptionSetEventsAction template) {
        if (template == null) {
            return null;
        }
        SubscriptionSetEventsActionImpl instance = new SubscriptionSetEventsActionImpl();
        instance.setMessages(Optional.ofNullable(template.getMessages())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.subscription.EventSubscription::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for SubscriptionSetEventsAction
     * @return builder
     */
    public static SubscriptionSetEventsActionBuilder builder() {
        return SubscriptionSetEventsActionBuilder.of();
    }

    /**
     * create builder for SubscriptionSetEventsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SubscriptionSetEventsActionBuilder builder(final SubscriptionSetEventsAction template) {
        return SubscriptionSetEventsActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSubscriptionSetEventsAction(Function<SubscriptionSetEventsAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SubscriptionSetEventsAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SubscriptionSetEventsAction>() {
            @Override
            public String toString() {
                return "TypeReference<SubscriptionSetEventsAction>";
            }
        };
    }
}
