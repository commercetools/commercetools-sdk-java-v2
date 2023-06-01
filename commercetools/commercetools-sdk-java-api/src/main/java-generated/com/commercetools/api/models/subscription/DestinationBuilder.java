package com.commercetools.api.models.subscription;

import com.commercetools.api.models.subscription.AzureEventGridDestination;
import com.commercetools.api.models.subscription.AzureServiceBusDestination;
import com.commercetools.api.models.subscription.EventBridgeDestination;
import com.commercetools.api.models.subscription.GoogleCloudPubSubDestination;
import com.commercetools.api.models.subscription.SnsDestination;
import com.commercetools.api.models.subscription.SqsDestination;
import com.commercetools.api.models.subscription.Destination;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DestinationBuilder
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
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
    public com.commercetools.api.models.subscription.SnsDestinationBuilder snsBuilder() {
       return com.commercetools.api.models.subscription.SnsDestinationBuilder.of();
    }
    public com.commercetools.api.models.subscription.SqsDestinationBuilder sqsBuilder() {
       return com.commercetools.api.models.subscription.SqsDestinationBuilder.of();
    }

    /**
     * factory method for an instance of DestinationBuilder
     * @return builder 
     */
    public static DestinationBuilder of() {
        return new DestinationBuilder();
    }

}
