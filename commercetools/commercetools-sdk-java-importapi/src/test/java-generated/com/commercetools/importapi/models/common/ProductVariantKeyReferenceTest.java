
package com.commercetools.importapi.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductVariantKeyReferenceTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductVariantKeyReferenceBuilder builder) {
        ProductVariantKeyReference productVariantKeyReference = builder.buildUnchecked();
        Assertions.assertThat(productVariantKeyReference).isInstanceOf(ProductVariantKeyReference.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", ProductVariantKeyReference.builder().key("key") } };
    }

    @Test
    public void key() {
        ProductVariantKeyReference value = ProductVariantKeyReference.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
