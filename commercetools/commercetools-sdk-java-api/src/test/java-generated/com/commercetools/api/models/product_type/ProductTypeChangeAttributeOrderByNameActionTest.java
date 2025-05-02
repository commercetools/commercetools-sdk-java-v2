
package com.commercetools.api.models.product_type;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductTypeChangeAttributeOrderByNameActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductTypeChangeAttributeOrderByNameActionBuilder builder) {
        ProductTypeChangeAttributeOrderByNameAction productTypeChangeAttributeOrderByNameAction = builder
                .buildUnchecked();
        Assertions.assertThat(productTypeChangeAttributeOrderByNameAction)
                .isInstanceOf(ProductTypeChangeAttributeOrderByNameAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "attributeNames", ProductTypeChangeAttributeOrderByNameAction.builder()
                .attributeNames(Collections.singletonList("attributeNames")) } };
    }

    @Test
    public void attributeNames() {
        ProductTypeChangeAttributeOrderByNameAction value = ProductTypeChangeAttributeOrderByNameAction.of();
        value.setAttributeNames(Collections.singletonList("attributeNames"));
        Assertions.assertThat(value.getAttributeNames()).isEqualTo(Collections.singletonList("attributeNames"));
    }
}
