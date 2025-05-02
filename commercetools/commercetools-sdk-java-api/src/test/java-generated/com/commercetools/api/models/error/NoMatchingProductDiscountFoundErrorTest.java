
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class NoMatchingProductDiscountFoundErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, NoMatchingProductDiscountFoundErrorBuilder builder) {
        NoMatchingProductDiscountFoundError noMatchingProductDiscountFoundError = builder.buildUnchecked();
        Assertions.assertThat(noMatchingProductDiscountFoundError)
                .isInstanceOf(NoMatchingProductDiscountFoundError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "message", NoMatchingProductDiscountFoundError.builder().message("message") } };
    }

    @Test
    public void message() {
        NoMatchingProductDiscountFoundError value = NoMatchingProductDiscountFoundError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }
}
