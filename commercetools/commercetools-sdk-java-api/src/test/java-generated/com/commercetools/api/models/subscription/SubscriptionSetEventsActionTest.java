
package com.commercetools.api.models.subscription;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SubscriptionSetEventsActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SubscriptionSetEventsActionBuilder builder) {
        SubscriptionSetEventsAction subscriptionSetEventsAction = builder.buildUnchecked();
        Assertions.assertThat(subscriptionSetEventsAction).isInstanceOf(SubscriptionSetEventsAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "messages",
                SubscriptionSetEventsAction.builder()
                        .messages(Collections.singletonList(
                            new com.commercetools.api.models.subscription.EventSubscriptionImpl())) } };
    }

    @Test
    public void messages() {
        SubscriptionSetEventsAction value = SubscriptionSetEventsAction.of();
        value.setMessages(
            Collections.singletonList(new com.commercetools.api.models.subscription.EventSubscriptionImpl()));
        Assertions.assertThat(value.getMessages())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.subscription.EventSubscriptionImpl()));
    }
}
