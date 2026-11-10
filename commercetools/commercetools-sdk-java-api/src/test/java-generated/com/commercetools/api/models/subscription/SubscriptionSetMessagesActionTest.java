
package com.commercetools.api.models.subscription;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SubscriptionSetMessagesActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SubscriptionSetMessagesActionBuilder builder) {
        SubscriptionSetMessagesAction subscriptionSetMessagesAction = builder.buildUnchecked();
        Assertions.assertThat(subscriptionSetMessagesAction).isInstanceOf(SubscriptionSetMessagesAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "messages",
                SubscriptionSetMessagesAction.builder()
                        .messages(Collections.singletonList(
                            new com.commercetools.api.models.subscription.MessageSubscriptionImpl())) } };
    }

    @Test
    public void messages() {
        SubscriptionSetMessagesAction value = SubscriptionSetMessagesAction.of();
        value.setMessages(
            Collections.singletonList(new com.commercetools.api.models.subscription.MessageSubscriptionImpl()));
        Assertions.assertThat(value.getMessages())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.subscription.MessageSubscriptionImpl()));
    }
}
