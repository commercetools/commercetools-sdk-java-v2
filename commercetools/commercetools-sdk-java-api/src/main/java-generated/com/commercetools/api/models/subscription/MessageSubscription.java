
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
     */
    @NotNull
    @JsonProperty("resourceTypeId")
    public MessageSubscriptionResourceTypeId getResourceTypeId();

    /**
     *  <p>Must contain valid message types for the resource. For example, for resource type <code>product</code> the message type <code>ProductPublished</code> is valid. If no <code>types</code> of messages are given, the Subscription will receive all messages for this resource.</p>
     */

    @JsonProperty("types")
    public List<String> getTypes();

    public void setResourceTypeId(final MessageSubscriptionResourceTypeId resourceTypeId);

    @JsonIgnore
    public void setTypes(final String... types);

    public void setTypes(final List<String> types);

    public static MessageSubscription of() {
        return new MessageSubscriptionImpl();
    }

    public static MessageSubscription of(final MessageSubscription template) {
        MessageSubscriptionImpl instance = new MessageSubscriptionImpl();
        instance.setResourceTypeId(template.getResourceTypeId());
        instance.setTypes(template.getTypes());
        return instance;
    }

    public static MessageSubscriptionBuilder builder() {
        return MessageSubscriptionBuilder.of();
    }

    public static MessageSubscriptionBuilder builder(final MessageSubscription template) {
        return MessageSubscriptionBuilder.of(template);
    }

    default <T> T withMessageSubscription(Function<MessageSubscription, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MessageSubscription> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MessageSubscription>() {
            @Override
            public String toString() {
                return "TypeReference<MessageSubscription>";
            }
        };
    }
}
