
package com.commercetools.api.models.error;

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
        return new Object[][] { new Object[] { "message", DuplicateAttributeValuesError.builder().message("message") },
                new Object[] { "attributes", DuplicateAttributeValuesError.builder()
                        .attributes(
                            Collections.singletonList(new com.commercetools.api.models.product.AttributeImpl())) } };
    }

    @Test
    public void message() {
        DuplicateAttributeValuesError value = DuplicateAttributeValuesError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void attributes() {
        DuplicateAttributeValuesError value = DuplicateAttributeValuesError.of();
        value.setAttributes(Collections.singletonList(new com.commercetools.api.models.product.AttributeImpl()));
        Assertions.assertThat(value.getAttributes())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.product.AttributeImpl()));
    }
}
