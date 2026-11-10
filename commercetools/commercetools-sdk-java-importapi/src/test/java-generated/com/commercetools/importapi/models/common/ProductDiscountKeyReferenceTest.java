
package com.commercetools.importapi.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductDiscountKeyReferenceTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductDiscountKeyReferenceBuilder builder) {
        ProductDiscountKeyReference productDiscountKeyReference = builder.buildUnchecked();
        Assertions.assertThat(productDiscountKeyReference).isInstanceOf(ProductDiscountKeyReference.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", ProductDiscountKeyReference.builder().key("key") } };
    }

    @Test
    public void key() {
        ProductDiscountKeyReference value = ProductDiscountKeyReference.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
