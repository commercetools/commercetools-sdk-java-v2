
package com.commercetools.history.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductDiscountReferenceTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductDiscountReferenceBuilder builder) {
        ProductDiscountReference productDiscountReference = builder.buildUnchecked();
        Assertions.assertThat(productDiscountReference).isInstanceOf(ProductDiscountReference.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", ProductDiscountReference.builder().id("id") } };
    }

    @Test
    public void id() {
        ProductDiscountReference value = ProductDiscountReference.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }
}
