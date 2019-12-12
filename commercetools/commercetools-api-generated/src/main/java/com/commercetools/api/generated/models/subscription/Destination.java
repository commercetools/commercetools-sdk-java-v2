package com.commercetools.api.generated.models.subscription;

import com.commercetools.api.generated.models.subscription.AzureEventGridDestination;
import com.commercetools.api.generated.models.subscription.AzureServiceBusDestination;
import com.commercetools.api.generated.models.subscription.GoogleCloudPubSubDestination;
import com.commercetools.api.generated.models.subscription.IronMqDestination;
import com.commercetools.api.generated.models.subscription.SnsDestination;
import com.commercetools.api.generated.models.subscription.SqsDestination;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.subscription.GoogleCloudPubSubDestinationImpl.class, name = "GoogleCloudPubSub"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.subscription.IronMqDestinationImpl.class, name = "IronMQ"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.subscription.SnsDestinationImpl.class, name = "SNS"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.subscription.SqsDestinationImpl.class, name = "SQS"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.subscription.AzureEventGridDestinationImpl.class, name = "EventGrid"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.subscription.AzureServiceBusDestinationImpl.class, name = "AzureServiceBus")
})
@JsonTypeInfo(
   use = JsonTypeInfo.Id.NAME,
   include = JsonTypeInfo.As.PROPERTY,
   property = "type",
   defaultImpl = DestinationImpl.class
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface Destination  {


   


}