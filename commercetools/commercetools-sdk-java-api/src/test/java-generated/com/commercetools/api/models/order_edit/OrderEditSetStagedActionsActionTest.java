
package com.commercetools.api.models.order_edit;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderEditSetStagedActionsActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderEditSetStagedActionsActionBuilder builder) {
        OrderEditSetStagedActionsAction orderEditSetStagedActionsAction = builder.buildUnchecked();
        Assertions.assertThat(orderEditSetStagedActionsAction).isInstanceOf(OrderEditSetStagedActionsAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "stagedActions",
                OrderEditSetStagedActionsAction.builder()
                        .stagedActions(Collections.singletonList(
                            new com.commercetools.api.models.order.StagedOrderUpdateActionImpl())) } };
    }

    @Test
    public void stagedActions() {
        OrderEditSetStagedActionsAction value = OrderEditSetStagedActionsAction.of();
        value.setStagedActions(
            Collections.singletonList(new com.commercetools.api.models.order.StagedOrderUpdateActionImpl()));
        Assertions.assertThat(value.getStagedActions())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.order.StagedOrderUpdateActionImpl()));
    }
}
