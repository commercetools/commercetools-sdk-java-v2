
package com.commercetools.api.models.category;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CategoryChangeOrderHintActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CategoryChangeOrderHintActionBuilder builder) {
        CategoryChangeOrderHintAction categoryChangeOrderHintAction = builder.buildUnchecked();
        Assertions.assertThat(categoryChangeOrderHintAction).isInstanceOf(CategoryChangeOrderHintAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "orderHint", CategoryChangeOrderHintAction.builder().orderHint("orderHint") } };
    }

    @Test
    public void orderHint() {
        CategoryChangeOrderHintAction value = CategoryChangeOrderHintAction.of();
        value.setOrderHint("orderHint");
        Assertions.assertThat(value.getOrderHint()).isEqualTo("orderHint");
    }
}
