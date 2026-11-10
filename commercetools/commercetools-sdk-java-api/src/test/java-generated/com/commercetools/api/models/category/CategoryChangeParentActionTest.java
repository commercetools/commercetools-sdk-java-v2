
package com.commercetools.api.models.category;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CategoryChangeParentActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CategoryChangeParentActionBuilder builder) {
        CategoryChangeParentAction categoryChangeParentAction = builder.buildUnchecked();
        Assertions.assertThat(categoryChangeParentAction).isInstanceOf(CategoryChangeParentAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "parent", CategoryChangeParentAction.builder()
                .parent(new com.commercetools.api.models.category.CategoryResourceIdentifierImpl()) } };
    }

    @Test
    public void parent() {
        CategoryChangeParentAction value = CategoryChangeParentAction.of();
        value.setParent(new com.commercetools.api.models.category.CategoryResourceIdentifierImpl());
        Assertions.assertThat(value.getParent())
                .isEqualTo(new com.commercetools.api.models.category.CategoryResourceIdentifierImpl());
    }
}
