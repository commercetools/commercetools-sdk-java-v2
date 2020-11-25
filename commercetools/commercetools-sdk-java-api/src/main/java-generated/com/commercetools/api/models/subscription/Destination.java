package com.commercetools.api.models.subscription;

import com.commercetools.api.models.subscription.AzureEventGridDestination;
import com.commercetools.api.models.subscription.AzureServiceBusDestination;
import com.commercetools.api.models.subscription.GoogleCloudPubSubDestination;
import com.commercetools.api.models.subscription.IronMqDestination;
import com.commercetools.api.models.subscription.SnsDestination;
import com.commercetools.api.models.subscription.SqsDestination;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.api.models.subscription.GoogleCloudPubSubDestinationImpl.class, name = "GoogleCloudPubSub"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.subscription.IronMqDestinationImpl.class, name = "IronMQ"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.subscription.SnsDestinationImpl.class, name = "SNS"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.subscription.SqsDestinationImpl.class, name = "SQS"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.subscription.AzureServiceBusDestinationImpl.class, name = "AzureServiceBus"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.subscription.AzureEventGridDestinationImpl.class, name = "EventGrid")
})
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "type",
    defaultImpl = DestinationImpl.class,
    visible = true
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface Destination  {

    
    @NotNull
    @JsonProperty("type")
    public String getType();




    default <T> T withDestination(Function<Destination, T> helper) {
        return helper.apply(this);
    }
}
