
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductAddedToCategoryMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductAddedToCategoryMessageBuilder builder) {
        ProductAddedToCategoryMessage productAddedToCategoryMessage = builder.buildUnchecked();
        Assertions.assertThat(productAddedToCategoryMessage).isInstanceOf(ProductAddedToCategoryMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "category",
                        ProductAddedToCategoryMessage.builder()
                                .category(new com.commercetools.api.models.category.CategoryReferenceImpl()) },
                new Object[] { "staged", ProductAddedToCategoryMessage.builder().staged(true) } };
    }

    @Test
    public void category() {
        ProductAddedToCategoryMessage value = ProductAddedToCategoryMessage.of();
        value.setCategory(new com.commercetools.api.models.category.CategoryReferenceImpl());
        Assertions.assertThat(value.getCategory())
                .isEqualTo(new com.commercetools.api.models.category.CategoryReferenceImpl());
    }

    @Test
    public void staged() {
        ProductAddedToCategoryMessage value = ProductAddedToCategoryMessage.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
