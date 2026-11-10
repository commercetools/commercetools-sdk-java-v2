
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MaxStoreReferencesReachedErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MaxStoreReferencesReachedErrorBuilder builder) {
        MaxStoreReferencesReachedError maxStoreReferencesReachedError = builder.buildUnchecked();
        Assertions.assertThat(maxStoreReferencesReachedError).isInstanceOf(MaxStoreReferencesReachedError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "message", MaxStoreReferencesReachedError.builder().message("message") } };
    }

    @Test
    public void message() {
        MaxStoreReferencesReachedError value = MaxStoreReferencesReachedError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }
}
