
package com.commercetools.api.models.order_edit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedOrderSetLineItemCustomFieldActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedOrderSetLineItemCustomFieldActionBuilder builder) {
        StagedOrderSetLineItemCustomFieldAction stagedOrderSetLineItemCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderSetLineItemCustomFieldAction)
                .isInstanceOf(StagedOrderSetLineItemCustomFieldAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "lineItemId",
                        StagedOrderSetLineItemCustomFieldAction.builder().lineItemId("lineItemId") },
                new Object[] { "lineItemKey",
                        StagedOrderSetLineItemCustomFieldAction.builder().lineItemKey("lineItemKey") },
                new Object[] { "name", StagedOrderSetLineItemCustomFieldAction.builder().name("name") },
                new Object[] { "value", StagedOrderSetLineItemCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void lineItemId() {
        StagedOrderSetLineItemCustomFieldAction value = StagedOrderSetLineItemCustomFieldAction.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void lineItemKey() {
        StagedOrderSetLineItemCustomFieldAction value = StagedOrderSetLineItemCustomFieldAction.of();
        value.setLineItemKey("lineItemKey");
        Assertions.assertThat(value.getLineItemKey()).isEqualTo("lineItemKey");
    }

    @Test
    public void name() {
        StagedOrderSetLineItemCustomFieldAction value = StagedOrderSetLineItemCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        StagedOrderSetLineItemCustomFieldAction value = StagedOrderSetLineItemCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
