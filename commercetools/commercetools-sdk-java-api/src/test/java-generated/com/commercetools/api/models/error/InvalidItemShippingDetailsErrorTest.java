
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class InvalidItemShippingDetailsErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, InvalidItemShippingDetailsErrorBuilder builder) {
        InvalidItemShippingDetailsError invalidItemShippingDetailsError = builder.buildUnchecked();
        Assertions.assertThat(invalidItemShippingDetailsError).isInstanceOf(InvalidItemShippingDetailsError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "message", InvalidItemShippingDetailsError.builder().message("message") },
                new Object[] { "subject", InvalidItemShippingDetailsError.builder().subject("subject") },
                new Object[] { "itemId", InvalidItemShippingDetailsError.builder().itemId("itemId") } };
    }

    @Test
    public void message() {
        InvalidItemShippingDetailsError value = InvalidItemShippingDetailsError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void subject() {
        InvalidItemShippingDetailsError value = InvalidItemShippingDetailsError.of();
        value.setSubject("subject");
        Assertions.assertThat(value.getSubject()).isEqualTo("subject");
    }

    @Test
    public void itemId() {
        InvalidItemShippingDetailsError value = InvalidItemShippingDetailsError.of();
        value.setItemId("itemId");
        Assertions.assertThat(value.getItemId()).isEqualTo("itemId");
    }
}
