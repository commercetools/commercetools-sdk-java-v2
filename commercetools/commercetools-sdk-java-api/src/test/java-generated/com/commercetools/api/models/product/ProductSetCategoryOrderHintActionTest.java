
package com.commercetools.api.models.product;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductSetCategoryOrderHintActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductSetCategoryOrderHintActionBuilder builder) {
        ProductSetCategoryOrderHintAction productSetCategoryOrderHintAction = builder.buildUnchecked();
        Assertions.assertThat(productSetCategoryOrderHintAction).isInstanceOf(ProductSetCategoryOrderHintAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "categoryId", ProductSetCategoryOrderHintAction.builder().categoryId("categoryId") },
                new Object[] { "orderHint", ProductSetCategoryOrderHintAction.builder().orderHint("orderHint") },
                new Object[] { "staged", ProductSetCategoryOrderHintAction.builder().staged(true) } };
    }

    @Test
    public void categoryId() {
        ProductSetCategoryOrderHintAction value = ProductSetCategoryOrderHintAction.of();
        value.setCategoryId("categoryId");
        Assertions.assertThat(value.getCategoryId()).isEqualTo("categoryId");
    }

    @Test
    public void orderHint() {
        ProductSetCategoryOrderHintAction value = ProductSetCategoryOrderHintAction.of();
        value.setOrderHint("orderHint");
        Assertions.assertThat(value.getOrderHint()).isEqualTo("orderHint");
    }

    @Test
    public void staged() {
        ProductSetCategoryOrderHintAction value = ProductSetCategoryOrderHintAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
