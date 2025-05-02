
package com.commercetools.api.models.category;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CategorySetMetaTitleActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CategorySetMetaTitleActionBuilder builder) {
        CategorySetMetaTitleAction categorySetMetaTitleAction = builder.buildUnchecked();
        Assertions.assertThat(categorySetMetaTitleAction).isInstanceOf(CategorySetMetaTitleAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "metaTitle", CategorySetMetaTitleAction.builder()
                .metaTitle(new com.commercetools.api.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void metaTitle() {
        CategorySetMetaTitleAction value = CategorySetMetaTitleAction.of();
        value.setMetaTitle(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getMetaTitle())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }
}
