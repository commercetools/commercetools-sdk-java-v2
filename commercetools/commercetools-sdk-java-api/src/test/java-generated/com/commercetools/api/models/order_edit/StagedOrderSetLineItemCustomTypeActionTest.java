
package com.commercetools.api.models.order_edit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedOrderSetLineItemCustomTypeActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedOrderSetLineItemCustomTypeActionBuilder builder) {
        StagedOrderSetLineItemCustomTypeAction stagedOrderSetLineItemCustomTypeAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderSetLineItemCustomTypeAction)
                .isInstanceOf(StagedOrderSetLineItemCustomTypeAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "lineItemId",
                        StagedOrderSetLineItemCustomTypeAction.builder().lineItemId("lineItemId") },
                new Object[] { "lineItemKey",
                        StagedOrderSetLineItemCustomTypeAction.builder().lineItemKey("lineItemKey") },
                new Object[] { "type",
                        StagedOrderSetLineItemCustomTypeAction.builder()
                                .type(new com.commercetools.api.models.type.TypeResourceIdentifierImpl()) },
                new Object[] { "fields", StagedOrderSetLineItemCustomTypeAction.builder()
                        .fields(new com.commercetools.api.models.type.FieldContainerImpl()) } };
    }

    @Test
    public void lineItemId() {
        StagedOrderSetLineItemCustomTypeAction value = StagedOrderSetLineItemCustomTypeAction.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void lineItemKey() {
        StagedOrderSetLineItemCustomTypeAction value = StagedOrderSetLineItemCustomTypeAction.of();
        value.setLineItemKey("lineItemKey");
        Assertions.assertThat(value.getLineItemKey()).isEqualTo("lineItemKey");
    }

    @Test
    public void type() {
        StagedOrderSetLineItemCustomTypeAction value = StagedOrderSetLineItemCustomTypeAction.of();
        value.setType(new com.commercetools.api.models.type.TypeResourceIdentifierImpl());
        Assertions.assertThat(value.getType())
                .isEqualTo(new com.commercetools.api.models.type.TypeResourceIdentifierImpl());
    }

    @Test
    public void fields() {
        StagedOrderSetLineItemCustomTypeAction value = StagedOrderSetLineItemCustomTypeAction.of();
        value.setFields(new com.commercetools.api.models.type.FieldContainerImpl());
        Assertions.assertThat(value.getFields()).isEqualTo(new com.commercetools.api.models.type.FieldContainerImpl());
    }
}
