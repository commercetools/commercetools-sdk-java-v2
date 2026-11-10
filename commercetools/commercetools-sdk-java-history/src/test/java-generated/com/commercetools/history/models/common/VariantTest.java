
package com.commercetools.history.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class VariantTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, VariantBuilder builder) {
        Variant variant = builder.buildUnchecked();
        Assertions.assertThat(variant).isInstanceOf(Variant.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", Variant.builder().id(2) },
                new Object[] { "sku", Variant.builder().sku("sku") },
                new Object[] { "key", Variant.builder().key("key") } };
    }

    @Test
    public void id() {
        Variant value = Variant.of();
        value.setId(2);
        Assertions.assertThat(value.getId()).isEqualTo(2);
    }

    @Test
    public void sku() {
        Variant value = Variant.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void key() {
        Variant value = Variant.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
