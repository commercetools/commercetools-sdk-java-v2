
package com.commercetools.api.models.category;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CategorySetDescriptionActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CategorySetDescriptionActionBuilder builder) {
        CategorySetDescriptionAction categorySetDescriptionAction = builder.buildUnchecked();
        Assertions.assertThat(categorySetDescriptionAction).isInstanceOf(CategorySetDescriptionAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "description", CategorySetDescriptionAction.builder()
                .description(new com.commercetools.api.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void description() {
        CategorySetDescriptionAction value = CategorySetDescriptionAction.of();
        value.setDescription(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getDescription())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }
}
