
package com.commercetools.api.models.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderSetReturnItemCustomTypeActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderSetReturnItemCustomTypeActionBuilder builder) {
        OrderSetReturnItemCustomTypeAction orderSetReturnItemCustomTypeAction = builder.buildUnchecked();
        Assertions.assertThat(orderSetReturnItemCustomTypeAction)
                .isInstanceOf(OrderSetReturnItemCustomTypeAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "returnItemId",
                        OrderSetReturnItemCustomTypeAction.builder().returnItemId("returnItemId") },
                new Object[] { "returnItemKey",
                        OrderSetReturnItemCustomTypeAction.builder().returnItemKey("returnItemKey") },
                new Object[] { "type",
                        OrderSetReturnItemCustomTypeAction.builder()
                                .type(new com.commercetools.api.models.type.TypeResourceIdentifierImpl()) },
                new Object[] { "fields", OrderSetReturnItemCustomTypeAction.builder()
                        .fields(new com.commercetools.api.models.type.FieldContainerImpl()) } };
    }

    @Test
    public void returnItemId() {
        OrderSetReturnItemCustomTypeAction value = OrderSetReturnItemCustomTypeAction.of();
        value.setReturnItemId("returnItemId");
        Assertions.assertThat(value.getReturnItemId()).isEqualTo("returnItemId");
    }

    @Test
    public void returnItemKey() {
        OrderSetReturnItemCustomTypeAction value = OrderSetReturnItemCustomTypeAction.of();
        value.setReturnItemKey("returnItemKey");
        Assertions.assertThat(value.getReturnItemKey()).isEqualTo("returnItemKey");
    }

    @Test
    public void type() {
        OrderSetReturnItemCustomTypeAction value = OrderSetReturnItemCustomTypeAction.of();
        value.setType(new com.commercetools.api.models.type.TypeResourceIdentifierImpl());
        Assertions.assertThat(value.getType())
                .isEqualTo(new com.commercetools.api.models.type.TypeResourceIdentifierImpl());
    }

    @Test
    public void fields() {
        OrderSetReturnItemCustomTypeAction value = OrderSetReturnItemCustomTypeAction.of();
        value.setFields(new com.commercetools.api.models.type.FieldContainerImpl());
        Assertions.assertThat(value.getFields()).isEqualTo(new com.commercetools.api.models.type.FieldContainerImpl());
    }
}
