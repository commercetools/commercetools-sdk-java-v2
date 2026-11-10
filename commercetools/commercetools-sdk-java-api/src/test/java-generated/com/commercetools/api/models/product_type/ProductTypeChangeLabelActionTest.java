
package com.commercetools.api.models.product_type;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductTypeChangeLabelActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductTypeChangeLabelActionBuilder builder) {
        ProductTypeChangeLabelAction productTypeChangeLabelAction = builder.buildUnchecked();
        Assertions.assertThat(productTypeChangeLabelAction).isInstanceOf(ProductTypeChangeLabelAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "attributeName", ProductTypeChangeLabelAction.builder().attributeName("attributeName") },
                new Object[] { "label", ProductTypeChangeLabelAction.builder()
                        .label(new com.commercetools.api.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void attributeName() {
        ProductTypeChangeLabelAction value = ProductTypeChangeLabelAction.of();
        value.setAttributeName("attributeName");
        Assertions.assertThat(value.getAttributeName()).isEqualTo("attributeName");
    }

    @Test
    public void label() {
        ProductTypeChangeLabelAction value = ProductTypeChangeLabelAction.of();
        value.setLabel(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getLabel())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }
}
