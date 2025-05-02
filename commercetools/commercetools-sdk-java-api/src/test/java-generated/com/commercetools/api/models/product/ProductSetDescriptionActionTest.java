
package com.commercetools.api.models.product;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductSetDescriptionActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductSetDescriptionActionBuilder builder) {
        ProductSetDescriptionAction productSetDescriptionAction = builder.buildUnchecked();
        Assertions.assertThat(productSetDescriptionAction).isInstanceOf(ProductSetDescriptionAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "description",
                        ProductSetDescriptionAction.builder()
                                .description(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "staged", ProductSetDescriptionAction.builder().staged(true) } };
    }

    @Test
    public void description() {
        ProductSetDescriptionAction value = ProductSetDescriptionAction.of();
        value.setDescription(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getDescription())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void staged() {
        ProductSetDescriptionAction value = ProductSetDescriptionAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
