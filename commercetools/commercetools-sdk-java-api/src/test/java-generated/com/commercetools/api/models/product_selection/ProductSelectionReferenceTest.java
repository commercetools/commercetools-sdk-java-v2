
package com.commercetools.api.models.product_selection;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductSelectionReferenceTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductSelectionReferenceBuilder builder) {
        ProductSelectionReference productSelectionReference = builder.buildUnchecked();
        Assertions.assertThat(productSelectionReference).isInstanceOf(ProductSelectionReference.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", ProductSelectionReference.builder().id("id") },
                new Object[] { "obj", ProductSelectionReference.builder()
                        .obj(new com.commercetools.api.models.product_selection.ProductSelectionImpl()) } };
    }

    @Test
    public void id() {
        ProductSelectionReference value = ProductSelectionReference.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void obj() {
        ProductSelectionReference value = ProductSelectionReference.of();
        value.setObj(new com.commercetools.api.models.product_selection.ProductSelectionImpl());
        Assertions.assertThat(value.getObj())
                .isEqualTo(new com.commercetools.api.models.product_selection.ProductSelectionImpl());
    }
}
