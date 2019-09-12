package com.commercetools.models.Subscription;

import com.commercetools.models.Subscription.AzureEventGridDestination;
import com.commercetools.models.Subscription.AzureServiceBusDestination;
import com.commercetools.models.Subscription.GoogleCloudPubSubDestination;
import com.commercetools.models.Subscription.IronMqDestination;
import com.commercetools.models.Subscription.SnsDestination;
import com.commercetools.models.Subscription.SqsDestination;
import java.lang.String;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.models.Subscription.GoogleCloudPubSubDestinationImpl.class, name = "GoogleCloudPubSub"),
   @JsonSubTypes.Type(value = com.commercetools.models.Subscription.IronMqDestinationImpl.class, name = "IronMQ"),
   @JsonSubTypes.Type(value = com.commercetools.models.Subscription.SnsDestinationImpl.class, name = "SNS"),
   @JsonSubTypes.Type(value = com.commercetools.models.Subscription.SqsDestinationImpl.class, name = "SQS"),
   @JsonSubTypes.Type(value = com.commercetools.models.Subscription.AzureEventGridDestinationImpl.class, name = "EventGrid"),
   @JsonSubTypes.Type(value = com.commercetools.models.Subscription.AzureServiceBusDestinationImpl.class, name = "AzureServiceBus")
})
@JsonTypeInfo(
   use = JsonTypeInfo.Id.NAME,
   include = JsonTypeInfo.As.PROPERTY,
   property = "type"
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface Destination  {


   


}