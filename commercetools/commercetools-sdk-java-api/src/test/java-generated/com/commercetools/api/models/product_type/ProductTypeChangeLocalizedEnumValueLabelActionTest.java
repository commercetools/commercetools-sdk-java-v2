
package com.commercetools.api.models.product_type;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductTypeChangeLocalizedEnumValueLabelActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductTypeChangeLocalizedEnumValueLabelActionBuilder builder) {
        ProductTypeChangeLocalizedEnumValueLabelAction productTypeChangeLocalizedEnumValueLabelAction = builder
                .buildUnchecked();
        Assertions.assertThat(productTypeChangeLocalizedEnumValueLabelAction)
                .isInstanceOf(ProductTypeChangeLocalizedEnumValueLabelAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "attributeName",
                        ProductTypeChangeLocalizedEnumValueLabelAction.builder().attributeName("attributeName") },
                new Object[] { "newValue", ProductTypeChangeLocalizedEnumValueLabelAction.builder()
                        .newValue(new com.commercetools.api.models.product_type.AttributeLocalizedEnumValueImpl()) } };
    }

    @Test
    public void attributeName() {
        ProductTypeChangeLocalizedEnumValueLabelAction value = ProductTypeChangeLocalizedEnumValueLabelAction.of();
        value.setAttributeName("attributeName");
        Assertions.assertThat(value.getAttributeName()).isEqualTo("attributeName");
    }

    @Test
    public void newValue() {
        ProductTypeChangeLocalizedEnumValueLabelAction value = ProductTypeChangeLocalizedEnumValueLabelAction.of();
        value.setNewValue(new com.commercetools.api.models.product_type.AttributeLocalizedEnumValueImpl());
        Assertions.assertThat(value.getNewValue())
                .isEqualTo(new com.commercetools.api.models.product_type.AttributeLocalizedEnumValueImpl());
    }
}
