
package com.commercetools.api.models.product_tailoring;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductTailoringSetMetaKeywordsActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductTailoringSetMetaKeywordsActionBuilder builder) {
        ProductTailoringSetMetaKeywordsAction productTailoringSetMetaKeywordsAction = builder.buildUnchecked();
        Assertions.assertThat(productTailoringSetMetaKeywordsAction)
                .isInstanceOf(ProductTailoringSetMetaKeywordsAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "metaKeywords",
                        ProductTailoringSetMetaKeywordsAction.builder()
                                .metaKeywords(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "staged", ProductTailoringSetMetaKeywordsAction.builder().staged(true) } };
    }

    @Test
    public void metaKeywords() {
        ProductTailoringSetMetaKeywordsAction value = ProductTailoringSetMetaKeywordsAction.of();
        value.setMetaKeywords(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getMetaKeywords())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void staged() {
        ProductTailoringSetMetaKeywordsAction value = ProductTailoringSetMetaKeywordsAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
