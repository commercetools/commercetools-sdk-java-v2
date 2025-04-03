
package com.commercetools.api.models.subscription;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SubscriptionNotificationBuilder
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SubscriptionNotificationBuilder {

    public com.commercetools.api.models.subscription.EventDeliveryPayloadBuilder eventBuilder() {
        return com.commercetools.api.models.subscription.EventDeliveryPayloadBuilder.of();
    }

    public com.commercetools.api.models.subscription.MessageDeliveryPayloadBuilder messageBuilder() {
        return com.commercetools.api.models.subscription.MessageDeliveryPayloadBuilder.of();
    }

    public com.commercetools.api.models.subscription.ResourceCreatedDeliveryPayloadBuilder resourceCreatedBuilder() {
        return com.commercetools.api.models.subscription.ResourceCreatedDeliveryPayloadBuilder.of();
    }

    public com.commercetools.api.models.subscription.ResourceDeletedDeliveryPayloadBuilder resourceDeletedBuilder() {
        return com.commercetools.api.models.subscription.ResourceDeletedDeliveryPayloadBuilder.of();
    }

    public com.commercetools.api.models.subscription.ResourceUpdatedDeliveryPayloadBuilder resourceUpdatedBuilder() {
        return com.commercetools.api.models.subscription.ResourceUpdatedDeliveryPayloadBuilder.of();
    }

    /**
     * factory method for an instance of SubscriptionNotificationBuilder
     * @return builder
     */
    public static SubscriptionNotificationBuilder of() {
        return new SubscriptionNotificationBuilder();
    }

}
