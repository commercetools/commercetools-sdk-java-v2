
package com.commercetools.api.models.product_type;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductTypeAddPlainEnumValueActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductTypeAddPlainEnumValueActionBuilder builder) {
        ProductTypeAddPlainEnumValueAction productTypeAddPlainEnumValueAction = builder.buildUnchecked();
        Assertions.assertThat(productTypeAddPlainEnumValueAction)
                .isInstanceOf(ProductTypeAddPlainEnumValueAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "attributeName",
                        ProductTypeAddPlainEnumValueAction.builder().attributeName("attributeName") },
                new Object[] { "value", ProductTypeAddPlainEnumValueAction.builder()
                        .value(new com.commercetools.api.models.product_type.AttributePlainEnumValueImpl()) } };
    }

    @Test
    public void attributeName() {
        ProductTypeAddPlainEnumValueAction value = ProductTypeAddPlainEnumValueAction.of();
        value.setAttributeName("attributeName");
        Assertions.assertThat(value.getAttributeName()).isEqualTo("attributeName");
    }

    @Test
    public void value() {
        ProductTypeAddPlainEnumValueAction value = ProductTypeAddPlainEnumValueAction.of();
        value.setValue(new com.commercetools.api.models.product_type.AttributePlainEnumValueImpl());
        Assertions.assertThat(value.getValue())
                .isEqualTo(new com.commercetools.api.models.product_type.AttributePlainEnumValueImpl());
    }
}
