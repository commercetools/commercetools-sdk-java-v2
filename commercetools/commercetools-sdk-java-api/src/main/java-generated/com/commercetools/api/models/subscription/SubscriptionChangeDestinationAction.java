
package com.commercetools.api.models.subscription;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SubscriptionChangeDestinationActionImpl.class)
public interface SubscriptionChangeDestinationAction extends SubscriptionUpdateAction {

    String CHANGE_DESTINATION = "changeDestination";

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @return destination
     */
    @NotNull
    @Valid
    @JsonProperty("destination")
    public Destination getDestination();

    public void setDestination(final Destination destination);

    public static SubscriptionChangeDestinationAction of() {
        return new SubscriptionChangeDestinationActionImpl();
    }

    public static SubscriptionChangeDestinationAction of(final SubscriptionChangeDestinationAction template) {
        SubscriptionChangeDestinationActionImpl instance = new SubscriptionChangeDestinationActionImpl();
        instance.setDestination(template.getDestination());
        return instance;
    }

    public static SubscriptionChangeDestinationActionBuilder builder() {
        return SubscriptionChangeDestinationActionBuilder.of();
    }

    public static SubscriptionChangeDestinationActionBuilder builder(
            final SubscriptionChangeDestinationAction template) {
        return SubscriptionChangeDestinationActionBuilder.of(template);
    }

    default <T> T withSubscriptionChangeDestinationAction(Function<SubscriptionChangeDestinationAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SubscriptionChangeDestinationAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SubscriptionChangeDestinationAction>() {
            @Override
            public String toString() {
                return "TypeReference<SubscriptionChangeDestinationAction>";
            }
        };
    }
}
