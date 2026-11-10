
package com.commercetools.api.models.product;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductSetMetaDescriptionActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductSetMetaDescriptionActionBuilder builder) {
        ProductSetMetaDescriptionAction productSetMetaDescriptionAction = builder.buildUnchecked();
        Assertions.assertThat(productSetMetaDescriptionAction).isInstanceOf(ProductSetMetaDescriptionAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "metaDescription",
                        ProductSetMetaDescriptionAction.builder()
                                .metaDescription(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "staged", ProductSetMetaDescriptionAction.builder().staged(true) } };
    }

    @Test
    public void metaDescription() {
        ProductSetMetaDescriptionAction value = ProductSetMetaDescriptionAction.of();
        value.setMetaDescription(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getMetaDescription())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void staged() {
        ProductSetMetaDescriptionAction value = ProductSetMetaDescriptionAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
