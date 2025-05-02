
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DuplicateAttributeValueErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DuplicateAttributeValueErrorBuilder builder) {
        DuplicateAttributeValueError duplicateAttributeValueError = builder.buildUnchecked();
        Assertions.assertThat(duplicateAttributeValueError).isInstanceOf(DuplicateAttributeValueError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "message", DuplicateAttributeValueError.builder().message("message") },
                new Object[] { "attribute", DuplicateAttributeValueError.builder()
                        .attribute(new com.commercetools.api.models.product.AttributeImpl()) } };
    }

    @Test
    public void message() {
        DuplicateAttributeValueError value = DuplicateAttributeValueError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void attribute() {
        DuplicateAttributeValueError value = DuplicateAttributeValueError.of();
        value.setAttribute(new com.commercetools.api.models.product.AttributeImpl());
        Assertions.assertThat(value.getAttribute()).isEqualTo(new com.commercetools.api.models.product.AttributeImpl());
    }
}
