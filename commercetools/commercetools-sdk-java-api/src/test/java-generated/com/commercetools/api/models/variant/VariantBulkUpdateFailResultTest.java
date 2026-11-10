
package com.commercetools.api.models.variant;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class VariantBulkUpdateFailResultTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, VariantBulkUpdateFailResultBuilder builder) {
        VariantBulkUpdateFailResult variantBulkUpdateFailResult = builder.buildUnchecked();
        Assertions.assertThat(variantBulkUpdateFailResult).isInstanceOf(VariantBulkUpdateFailResult.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "errors", VariantBulkUpdateFailResult.builder()
                .errors(Collections.singletonList(new com.commercetools.api.models.error.ErrorObjectImpl())) } };
    }

    @Test
    public void errors() {
        VariantBulkUpdateFailResult value = VariantBulkUpdateFailResult.of();
        value.setErrors(Collections.singletonList(new com.commercetools.api.models.error.ErrorObjectImpl()));
        Assertions.assertThat(value.getErrors())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.error.ErrorObjectImpl()));
    }
}
