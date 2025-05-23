
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
 *  <p>AWS EventBridge can be used to push events and messages to a serverless event bus that can forward them to AWS SQS, SNS, Lambda, and other AWS services based on forwarding rules. Once the Subscription is created, an equivalent "partner event source" is created in AWS EventBridge. This event source must be associated with an event bus for the Subscription setup to be complete.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     EventBridgeDestination eventBridgeDestination = EventBridgeDestination.builder()
 *             .region("{region}")
 *             .accountId("{accountId}")
 *             .source("{source}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("EventBridge")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = EventBridgeDestinationImpl.class)
public interface EventBridgeDestination extends Destination {

    /**
     * discriminator value for EventBridgeDestination
     */
    String EVENT_BRIDGE = "EventBridge";

    /**
     *  <p>AWS region that receives the events.</p>
     * @return region
     */
    @NotNull
    @JsonProperty("region")
    public String getRegion();

    /**
     *  <p>ID of the AWS account that receives the events.</p>
     * @return accountId
     */
    @NotNull
    @JsonProperty("accountId")
    public String getAccountId();

    /**
     *  <p>URN for the EventBridge destination.</p>
     * @return source
     */
    @NotNull
    @JsonProperty("source")
    public String getSource();

    /**
     *  <p>AWS region that receives the events.</p>
     * @param region value to be set
     */

    public void setRegion(final String region);

    /**
     *  <p>ID of the AWS account that receives the events.</p>
     * @param accountId value to be set
     */

    public void setAccountId(final String accountId);

    /**
     *  <p>URN for the EventBridge destination.</p>
     * @param source value to be set
     */

    public void setSource(final String source);

    /**
     * factory method
     * @return instance of EventBridgeDestination
     */
    public static EventBridgeDestination of() {
        return new EventBridgeDestinationImpl();
    }

    /**
     * factory method to create a shallow copy EventBridgeDestination
     * @param template instance to be copied
     * @return copy instance
     */
    public static EventBridgeDestination of(final EventBridgeDestination template) {
        EventBridgeDestinationImpl instance = new EventBridgeDestinationImpl();
        instance.setRegion(template.getRegion());
        instance.setAccountId(template.getAccountId());
        instance.setSource(template.getSource());
        return instance;
    }

    public EventBridgeDestination copyDeep();

    /**
     * factory method to create a deep copy of EventBridgeDestination
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static EventBridgeDestination deepCopy(@Nullable final EventBridgeDestination template) {
        if (template == null) {
            return null;
        }
        EventBridgeDestinationImpl instance = new EventBridgeDestinationImpl();
        instance.setRegion(template.getRegion());
        instance.setAccountId(template.getAccountId());
        instance.setSource(template.getSource());
        return instance;
    }

    /**
     * builder factory method for EventBridgeDestination
     * @return builder
     */
    public static EventBridgeDestinationBuilder builder() {
        return EventBridgeDestinationBuilder.of();
    }

    /**
     * create builder for EventBridgeDestination instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static EventBridgeDestinationBuilder builder(final EventBridgeDestination template) {
        return EventBridgeDestinationBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withEventBridgeDestination(Function<EventBridgeDestination, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<EventBridgeDestination> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<EventBridgeDestination>() {
            @Override
            public String toString() {
                return "TypeReference<EventBridgeDestination>";
            }
        };
    }
}
