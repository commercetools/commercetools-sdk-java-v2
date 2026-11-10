
package com.commercetools.api.models.order_edit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedOrderSetReturnPaymentStateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedOrderSetReturnPaymentStateActionBuilder builder) {
        StagedOrderSetReturnPaymentStateAction stagedOrderSetReturnPaymentStateAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderSetReturnPaymentStateAction)
                .isInstanceOf(StagedOrderSetReturnPaymentStateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "returnItemId",
                        StagedOrderSetReturnPaymentStateAction.builder().returnItemId("returnItemId") },
                new Object[] { "returnItemKey",
                        StagedOrderSetReturnPaymentStateAction.builder().returnItemKey("returnItemKey") },
                new Object[] { "paymentState", StagedOrderSetReturnPaymentStateAction.builder()
                        .paymentState(
                            com.commercetools.api.models.order.ReturnPaymentState.findEnum("NonRefundable")) } };
    }

    @Test
    public void returnItemId() {
        StagedOrderSetReturnPaymentStateAction value = StagedOrderSetReturnPaymentStateAction.of();
        value.setReturnItemId("returnItemId");
        Assertions.assertThat(value.getReturnItemId()).isEqualTo("returnItemId");
    }

    @Test
    public void returnItemKey() {
        StagedOrderSetReturnPaymentStateAction value = StagedOrderSetReturnPaymentStateAction.of();
        value.setReturnItemKey("returnItemKey");
        Assertions.assertThat(value.getReturnItemKey()).isEqualTo("returnItemKey");
    }

    @Test
    public void paymentState() {
        StagedOrderSetReturnPaymentStateAction value = StagedOrderSetReturnPaymentStateAction.of();
        value.setPaymentState(com.commercetools.api.models.order.ReturnPaymentState.findEnum("NonRefundable"));
        Assertions.assertThat(value.getPaymentState())
                .isEqualTo(com.commercetools.api.models.order.ReturnPaymentState.findEnum("NonRefundable"));
    }
}
