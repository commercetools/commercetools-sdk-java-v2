
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerEmailChangedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerEmailChangedMessagePayloadBuilder builder) {
        CustomerEmailChangedMessagePayload customerEmailChangedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(customerEmailChangedMessagePayload)
                .isInstanceOf(CustomerEmailChangedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "email", CustomerEmailChangedMessagePayload.builder().email("email") },
                new Object[] { "oldEmail", CustomerEmailChangedMessagePayload.builder().oldEmail("oldEmail") } };
    }

    @Test
    public void email() {
        CustomerEmailChangedMessagePayload value = CustomerEmailChangedMessagePayload.of();
        value.setEmail("email");
        Assertions.assertThat(value.getEmail()).isEqualTo("email");
    }

    @Test
    public void oldEmail() {
        CustomerEmailChangedMessagePayload value = CustomerEmailChangedMessagePayload.of();
        value.setOldEmail("oldEmail");
        Assertions.assertThat(value.getOldEmail()).isEqualTo("oldEmail");
    }
}
