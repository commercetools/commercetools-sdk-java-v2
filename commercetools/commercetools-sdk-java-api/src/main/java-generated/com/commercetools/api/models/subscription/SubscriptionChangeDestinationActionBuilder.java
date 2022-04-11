
package com.commercetools.api.models.subscription;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class SubscriptionChangeDestinationActionBuilder implements Builder<SubscriptionChangeDestinationAction> {

    private com.commercetools.api.models.subscription.Destination destination;

    public SubscriptionChangeDestinationActionBuilder destination(
            final com.commercetools.api.models.subscription.Destination destination) {
        this.destination = destination;
        return this;
    }

    public SubscriptionChangeDestinationActionBuilder destination(
            Function<com.commercetools.api.models.subscription.DestinationBuilder, Builder<? extends com.commercetools.api.models.subscription.Destination>> builder) {
        this.destination = builder.apply(com.commercetools.api.models.subscription.DestinationBuilder.of()).build();
        return this;
    }

    public com.commercetools.api.models.subscription.Destination getDestination() {
        return this.destination;
    }

    public SubscriptionChangeDestinationAction build() {
        Objects.requireNonNull(destination, SubscriptionChangeDestinationAction.class + ": destination is missing");
        return new SubscriptionChangeDestinationActionImpl(destination);
    }

    /**
     * builds SubscriptionChangeDestinationAction without checking for non null required values
     */
    public SubscriptionChangeDestinationAction buildUnchecked() {
        return new SubscriptionChangeDestinationActionImpl(destination);
    }

    public static SubscriptionChangeDestinationActionBuilder of() {
        return new SubscriptionChangeDestinationActionBuilder();
    }

    public static SubscriptionChangeDestinationActionBuilder of(final SubscriptionChangeDestinationAction template) {
        SubscriptionChangeDestinationActionBuilder builder = new SubscriptionChangeDestinationActionBuilder();
        builder.destination = template.getDestination();
        return builder;
    }

}
