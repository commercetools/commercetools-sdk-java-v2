
package com.commercetools.api.models.order_edit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedOrderChangeOrderStateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedOrderChangeOrderStateActionBuilder builder) {
        StagedOrderChangeOrderStateAction stagedOrderChangeOrderStateAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderChangeOrderStateAction).isInstanceOf(StagedOrderChangeOrderStateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "orderState", StagedOrderChangeOrderStateAction.builder()
                .orderState(com.commercetools.api.models.order.OrderState.findEnum("Open")) } };
    }

    @Test
    public void orderState() {
        StagedOrderChangeOrderStateAction value = StagedOrderChangeOrderStateAction.of();
        value.setOrderState(com.commercetools.api.models.order.OrderState.findEnum("Open"));
        Assertions.assertThat(value.getOrderState())
                .isEqualTo(com.commercetools.api.models.order.OrderState.findEnum("Open"));
    }
}
