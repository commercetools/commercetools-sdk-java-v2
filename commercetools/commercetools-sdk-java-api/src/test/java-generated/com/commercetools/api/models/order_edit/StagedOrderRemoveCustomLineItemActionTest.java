
package com.commercetools.api.models.order_edit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedOrderRemoveCustomLineItemActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedOrderRemoveCustomLineItemActionBuilder builder) {
        StagedOrderRemoveCustomLineItemAction stagedOrderRemoveCustomLineItemAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderRemoveCustomLineItemAction)
                .isInstanceOf(StagedOrderRemoveCustomLineItemAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "customLineItemId",
                        StagedOrderRemoveCustomLineItemAction.builder().customLineItemId("customLineItemId") },
                new Object[] { "customLineItemKey",
                        StagedOrderRemoveCustomLineItemAction.builder().customLineItemKey("customLineItemKey") } };
    }

    @Test
    public void customLineItemId() {
        StagedOrderRemoveCustomLineItemAction value = StagedOrderRemoveCustomLineItemAction.of();
        value.setCustomLineItemId("customLineItemId");
        Assertions.assertThat(value.getCustomLineItemId()).isEqualTo("customLineItemId");
    }

    @Test
    public void customLineItemKey() {
        StagedOrderRemoveCustomLineItemAction value = StagedOrderRemoveCustomLineItemAction.of();
        value.setCustomLineItemKey("customLineItemKey");
        Assertions.assertThat(value.getCustomLineItemKey()).isEqualTo("customLineItemKey");
    }
}
