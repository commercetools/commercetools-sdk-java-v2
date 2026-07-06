
package com.commercetools.api.models.variant;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class VariantBulkUpdateItemTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, VariantBulkUpdateItemBuilder builder) {
        VariantBulkUpdateItem variantBulkUpdateItem = builder.buildUnchecked();
        Assertions.assertThat(variantBulkUpdateItem).isInstanceOf(VariantBulkUpdateItem.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", VariantBulkUpdateItem.builder().id("id") },
                new Object[] { "key", VariantBulkUpdateItem.builder().key("key") },
                new Object[] { "version", VariantBulkUpdateItem.builder().version(2L) } };
    }

    @Test
    public void id() {
        VariantBulkUpdateItem value = VariantBulkUpdateItem.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void key() {
        VariantBulkUpdateItem value = VariantBulkUpdateItem.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void version() {
        VariantBulkUpdateItem value = VariantBulkUpdateItem.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }
}
