
package com.commercetools.checkout.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MaxResourceLimitExceededErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MaxResourceLimitExceededErrorBuilder builder) {
        MaxResourceLimitExceededError maxResourceLimitExceededError = builder.buildUnchecked();
        Assertions.assertThat(maxResourceLimitExceededError).isInstanceOf(MaxResourceLimitExceededError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "message", MaxResourceLimitExceededError.builder().message("message") },
                new Object[] { "limit", MaxResourceLimitExceededError.builder().limit(0.26748633) }, new Object[] {
                        "resourceTypeId", MaxResourceLimitExceededError.builder().resourceTypeId("resourceTypeId") } };
    }

    @Test
    public void message() {
        MaxResourceLimitExceededError value = MaxResourceLimitExceededError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void limit() {
        MaxResourceLimitExceededError value = MaxResourceLimitExceededError.of();
        value.setLimit(0.26748633);
        Assertions.assertThat(value.getLimit()).isEqualTo(0.26748633);
    }

    @Test
    public void resourceTypeId() {
        MaxResourceLimitExceededError value = MaxResourceLimitExceededError.of();
        value.setResourceTypeId("resourceTypeId");
        Assertions.assertThat(value.getResourceTypeId()).isEqualTo("resourceTypeId");
    }
}
