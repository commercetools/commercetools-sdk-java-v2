
package com.commercetools.api.models.category;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CategoryResourceIdentifierTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CategoryResourceIdentifierBuilder builder) {
        CategoryResourceIdentifier categoryResourceIdentifier = builder.buildUnchecked();
        Assertions.assertThat(categoryResourceIdentifier).isInstanceOf(CategoryResourceIdentifier.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", CategoryResourceIdentifier.builder().id("id") },
                new Object[] { "key", CategoryResourceIdentifier.builder().key("key") } };
    }

    @Test
    public void id() {
        CategoryResourceIdentifier value = CategoryResourceIdentifier.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void key() {
        CategoryResourceIdentifier value = CategoryResourceIdentifier.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
