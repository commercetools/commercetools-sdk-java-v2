
package com.commercetools.api.models.product_type;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductTypeChangePlainEnumValueLabelActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductTypeChangePlainEnumValueLabelActionBuilder builder) {
        ProductTypeChangePlainEnumValueLabelAction productTypeChangePlainEnumValueLabelAction = builder
                .buildUnchecked();
        Assertions.assertThat(productTypeChangePlainEnumValueLabelAction)
                .isInstanceOf(ProductTypeChangePlainEnumValueLabelAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "attributeName",
                        ProductTypeChangePlainEnumValueLabelAction.builder().attributeName("attributeName") },
                new Object[] { "newValue", ProductTypeChangePlainEnumValueLabelAction.builder()
                        .newValue(new com.commercetools.api.models.product_type.AttributePlainEnumValueImpl()) } };
    }

    @Test
    public void attributeName() {
        ProductTypeChangePlainEnumValueLabelAction value = ProductTypeChangePlainEnumValueLabelAction.of();
        value.setAttributeName("attributeName");
        Assertions.assertThat(value.getAttributeName()).isEqualTo("attributeName");
    }

    @Test
    public void newValue() {
        ProductTypeChangePlainEnumValueLabelAction value = ProductTypeChangePlainEnumValueLabelAction.of();
        value.setNewValue(new com.commercetools.api.models.product_type.AttributePlainEnumValueImpl());
        Assertions.assertThat(value.getNewValue())
                .isEqualTo(new com.commercetools.api.models.product_type.AttributePlainEnumValueImpl());
    }
}
