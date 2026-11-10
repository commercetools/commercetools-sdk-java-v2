
package com.commercetools.api.models.subscription;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SubscriptionChangeDestinationActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SubscriptionChangeDestinationActionBuilder builder) {
        SubscriptionChangeDestinationAction subscriptionChangeDestinationAction = builder.buildUnchecked();
        Assertions.assertThat(subscriptionChangeDestinationAction)
                .isInstanceOf(SubscriptionChangeDestinationAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "destination", SubscriptionChangeDestinationAction.builder()
                .destination(new com.commercetools.api.models.subscription.DestinationImpl()) } };
    }

    @Test
    public void destination() {
        SubscriptionChangeDestinationAction value = SubscriptionChangeDestinationAction.of();
        value.setDestination(new com.commercetools.api.models.subscription.DestinationImpl());
        Assertions.assertThat(value.getDestination())
                .isEqualTo(new com.commercetools.api.models.subscription.DestinationImpl());
    }
}
