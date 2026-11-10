
package com.commercetools.api.models.customer_group;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerGroupChangeNameActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerGroupChangeNameActionBuilder builder) {
        CustomerGroupChangeNameAction customerGroupChangeNameAction = builder.buildUnchecked();
        Assertions.assertThat(customerGroupChangeNameAction).isInstanceOf(CustomerGroupChangeNameAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", CustomerGroupChangeNameAction.builder().name("name") } };
    }

    @Test
    public void name() {
        CustomerGroupChangeNameAction value = CustomerGroupChangeNameAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }
}
