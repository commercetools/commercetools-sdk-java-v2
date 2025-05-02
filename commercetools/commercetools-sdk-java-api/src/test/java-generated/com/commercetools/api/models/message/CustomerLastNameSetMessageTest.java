
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerLastNameSetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerLastNameSetMessageBuilder builder) {
        CustomerLastNameSetMessage customerLastNameSetMessage = builder.buildUnchecked();
        Assertions.assertThat(customerLastNameSetMessage).isInstanceOf(CustomerLastNameSetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "lastName", CustomerLastNameSetMessage.builder().lastName("lastName") } };
    }

    @Test
    public void lastName() {
        CustomerLastNameSetMessage value = CustomerLastNameSetMessage.of();
        value.setLastName("lastName");
        Assertions.assertThat(value.getLastName()).isEqualTo("lastName");
    }
}
