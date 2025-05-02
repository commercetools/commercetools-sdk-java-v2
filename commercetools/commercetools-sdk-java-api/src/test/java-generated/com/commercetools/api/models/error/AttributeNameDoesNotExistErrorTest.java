
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AttributeNameDoesNotExistErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AttributeNameDoesNotExistErrorBuilder builder) {
        AttributeNameDoesNotExistError attributeNameDoesNotExistError = builder.buildUnchecked();
        Assertions.assertThat(attributeNameDoesNotExistError).isInstanceOf(AttributeNameDoesNotExistError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "message", AttributeNameDoesNotExistError.builder().message("message") },
                new Object[] { "invalidAttributeName",
                        AttributeNameDoesNotExistError.builder().invalidAttributeName("invalidAttributeName") } };
    }

    @Test
    public void message() {
        AttributeNameDoesNotExistError value = AttributeNameDoesNotExistError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void invalidAttributeName() {
        AttributeNameDoesNotExistError value = AttributeNameDoesNotExistError.of();
        value.setInvalidAttributeName("invalidAttributeName");
        Assertions.assertThat(value.getInvalidAttributeName()).isEqualTo("invalidAttributeName");
    }
}
