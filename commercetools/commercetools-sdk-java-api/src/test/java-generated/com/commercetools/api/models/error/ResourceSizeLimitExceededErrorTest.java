
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ResourceSizeLimitExceededErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ResourceSizeLimitExceededErrorBuilder builder) {
        ResourceSizeLimitExceededError resourceSizeLimitExceededError = builder.buildUnchecked();
        Assertions.assertThat(resourceSizeLimitExceededError).isInstanceOf(ResourceSizeLimitExceededError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "message", ResourceSizeLimitExceededError.builder().message("message") } };
    }

    @Test
    public void message() {
        ResourceSizeLimitExceededError value = ResourceSizeLimitExceededError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }
}
