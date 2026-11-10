
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ExpiredCustomerEmailTokenErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ExpiredCustomerEmailTokenErrorBuilder builder) {
        ExpiredCustomerEmailTokenError expiredCustomerEmailTokenError = builder.buildUnchecked();
        Assertions.assertThat(expiredCustomerEmailTokenError).isInstanceOf(ExpiredCustomerEmailTokenError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "message", ExpiredCustomerEmailTokenError.builder().message("message") } };
    }

    @Test
    public void message() {
        ExpiredCustomerEmailTokenError value = ExpiredCustomerEmailTokenError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }
}
