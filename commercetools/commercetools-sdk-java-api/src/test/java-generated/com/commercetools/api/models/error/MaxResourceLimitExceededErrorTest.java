
package com.commercetools.api.models.error;

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
                new Object[] { "exceededResource",
                        MaxResourceLimitExceededError.builder()
                                .exceededResource(
                                    com.commercetools.api.models.common.ReferenceTypeId.findEnum("approval-flow")) } };
    }

    @Test
    public void message() {
        MaxResourceLimitExceededError value = MaxResourceLimitExceededError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void exceededResource() {
        MaxResourceLimitExceededError value = MaxResourceLimitExceededError.of();
        value.setExceededResource(com.commercetools.api.models.common.ReferenceTypeId.findEnum("approval-flow"));
        Assertions.assertThat(value.getExceededResource())
                .isEqualTo(com.commercetools.api.models.common.ReferenceTypeId.findEnum("approval-flow"));
    }
}
