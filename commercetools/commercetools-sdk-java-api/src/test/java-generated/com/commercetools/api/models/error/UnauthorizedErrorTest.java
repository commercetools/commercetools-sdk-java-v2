
package com.commercetools.api.models.error;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class UnauthorizedErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, UnauthorizedErrorBuilder builder) {
        UnauthorizedError unauthorizedError = builder.buildUnchecked();
        Assertions.assertThat(unauthorizedError).isInstanceOf(UnauthorizedError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "message", UnauthorizedError.builder().message("message") },
                new Object[] { "storesWithoutPermission", UnauthorizedError.builder()
                        .storesWithoutPermission(Collections.singletonList("storesWithoutPermission")) } };
    }

    @Test
    public void message() {
        UnauthorizedError value = UnauthorizedError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void storesWithoutPermission() {
        UnauthorizedError value = UnauthorizedError.of();
        value.setStoresWithoutPermission(Collections.singletonList("storesWithoutPermission"));
        Assertions.assertThat(value.getStoresWithoutPermission())
                .isEqualTo(Collections.singletonList("storesWithoutPermission"));
    }
}
