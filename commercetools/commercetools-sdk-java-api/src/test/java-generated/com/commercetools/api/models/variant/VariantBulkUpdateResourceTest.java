
package com.commercetools.api.models.variant;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class VariantBulkUpdateResourceTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, VariantBulkUpdateResourceBuilder builder) {
        VariantBulkUpdateResource variantBulkUpdateResource = builder.buildUnchecked();
        Assertions.assertThat(variantBulkUpdateResource).isInstanceOf(VariantBulkUpdateResource.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", VariantBulkUpdateResource.builder().id("id") },
                new Object[] { "version", VariantBulkUpdateResource.builder().version(2L) } };
    }

    @Test
    public void id() {
        VariantBulkUpdateResource value = VariantBulkUpdateResource.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void version() {
        VariantBulkUpdateResource value = VariantBulkUpdateResource.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }
}
