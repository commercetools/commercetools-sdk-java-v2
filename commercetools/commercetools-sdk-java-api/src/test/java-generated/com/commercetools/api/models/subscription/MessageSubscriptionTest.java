
package com.commercetools.api.models.subscription;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MessageSubscriptionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MessageSubscriptionBuilder builder) {
        MessageSubscription messageSubscription = builder.buildUnchecked();
        Assertions.assertThat(messageSubscription).isInstanceOf(MessageSubscription.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "resourceTypeId", MessageSubscription.builder()
                        .resourceTypeId(com.commercetools.api.models.subscription.MessageSubscriptionResourceTypeId
                                .findEnum("approval-flow")) },
                new Object[] { "types", MessageSubscription.builder().types(Collections.singletonList("types")) } };
    }

    @Test
    public void resourceTypeId() {
        MessageSubscription value = MessageSubscription.of();
        value.setResourceTypeId(
            com.commercetools.api.models.subscription.MessageSubscriptionResourceTypeId.findEnum("approval-flow"));
        Assertions.assertThat(value.getResourceTypeId())
                .isEqualTo(com.commercetools.api.models.subscription.MessageSubscriptionResourceTypeId
                        .findEnum("approval-flow"));
    }

    @Test
    public void types() {
        MessageSubscription value = MessageSubscription.of();
        value.setTypes(Collections.singletonList("types"));
        Assertions.assertThat(value.getTypes()).isEqualTo(Collections.singletonList("types"));
    }
}
