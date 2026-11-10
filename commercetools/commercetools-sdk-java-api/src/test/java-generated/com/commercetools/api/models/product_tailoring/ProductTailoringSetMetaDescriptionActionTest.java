
package com.commercetools.api.models.product_tailoring;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductTailoringSetMetaDescriptionActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductTailoringSetMetaDescriptionActionBuilder builder) {
        ProductTailoringSetMetaDescriptionAction productTailoringSetMetaDescriptionAction = builder.buildUnchecked();
        Assertions.assertThat(productTailoringSetMetaDescriptionAction)
                .isInstanceOf(ProductTailoringSetMetaDescriptionAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "metaDescription",
                        ProductTailoringSetMetaDescriptionAction.builder()
                                .metaDescription(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "staged", ProductTailoringSetMetaDescriptionAction.builder().staged(true) } };
    }

    @Test
    public void metaDescription() {
        ProductTailoringSetMetaDescriptionAction value = ProductTailoringSetMetaDescriptionAction.of();
        value.setMetaDescription(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getMetaDescription())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void staged() {
        ProductTailoringSetMetaDescriptionAction value = ProductTailoringSetMetaDescriptionAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
