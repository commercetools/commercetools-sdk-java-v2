
package com.commercetools.history.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductTypeReferenceTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductTypeReferenceBuilder builder) {
        ProductTypeReference productTypeReference = builder.buildUnchecked();
        Assertions.assertThat(productTypeReference).isInstanceOf(ProductTypeReference.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", ProductTypeReference.builder().id("id") } };
    }

    @Test
    public void id() {
        ProductTypeReference value = ProductTypeReference.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }
}
