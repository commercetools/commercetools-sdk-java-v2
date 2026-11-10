
package com.commercetools.api.models.category;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CategorySetKeyActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CategorySetKeyActionBuilder builder) {
        CategorySetKeyAction categorySetKeyAction = builder.buildUnchecked();
        Assertions.assertThat(categorySetKeyAction).isInstanceOf(CategorySetKeyAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", CategorySetKeyAction.builder().key("key") } };
    }

    @Test
    public void key() {
        CategorySetKeyAction value = CategorySetKeyAction.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
