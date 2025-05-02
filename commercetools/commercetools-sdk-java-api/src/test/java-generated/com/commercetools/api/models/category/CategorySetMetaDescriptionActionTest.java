
package com.commercetools.api.models.category;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CategorySetMetaDescriptionActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CategorySetMetaDescriptionActionBuilder builder) {
        CategorySetMetaDescriptionAction categorySetMetaDescriptionAction = builder.buildUnchecked();
        Assertions.assertThat(categorySetMetaDescriptionAction).isInstanceOf(CategorySetMetaDescriptionAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "metaDescription", CategorySetMetaDescriptionAction.builder()
                .metaDescription(new com.commercetools.api.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void metaDescription() {
        CategorySetMetaDescriptionAction value = CategorySetMetaDescriptionAction.of();
        value.setMetaDescription(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getMetaDescription())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }
}
