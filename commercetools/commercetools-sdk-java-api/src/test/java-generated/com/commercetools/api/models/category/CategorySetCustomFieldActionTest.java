
package com.commercetools.api.models.category;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CategorySetCustomFieldActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CategorySetCustomFieldActionBuilder builder) {
        CategorySetCustomFieldAction categorySetCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(categorySetCustomFieldAction).isInstanceOf(CategorySetCustomFieldAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", CategorySetCustomFieldAction.builder().name("name") },
                new Object[] { "value", CategorySetCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void name() {
        CategorySetCustomFieldAction value = CategorySetCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        CategorySetCustomFieldAction value = CategorySetCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
