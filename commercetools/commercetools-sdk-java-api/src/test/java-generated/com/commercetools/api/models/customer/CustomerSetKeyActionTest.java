
package com.commercetools.api.models.customer;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerSetKeyActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerSetKeyActionBuilder builder) {
        CustomerSetKeyAction customerSetKeyAction = builder.buildUnchecked();
        Assertions.assertThat(customerSetKeyAction).isInstanceOf(CustomerSetKeyAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", CustomerSetKeyAction.builder().key("key") } };
    }

    @Test
    public void key() {
        CustomerSetKeyAction value = CustomerSetKeyAction.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
