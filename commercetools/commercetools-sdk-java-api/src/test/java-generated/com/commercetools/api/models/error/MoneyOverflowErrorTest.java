
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MoneyOverflowErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MoneyOverflowErrorBuilder builder) {
        MoneyOverflowError moneyOverflowError = builder.buildUnchecked();
        Assertions.assertThat(moneyOverflowError).isInstanceOf(MoneyOverflowError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "message", MoneyOverflowError.builder().message("message") } };
    }

    @Test
    public void message() {
        MoneyOverflowError value = MoneyOverflowError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }
}
