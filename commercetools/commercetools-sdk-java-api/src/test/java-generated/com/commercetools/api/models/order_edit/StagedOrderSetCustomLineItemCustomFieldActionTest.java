
package com.commercetools.api.models.order_edit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedOrderSetCustomLineItemCustomFieldActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedOrderSetCustomLineItemCustomFieldActionBuilder builder) {
        StagedOrderSetCustomLineItemCustomFieldAction stagedOrderSetCustomLineItemCustomFieldAction = builder
                .buildUnchecked();
        Assertions.assertThat(stagedOrderSetCustomLineItemCustomFieldAction)
                .isInstanceOf(StagedOrderSetCustomLineItemCustomFieldAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "customLineItemId",
                        StagedOrderSetCustomLineItemCustomFieldAction.builder().customLineItemId("customLineItemId") },
                new Object[] { "customLineItemKey",
                        StagedOrderSetCustomLineItemCustomFieldAction.builder()
                                .customLineItemKey("customLineItemKey") },
                new Object[] { "name", StagedOrderSetCustomLineItemCustomFieldAction.builder().name("name") },
                new Object[] { "value", StagedOrderSetCustomLineItemCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void customLineItemId() {
        StagedOrderSetCustomLineItemCustomFieldAction value = StagedOrderSetCustomLineItemCustomFieldAction.of();
        value.setCustomLineItemId("customLineItemId");
        Assertions.assertThat(value.getCustomLineItemId()).isEqualTo("customLineItemId");
    }

    @Test
    public void customLineItemKey() {
        StagedOrderSetCustomLineItemCustomFieldAction value = StagedOrderSetCustomLineItemCustomFieldAction.of();
        value.setCustomLineItemKey("customLineItemKey");
        Assertions.assertThat(value.getCustomLineItemKey()).isEqualTo("customLineItemKey");
    }

    @Test
    public void name() {
        StagedOrderSetCustomLineItemCustomFieldAction value = StagedOrderSetCustomLineItemCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        StagedOrderSetCustomLineItemCustomFieldAction value = StagedOrderSetCustomLineItemCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
