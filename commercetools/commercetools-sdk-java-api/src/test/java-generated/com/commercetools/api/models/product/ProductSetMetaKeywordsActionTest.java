
package com.commercetools.api.models.product;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductSetMetaKeywordsActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductSetMetaKeywordsActionBuilder builder) {
        ProductSetMetaKeywordsAction productSetMetaKeywordsAction = builder.buildUnchecked();
        Assertions.assertThat(productSetMetaKeywordsAction).isInstanceOf(ProductSetMetaKeywordsAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "metaKeywords",
                        ProductSetMetaKeywordsAction.builder()
                                .metaKeywords(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "staged", ProductSetMetaKeywordsAction.builder().staged(true) } };
    }

    @Test
    public void metaKeywords() {
        ProductSetMetaKeywordsAction value = ProductSetMetaKeywordsAction.of();
        value.setMetaKeywords(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getMetaKeywords())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void staged() {
        ProductSetMetaKeywordsAction value = ProductSetMetaKeywordsAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
