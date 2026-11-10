
package com.commercetools.api.models.event;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CheckoutOrderCreationFailedEventTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CheckoutOrderCreationFailedEventBuilder builder) {
        CheckoutOrderCreationFailedEvent checkoutOrderCreationFailedEvent = builder.buildUnchecked();
        Assertions.assertThat(checkoutOrderCreationFailedEvent).isInstanceOf(CheckoutOrderCreationFailedEvent.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "resourceType",
                        CheckoutOrderCreationFailedEvent.builder()
                                .resourceType(com.commercetools.api.models.subscription.EventSubscriptionResourceTypeId
                                        .findEnum("checkout")) },
                new Object[] { "data", CheckoutOrderCreationFailedEvent.builder()
                        .data(new com.commercetools.api.models.event.CheckoutMessageOrderPayloadBaseDataImpl()) } };
    }

    @Test
    public void resourceType() {
        CheckoutOrderCreationFailedEvent value = CheckoutOrderCreationFailedEvent.of();
        value.setResourceType(
            com.commercetools.api.models.subscription.EventSubscriptionResourceTypeId.findEnum("checkout"));
        Assertions.assertThat(value.getResourceType())
                .isEqualTo(
                    com.commercetools.api.models.subscription.EventSubscriptionResourceTypeId.findEnum("checkout"));
    }

    @Test
    public void data() {
        CheckoutOrderCreationFailedEvent value = CheckoutOrderCreationFailedEvent.of();
        value.setData(new com.commercetools.api.models.event.CheckoutMessageOrderPayloadBaseDataImpl());
        Assertions.assertThat(value.getData())
                .isEqualTo(new com.commercetools.api.models.event.CheckoutMessageOrderPayloadBaseDataImpl());
    }
}
