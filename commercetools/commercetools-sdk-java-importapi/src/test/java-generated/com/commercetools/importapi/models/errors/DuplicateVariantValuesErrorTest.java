
package com.commercetools.importapi.models.errors;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DuplicateVariantValuesErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DuplicateVariantValuesErrorBuilder builder) {
        DuplicateVariantValuesError duplicateVariantValuesError = builder.buildUnchecked();
        Assertions.assertThat(duplicateVariantValuesError).isInstanceOf(DuplicateVariantValuesError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "variantValues", DuplicateVariantValuesError.builder()
                .variantValues(new com.commercetools.importapi.models.errors.VariantValuesImpl()) } };
    }

    @Test
    public void variantValues() {
        DuplicateVariantValuesError value = DuplicateVariantValuesError.of();
        value.setVariantValues(new com.commercetools.importapi.models.errors.VariantValuesImpl());
        Assertions.assertThat(value.getVariantValues())
                .isEqualTo(new com.commercetools.importapi.models.errors.VariantValuesImpl());
    }
}
