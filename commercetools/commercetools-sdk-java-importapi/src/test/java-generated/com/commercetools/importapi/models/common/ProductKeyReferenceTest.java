
package com.commercetools.importapi.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductKeyReferenceTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductKeyReferenceBuilder builder) {
        ProductKeyReference productKeyReference = builder.buildUnchecked();
        Assertions.assertThat(productKeyReference).isInstanceOf(ProductKeyReference.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", ProductKeyReference.builder().key("key") } };
    }

    @Test
    public void key() {
        ProductKeyReference value = ProductKeyReference.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
