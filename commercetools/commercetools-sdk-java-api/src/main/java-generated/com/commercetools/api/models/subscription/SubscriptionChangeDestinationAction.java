package com.commercetools.api.models.subscription;

import com.commercetools.api.models.subscription.Destination;
import com.commercetools.api.models.subscription.SubscriptionUpdateAction;
import com.commercetools.api.models.subscription.SubscriptionChangeDestinationActionImpl;

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
 *  <p>A test message is sent to ensure the correct configuration of the Destination. If the message cannot be delivered, the update will fail. The payload of the test message is a notification of type ResourceCreated for the <code>resourceTypeId</code> <code>subscription</code>. The <code>status</code> will change to Healthy, if it isn't already.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SubscriptionChangeDestinationAction subscriptionChangeDestinationAction = SubscriptionChangeDestinationAction.builder()
 *             .destination(destinationBuilder -> destinationBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = SubscriptionChangeDestinationActionImpl.class)
public interface SubscriptionChangeDestinationAction extends SubscriptionUpdateAction {

    /**
     * discriminator value for SubscriptionChangeDestinationAction
     */
    String CHANGE_DESTINATION = "changeDestination";

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @return destination
     */
    @NotNull
    @Valid
    @JsonProperty("destination")
    public Destination getDestination();

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @param destination value to be set
     */
    
    public void setDestination(final Destination destination);
    

    /**
     * factory method
     * @return instance of SubscriptionChangeDestinationAction
     */
    public static SubscriptionChangeDestinationAction of(){
        return new SubscriptionChangeDestinationActionImpl();
    }
    

    /**
     * factory method to create a shallow copy SubscriptionChangeDestinationAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static SubscriptionChangeDestinationAction of(final SubscriptionChangeDestinationAction template) {
        SubscriptionChangeDestinationActionImpl instance = new SubscriptionChangeDestinationActionImpl();
        instance.setDestination(template.getDestination());
        return instance;
    }

    /**
     * factory method to create a deep copy of SubscriptionChangeDestinationAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SubscriptionChangeDestinationAction deepCopy(@Nullable final SubscriptionChangeDestinationAction template) {
        if (template == null) {
            return null;
        }
        SubscriptionChangeDestinationActionImpl instance = new SubscriptionChangeDestinationActionImpl();
        instance.setDestination(com.commercetools.api.models.subscription.Destination.deepCopy(template.getDestination()));
        return instance;
    }

    /**
     * builder factory method for SubscriptionChangeDestinationAction
     * @return builder
     */
    public static SubscriptionChangeDestinationActionBuilder builder() {
        return SubscriptionChangeDestinationActionBuilder.of();
    }
    
    /**
     * create builder for SubscriptionChangeDestinationAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SubscriptionChangeDestinationActionBuilder builder(final SubscriptionChangeDestinationAction template) {
        return SubscriptionChangeDestinationActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSubscriptionChangeDestinationAction(Function<SubscriptionChangeDestinationAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SubscriptionChangeDestinationAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SubscriptionChangeDestinationAction>() {
            @Override
            public String toString() {
                return "TypeReference<SubscriptionChangeDestinationAction>";
            }
        };
    }
}
