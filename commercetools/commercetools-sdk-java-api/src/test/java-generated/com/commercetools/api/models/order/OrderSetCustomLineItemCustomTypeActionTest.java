
package com.commercetools.api.models.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderSetCustomLineItemCustomTypeActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderSetCustomLineItemCustomTypeActionBuilder builder) {
        OrderSetCustomLineItemCustomTypeAction orderSetCustomLineItemCustomTypeAction = builder.buildUnchecked();
        Assertions.assertThat(orderSetCustomLineItemCustomTypeAction)
                .isInstanceOf(OrderSetCustomLineItemCustomTypeAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "customLineItemId",
                        OrderSetCustomLineItemCustomTypeAction.builder().customLineItemId("customLineItemId") },
                new Object[] { "customLineItemKey",
                        OrderSetCustomLineItemCustomTypeAction.builder().customLineItemKey("customLineItemKey") },
                new Object[] { "type",
                        OrderSetCustomLineItemCustomTypeAction.builder()
                                .type(new com.commercetools.api.models.type.TypeResourceIdentifierImpl()) },
                new Object[] { "fields", OrderSetCustomLineItemCustomTypeAction.builder()
                        .fields(new com.commercetools.api.models.type.FieldContainerImpl()) } };
    }

    @Test
    public void customLineItemId() {
        OrderSetCustomLineItemCustomTypeAction value = OrderSetCustomLineItemCustomTypeAction.of();
        value.setCustomLineItemId("customLineItemId");
        Assertions.assertThat(value.getCustomLineItemId()).isEqualTo("customLineItemId");
    }

    @Test
    public void customLineItemKey() {
        OrderSetCustomLineItemCustomTypeAction value = OrderSetCustomLineItemCustomTypeAction.of();
        value.setCustomLineItemKey("customLineItemKey");
        Assertions.assertThat(value.getCustomLineItemKey()).isEqualTo("customLineItemKey");
    }

    @Test
    public void type() {
        OrderSetCustomLineItemCustomTypeAction value = OrderSetCustomLineItemCustomTypeAction.of();
        value.setType(new com.commercetools.api.models.type.TypeResourceIdentifierImpl());
        Assertions.assertThat(value.getType())
                .isEqualTo(new com.commercetools.api.models.type.TypeResourceIdentifierImpl());
    }

    @Test
    public void fields() {
        OrderSetCustomLineItemCustomTypeAction value = OrderSetCustomLineItemCustomTypeAction.of();
        value.setFields(new com.commercetools.api.models.type.FieldContainerImpl());
        Assertions.assertThat(value.getFields()).isEqualTo(new com.commercetools.api.models.type.FieldContainerImpl());
    }
}
