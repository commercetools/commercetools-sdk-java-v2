
package com.commercetools.api.models.order_edit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedOrderChangeCustomLineItemMoneyActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedOrderChangeCustomLineItemMoneyActionBuilder builder) {
        StagedOrderChangeCustomLineItemMoneyAction stagedOrderChangeCustomLineItemMoneyAction = builder
                .buildUnchecked();
        Assertions.assertThat(stagedOrderChangeCustomLineItemMoneyAction)
                .isInstanceOf(StagedOrderChangeCustomLineItemMoneyAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "customLineItemId",
                        StagedOrderChangeCustomLineItemMoneyAction.builder().customLineItemId("customLineItemId") },
                new Object[] { "customLineItemKey",
                        StagedOrderChangeCustomLineItemMoneyAction.builder().customLineItemKey("customLineItemKey") },
                new Object[] { "money", StagedOrderChangeCustomLineItemMoneyAction.builder()
                        .money(new com.commercetools.api.models.common.MoneyImpl()) } };
    }

    @Test
    public void customLineItemId() {
        StagedOrderChangeCustomLineItemMoneyAction value = StagedOrderChangeCustomLineItemMoneyAction.of();
        value.setCustomLineItemId("customLineItemId");
        Assertions.assertThat(value.getCustomLineItemId()).isEqualTo("customLineItemId");
    }

    @Test
    public void customLineItemKey() {
        StagedOrderChangeCustomLineItemMoneyAction value = StagedOrderChangeCustomLineItemMoneyAction.of();
        value.setCustomLineItemKey("customLineItemKey");
        Assertions.assertThat(value.getCustomLineItemKey()).isEqualTo("customLineItemKey");
    }

    @Test
    public void money() {
        StagedOrderChangeCustomLineItemMoneyAction value = StagedOrderChangeCustomLineItemMoneyAction.of();
        value.setMoney(new com.commercetools.api.models.common.MoneyImpl());
        Assertions.assertThat(value.getMoney()).isEqualTo(new com.commercetools.api.models.common.MoneyImpl());
    }
}
