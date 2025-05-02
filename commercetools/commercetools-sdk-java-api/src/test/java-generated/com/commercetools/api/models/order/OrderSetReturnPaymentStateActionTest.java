
package com.commercetools.api.models.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderSetReturnPaymentStateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderSetReturnPaymentStateActionBuilder builder) {
        OrderSetReturnPaymentStateAction orderSetReturnPaymentStateAction = builder.buildUnchecked();
        Assertions.assertThat(orderSetReturnPaymentStateAction).isInstanceOf(OrderSetReturnPaymentStateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "returnItemId",
                        OrderSetReturnPaymentStateAction.builder().returnItemId("returnItemId") },
                new Object[] { "returnItemKey",
                        OrderSetReturnPaymentStateAction.builder().returnItemKey("returnItemKey") },
                new Object[] { "paymentState", OrderSetReturnPaymentStateAction.builder()
                        .paymentState(
                            com.commercetools.api.models.order.ReturnPaymentState.findEnum("NonRefundable")) } };
    }

    @Test
    public void returnItemId() {
        OrderSetReturnPaymentStateAction value = OrderSetReturnPaymentStateAction.of();
        value.setReturnItemId("returnItemId");
        Assertions.assertThat(value.getReturnItemId()).isEqualTo("returnItemId");
    }

    @Test
    public void returnItemKey() {
        OrderSetReturnPaymentStateAction value = OrderSetReturnPaymentStateAction.of();
        value.setReturnItemKey("returnItemKey");
        Assertions.assertThat(value.getReturnItemKey()).isEqualTo("returnItemKey");
    }

    @Test
    public void paymentState() {
        OrderSetReturnPaymentStateAction value = OrderSetReturnPaymentStateAction.of();
        value.setPaymentState(com.commercetools.api.models.order.ReturnPaymentState.findEnum("NonRefundable"));
        Assertions.assertThat(value.getPaymentState())
                .isEqualTo(com.commercetools.api.models.order.ReturnPaymentState.findEnum("NonRefundable"));
    }
}
