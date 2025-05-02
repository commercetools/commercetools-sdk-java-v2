
package com.commercetools.api.models.customer;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerSetCustomFieldActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerSetCustomFieldActionBuilder builder) {
        CustomerSetCustomFieldAction customerSetCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(customerSetCustomFieldAction).isInstanceOf(CustomerSetCustomFieldAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", CustomerSetCustomFieldAction.builder().name("name") },
                new Object[] { "value", CustomerSetCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void name() {
        CustomerSetCustomFieldAction value = CustomerSetCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        CustomerSetCustomFieldAction value = CustomerSetCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
