
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ExpiredCustomerPasswordTokenErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ExpiredCustomerPasswordTokenErrorBuilder builder) {
        ExpiredCustomerPasswordTokenError expiredCustomerPasswordTokenError = builder.buildUnchecked();
        Assertions.assertThat(expiredCustomerPasswordTokenError).isInstanceOf(ExpiredCustomerPasswordTokenError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "message", ExpiredCustomerPasswordTokenError.builder().message("message") } };
    }

    @Test
    public void message() {
        ExpiredCustomerPasswordTokenError value = ExpiredCustomerPasswordTokenError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }
}
