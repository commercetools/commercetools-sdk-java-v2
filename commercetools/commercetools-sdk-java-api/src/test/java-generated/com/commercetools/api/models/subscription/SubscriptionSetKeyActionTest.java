
package com.commercetools.api.models.subscription;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SubscriptionSetKeyActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SubscriptionSetKeyActionBuilder builder) {
        SubscriptionSetKeyAction subscriptionSetKeyAction = builder.buildUnchecked();
        Assertions.assertThat(subscriptionSetKeyAction).isInstanceOf(SubscriptionSetKeyAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", SubscriptionSetKeyAction.builder().key("key") } };
    }

    @Test
    public void key() {
        SubscriptionSetKeyAction value = SubscriptionSetKeyAction.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
