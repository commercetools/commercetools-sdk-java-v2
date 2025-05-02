
package com.commercetools.api.models.order_edit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedOrderSetOrderNumberActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedOrderSetOrderNumberActionBuilder builder) {
        StagedOrderSetOrderNumberAction stagedOrderSetOrderNumberAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderSetOrderNumberAction).isInstanceOf(StagedOrderSetOrderNumberAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "orderNumber", StagedOrderSetOrderNumberAction.builder().orderNumber("orderNumber") } };
    }

    @Test
    public void orderNumber() {
        StagedOrderSetOrderNumberAction value = StagedOrderSetOrderNumberAction.of();
        value.setOrderNumber("orderNumber");
        Assertions.assertThat(value.getOrderNumber()).isEqualTo("orderNumber");
    }
}
