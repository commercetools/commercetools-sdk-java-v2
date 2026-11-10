
package com.commercetools.api.models.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderSetLineItemCustomTypeActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderSetLineItemCustomTypeActionBuilder builder) {
        OrderSetLineItemCustomTypeAction orderSetLineItemCustomTypeAction = builder.buildUnchecked();
        Assertions.assertThat(orderSetLineItemCustomTypeAction).isInstanceOf(OrderSetLineItemCustomTypeAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "lineItemId", OrderSetLineItemCustomTypeAction.builder().lineItemId("lineItemId") },
                new Object[] { "lineItemKey", OrderSetLineItemCustomTypeAction.builder().lineItemKey("lineItemKey") },
                new Object[] { "type",
                        OrderSetLineItemCustomTypeAction.builder()
                                .type(new com.commercetools.api.models.type.TypeResourceIdentifierImpl()) },
                new Object[] { "fields", OrderSetLineItemCustomTypeAction.builder()
                        .fields(new com.commercetools.api.models.type.FieldContainerImpl()) } };
    }

    @Test
    public void lineItemId() {
        OrderSetLineItemCustomTypeAction value = OrderSetLineItemCustomTypeAction.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void lineItemKey() {
        OrderSetLineItemCustomTypeAction value = OrderSetLineItemCustomTypeAction.of();
        value.setLineItemKey("lineItemKey");
        Assertions.assertThat(value.getLineItemKey()).isEqualTo("lineItemKey");
    }

    @Test
    public void type() {
        OrderSetLineItemCustomTypeAction value = OrderSetLineItemCustomTypeAction.of();
        value.setType(new com.commercetools.api.models.type.TypeResourceIdentifierImpl());
        Assertions.assertThat(value.getType())
                .isEqualTo(new com.commercetools.api.models.type.TypeResourceIdentifierImpl());
    }

    @Test
    public void fields() {
        OrderSetLineItemCustomTypeAction value = OrderSetLineItemCustomTypeAction.of();
        value.setFields(new com.commercetools.api.models.type.FieldContainerImpl());
        Assertions.assertThat(value.getFields()).isEqualTo(new com.commercetools.api.models.type.FieldContainerImpl());
    }
}
