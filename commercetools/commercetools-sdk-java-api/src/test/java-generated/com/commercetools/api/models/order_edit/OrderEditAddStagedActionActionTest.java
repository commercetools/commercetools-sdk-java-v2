
package com.commercetools.api.models.order_edit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderEditAddStagedActionActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderEditAddStagedActionActionBuilder builder) {
        OrderEditAddStagedActionAction orderEditAddStagedActionAction = builder.buildUnchecked();
        Assertions.assertThat(orderEditAddStagedActionAction).isInstanceOf(OrderEditAddStagedActionAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "stagedAction", OrderEditAddStagedActionAction.builder()
                .stagedAction(new com.commercetools.api.models.order.StagedOrderUpdateActionImpl()) } };
    }

    @Test
    public void stagedAction() {
        OrderEditAddStagedActionAction value = OrderEditAddStagedActionAction.of();
        value.setStagedAction(new com.commercetools.api.models.order.StagedOrderUpdateActionImpl());
        Assertions.assertThat(value.getStagedAction())
                .isEqualTo(new com.commercetools.api.models.order.StagedOrderUpdateActionImpl());
    }
}
