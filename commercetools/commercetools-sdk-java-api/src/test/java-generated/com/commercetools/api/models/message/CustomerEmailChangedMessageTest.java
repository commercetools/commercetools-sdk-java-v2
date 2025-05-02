
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerEmailChangedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerEmailChangedMessageBuilder builder) {
        CustomerEmailChangedMessage customerEmailChangedMessage = builder.buildUnchecked();
        Assertions.assertThat(customerEmailChangedMessage).isInstanceOf(CustomerEmailChangedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "email", CustomerEmailChangedMessage.builder().email("email") } };
    }

    @Test
    public void email() {
        CustomerEmailChangedMessage value = CustomerEmailChangedMessage.of();
        value.setEmail("email");
        Assertions.assertThat(value.getEmail()).isEqualTo("email");
    }
}
