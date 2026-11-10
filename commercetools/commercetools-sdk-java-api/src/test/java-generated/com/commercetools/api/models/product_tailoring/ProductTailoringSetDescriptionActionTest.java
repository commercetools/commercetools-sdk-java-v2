
package com.commercetools.api.models.product_tailoring;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductTailoringSetDescriptionActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductTailoringSetDescriptionActionBuilder builder) {
        ProductTailoringSetDescriptionAction productTailoringSetDescriptionAction = builder.buildUnchecked();
        Assertions.assertThat(productTailoringSetDescriptionAction)
                .isInstanceOf(ProductTailoringSetDescriptionAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "description",
                        ProductTailoringSetDescriptionAction.builder()
                                .description(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "staged", ProductTailoringSetDescriptionAction.builder().staged(true) } };
    }

    @Test
    public void description() {
        ProductTailoringSetDescriptionAction value = ProductTailoringSetDescriptionAction.of();
        value.setDescription(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getDescription())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void staged() {
        ProductTailoringSetDescriptionAction value = ProductTailoringSetDescriptionAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
