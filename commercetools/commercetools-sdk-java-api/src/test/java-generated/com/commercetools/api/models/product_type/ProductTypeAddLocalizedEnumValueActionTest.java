
package com.commercetools.api.models.product_type;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductTypeAddLocalizedEnumValueActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductTypeAddLocalizedEnumValueActionBuilder builder) {
        ProductTypeAddLocalizedEnumValueAction productTypeAddLocalizedEnumValueAction = builder.buildUnchecked();
        Assertions.assertThat(productTypeAddLocalizedEnumValueAction)
                .isInstanceOf(ProductTypeAddLocalizedEnumValueAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "attributeName",
                        ProductTypeAddLocalizedEnumValueAction.builder().attributeName("attributeName") },
                new Object[] { "value", ProductTypeAddLocalizedEnumValueAction.builder()
                        .value(new com.commercetools.api.models.product_type.AttributeLocalizedEnumValueImpl()) } };
    }

    @Test
    public void attributeName() {
        ProductTypeAddLocalizedEnumValueAction value = ProductTypeAddLocalizedEnumValueAction.of();
        value.setAttributeName("attributeName");
        Assertions.assertThat(value.getAttributeName()).isEqualTo("attributeName");
    }

    @Test
    public void value() {
        ProductTypeAddLocalizedEnumValueAction value = ProductTypeAddLocalizedEnumValueAction.of();
        value.setValue(new com.commercetools.api.models.product_type.AttributeLocalizedEnumValueImpl());
        Assertions.assertThat(value.getValue())
                .isEqualTo(new com.commercetools.api.models.product_type.AttributeLocalizedEnumValueImpl());
    }
}
