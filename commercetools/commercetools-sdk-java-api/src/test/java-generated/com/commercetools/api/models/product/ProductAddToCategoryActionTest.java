
package com.commercetools.api.models.product;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductAddToCategoryActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductAddToCategoryActionBuilder builder) {
        ProductAddToCategoryAction productAddToCategoryAction = builder.buildUnchecked();
        Assertions.assertThat(productAddToCategoryAction).isInstanceOf(ProductAddToCategoryAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "category",
                        ProductAddToCategoryAction.builder()
                                .category(new com.commercetools.api.models.category.CategoryResourceIdentifierImpl()) },
                new Object[] { "orderHint", ProductAddToCategoryAction.builder().orderHint("orderHint") },
                new Object[] { "staged", ProductAddToCategoryAction.builder().staged(true) } };
    }

    @Test
    public void category() {
        ProductAddToCategoryAction value = ProductAddToCategoryAction.of();
        value.setCategory(new com.commercetools.api.models.category.CategoryResourceIdentifierImpl());
        Assertions.assertThat(value.getCategory())
                .isEqualTo(new com.commercetools.api.models.category.CategoryResourceIdentifierImpl());
    }

    @Test
    public void orderHint() {
        ProductAddToCategoryAction value = ProductAddToCategoryAction.of();
        value.setOrderHint("orderHint");
        Assertions.assertThat(value.getOrderHint()).isEqualTo("orderHint");
    }

    @Test
    public void staged() {
        ProductAddToCategoryAction value = ProductAddToCategoryAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
