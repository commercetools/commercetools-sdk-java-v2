
package com.commercetools.api.models.customer_group;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerGroupSetCustomFieldActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerGroupSetCustomFieldActionBuilder builder) {
        CustomerGroupSetCustomFieldAction customerGroupSetCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(customerGroupSetCustomFieldAction).isInstanceOf(CustomerGroupSetCustomFieldAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", CustomerGroupSetCustomFieldAction.builder().name("name") },
                new Object[] { "value", CustomerGroupSetCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void name() {
        CustomerGroupSetCustomFieldAction value = CustomerGroupSetCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        CustomerGroupSetCustomFieldAction value = CustomerGroupSetCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
