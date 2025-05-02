
package com.commercetools.api.models.product_type;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductTypeChangePlainEnumValueOrderActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductTypeChangePlainEnumValueOrderActionBuilder builder) {
        ProductTypeChangePlainEnumValueOrderAction productTypeChangePlainEnumValueOrderAction = builder
                .buildUnchecked();
        Assertions.assertThat(productTypeChangePlainEnumValueOrderAction)
                .isInstanceOf(ProductTypeChangePlainEnumValueOrderAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "attributeName",
                        ProductTypeChangePlainEnumValueOrderAction.builder().attributeName("attributeName") },
                new Object[] { "values",
                        ProductTypeChangePlainEnumValueOrderAction.builder()
                                .values(Collections.singletonList(
                                    new com.commercetools.api.models.product_type.AttributePlainEnumValueImpl())) } };
    }

    @Test
    public void attributeName() {
        ProductTypeChangePlainEnumValueOrderAction value = ProductTypeChangePlainEnumValueOrderAction.of();
        value.setAttributeName("attributeName");
        Assertions.assertThat(value.getAttributeName()).isEqualTo("attributeName");
    }

    @Test
    public void values() {
        ProductTypeChangePlainEnumValueOrderAction value = ProductTypeChangePlainEnumValueOrderAction.of();
        value.setValues(
            Collections.singletonList(new com.commercetools.api.models.product_type.AttributePlainEnumValueImpl()));
        Assertions.assertThat(value.getValues())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.api.models.product_type.AttributePlainEnumValueImpl()));
    }
}
