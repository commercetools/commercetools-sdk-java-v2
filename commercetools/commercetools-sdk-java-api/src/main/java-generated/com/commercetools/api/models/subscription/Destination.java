
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
        @JsonSubTypes.Type(value = com.commercetools.api.models.subscription.GoogleCloudPubSubDestinationImpl.class, name = GoogleCloudPubSubDestination.GOOGLE_CLOUD_PUB_SUB),
        @JsonSubTypes.Type(value = com.commercetools.api.models.subscription.IronMqDestinationImpl.class, name = IronMqDestination.IRON_MQ),
        @JsonSubTypes.Type(value = com.commercetools.api.models.subscription.SnsDestinationImpl.class, name = SnsDestination.SNS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.subscription.SqsDestinationImpl.class, name = SqsDestination.SQS) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = DestinationImpl.class, visible = true)
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface Destination {

    @NotNull
    @JsonProperty("type")
    public String getType();

    default <T> T withDestination(Function<Destination, T> helper) {
        return helper.apply(this);
    }
}
