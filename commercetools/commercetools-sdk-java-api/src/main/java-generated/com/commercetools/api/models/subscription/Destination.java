
package com.commercetools.api.models.subscription;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * Destination
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Destination destination = Destination.eventGridBuilder()
 *             uri("{uri}")
 *             accessKey("{accessKey}")
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.subscription.AzureEventGridDestinationImpl.class, name = AzureEventGridDestination.EVENT_GRID),
        @JsonSubTypes.Type(value = com.commercetools.api.models.subscription.AzureServiceBusDestinationImpl.class, name = AzureServiceBusDestination.AZURE_SERVICE_BUS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.subscription.EventBridgeDestinationImpl.class, name = EventBridgeDestination.EVENT_BRIDGE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.subscription.GoogleCloudPubSubDestinationImpl.class, name = GoogleCloudPubSubDestination.GOOGLE_CLOUD_PUB_SUB),
        @JsonSubTypes.Type(value = com.commercetools.api.models.subscription.SnsDestinationImpl.class, name = SnsDestination.SNS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.subscription.SqsDestinationImpl.class, name = SqsDestination.SQS) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = DestinationImpl.class, visible = true)
@JsonDeserialize(as = DestinationImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface Destination {

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     * factory method to create a deep copy of Destination
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static Destination deepCopy(@Nullable final Destination template) {
        if (template == null) {
            return null;
        }
        if (template instanceof com.commercetools.api.models.subscription.AzureEventGridDestination) {
            return com.commercetools.api.models.subscription.AzureEventGridDestination
                    .deepCopy((com.commercetools.api.models.subscription.AzureEventGridDestination) template);
        }
        if (template instanceof com.commercetools.api.models.subscription.AzureServiceBusDestination) {
            return com.commercetools.api.models.subscription.AzureServiceBusDestination
                    .deepCopy((com.commercetools.api.models.subscription.AzureServiceBusDestination) template);
        }
        if (template instanceof com.commercetools.api.models.subscription.EventBridgeDestination) {
            return com.commercetools.api.models.subscription.EventBridgeDestination
                    .deepCopy((com.commercetools.api.models.subscription.EventBridgeDestination) template);
        }
        if (template instanceof com.commercetools.api.models.subscription.GoogleCloudPubSubDestination) {
            return com.commercetools.api.models.subscription.GoogleCloudPubSubDestination
                    .deepCopy((com.commercetools.api.models.subscription.GoogleCloudPubSubDestination) template);
        }
        if (template instanceof com.commercetools.api.models.subscription.SnsDestination) {
            return com.commercetools.api.models.subscription.SnsDestination
                    .deepCopy((com.commercetools.api.models.subscription.SnsDestination) template);
        }
        if (template instanceof com.commercetools.api.models.subscription.SqsDestination) {
            return com.commercetools.api.models.subscription.SqsDestination
                    .deepCopy((com.commercetools.api.models.subscription.SqsDestination) template);
        }
        DestinationImpl instance = new DestinationImpl();
        return instance;
    }

    /**
     * builder for eventGrid subtype
     * @return builder
     */
    public static com.commercetools.api.models.subscription.AzureEventGridDestinationBuilder eventGridBuilder() {
        return com.commercetools.api.models.subscription.AzureEventGridDestinationBuilder.of();
    }

    /**
     * builder for azureServiceBus subtype
     * @return builder
     */
    public static com.commercetools.api.models.subscription.AzureServiceBusDestinationBuilder azureServiceBusBuilder() {
        return com.commercetools.api.models.subscription.AzureServiceBusDestinationBuilder.of();
    }

    /**
     * builder for eventBridge subtype
     * @return builder
     */
    public static com.commercetools.api.models.subscription.EventBridgeDestinationBuilder eventBridgeBuilder() {
        return com.commercetools.api.models.subscription.EventBridgeDestinationBuilder.of();
    }

    /**
     * builder for googleCloudPubSub subtype
     * @return builder
     */
    public static com.commercetools.api.models.subscription.GoogleCloudPubSubDestinationBuilder googleCloudPubSubBuilder() {
        return com.commercetools.api.models.subscription.GoogleCloudPubSubDestinationBuilder.of();
    }

    /**
     * builder for sns subtype
     * @return builder
     */
    public static com.commercetools.api.models.subscription.SnsDestinationBuilder snsBuilder() {
        return com.commercetools.api.models.subscription.SnsDestinationBuilder.of();
    }

    /**
     * builder for sqs subtype
     * @return builder
     */
    public static com.commercetools.api.models.subscription.SqsDestinationBuilder sqsBuilder() {
        return com.commercetools.api.models.subscription.SqsDestinationBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDestination(Function<Destination, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<Destination> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Destination>() {
            @Override
            public String toString() {
                return "TypeReference<Destination>";
            }
        };
    }
}
