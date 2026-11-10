
package com.commercetools.api.models.category;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CategorySetMetaKeywordsActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CategorySetMetaKeywordsActionBuilder builder) {
        CategorySetMetaKeywordsAction categorySetMetaKeywordsAction = builder.buildUnchecked();
        Assertions.assertThat(categorySetMetaKeywordsAction).isInstanceOf(CategorySetMetaKeywordsAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "metaKeywords", CategorySetMetaKeywordsAction.builder()
                .metaKeywords(new com.commercetools.api.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void metaKeywords() {
        CategorySetMetaKeywordsAction value = CategorySetMetaKeywordsAction.of();
        value.setMetaKeywords(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getMetaKeywords())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }
}
