
package com.commercetools.api.models.order_edit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedOrderSetReturnItemCustomTypeActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedOrderSetReturnItemCustomTypeActionBuilder builder) {
        StagedOrderSetReturnItemCustomTypeAction stagedOrderSetReturnItemCustomTypeAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderSetReturnItemCustomTypeAction)
                .isInstanceOf(StagedOrderSetReturnItemCustomTypeAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "returnItemId",
                        StagedOrderSetReturnItemCustomTypeAction.builder().returnItemId("returnItemId") },
                new Object[] { "returnItemKey",
                        StagedOrderSetReturnItemCustomTypeAction.builder().returnItemKey("returnItemKey") },
                new Object[] { "type",
                        StagedOrderSetReturnItemCustomTypeAction.builder()
                                .type(new com.commercetools.api.models.type.TypeResourceIdentifierImpl()) },
                new Object[] { "fields", StagedOrderSetReturnItemCustomTypeAction.builder()
                        .fields(new com.commercetools.api.models.type.FieldContainerImpl()) } };
    }

    @Test
    public void returnItemId() {
        StagedOrderSetReturnItemCustomTypeAction value = StagedOrderSetReturnItemCustomTypeAction.of();
        value.setReturnItemId("returnItemId");
        Assertions.assertThat(value.getReturnItemId()).isEqualTo("returnItemId");
    }

    @Test
    public void returnItemKey() {
        StagedOrderSetReturnItemCustomTypeAction value = StagedOrderSetReturnItemCustomTypeAction.of();
        value.setReturnItemKey("returnItemKey");
        Assertions.assertThat(value.getReturnItemKey()).isEqualTo("returnItemKey");
    }

    @Test
    public void type() {
        StagedOrderSetReturnItemCustomTypeAction value = StagedOrderSetReturnItemCustomTypeAction.of();
        value.setType(new com.commercetools.api.models.type.TypeResourceIdentifierImpl());
        Assertions.assertThat(value.getType())
                .isEqualTo(new com.commercetools.api.models.type.TypeResourceIdentifierImpl());
    }

    @Test
    public void fields() {
        StagedOrderSetReturnItemCustomTypeAction value = StagedOrderSetReturnItemCustomTypeAction.of();
        value.setFields(new com.commercetools.api.models.type.FieldContainerImpl());
        Assertions.assertThat(value.getFields()).isEqualTo(new com.commercetools.api.models.type.FieldContainerImpl());
    }
}
