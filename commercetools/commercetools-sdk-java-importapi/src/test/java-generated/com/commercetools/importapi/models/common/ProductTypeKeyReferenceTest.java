
package com.commercetools.importapi.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductTypeKeyReferenceTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductTypeKeyReferenceBuilder builder) {
        ProductTypeKeyReference productTypeKeyReference = builder.buildUnchecked();
        Assertions.assertThat(productTypeKeyReference).isInstanceOf(ProductTypeKeyReference.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", ProductTypeKeyReference.builder().key("key") } };
    }

    @Test
    public void key() {
        ProductTypeKeyReference value = ProductTypeKeyReference.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
