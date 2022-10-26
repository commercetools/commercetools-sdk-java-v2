
package com.commercetools.api.models.subscription;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SubscriptionChangeDestinationActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SubscriptionChangeDestinationAction subscriptionChangeDestinationAction = SubscriptionChangeDestinationAction.builder()
 *             .destination(destinationBuilder -> destinationBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SubscriptionChangeDestinationActionBuilder implements Builder<SubscriptionChangeDestinationAction> {

    private com.commercetools.api.models.subscription.Destination destination;

    /**
     *  <p>New value to set. Must not be empty.</p>
     */

    public SubscriptionChangeDestinationActionBuilder destination(
            final com.commercetools.api.models.subscription.Destination destination) {
        this.destination = destination;
        return this;
    }

    /**
     *  <p>New value to set. Must not be empty.</p>
     */

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
