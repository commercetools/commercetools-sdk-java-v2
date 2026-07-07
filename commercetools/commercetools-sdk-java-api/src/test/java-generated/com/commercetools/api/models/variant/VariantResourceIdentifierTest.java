
package com.commercetools.api.models.variant;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class VariantResourceIdentifierTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, VariantResourceIdentifierBuilder builder) {
        VariantResourceIdentifier variantResourceIdentifier = builder.buildUnchecked();
        Assertions.assertThat(variantResourceIdentifier).isInstanceOf(VariantResourceIdentifier.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", VariantResourceIdentifier.builder().id("id") },
                new Object[] { "key", VariantResourceIdentifier.builder().key("key") } };
    }

    @Test
    public void id() {
        VariantResourceIdentifier value = VariantResourceIdentifier.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void key() {
        VariantResourceIdentifier value = VariantResourceIdentifier.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
