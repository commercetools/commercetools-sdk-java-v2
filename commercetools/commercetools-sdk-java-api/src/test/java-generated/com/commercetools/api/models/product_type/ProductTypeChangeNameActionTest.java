
package com.commercetools.api.models.product_type;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductTypeChangeNameActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductTypeChangeNameActionBuilder builder) {
        ProductTypeChangeNameAction productTypeChangeNameAction = builder.buildUnchecked();
        Assertions.assertThat(productTypeChangeNameAction).isInstanceOf(ProductTypeChangeNameAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", ProductTypeChangeNameAction.builder().name("name") } };
    }

    @Test
    public void name() {
        ProductTypeChangeNameAction value = ProductTypeChangeNameAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }
}
