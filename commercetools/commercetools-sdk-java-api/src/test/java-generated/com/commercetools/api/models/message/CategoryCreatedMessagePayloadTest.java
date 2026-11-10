
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CategoryCreatedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CategoryCreatedMessagePayloadBuilder builder) {
        CategoryCreatedMessagePayload categoryCreatedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(categoryCreatedMessagePayload).isInstanceOf(CategoryCreatedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "category", CategoryCreatedMessagePayload.builder()
                .category(new com.commercetools.api.models.category.CategoryImpl()) } };
    }

    @Test
    public void category() {
        CategoryCreatedMessagePayload value = CategoryCreatedMessagePayload.of();
        value.setCategory(new com.commercetools.api.models.category.CategoryImpl());
        Assertions.assertThat(value.getCategory()).isEqualTo(new com.commercetools.api.models.category.CategoryImpl());
    }
}
