
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MaxCartDiscountsReachedErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MaxCartDiscountsReachedErrorBuilder builder) {
        MaxCartDiscountsReachedError maxCartDiscountsReachedError = builder.buildUnchecked();
        Assertions.assertThat(maxCartDiscountsReachedError).isInstanceOf(MaxCartDiscountsReachedError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "message", MaxCartDiscountsReachedError.builder().message("message") } };
    }

    @Test
    public void message() {
        MaxCartDiscountsReachedError value = MaxCartDiscountsReachedError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }
}
