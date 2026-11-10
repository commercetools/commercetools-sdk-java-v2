
package com.commercetools.importapi.models.errors;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DuplicateAttributeValuesErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DuplicateAttributeValuesErrorBuilder builder) {
        DuplicateAttributeValuesError duplicateAttributeValuesError = builder.buildUnchecked();
        Assertions.assertThat(duplicateAttributeValuesError).isInstanceOf(DuplicateAttributeValuesError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "attributes",
                DuplicateAttributeValuesError.builder()
                        .attributes(Collections.singletonList(
                            new com.commercetools.importapi.models.productvariants.AttributeImpl())) } };
    }

    @Test
    public void attributes() {
        DuplicateAttributeValuesError value = DuplicateAttributeValuesError.of();
        value.setAttributes(
            Collections.singletonList(new com.commercetools.importapi.models.productvariants.AttributeImpl()));
        Assertions.assertThat(value.getAttributes())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.importapi.models.productvariants.AttributeImpl()));
    }
}
