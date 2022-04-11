
package com.commercetools.api.models.subscription;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class DestinationBuilder {

    public com.commercetools.api.models.subscription.AzureEventGridDestinationBuilder eventGridBuilder() {
        return com.commercetools.api.models.subscription.AzureEventGridDestinationBuilder.of();
    }

    public com.commercetools.api.models.subscription.AzureServiceBusDestinationBuilder azureServiceBusBuilder() {
        return com.commercetools.api.models.subscription.AzureServiceBusDestinationBuilder.of();
    }

    public com.commercetools.api.models.subscription.EventBridgeDestinationBuilder eventBridgeBuilder() {
        return com.commercetools.api.models.subscription.EventBridgeDestinationBuilder.of();
    }

    public com.commercetools.api.models.subscription.GoogleCloudPubSubDestinationBuilder googleCloudPubSubBuilder() {
        return com.commercetools.api.models.subscription.GoogleCloudPubSubDestinationBuilder.of();
    }

    public com.commercetools.api.models.subscription.IronMqDestinationBuilder ironMqBuilder() {
        return com.commercetools.api.models.subscription.IronMqDestinationBuilder.of();
    }

    public com.commercetools.api.models.subscription.SnsDestinationBuilder snsBuilder() {
        return com.commercetools.api.models.subscription.SnsDestinationBuilder.of();
    }

    public com.commercetools.api.models.subscription.SqsDestinationBuilder sqsBuilder() {
        return com.commercetools.api.models.subscription.SqsDestinationBuilder.of();
    }

    public static DestinationBuilder of() {
        return new DestinationBuilder();
    }
}
