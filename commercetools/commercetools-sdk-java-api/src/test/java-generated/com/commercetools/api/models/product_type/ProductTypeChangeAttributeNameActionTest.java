
package com.commercetools.api.models.product_type;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductTypeChangeAttributeNameActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductTypeChangeAttributeNameActionBuilder builder) {
        ProductTypeChangeAttributeNameAction productTypeChangeAttributeNameAction = builder.buildUnchecked();
        Assertions.assertThat(productTypeChangeAttributeNameAction)
                .isInstanceOf(ProductTypeChangeAttributeNameAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "attributeName",
                        ProductTypeChangeAttributeNameAction.builder().attributeName("attributeName") },
                new Object[] { "newAttributeName",
                        ProductTypeChangeAttributeNameAction.builder().newAttributeName("newAttributeName") } };
    }

    @Test
    public void attributeName() {
        ProductTypeChangeAttributeNameAction value = ProductTypeChangeAttributeNameAction.of();
        value.setAttributeName("attributeName");
        Assertions.assertThat(value.getAttributeName()).isEqualTo("attributeName");
    }

    @Test
    public void newAttributeName() {
        ProductTypeChangeAttributeNameAction value = ProductTypeChangeAttributeNameAction.of();
        value.setNewAttributeName("newAttributeName");
        Assertions.assertThat(value.getNewAttributeName()).isEqualTo("newAttributeName");
    }
}
