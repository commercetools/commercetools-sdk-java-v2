
package com.commercetools.api.models.product_type;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductTypeChangeLocalizedEnumValueOrderActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductTypeChangeLocalizedEnumValueOrderActionBuilder builder) {
        ProductTypeChangeLocalizedEnumValueOrderAction productTypeChangeLocalizedEnumValueOrderAction = builder
                .buildUnchecked();
        Assertions.assertThat(productTypeChangeLocalizedEnumValueOrderAction)
                .isInstanceOf(ProductTypeChangeLocalizedEnumValueOrderAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "attributeName",
                        ProductTypeChangeLocalizedEnumValueOrderAction.builder().attributeName("attributeName") },
                new Object[] { "values", ProductTypeChangeLocalizedEnumValueOrderAction.builder()
                        .values(Collections.singletonList(
                            new com.commercetools.api.models.product_type.AttributeLocalizedEnumValueImpl())) } };
    }

    @Test
    public void attributeName() {
        ProductTypeChangeLocalizedEnumValueOrderAction value = ProductTypeChangeLocalizedEnumValueOrderAction.of();
        value.setAttributeName("attributeName");
        Assertions.assertThat(value.getAttributeName()).isEqualTo("attributeName");
    }

    @Test
    public void values() {
        ProductTypeChangeLocalizedEnumValueOrderAction value = ProductTypeChangeLocalizedEnumValueOrderAction.of();
        value.setValues(
            Collections.singletonList(new com.commercetools.api.models.product_type.AttributeLocalizedEnumValueImpl()));
        Assertions.assertThat(value.getValues())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.api.models.product_type.AttributeLocalizedEnumValueImpl()));
    }
}
