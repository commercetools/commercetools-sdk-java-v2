
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductRemovedFromCategoryMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductRemovedFromCategoryMessageBuilder builder) {
        ProductRemovedFromCategoryMessage productRemovedFromCategoryMessage = builder.buildUnchecked();
        Assertions.assertThat(productRemovedFromCategoryMessage).isInstanceOf(ProductRemovedFromCategoryMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "category",
                        ProductRemovedFromCategoryMessage.builder()
                                .category(new com.commercetools.api.models.category.CategoryReferenceImpl()) },
                new Object[] { "staged", ProductRemovedFromCategoryMessage.builder().staged(true) } };
    }

    @Test
    public void category() {
        ProductRemovedFromCategoryMessage value = ProductRemovedFromCategoryMessage.of();
        value.setCategory(new com.commercetools.api.models.category.CategoryReferenceImpl());
        Assertions.assertThat(value.getCategory())
                .isEqualTo(new com.commercetools.api.models.category.CategoryReferenceImpl());
    }

    @Test
    public void staged() {
        ProductRemovedFromCategoryMessage value = ProductRemovedFromCategoryMessage.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
