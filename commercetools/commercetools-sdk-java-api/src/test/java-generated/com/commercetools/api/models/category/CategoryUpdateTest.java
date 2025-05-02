
package com.commercetools.api.models.category;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CategoryUpdateTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CategoryUpdateBuilder builder) {
        CategoryUpdate categoryUpdate = builder.buildUnchecked();
        Assertions.assertThat(categoryUpdate).isInstanceOf(CategoryUpdate.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "version", CategoryUpdate.builder().version(2L) },
                new Object[] { "actions",
                        CategoryUpdate.builder()
                                .actions(Collections.singletonList(
                                    new com.commercetools.api.models.category.CategoryUpdateActionImpl())) } };
    }

    @Test
    public void version() {
        CategoryUpdate value = CategoryUpdate.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void actions() {
        CategoryUpdate value = CategoryUpdate.of();
        value.setActions(
            Collections.singletonList(new com.commercetools.api.models.category.CategoryUpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.category.CategoryUpdateActionImpl()));
    }
}
