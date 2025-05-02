
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductRemovedFromCategoryMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductRemovedFromCategoryMessagePayloadBuilder builder) {
        ProductRemovedFromCategoryMessagePayload productRemovedFromCategoryMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(productRemovedFromCategoryMessagePayload)
                .isInstanceOf(ProductRemovedFromCategoryMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "category",
                        ProductRemovedFromCategoryMessagePayload.builder()
                                .category(new com.commercetools.api.models.category.CategoryReferenceImpl()) },
                new Object[] { "staged", ProductRemovedFromCategoryMessagePayload.builder().staged(true) } };
    }

    @Test
    public void category() {
        ProductRemovedFromCategoryMessagePayload value = ProductRemovedFromCategoryMessagePayload.of();
        value.setCategory(new com.commercetools.api.models.category.CategoryReferenceImpl());
        Assertions.assertThat(value.getCategory())
                .isEqualTo(new com.commercetools.api.models.category.CategoryReferenceImpl());
    }

    @Test
    public void staged() {
        ProductRemovedFromCategoryMessagePayload value = ProductRemovedFromCategoryMessagePayload.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
