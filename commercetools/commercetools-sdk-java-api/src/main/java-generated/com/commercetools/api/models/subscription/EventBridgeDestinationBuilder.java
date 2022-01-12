
package com.commercetools.api.models.subscription;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class EventBridgeDestinationBuilder implements Builder<EventBridgeDestination> {

    private String region;

    private String accountId;

    public EventBridgeDestinationBuilder region(final String region) {
        this.region = region;
        return this;
    }

    public EventBridgeDestinationBuilder accountId(final String accountId) {
        this.accountId = accountId;
        return this;
    }

    public String getRegion() {
        return this.region;
    }

    public String getAccountId() {
        return this.accountId;
    }

    public EventBridgeDestination build() {
        Objects.requireNonNull(region, EventBridgeDestination.class + ": region is missing");
        Objects.requireNonNull(accountId, EventBridgeDestination.class + ": accountId is missing");
        return new EventBridgeDestinationImpl(region, accountId);
    }

    /**
     * builds EventBridgeDestination without checking for non null required values
     */
    public EventBridgeDestination buildUnchecked() {
        return new EventBridgeDestinationImpl(region, accountId);
    }

    public static EventBridgeDestinationBuilder of() {
        return new EventBridgeDestinationBuilder();
    }

    public static EventBridgeDestinationBuilder of(final EventBridgeDestination template) {
        EventBridgeDestinationBuilder builder = new EventBridgeDestinationBuilder();
        builder.region = template.getRegion();
        builder.accountId = template.getAccountId();
        return builder;
    }

}
