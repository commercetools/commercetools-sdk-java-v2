
package com.commercetools.api.models.order_edit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedOrderChangeCustomLineItemQuantityActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedOrderChangeCustomLineItemQuantityActionBuilder builder) {
        StagedOrderChangeCustomLineItemQuantityAction stagedOrderChangeCustomLineItemQuantityAction = builder
                .buildUnchecked();
        Assertions.assertThat(stagedOrderChangeCustomLineItemQuantityAction)
                .isInstanceOf(StagedOrderChangeCustomLineItemQuantityAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "customLineItemId",
                        StagedOrderChangeCustomLineItemQuantityAction.builder().customLineItemId("customLineItemId") },
                new Object[] { "customLineItemKey",
                        StagedOrderChangeCustomLineItemQuantityAction.builder()
                                .customLineItemKey("customLineItemKey") },
                new Object[] { "quantity", StagedOrderChangeCustomLineItemQuantityAction.builder().quantity(8L) } };
    }

    @Test
    public void customLineItemId() {
        StagedOrderChangeCustomLineItemQuantityAction value = StagedOrderChangeCustomLineItemQuantityAction.of();
        value.setCustomLineItemId("customLineItemId");
        Assertions.assertThat(value.getCustomLineItemId()).isEqualTo("customLineItemId");
    }

    @Test
    public void customLineItemKey() {
        StagedOrderChangeCustomLineItemQuantityAction value = StagedOrderChangeCustomLineItemQuantityAction.of();
        value.setCustomLineItemKey("customLineItemKey");
        Assertions.assertThat(value.getCustomLineItemKey()).isEqualTo("customLineItemKey");
    }

    @Test
    public void quantity() {
        StagedOrderChangeCustomLineItemQuantityAction value = StagedOrderChangeCustomLineItemQuantityAction.of();
        value.setQuantity(8L);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8L);
    }
}
