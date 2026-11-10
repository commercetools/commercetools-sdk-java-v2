
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerFirstNameSetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerFirstNameSetMessageBuilder builder) {
        CustomerFirstNameSetMessage customerFirstNameSetMessage = builder.buildUnchecked();
        Assertions.assertThat(customerFirstNameSetMessage).isInstanceOf(CustomerFirstNameSetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "firstName", CustomerFirstNameSetMessage.builder().firstName("firstName") } };
    }

    @Test
    public void firstName() {
        CustomerFirstNameSetMessage value = CustomerFirstNameSetMessage.of();
        value.setFirstName("firstName");
        Assertions.assertThat(value.getFirstName()).isEqualTo("firstName");
    }
}
