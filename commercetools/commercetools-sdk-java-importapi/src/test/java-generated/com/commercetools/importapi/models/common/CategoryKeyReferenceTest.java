
package com.commercetools.importapi.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CategoryKeyReferenceTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CategoryKeyReferenceBuilder builder) {
        CategoryKeyReference categoryKeyReference = builder.buildUnchecked();
        Assertions.assertThat(categoryKeyReference).isInstanceOf(CategoryKeyReference.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", CategoryKeyReference.builder().key("key") } };
    }

    @Test
    public void key() {
        CategoryKeyReference value = CategoryKeyReference.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
