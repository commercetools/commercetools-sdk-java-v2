
package com.commercetools.api.models.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderSetBillingAddressCustomFieldActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderSetBillingAddressCustomFieldActionBuilder builder) {
        OrderSetBillingAddressCustomFieldAction orderSetBillingAddressCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(orderSetBillingAddressCustomFieldAction)
                .isInstanceOf(OrderSetBillingAddressCustomFieldAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", OrderSetBillingAddressCustomFieldAction.builder().name("name") },
                new Object[] { "value", OrderSetBillingAddressCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void name() {
        OrderSetBillingAddressCustomFieldAction value = OrderSetBillingAddressCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        OrderSetBillingAddressCustomFieldAction value = OrderSetBillingAddressCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
