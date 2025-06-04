
package com.commercetools.api.models.event;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CheckoutPaymentRefundFailedEventTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CheckoutPaymentRefundFailedEventBuilder builder) {
        CheckoutPaymentRefundFailedEvent checkoutPaymentRefundFailedEvent = builder.buildUnchecked();
        Assertions.assertThat(checkoutPaymentRefundFailedEvent).isInstanceOf(CheckoutPaymentRefundFailedEvent.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "resourceType",
                        CheckoutPaymentRefundFailedEvent.builder()
                                .resourceType(com.commercetools.api.models.subscription.EventSubscriptionResourceTypeId
                                        .findEnum("checkout")) },
                new Object[] { "data", CheckoutPaymentRefundFailedEvent.builder()
                        .data(new com.commercetools.api.models.event.CheckoutMessagePaymentsPayloadBaseDataImpl()) } };
    }

    @Test
    public void resourceType() {
        CheckoutPaymentRefundFailedEvent value = CheckoutPaymentRefundFailedEvent.of();
        value.setResourceType(
            com.commercetools.api.models.subscription.EventSubscriptionResourceTypeId.findEnum("checkout"));
        Assertions.assertThat(value.getResourceType())
                .isEqualTo(
                    com.commercetools.api.models.subscription.EventSubscriptionResourceTypeId.findEnum("checkout"));
    }

    @Test
    public void data() {
        CheckoutPaymentRefundFailedEvent value = CheckoutPaymentRefundFailedEvent.of();
        value.setData(new com.commercetools.api.models.event.CheckoutMessagePaymentsPayloadBaseDataImpl());
        Assertions.assertThat(value.getData())
                .isEqualTo(new com.commercetools.api.models.event.CheckoutMessagePaymentsPayloadBaseDataImpl());
    }
}
