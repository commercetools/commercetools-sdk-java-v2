
package com.commercetools.api.models.order_edit;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedOrderImportCustomLineItemStateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedOrderImportCustomLineItemStateActionBuilder builder) {
        StagedOrderImportCustomLineItemStateAction stagedOrderImportCustomLineItemStateAction = builder
                .buildUnchecked();
        Assertions.assertThat(stagedOrderImportCustomLineItemStateAction)
                .isInstanceOf(StagedOrderImportCustomLineItemStateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "customLineItemId",
                        StagedOrderImportCustomLineItemStateAction.builder().customLineItemId("customLineItemId") },
                new Object[] { "customLineItemKey",
                        StagedOrderImportCustomLineItemStateAction.builder().customLineItemKey("customLineItemKey") },
                new Object[] { "state", StagedOrderImportCustomLineItemStateAction.builder()
                        .state(Collections.singletonList(new com.commercetools.api.models.order.ItemStateImpl())) } };
    }

    @Test
    public void customLineItemId() {
        StagedOrderImportCustomLineItemStateAction value = StagedOrderImportCustomLineItemStateAction.of();
        value.setCustomLineItemId("customLineItemId");
        Assertions.assertThat(value.getCustomLineItemId()).isEqualTo("customLineItemId");
    }

    @Test
    public void customLineItemKey() {
        StagedOrderImportCustomLineItemStateAction value = StagedOrderImportCustomLineItemStateAction.of();
        value.setCustomLineItemKey("customLineItemKey");
        Assertions.assertThat(value.getCustomLineItemKey()).isEqualTo("customLineItemKey");
    }

    @Test
    public void state() {
        StagedOrderImportCustomLineItemStateAction value = StagedOrderImportCustomLineItemStateAction.of();
        value.setState(Collections.singletonList(new com.commercetools.api.models.order.ItemStateImpl()));
        Assertions.assertThat(value.getState())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.order.ItemStateImpl()));
    }
}
