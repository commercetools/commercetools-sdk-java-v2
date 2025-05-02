
package com.commercetools.api.models.product_tailoring;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductTailoringSetMetaTitleActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductTailoringSetMetaTitleActionBuilder builder) {
        ProductTailoringSetMetaTitleAction productTailoringSetMetaTitleAction = builder.buildUnchecked();
        Assertions.assertThat(productTailoringSetMetaTitleAction)
                .isInstanceOf(ProductTailoringSetMetaTitleAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "metaTitle",
                        ProductTailoringSetMetaTitleAction.builder()
                                .metaTitle(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "staged", ProductTailoringSetMetaTitleAction.builder().staged(true) } };
    }

    @Test
    public void metaTitle() {
        ProductTailoringSetMetaTitleAction value = ProductTailoringSetMetaTitleAction.of();
        value.setMetaTitle(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getMetaTitle())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void staged() {
        ProductTailoringSetMetaTitleAction value = ProductTailoringSetMetaTitleAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
