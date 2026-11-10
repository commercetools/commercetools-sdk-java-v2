
package com.commercetools.api.models.product;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductRemoveFromCategoryActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductRemoveFromCategoryActionBuilder builder) {
        ProductRemoveFromCategoryAction productRemoveFromCategoryAction = builder.buildUnchecked();
        Assertions.assertThat(productRemoveFromCategoryAction).isInstanceOf(ProductRemoveFromCategoryAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "category",
                        ProductRemoveFromCategoryAction.builder()
                                .category(new com.commercetools.api.models.category.CategoryResourceIdentifierImpl()) },
                new Object[] { "staged", ProductRemoveFromCategoryAction.builder().staged(true) } };
    }

    @Test
    public void category() {
        ProductRemoveFromCategoryAction value = ProductRemoveFromCategoryAction.of();
        value.setCategory(new com.commercetools.api.models.category.CategoryResourceIdentifierImpl());
        Assertions.assertThat(value.getCategory())
                .isEqualTo(new com.commercetools.api.models.category.CategoryResourceIdentifierImpl());
    }

    @Test
    public void staged() {
        ProductRemoveFromCategoryAction value = ProductRemoveFromCategoryAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
