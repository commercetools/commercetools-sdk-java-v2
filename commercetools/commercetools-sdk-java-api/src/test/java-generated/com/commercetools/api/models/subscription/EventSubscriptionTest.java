
package com.commercetools.api.models.subscription;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class EventSubscriptionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, EventSubscriptionBuilder builder) {
        EventSubscription eventSubscription = builder.buildUnchecked();
        Assertions.assertThat(eventSubscription).isInstanceOf(EventSubscription.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "resourceTypeId", EventSubscription.builder()
                        .resourceTypeId(com.commercetools.api.models.subscription.EventSubscriptionResourceTypeId
                                .findEnum("checkout")) },
                new Object[] { "types",
                        EventSubscription.builder()
                                .types(Collections.singletonList(com.commercetools.api.models.subscription.EventType
                                        .findEnum("CheckoutOrderCreationFailed"))) } };
    }

    @Test
    public void resourceTypeId() {
        EventSubscription value = EventSubscription.of();
        value.setResourceTypeId(
            com.commercetools.api.models.subscription.EventSubscriptionResourceTypeId.findEnum("checkout"));
        Assertions.assertThat(value.getResourceTypeId())
                .isEqualTo(
                    com.commercetools.api.models.subscription.EventSubscriptionResourceTypeId.findEnum("checkout"));
    }

    @Test
    public void types() {
        EventSubscription value = EventSubscription.of();
        value.setTypes(Collections.singletonList(
            com.commercetools.api.models.subscription.EventType.findEnum("CheckoutOrderCreationFailed")));
        Assertions.assertThat(value.getTypes())
                .isEqualTo(Collections.singletonList(
                    com.commercetools.api.models.subscription.EventType.findEnum("CheckoutOrderCreationFailed")));
    }
}
