
package com.commercetools.api.models.product;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductSetMetaTitleActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductSetMetaTitleActionBuilder builder) {
        ProductSetMetaTitleAction productSetMetaTitleAction = builder.buildUnchecked();
        Assertions.assertThat(productSetMetaTitleAction).isInstanceOf(ProductSetMetaTitleAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "metaTitle",
                        ProductSetMetaTitleAction.builder()
                                .metaTitle(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "staged", ProductSetMetaTitleAction.builder().staged(true) } };
    }

    @Test
    public void metaTitle() {
        ProductSetMetaTitleAction value = ProductSetMetaTitleAction.of();
        value.setMetaTitle(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getMetaTitle())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void staged() {
        ProductSetMetaTitleAction value = ProductSetMetaTitleAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
