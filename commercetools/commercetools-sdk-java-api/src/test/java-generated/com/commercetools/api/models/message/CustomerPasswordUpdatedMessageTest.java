
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerPasswordUpdatedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerPasswordUpdatedMessageBuilder builder) {
        CustomerPasswordUpdatedMessage customerPasswordUpdatedMessage = builder.buildUnchecked();
        Assertions.assertThat(customerPasswordUpdatedMessage).isInstanceOf(CustomerPasswordUpdatedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "reset", CustomerPasswordUpdatedMessage.builder().reset(true) } };
    }

    @Test
    public void reset() {
        CustomerPasswordUpdatedMessage value = CustomerPasswordUpdatedMessage.of();
        value.setReset(true);
        Assertions.assertThat(value.getReset()).isEqualTo(true);
    }
}
