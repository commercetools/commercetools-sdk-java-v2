
package com.commercetools.api.models.subscription;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.subscription.AzureEventGridDestinationImpl.class, name = AzureEventGridDestination.EVENT_GRID),
        @JsonSubTypes.Type(value = com.commercetools.api.models.subscription.AzureServiceBusDestinationImpl.class, name = AzureServiceBusDestination.AZURE_SERVICE_BUS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.subscription.EventBridgeDestinationImpl.class, name = EventBridgeDestination.EVENT_BRIDGE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.subscription.GoogleCloudPubSubDestinationImpl.class, name = GoogleCloudPubSubDestination.GOOGLE_CLOUD_PUB_SUB),
        @JsonSubTypes.Type(value = com.commercetools.api.models.subscription.IronMqDestinationImpl.class, name = IronMqDestination.IRON_MQ),
        @JsonSubTypes.Type(value = com.commercetools.api.models.subscription.SnsDestinationImpl.class, name = SnsDestination.SNS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.subscription.SqsDestinationImpl.class, name = SqsDestination.SQS) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = DestinationImpl.class, visible = true)
@JsonDeserialize(as = DestinationImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface Destination {

    @NotNull
    @JsonProperty("type")
    public String getType();

    public static com.commercetools.api.models.subscription.AzureEventGridDestinationBuilder eventGridBuilder() {
        return com.commercetools.api.models.subscription.AzureEventGridDestinationBuilder.of();
    }

    public static com.commercetools.api.models.subscription.AzureServiceBusDestinationBuilder azureServiceBusBuilder() {
        return com.commercetools.api.models.subscription.AzureServiceBusDestinationBuilder.of();
    }

    public static com.commercetools.api.models.subscription.EventBridgeDestinationBuilder eventBridgeBuilder() {
        return com.commercetools.api.models.subscription.EventBridgeDestinationBuilder.of();
    }

    public static com.commercetools.api.models.subscription.GoogleCloudPubSubDestinationBuilder googleCloudPubSubBuilder() {
        return com.commercetools.api.models.subscription.GoogleCloudPubSubDestinationBuilder.of();
    }

    public static com.commercetools.api.models.subscription.IronMqDestinationBuilder ironMqBuilder() {
        return com.commercetools.api.models.subscription.IronMqDestinationBuilder.of();
    }

    public static com.commercetools.api.models.subscription.SnsDestinationBuilder snsBuilder() {
        return com.commercetools.api.models.subscription.SnsDestinationBuilder.of();
    }

    public static com.commercetools.api.models.subscription.SqsDestinationBuilder sqsBuilder() {
        return com.commercetools.api.models.subscription.SqsDestinationBuilder.of();
    }

    default <T> T withDestination(Function<Destination, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<Destination> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Destination>() {
            @Override
            public String toString() {
                return "TypeReference<Destination>";
            }
        };
    }
}
