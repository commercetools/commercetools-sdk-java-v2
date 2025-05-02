
package com.commercetools.importapi.models.errors;

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
        return new Object[][] { new Object[] { "attribute", DuplicateAttributeValueError.builder()
                .attribute(new com.commercetools.importapi.models.productvariants.AttributeImpl()) } };
    }

    @Test
    public void attribute() {
        DuplicateAttributeValueError value = DuplicateAttributeValueError.of();
        value.setAttribute(new com.commercetools.importapi.models.productvariants.AttributeImpl());
        Assertions.assertThat(value.getAttribute())
                .isEqualTo(new com.commercetools.importapi.models.productvariants.AttributeImpl());
    }
}
