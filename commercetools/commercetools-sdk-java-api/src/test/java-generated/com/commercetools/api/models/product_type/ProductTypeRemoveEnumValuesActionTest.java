
package com.commercetools.api.models.product_type;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductTypeRemoveEnumValuesActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductTypeRemoveEnumValuesActionBuilder builder) {
        ProductTypeRemoveEnumValuesAction productTypeRemoveEnumValuesAction = builder.buildUnchecked();
        Assertions.assertThat(productTypeRemoveEnumValuesAction).isInstanceOf(ProductTypeRemoveEnumValuesAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "attributeName",
                        ProductTypeRemoveEnumValuesAction.builder().attributeName("attributeName") },
                new Object[] { "keys",
                        ProductTypeRemoveEnumValuesAction.builder().keys(Collections.singletonList("keys")) } };
    }

    @Test
    public void attributeName() {
        ProductTypeRemoveEnumValuesAction value = ProductTypeRemoveEnumValuesAction.of();
        value.setAttributeName("attributeName");
        Assertions.assertThat(value.getAttributeName()).isEqualTo("attributeName");
    }

    @Test
    public void keys() {
        ProductTypeRemoveEnumValuesAction value = ProductTypeRemoveEnumValuesAction.of();
        value.setKeys(Collections.singletonList("keys"));
        Assertions.assertThat(value.getKeys()).isEqualTo(Collections.singletonList("keys"));
    }
}
