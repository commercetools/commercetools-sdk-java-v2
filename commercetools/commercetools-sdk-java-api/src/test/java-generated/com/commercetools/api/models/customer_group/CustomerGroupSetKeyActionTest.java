
package com.commercetools.api.models.customer_group;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerGroupSetKeyActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerGroupSetKeyActionBuilder builder) {
        CustomerGroupSetKeyAction customerGroupSetKeyAction = builder.buildUnchecked();
        Assertions.assertThat(customerGroupSetKeyAction).isInstanceOf(CustomerGroupSetKeyAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", CustomerGroupSetKeyAction.builder().key("key") } };
    }

    @Test
    public void key() {
        CustomerGroupSetKeyAction value = CustomerGroupSetKeyAction.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
