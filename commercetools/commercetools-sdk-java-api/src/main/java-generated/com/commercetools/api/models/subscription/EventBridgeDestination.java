
package com.commercetools.api.models.subscription;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p><a href="https://aws.amazon.com/eventbridge/">AWS EventBridge</a> can be used to push events and messages to a serverless event bus that can forward them to AWS SQS, SNS, Lambda, and other AWS services based on forwarding rules.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = EventBridgeDestinationImpl.class)
public interface EventBridgeDestination extends Destination {

    String EVENT_BRIDGE = "EventBridge";

    /**
    *  <p>AWS region to which commercetools sends the events.</p>
    */
    @NotNull
    @JsonProperty("region")
    public String getRegion();

    /**
    *  <p>ID of the AWS account that receives events from the commercetools platform.</p>
    */
    @NotNull
    @JsonProperty("accountId")
    public String getAccountId();

    public void setRegion(final String region);

    public void setAccountId(final String accountId);

    public static EventBridgeDestination of() {
        return new EventBridgeDestinationImpl();
    }

    public static EventBridgeDestination of(final EventBridgeDestination template) {
        EventBridgeDestinationImpl instance = new EventBridgeDestinationImpl();
        instance.setRegion(template.getRegion());
        instance.setAccountId(template.getAccountId());
        return instance;
    }

    public static EventBridgeDestinationBuilder builder() {
        return EventBridgeDestinationBuilder.of();
    }

    public static EventBridgeDestinationBuilder builder(final EventBridgeDestination template) {
        return EventBridgeDestinationBuilder.of(template);
    }

    default <T> T withEventBridgeDestination(Function<EventBridgeDestination, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<EventBridgeDestination> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<EventBridgeDestination>() {
            @Override
            public String toString() {
                return "TypeReference<EventBridgeDestination>";
            }
        };
    }
}
