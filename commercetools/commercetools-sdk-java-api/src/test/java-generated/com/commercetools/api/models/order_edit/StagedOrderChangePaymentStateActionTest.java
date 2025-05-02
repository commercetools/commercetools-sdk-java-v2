
package com.commercetools.api.models.order_edit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedOrderChangePaymentStateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedOrderChangePaymentStateActionBuilder builder) {
        StagedOrderChangePaymentStateAction stagedOrderChangePaymentStateAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderChangePaymentStateAction)
                .isInstanceOf(StagedOrderChangePaymentStateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "paymentState", StagedOrderChangePaymentStateAction.builder()
                .paymentState(com.commercetools.api.models.order.PaymentState.findEnum("BalanceDue")) } };
    }

    @Test
    public void paymentState() {
        StagedOrderChangePaymentStateAction value = StagedOrderChangePaymentStateAction.of();
        value.setPaymentState(com.commercetools.api.models.order.PaymentState.findEnum("BalanceDue"));
        Assertions.assertThat(value.getPaymentState())
                .isEqualTo(com.commercetools.api.models.order.PaymentState.findEnum("BalanceDue"));
    }
}
