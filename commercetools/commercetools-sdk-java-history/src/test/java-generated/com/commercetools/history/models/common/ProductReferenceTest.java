
package com.commercetools.history.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductReferenceTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductReferenceBuilder builder) {
        ProductReference productReference = builder.buildUnchecked();
        Assertions.assertThat(productReference).isInstanceOf(ProductReference.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", ProductReference.builder().id("id") } };
    }

    @Test
    public void id() {
        ProductReference value = ProductReference.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }
}
