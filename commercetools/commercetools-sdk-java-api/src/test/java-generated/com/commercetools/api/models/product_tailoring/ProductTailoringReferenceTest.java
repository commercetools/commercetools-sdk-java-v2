
package com.commercetools.api.models.product_tailoring;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductTailoringReferenceTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductTailoringReferenceBuilder builder) {
        ProductTailoringReference productTailoringReference = builder.buildUnchecked();
        Assertions.assertThat(productTailoringReference).isInstanceOf(ProductTailoringReference.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", ProductTailoringReference.builder().id("id") },
                new Object[] { "obj", ProductTailoringReference.builder()
                        .obj(new com.commercetools.api.models.product_tailoring.ProductTailoringImpl()) } };
    }

    @Test
    public void id() {
        ProductTailoringReference value = ProductTailoringReference.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void obj() {
        ProductTailoringReference value = ProductTailoringReference.of();
        value.setObj(new com.commercetools.api.models.product_tailoring.ProductTailoringImpl());
        Assertions.assertThat(value.getObj())
                .isEqualTo(new com.commercetools.api.models.product_tailoring.ProductTailoringImpl());
    }
}
