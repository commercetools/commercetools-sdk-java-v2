
package com.commercetools.api.models.subscription;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * SubscriptionUpdateAction
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SubscriptionUpdateAction subscriptionUpdateAction = SubscriptionUpdateAction.changeDestinationBuilder()
 *             destination(destinationBuilder -> destinationBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = SubscriptionUpdateActionImpl.class, visible = true)
@JsonDeserialize(as = SubscriptionUpdateActionImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface SubscriptionUpdateAction
        extends com.commercetools.api.models.ResourceUpdateAction<SubscriptionUpdateAction> {

    /**
     *
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();

    public SubscriptionUpdateAction copyDeep();

    /**
     * factory method to create a deep copy of SubscriptionUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SubscriptionUpdateAction deepCopy(@Nullable final SubscriptionUpdateAction template) {
        if (template == null) {
            return null;
        }

        if (!(template instanceof SubscriptionUpdateActionImpl)) {
            return template.copyDeep();
        }
        SubscriptionUpdateActionImpl instance = new SubscriptionUpdateActionImpl();
        return instance;
    }

    /**
     * builder for changeDestination subtype
     * @return builder
     */
    public static com.commercetools.api.models.subscription.SubscriptionChangeDestinationActionBuilder changeDestinationBuilder() {
        return com.commercetools.api.models.subscription.SubscriptionChangeDestinationActionBuilder.of();
    }

    /**
     * builder for setChanges subtype
     * @return builder
     */
    public static com.commercetools.api.models.subscription.SubscriptionSetChangesActionBuilder setChangesBuilder() {
        return com.commercetools.api.models.subscription.SubscriptionSetChangesActionBuilder.of();
    }

    /**
     * builder for setEvents subtype
     * @return builder
     */
    public static com.commercetools.api.models.subscription.SubscriptionSetEventsActionBuilder setEventsBuilder() {
        return com.commercetools.api.models.subscription.SubscriptionSetEventsActionBuilder.of();
    }

    /**
     * builder for setKey subtype
     * @return builder
     */
    public static com.commercetools.api.models.subscription.SubscriptionSetKeyActionBuilder setKeyBuilder() {
        return com.commercetools.api.models.subscription.SubscriptionSetKeyActionBuilder.of();
    }

    /**
     * builder for setMessages subtype
     * @return builder
     */
    public static com.commercetools.api.models.subscription.SubscriptionSetMessagesActionBuilder setMessagesBuilder() {
        return com.commercetools.api.models.subscription.SubscriptionSetMessagesActionBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSubscriptionUpdateAction(Function<SubscriptionUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SubscriptionUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SubscriptionUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<SubscriptionUpdateAction>";
            }
        };
    }
}
