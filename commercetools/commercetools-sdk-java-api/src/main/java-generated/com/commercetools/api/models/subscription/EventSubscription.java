
package com.commercetools.api.models.subscription;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>For EventSubscription, the format of the payload is custom for each specific notification.</p>
 *
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
@JsonDeserialize(as = EventSubscriptionImpl.class)
public interface EventSubscription {

    /**
     *  <p>Unique identifier for the type of resource, for example, <code>import-api</code>.</p>
     * @return resourceTypeId
     */
    @NotNull
    @JsonProperty("resourceTypeId")
    public EventSubscriptionResourceTypeId getResourceTypeId();

    /**
     *  <p>Must contain valid event types for the resource. For example, for resource type <code>import-api</code> the event type <code>ImportContainerCreated</code> is valid. If no <code>types</code> are given, the Subscription will receive all events for this resource.</p>
     * @return types
     */

    @JsonProperty("types")
    public List<EventType> getTypes();

    /**
     *  <p>Unique identifier for the type of resource, for example, <code>import-api</code>.</p>
     * @param resourceTypeId value to be set
     */

    public void setResourceTypeId(final EventSubscriptionResourceTypeId resourceTypeId);

    /**
     *  <p>Must contain valid event types for the resource. For example, for resource type <code>import-api</code> the event type <code>ImportContainerCreated</code> is valid. If no <code>types</code> are given, the Subscription will receive all events for this resource.</p>
     * @param types values to be set
     */

    @JsonIgnore
    public void setTypes(final EventType... types);

    /**
     *  <p>Must contain valid event types for the resource. For example, for resource type <code>import-api</code> the event type <code>ImportContainerCreated</code> is valid. If no <code>types</code> are given, the Subscription will receive all events for this resource.</p>
     * @param types values to be set
     */

    public void setTypes(final List<EventType> types);

    /**
     * factory method
     * @return instance of EventSubscription
     */
    public static EventSubscription of() {
        return new EventSubscriptionImpl();
    }

    /**
     * factory method to create a shallow copy EventSubscription
     * @param template instance to be copied
     * @return copy instance
     */
    public static EventSubscription of(final EventSubscription template) {
        EventSubscriptionImpl instance = new EventSubscriptionImpl();
        instance.setResourceTypeId(template.getResourceTypeId());
        instance.setTypes(template.getTypes());
        return instance;
    }

    public EventSubscription copyDeep();

    /**
     * factory method to create a deep copy of EventSubscription
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static EventSubscription deepCopy(@Nullable final EventSubscription template) {
        if (template == null) {
            return null;
        }
        EventSubscriptionImpl instance = new EventSubscriptionImpl();
        instance.setResourceTypeId(template.getResourceTypeId());
        instance.setTypes(Optional.ofNullable(template.getTypes()).map(ArrayList::new).orElse(null));
        return instance;
    }

    /**
     * builder factory method for EventSubscription
     * @return builder
     */
    public static EventSubscriptionBuilder builder() {
        return EventSubscriptionBuilder.of();
    }

    /**
     * create builder for EventSubscription instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static EventSubscriptionBuilder builder(final EventSubscription template) {
        return EventSubscriptionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withEventSubscription(Function<EventSubscription, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<EventSubscription> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<EventSubscription>() {
            @Override
            public String toString() {
                return "TypeReference<EventSubscription>";
            }
        };
    }
}
