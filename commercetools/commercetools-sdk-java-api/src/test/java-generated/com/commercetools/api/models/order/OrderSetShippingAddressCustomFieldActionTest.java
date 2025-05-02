
package com.commercetools.api.models.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderSetShippingAddressCustomFieldActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderSetShippingAddressCustomFieldActionBuilder builder) {
        OrderSetShippingAddressCustomFieldAction orderSetShippingAddressCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(orderSetShippingAddressCustomFieldAction)
                .isInstanceOf(OrderSetShippingAddressCustomFieldAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "name", OrderSetShippingAddressCustomFieldAction.builder().name("name") },
                new Object[] { "value", OrderSetShippingAddressCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void name() {
        OrderSetShippingAddressCustomFieldAction value = OrderSetShippingAddressCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        OrderSetShippingAddressCustomFieldAction value = OrderSetShippingAddressCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
