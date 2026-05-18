
package com.commercetools.history.models.common;

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
        return new Object[][] { new Object[] { "id", CategoryReference.builder().id("id") } };
    }

    @Test
    public void id() {
        CategoryReference value = CategoryReference.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }
}
