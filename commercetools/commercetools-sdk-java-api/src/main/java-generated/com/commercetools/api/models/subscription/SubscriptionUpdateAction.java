package com.commercetools.api.models.subscription;

import com.commercetools.api.models.subscription.SubscriptionChangeDestinationAction;
import com.commercetools.api.models.subscription.SubscriptionSetChangesAction;
import com.commercetools.api.models.subscription.SubscriptionSetKeyAction;
import com.commercetools.api.models.subscription.SubscriptionSetMessagesAction;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

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
@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.api.models.subscription.SubscriptionChangeDestinationActionImpl.class, name = SubscriptionChangeDestinationAction.CHANGE_DESTINATION),
   @JsonSubTypes.Type(value = com.commercetools.api.models.subscription.SubscriptionSetChangesActionImpl.class, name = SubscriptionSetChangesAction.SET_CHANGES),
   @JsonSubTypes.Type(value = com.commercetools.api.models.subscription.SubscriptionSetKeyActionImpl.class, name = SubscriptionSetKeyAction.SET_KEY),
   @JsonSubTypes.Type(value = com.commercetools.api.models.subscription.SubscriptionSetMessagesActionImpl.class, name = SubscriptionSetMessagesAction.SET_MESSAGES)
})
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "action",
    defaultImpl = SubscriptionUpdateActionImpl.class,
    visible = true
)
@JsonDeserialize(as = SubscriptionUpdateActionImpl.class)
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public interface SubscriptionUpdateAction extends com.commercetools.api.models.ResourceUpdateAction<SubscriptionUpdateAction> {


    /**
     *
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();




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
        if (template instanceof com.commercetools.api.models.subscription.SubscriptionChangeDestinationAction) {
            return com.commercetools.api.models.subscription.SubscriptionChangeDestinationAction.deepCopy((com.commercetools.api.models.subscription.SubscriptionChangeDestinationAction)template);
        }
        if (template instanceof com.commercetools.api.models.subscription.SubscriptionSetChangesAction) {
            return com.commercetools.api.models.subscription.SubscriptionSetChangesAction.deepCopy((com.commercetools.api.models.subscription.SubscriptionSetChangesAction)template);
        }
        if (template instanceof com.commercetools.api.models.subscription.SubscriptionSetKeyAction) {
            return com.commercetools.api.models.subscription.SubscriptionSetKeyAction.deepCopy((com.commercetools.api.models.subscription.SubscriptionSetKeyAction)template);
        }
        if (template instanceof com.commercetools.api.models.subscription.SubscriptionSetMessagesAction) {
            return com.commercetools.api.models.subscription.SubscriptionSetMessagesAction.deepCopy((com.commercetools.api.models.subscription.SubscriptionSetMessagesAction)template);
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
