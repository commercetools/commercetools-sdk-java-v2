
package com.commercetools.api.models.event;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CheckoutPaymentRefundedEventTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CheckoutPaymentRefundedEventBuilder builder) {
        CheckoutPaymentRefundedEvent checkoutPaymentRefundedEvent = builder.buildUnchecked();
        Assertions.assertThat(checkoutPaymentRefundedEvent).isInstanceOf(CheckoutPaymentRefundedEvent.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "resourceType",
                        CheckoutPaymentRefundedEvent.builder()
                                .resourceType(com.commercetools.api.models.subscription.EventSubscriptionResourceTypeId
                                        .findEnum("checkout")) },
                new Object[] { "data", CheckoutPaymentRefundedEvent.builder()
                        .data(new com.commercetools.api.models.event.CheckoutMessagePaymentsPayloadBaseDataImpl()) } };
    }

    @Test
    public void resourceType() {
        CheckoutPaymentRefundedEvent value = CheckoutPaymentRefundedEvent.of();
        value.setResourceType(
            com.commercetools.api.models.subscription.EventSubscriptionResourceTypeId.findEnum("checkout"));
        Assertions.assertThat(value.getResourceType())
                .isEqualTo(
                    com.commercetools.api.models.subscription.EventSubscriptionResourceTypeId.findEnum("checkout"));
    }

    @Test
    public void data() {
        CheckoutPaymentRefundedEvent value = CheckoutPaymentRefundedEvent.of();
        value.setData(new com.commercetools.api.models.event.CheckoutMessagePaymentsPayloadBaseDataImpl());
        Assertions.assertThat(value.getData())
                .isEqualTo(new com.commercetools.api.models.event.CheckoutMessagePaymentsPayloadBaseDataImpl());
    }
}
