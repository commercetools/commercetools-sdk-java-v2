package com.commercetools.api.models.subscription;

import com.commercetools.api.models.subscription.SubscriptionChangeDestinationAction;
import com.commercetools.api.models.subscription.SubscriptionSetChangesAction;
import com.commercetools.api.models.subscription.SubscriptionSetKeyAction;
import com.commercetools.api.models.subscription.SubscriptionSetMessagesAction;
import com.commercetools.api.models.subscription.SubscriptionUpdateAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SubscriptionUpdateActionBuilder
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
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

    /**
     * factory method for an instance of SubscriptionUpdateActionBuilder
     * @return builder 
     */
    public static SubscriptionUpdateActionBuilder of() {
        return new SubscriptionUpdateActionBuilder();
    }

}
