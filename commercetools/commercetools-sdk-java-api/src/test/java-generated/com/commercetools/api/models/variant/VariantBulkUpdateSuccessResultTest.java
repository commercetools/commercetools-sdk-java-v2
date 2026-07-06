
package com.commercetools.api.models.variant;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class VariantBulkUpdateSuccessResultTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, VariantBulkUpdateSuccessResultBuilder builder) {
        VariantBulkUpdateSuccessResult variantBulkUpdateSuccessResult = builder.buildUnchecked();
        Assertions.assertThat(variantBulkUpdateSuccessResult).isInstanceOf(VariantBulkUpdateSuccessResult.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "resource", VariantBulkUpdateSuccessResult.builder()
                .resource(new com.commercetools.api.models.variant.VariantBulkUpdateResourceImpl()) } };
    }

    @Test
    public void resource() {
        VariantBulkUpdateSuccessResult value = VariantBulkUpdateSuccessResult.of();
        value.setResource(new com.commercetools.api.models.variant.VariantBulkUpdateResourceImpl());
        Assertions.assertThat(value.getResource())
                .isEqualTo(new com.commercetools.api.models.variant.VariantBulkUpdateResourceImpl());
    }
}
