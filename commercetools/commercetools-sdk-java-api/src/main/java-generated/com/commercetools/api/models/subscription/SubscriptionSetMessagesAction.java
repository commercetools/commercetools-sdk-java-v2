package com.commercetools.api.models.subscription;

import com.commercetools.api.models.subscription.MessageSubscription;
import com.commercetools.api.models.subscription.SubscriptionUpdateAction;
import com.commercetools.api.models.subscription.SubscriptionSetMessagesActionImpl;

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
 * SubscriptionSetMessagesAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SubscriptionSetMessagesAction subscriptionSetMessagesAction = SubscriptionSetMessagesAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = SubscriptionSetMessagesActionImpl.class)
public interface SubscriptionSetMessagesAction extends SubscriptionUpdateAction {

    /**
     * discriminator value for SubscriptionSetMessagesAction
     */
    String SET_MESSAGES = "setMessages";

    /**
     *  <p>Value to set. Can only be unset if <code>changes</code> is set.</p>
     * @return messages
     */
    @Valid
    @JsonProperty("messages")
    public List<MessageSubscription> getMessages();

    /**
     *  <p>Value to set. Can only be unset if <code>changes</code> is set.</p>
     * @param messages values to be set
     */
    
    @JsonIgnore
    public void setMessages(final MessageSubscription ...messages);
    /**
     *  <p>Value to set. Can only be unset if <code>changes</code> is set.</p>
     * @param messages values to be set
     */
    
    public void setMessages(final List<MessageSubscription> messages);

    /**
     * factory method
     * @return instance of SubscriptionSetMessagesAction
     */
    public static SubscriptionSetMessagesAction of(){
        return new SubscriptionSetMessagesActionImpl();
    }
    

    /**
     * factory method to create a shallow copy SubscriptionSetMessagesAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static SubscriptionSetMessagesAction of(final SubscriptionSetMessagesAction template) {
        SubscriptionSetMessagesActionImpl instance = new SubscriptionSetMessagesActionImpl();
        instance.setMessages(template.getMessages());
        return instance;
    }

    /**
     * factory method to create a deep copy of SubscriptionSetMessagesAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SubscriptionSetMessagesAction deepCopy(@Nullable final SubscriptionSetMessagesAction template) {
        if (template == null) {
            return null;
        }
        SubscriptionSetMessagesActionImpl instance = new SubscriptionSetMessagesActionImpl();
        instance.setMessages(Optional.ofNullable(template.getMessages())
                .map(t -> t.stream().map(com.commercetools.api.models.subscription.MessageSubscription::deepCopy).collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for SubscriptionSetMessagesAction
     * @return builder
     */
    public static SubscriptionSetMessagesActionBuilder builder() {
        return SubscriptionSetMessagesActionBuilder.of();
    }
    
    /**
     * create builder for SubscriptionSetMessagesAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SubscriptionSetMessagesActionBuilder builder(final SubscriptionSetMessagesAction template) {
        return SubscriptionSetMessagesActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSubscriptionSetMessagesAction(Function<SubscriptionSetMessagesAction, T> helper) {
        return helper.apply(this);
    }
    public static SubscriptionSetMessagesAction ofUnset() {
        return SubscriptionSetMessagesAction.of();
    }
    
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SubscriptionSetMessagesAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SubscriptionSetMessagesAction>() {
            @Override
            public String toString() {
                return "TypeReference<SubscriptionSetMessagesAction>";
            }
        };
    }
}
