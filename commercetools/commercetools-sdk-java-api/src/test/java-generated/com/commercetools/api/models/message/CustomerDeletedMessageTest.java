
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerDeletedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerDeletedMessageBuilder builder) {
        CustomerDeletedMessage customerDeletedMessage = builder.buildUnchecked();
        Assertions.assertThat(customerDeletedMessage).isInstanceOf(CustomerDeletedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "email", CustomerDeletedMessage.builder().email("email") } };
    }

    @Test
    public void email() {
        CustomerDeletedMessage value = CustomerDeletedMessage.of();
        value.setEmail("email");
        Assertions.assertThat(value.getEmail()).isEqualTo("email");
    }
}
