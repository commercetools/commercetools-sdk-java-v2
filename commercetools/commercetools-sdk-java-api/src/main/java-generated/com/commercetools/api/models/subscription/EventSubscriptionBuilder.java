
package com.commercetools.api.models.subscription;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * EventSubscriptionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     EventSubscription eventSubscription = EventSubscription.builder()
 *             .resourceTypeId(EventSubscriptionResourceTypeId.IMPORT_API)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class EventSubscriptionBuilder implements Builder<EventSubscription> {

    private com.commercetools.api.models.subscription.EventSubscriptionResourceTypeId resourceTypeId;

    @Nullable
    private java.util.List<com.commercetools.api.models.subscription.EventType> types;

    /**
     *  <p>Unique identifier for the type of resource, for example, <code>import-api</code>.</p>
     * @param resourceTypeId value to be set
     * @return Builder
     */

    public EventSubscriptionBuilder resourceTypeId(
            final com.commercetools.api.models.subscription.EventSubscriptionResourceTypeId resourceTypeId) {
        this.resourceTypeId = resourceTypeId;
        return this;
    }

    /**
     *  <p>Must contain valid event types for the resource. For example, for resource type <code>import-api</code> the event type <code>ImportContainerCreated</code> is valid. If no <code>types</code> are given, the Subscription will receive all events for this resource.</p>
     * @param types value to be set
     * @return Builder
     */

    public EventSubscriptionBuilder types(
            @Nullable final com.commercetools.api.models.subscription.EventType... types) {
        this.types = new ArrayList<>(Arrays.asList(types));
        return this;
    }

    /**
     *  <p>Must contain valid event types for the resource. For example, for resource type <code>import-api</code> the event type <code>ImportContainerCreated</code> is valid. If no <code>types</code> are given, the Subscription will receive all events for this resource.</p>
     * @param types value to be set
     * @return Builder
     */

    public EventSubscriptionBuilder types(
            @Nullable final java.util.List<com.commercetools.api.models.subscription.EventType> types) {
        this.types = types;
        return this;
    }

    /**
     *  <p>Must contain valid event types for the resource. For example, for resource type <code>import-api</code> the event type <code>ImportContainerCreated</code> is valid. If no <code>types</code> are given, the Subscription will receive all events for this resource.</p>
     * @param types value to be set
     * @return Builder
     */

    public EventSubscriptionBuilder plusTypes(
            @Nullable final com.commercetools.api.models.subscription.EventType... types) {
        if (this.types == null) {
            this.types = new ArrayList<>();
        }
        this.types.addAll(Arrays.asList(types));
        return this;
    }

    /**
     *  <p>Unique identifier for the type of resource, for example, <code>import-api</code>.</p>
     * @return resourceTypeId
     */

    public com.commercetools.api.models.subscription.EventSubscriptionResourceTypeId getResourceTypeId() {
        return this.resourceTypeId;
    }

    /**
     *  <p>Must contain valid event types for the resource. For example, for resource type <code>import-api</code> the event type <code>ImportContainerCreated</code> is valid. If no <code>types</code> are given, the Subscription will receive all events for this resource.</p>
     * @return types
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.subscription.EventType> getTypes() {
        return this.types;
    }

    /**
     * builds EventSubscription with checking for non-null required values
     * @return EventSubscription
     */
    public EventSubscription build() {
        Objects.requireNonNull(resourceTypeId, EventSubscription.class + ": resourceTypeId is missing");
        return new EventSubscriptionImpl(resourceTypeId, types);
    }

    /**
     * builds EventSubscription without checking for non-null required values
     * @return EventSubscription
     */
    public EventSubscription buildUnchecked() {
        return new EventSubscriptionImpl(resourceTypeId, types);
    }

    /**
     * factory method for an instance of EventSubscriptionBuilder
     * @return builder
     */
    public static EventSubscriptionBuilder of() {
        return new EventSubscriptionBuilder();
    }

    /**
     * create builder for EventSubscription instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static EventSubscriptionBuilder of(final EventSubscription template) {
        EventSubscriptionBuilder builder = new EventSubscriptionBuilder();
        builder.resourceTypeId = template.getResourceTypeId();
        builder.types = template.getTypes();
        return builder;
    }

}
