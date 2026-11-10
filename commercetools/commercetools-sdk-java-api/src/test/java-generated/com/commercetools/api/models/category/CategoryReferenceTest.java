
package com.commercetools.api.models.category;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CategoryReferenceTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CategoryReferenceBuilder builder) {
        CategoryReference categoryReference = builder.buildUnchecked();
        Assertions.assertThat(categoryReference).isInstanceOf(CategoryReference.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "obj",
                        CategoryReference.builder().obj(new com.commercetools.api.models.category.CategoryImpl()) },
                new Object[] { "id", CategoryReference.builder().id("id") } };
    }

    @Test
    public void obj() {
        CategoryReference value = CategoryReference.of();
        value.setObj(new com.commercetools.api.models.category.CategoryImpl());
        Assertions.assertThat(value.getObj()).isEqualTo(new com.commercetools.api.models.category.CategoryImpl());
    }

    @Test
    public void id() {
        CategoryReference value = CategoryReference.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }
}
