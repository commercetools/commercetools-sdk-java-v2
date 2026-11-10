
package com.commercetools.api.models.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderSetItemShippingAddressCustomTypeActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderSetItemShippingAddressCustomTypeActionBuilder builder) {
        OrderSetItemShippingAddressCustomTypeAction orderSetItemShippingAddressCustomTypeAction = builder
                .buildUnchecked();
        Assertions.assertThat(orderSetItemShippingAddressCustomTypeAction)
                .isInstanceOf(OrderSetItemShippingAddressCustomTypeAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "addressKey",
                        OrderSetItemShippingAddressCustomTypeAction.builder().addressKey("addressKey") },
                new Object[] { "type",
                        OrderSetItemShippingAddressCustomTypeAction.builder()
                                .type(new com.commercetools.api.models.type.TypeResourceIdentifierImpl()) },
                new Object[] { "fields", OrderSetItemShippingAddressCustomTypeAction.builder()
                        .fields(new com.commercetools.api.models.type.FieldContainerImpl()) } };
    }

    @Test
    public void addressKey() {
        OrderSetItemShippingAddressCustomTypeAction value = OrderSetItemShippingAddressCustomTypeAction.of();
        value.setAddressKey("addressKey");
        Assertions.assertThat(value.getAddressKey()).isEqualTo("addressKey");
    }

    @Test
    public void type() {
        OrderSetItemShippingAddressCustomTypeAction value = OrderSetItemShippingAddressCustomTypeAction.of();
        value.setType(new com.commercetools.api.models.type.TypeResourceIdentifierImpl());
        Assertions.assertThat(value.getType())
                .isEqualTo(new com.commercetools.api.models.type.TypeResourceIdentifierImpl());
    }

    @Test
    public void fields() {
        OrderSetItemShippingAddressCustomTypeAction value = OrderSetItemShippingAddressCustomTypeAction.of();
        value.setFields(new com.commercetools.api.models.type.FieldContainerImpl());
        Assertions.assertThat(value.getFields()).isEqualTo(new com.commercetools.api.models.type.FieldContainerImpl());
    }
}
