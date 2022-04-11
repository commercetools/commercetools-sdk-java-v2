
package com.commercetools.api.models.subscription;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class SubscriptionUpdateActionBuilder {

    public com.commercetools.api.models.subscription.SubscriptionChangeDestinationActionBuilder changeDestinationBuilder() {
        return com.commercetools.api.models.subscription.SubscriptionChangeDestinationActionBuilder.of();
    }

    public com.commercetools.api.models.subscription.SubscriptionSetChangesActionBuilder setChangesBuilder() {
        return com.commercetools.api.models.subscription.SubscriptionSetChangesActionBuilder.of();
    }

    public com.commercetools.api.models.subscription.SubscriptionSetKeyActionBuilder setKeyBuilder() {
        return com.commercetools.api.models.subscription.SubscriptionSetKeyActionBuilder.of();
    }

    public com.commercetools.api.models.subscription.SubscriptionSetMessagesActionBuilder setMessagesBuilder() {
        return com.commercetools.api.models.subscription.SubscriptionSetMessagesActionBuilder.of();
    }

    public static SubscriptionUpdateActionBuilder of() {
        return new SubscriptionUpdateActionBuilder();
    }
}
