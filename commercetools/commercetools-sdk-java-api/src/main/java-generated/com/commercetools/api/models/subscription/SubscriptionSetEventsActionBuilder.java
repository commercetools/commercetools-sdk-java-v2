
package com.commercetools.api.models.subscription;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SubscriptionSetEventsActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SubscriptionSetEventsAction subscriptionSetEventsAction = SubscriptionSetEventsAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SubscriptionSetEventsActionBuilder implements Builder<SubscriptionSetEventsAction> {

    @Nullable
    private java.util.List<com.commercetools.api.models.subscription.EventSubscription> events;

    /**
     *  <p>Value to set. Can only be unset if either <code>messages</code> or <code>changes</code> is set.</p>
     * @param events value to be set
     * @return Builder
     */

    public SubscriptionSetEventsActionBuilder events(
            @Nullable final com.commercetools.api.models.subscription.EventSubscription... events) {
        this.events = new ArrayList<>(Arrays.asList(events));
        return this;
    }

    /**
     *  <p>Value to set. Can only be unset if either <code>messages</code> or <code>changes</code> is set.</p>
     * @param events value to be set
     * @return Builder
     */

    public SubscriptionSetEventsActionBuilder events(
            @Nullable final java.util.List<com.commercetools.api.models.subscription.EventSubscription> events) {
        this.events = events;
        return this;
    }

    /**
     *  <p>Value to set. Can only be unset if either <code>messages</code> or <code>changes</code> is set.</p>
     * @param events value to be set
     * @return Builder
     */

    public SubscriptionSetEventsActionBuilder plusEvents(
            @Nullable final com.commercetools.api.models.subscription.EventSubscription... events) {
        if (this.events == null) {
            this.events = new ArrayList<>();
        }
        this.events.addAll(Arrays.asList(events));
        return this;
    }

    /**
     *  <p>Value to set. Can only be unset if either <code>messages</code> or <code>changes</code> is set.</p>
     * @param builder function to build the events value
     * @return Builder
     */

    public SubscriptionSetEventsActionBuilder plusEvents(
            Function<com.commercetools.api.models.subscription.EventSubscriptionBuilder, com.commercetools.api.models.subscription.EventSubscriptionBuilder> builder) {
        if (this.events == null) {
            this.events = new ArrayList<>();
        }
        this.events.add(builder.apply(com.commercetools.api.models.subscription.EventSubscriptionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value to set. Can only be unset if either <code>messages</code> or <code>changes</code> is set.</p>
     * @param builder function to build the events value
     * @return Builder
     */

    public SubscriptionSetEventsActionBuilder withEvents(
            Function<com.commercetools.api.models.subscription.EventSubscriptionBuilder, com.commercetools.api.models.subscription.EventSubscriptionBuilder> builder) {
        this.events = new ArrayList<>();
        this.events.add(builder.apply(com.commercetools.api.models.subscription.EventSubscriptionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value to set. Can only be unset if either <code>messages</code> or <code>changes</code> is set.</p>
     * @param builder function to build the events value
     * @return Builder
     */

    public SubscriptionSetEventsActionBuilder addEvents(
            Function<com.commercetools.api.models.subscription.EventSubscriptionBuilder, com.commercetools.api.models.subscription.EventSubscription> builder) {
        return plusEvents(builder.apply(com.commercetools.api.models.subscription.EventSubscriptionBuilder.of()));
    }

    /**
     *  <p>Value to set. Can only be unset if either <code>messages</code> or <code>changes</code> is set.</p>
     * @param builder function to build the events value
     * @return Builder
     */

    public SubscriptionSetEventsActionBuilder setEvents(
            Function<com.commercetools.api.models.subscription.EventSubscriptionBuilder, com.commercetools.api.models.subscription.EventSubscription> builder) {
        return events(builder.apply(com.commercetools.api.models.subscription.EventSubscriptionBuilder.of()));
    }

    /**
     *  <p>Value to set. Can only be unset if either <code>messages</code> or <code>changes</code> is set.</p>
     * @return events
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.subscription.EventSubscription> getEvents() {
        return this.events;
    }

    /**
     * builds SubscriptionSetEventsAction with checking for non-null required values
     * @return SubscriptionSetEventsAction
     */
    public SubscriptionSetEventsAction build() {
        return new SubscriptionSetEventsActionImpl(events);
    }

    /**
     * builds SubscriptionSetEventsAction without checking for non-null required values
     * @return SubscriptionSetEventsAction
     */
    public SubscriptionSetEventsAction buildUnchecked() {
        return new SubscriptionSetEventsActionImpl(events);
    }

    /**
     * factory method for an instance of SubscriptionSetEventsActionBuilder
     * @return builder
     */
    public static SubscriptionSetEventsActionBuilder of() {
        return new SubscriptionSetEventsActionBuilder();
    }

    /**
     * create builder for SubscriptionSetEventsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SubscriptionSetEventsActionBuilder of(final SubscriptionSetEventsAction template) {
        SubscriptionSetEventsActionBuilder builder = new SubscriptionSetEventsActionBuilder();
        builder.events = template.getEvents();
        return builder;
    }

}
