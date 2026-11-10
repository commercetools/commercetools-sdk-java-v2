
package com.commercetools.api.models.order_edit;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedOrderImportLineItemStateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedOrderImportLineItemStateActionBuilder builder) {
        StagedOrderImportLineItemStateAction stagedOrderImportLineItemStateAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderImportLineItemStateAction)
                .isInstanceOf(StagedOrderImportLineItemStateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "lineItemId", StagedOrderImportLineItemStateAction.builder().lineItemId("lineItemId") },
                new Object[] { "lineItemKey",
                        StagedOrderImportLineItemStateAction.builder().lineItemKey("lineItemKey") },
                new Object[] { "state", StagedOrderImportLineItemStateAction.builder()
                        .state(Collections.singletonList(new com.commercetools.api.models.order.ItemStateImpl())) } };
    }

    @Test
    public void lineItemId() {
        StagedOrderImportLineItemStateAction value = StagedOrderImportLineItemStateAction.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void lineItemKey() {
        StagedOrderImportLineItemStateAction value = StagedOrderImportLineItemStateAction.of();
        value.setLineItemKey("lineItemKey");
        Assertions.assertThat(value.getLineItemKey()).isEqualTo("lineItemKey");
    }

    @Test
    public void state() {
        StagedOrderImportLineItemStateAction value = StagedOrderImportLineItemStateAction.of();
        value.setState(Collections.singletonList(new com.commercetools.api.models.order.ItemStateImpl()));
        Assertions.assertThat(value.getState())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.order.ItemStateImpl()));
    }
}
