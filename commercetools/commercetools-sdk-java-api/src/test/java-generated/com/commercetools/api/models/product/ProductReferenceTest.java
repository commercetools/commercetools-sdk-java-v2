
package com.commercetools.api.models.product;

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
        return new Object[][] {
                new Object[] { "obj",
                        ProductReference.builder().obj(new com.commercetools.api.models.product.ProductImpl()) },
                new Object[] { "id", ProductReference.builder().id("id") } };
    }

    @Test
    public void obj() {
        ProductReference value = ProductReference.of();
        value.setObj(new com.commercetools.api.models.product.ProductImpl());
        Assertions.assertThat(value.getObj()).isEqualTo(new com.commercetools.api.models.product.ProductImpl());
    }

    @Test
    public void id() {
        ProductReference value = ProductReference.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }
}
