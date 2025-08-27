
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MaxDiscountGroupsReachedErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MaxDiscountGroupsReachedErrorBuilder builder) {
        MaxDiscountGroupsReachedError maxDiscountGroupsReachedError = builder.buildUnchecked();
        Assertions.assertThat(maxDiscountGroupsReachedError).isInstanceOf(MaxDiscountGroupsReachedError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "message", MaxDiscountGroupsReachedError.builder().message("message") } };
    }

    @Test
    public void message() {
        MaxDiscountGroupsReachedError value = MaxDiscountGroupsReachedError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }
}
