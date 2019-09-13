package com.commercetools.models.subscription;

import com.commercetools.models.subscription.AzureEventGridDestination;
import com.commercetools.models.subscription.AzureServiceBusDestination;
import com.commercetools.models.subscription.GoogleCloudPubSubDestination;
import com.commercetools.models.subscription.IronMqDestination;
import com.commercetools.models.subscription.SnsDestination;
import com.commercetools.models.subscription.SqsDestination;
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
   @JsonSubTypes.Type(value = com.commercetools.models.subscription.GoogleCloudPubSubDestinationImpl.class, name = "GoogleCloudPubSub"),
   @JsonSubTypes.Type(value = com.commercetools.models.subscription.IronMqDestinationImpl.class, name = "IronMQ"),
   @JsonSubTypes.Type(value = com.commercetools.models.subscription.SnsDestinationImpl.class, name = "SNS"),
   @JsonSubTypes.Type(value = com.commercetools.models.subscription.SqsDestinationImpl.class, name = "SQS"),
   @JsonSubTypes.Type(value = com.commercetools.models.subscription.AzureEventGridDestinationImpl.class, name = "EventGrid"),
   @JsonSubTypes.Type(value = com.commercetools.models.subscription.AzureServiceBusDestinationImpl.class, name = "AzureServiceBus")
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