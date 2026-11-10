
package com.commercetools.api.models.order_edit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedOrderSetReturnItemCustomFieldActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedOrderSetReturnItemCustomFieldActionBuilder builder) {
        StagedOrderSetReturnItemCustomFieldAction stagedOrderSetReturnItemCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderSetReturnItemCustomFieldAction)
                .isInstanceOf(StagedOrderSetReturnItemCustomFieldAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "returnItemId",
                        StagedOrderSetReturnItemCustomFieldAction.builder().returnItemId("returnItemId") },
                new Object[] { "returnItemKey",
                        StagedOrderSetReturnItemCustomFieldAction.builder().returnItemKey("returnItemKey") },
                new Object[] { "name", StagedOrderSetReturnItemCustomFieldAction.builder().name("name") },
                new Object[] { "value", StagedOrderSetReturnItemCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void returnItemId() {
        StagedOrderSetReturnItemCustomFieldAction value = StagedOrderSetReturnItemCustomFieldAction.of();
        value.setReturnItemId("returnItemId");
        Assertions.assertThat(value.getReturnItemId()).isEqualTo("returnItemId");
    }

    @Test
    public void returnItemKey() {
        StagedOrderSetReturnItemCustomFieldAction value = StagedOrderSetReturnItemCustomFieldAction.of();
        value.setReturnItemKey("returnItemKey");
        Assertions.assertThat(value.getReturnItemKey()).isEqualTo("returnItemKey");
    }

    @Test
    public void name() {
        StagedOrderSetReturnItemCustomFieldAction value = StagedOrderSetReturnItemCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        StagedOrderSetReturnItemCustomFieldAction value = StagedOrderSetReturnItemCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
