
package com.commercetools.api.models.subscription;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>For supported resources and message types, see Message Types. Messages will be delivered even if the Messages Query HTTP API is not enabled.</p>
 *  <p>For MessageSubscriptions, the format of the payload is MessageDeliveryPayload.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MessageSubscription messageSubscription = MessageSubscription.builder()
 *             .resourceTypeId(MessageSubscriptionResourceTypeId.BUSINESS_UNIT)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MessageSubscriptionImpl.class)
public interface MessageSubscription {

    /**
     *  <p>Unique identifier for the type of resource, for example, <code>order</code>.</p>
     * @return resourceTypeId
     */
    @NotNull
    @JsonProperty("resourceTypeId")
    public MessageSubscriptionResourceTypeId getResourceTypeId();

    /**
     *  <p>Must contain valid message types for the resource. For example, for resource type <code>product</code> the message type <code>ProductPublished</code> is valid. If no <code>types</code> of messages are given, the Subscription will receive all messages for this resource.</p>
     * @return types
     */

    @JsonProperty("types")
    public List<String> getTypes();

    /**
     *  <p>Unique identifier for the type of resource, for example, <code>order</code>.</p>
     * @param resourceTypeId value to be set
     */

    public void setResourceTypeId(final MessageSubscriptionResourceTypeId resourceTypeId);

    /**
     *  <p>Must contain valid message types for the resource. For example, for resource type <code>product</code> the message type <code>ProductPublished</code> is valid. If no <code>types</code> of messages are given, the Subscription will receive all messages for this resource.</p>
     * @param types values to be set
     */

    @JsonIgnore
    public void setTypes(final String... types);

    /**
     *  <p>Must contain valid message types for the resource. For example, for resource type <code>product</code> the message type <code>ProductPublished</code> is valid. If no <code>types</code> of messages are given, the Subscription will receive all messages for this resource.</p>
     * @param types values to be set
     */

    public void setTypes(final List<String> types);

    /**
     * factory method
     * @return instance of MessageSubscription
     */
    public static MessageSubscription of() {
        return new MessageSubscriptionImpl();
    }

    /**
     * factory method to copy an instance of MessageSubscription
     * @param template instance to be copied
     * @return copy instance
     */
    public static MessageSubscription of(final MessageSubscription template) {
        MessageSubscriptionImpl instance = new MessageSubscriptionImpl();
        instance.setResourceTypeId(template.getResourceTypeId());
        instance.setTypes(template.getTypes());
        return instance;
    }

    /**
     * builder factory method for MessageSubscription
     * @return builder
     */
    public static MessageSubscriptionBuilder builder() {
        return MessageSubscriptionBuilder.of();
    }

    /**
     * create builder for MessageSubscription instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MessageSubscriptionBuilder builder(final MessageSubscription template) {
        return MessageSubscriptionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMessageSubscription(Function<MessageSubscription, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MessageSubscription> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MessageSubscription>() {
            @Override
            public String toString() {
                return "TypeReference<MessageSubscription>";
            }
        };
    }
}
