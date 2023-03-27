
package com.commercetools.api.models.subscription;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MessageSubscriptionBuilder
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
public class MessageSubscriptionBuilder implements Builder<MessageSubscription> {

    private com.commercetools.api.models.subscription.MessageSubscriptionResourceTypeId resourceTypeId;

    @Nullable
    private java.util.List<String> types;

    /**
     *  <p>Unique identifier for the type of resource, for example, <code>order</code>.</p>
     * @param resourceTypeId value to be set
     * @return Builder
     */

    public MessageSubscriptionBuilder resourceTypeId(
            final com.commercetools.api.models.subscription.MessageSubscriptionResourceTypeId resourceTypeId) {
        this.resourceTypeId = resourceTypeId;
        return this;
    }

    /**
     *  <p>Must contain valid message types for the resource. For example, for resource type <code>product</code> the message type <code>ProductPublished</code> is valid. If no <code>types</code> of messages are given, the Subscription will receive all messages for this resource.</p>
     * @param types value to be set
     * @return Builder
     */

    public MessageSubscriptionBuilder types(@Nullable final String... types) {
        this.types = new ArrayList<>(Arrays.asList(types));
        return this;
    }

    /**
     *  <p>Must contain valid message types for the resource. For example, for resource type <code>product</code> the message type <code>ProductPublished</code> is valid. If no <code>types</code> of messages are given, the Subscription will receive all messages for this resource.</p>
     * @param types value to be set
     * @return Builder
     */

    public MessageSubscriptionBuilder types(@Nullable final java.util.List<String> types) {
        this.types = types;
        return this;
    }

    /**
     *  <p>Must contain valid message types for the resource. For example, for resource type <code>product</code> the message type <code>ProductPublished</code> is valid. If no <code>types</code> of messages are given, the Subscription will receive all messages for this resource.</p>
     * @param types value to be set
     * @return Builder
     */

    public MessageSubscriptionBuilder plusTypes(@Nullable final String... types) {
        if (this.types == null) {
            this.types = new ArrayList<>();
        }
        this.types.addAll(Arrays.asList(types));
        return this;
    }

    /**
     *  <p>Unique identifier for the type of resource, for example, <code>order</code>.</p>
     * @return resourceTypeId
     */

    public com.commercetools.api.models.subscription.MessageSubscriptionResourceTypeId getResourceTypeId() {
        return this.resourceTypeId;
    }

    /**
     *  <p>Must contain valid message types for the resource. For example, for resource type <code>product</code> the message type <code>ProductPublished</code> is valid. If no <code>types</code> of messages are given, the Subscription will receive all messages for this resource.</p>
     * @return types
     */

    @Nullable
    public java.util.List<String> getTypes() {
        return this.types;
    }

    /**
     * builds MessageSubscription with checking for non-null required values
     * @return MessageSubscription
     */
    public MessageSubscription build() {
        Objects.requireNonNull(resourceTypeId, MessageSubscription.class + ": resourceTypeId is missing");
        return new MessageSubscriptionImpl(resourceTypeId, types);
    }

    /**
     * builds MessageSubscription without checking for non-null required values
     * @return MessageSubscription
     */
    public MessageSubscription buildUnchecked() {
        return new MessageSubscriptionImpl(resourceTypeId, types);
    }

    /**
     * factory method for an instance of MessageSubscriptionBuilder
     * @return builder
     */
    public static MessageSubscriptionBuilder of() {
        return new MessageSubscriptionBuilder();
    }

    /**
     * create builder for MessageSubscription instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MessageSubscriptionBuilder of(final MessageSubscription template) {
        MessageSubscriptionBuilder builder = new MessageSubscriptionBuilder();
        builder.resourceTypeId = template.getResourceTypeId();
        builder.types = template.getTypes();
        return builder;
    }

}
