
package com.commercetools.api.models.subscription;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SubscriptionUpdateTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SubscriptionUpdateBuilder builder) {
        SubscriptionUpdate subscriptionUpdate = builder.buildUnchecked();
        Assertions.assertThat(subscriptionUpdate).isInstanceOf(SubscriptionUpdate.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "version", SubscriptionUpdate.builder().version(2L) },
                new Object[] { "actions",
                        SubscriptionUpdate.builder()
                                .actions(Collections.singletonList(
                                    new com.commercetools.api.models.subscription.SubscriptionUpdateActionImpl())) } };
    }

    @Test
    public void version() {
        SubscriptionUpdate value = SubscriptionUpdate.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void actions() {
        SubscriptionUpdate value = SubscriptionUpdate.of();
        value.setActions(
            Collections.singletonList(new com.commercetools.api.models.subscription.SubscriptionUpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.api.models.subscription.SubscriptionUpdateActionImpl()));
    }
}
