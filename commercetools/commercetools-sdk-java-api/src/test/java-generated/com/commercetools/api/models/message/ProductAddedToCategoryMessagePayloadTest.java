
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductAddedToCategoryMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductAddedToCategoryMessagePayloadBuilder builder) {
        ProductAddedToCategoryMessagePayload productAddedToCategoryMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(productAddedToCategoryMessagePayload)
                .isInstanceOf(ProductAddedToCategoryMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "category",
                        ProductAddedToCategoryMessagePayload.builder()
                                .category(new com.commercetools.api.models.category.CategoryReferenceImpl()) },
                new Object[] { "staged", ProductAddedToCategoryMessagePayload.builder().staged(true) } };
    }

    @Test
    public void category() {
        ProductAddedToCategoryMessagePayload value = ProductAddedToCategoryMessagePayload.of();
        value.setCategory(new com.commercetools.api.models.category.CategoryReferenceImpl());
        Assertions.assertThat(value.getCategory())
                .isEqualTo(new com.commercetools.api.models.category.CategoryReferenceImpl());
    }

    @Test
    public void staged() {
        ProductAddedToCategoryMessagePayload value = ProductAddedToCategoryMessagePayload.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
