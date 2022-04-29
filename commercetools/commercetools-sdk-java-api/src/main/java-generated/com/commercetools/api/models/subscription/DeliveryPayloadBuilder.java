
package com.commercetools.api.models.subscription;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class DeliveryPayloadBuilder {

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

    public static DeliveryPayloadBuilder of() {
        return new DeliveryPayloadBuilder();
    }
}
