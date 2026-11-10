
package com.commercetools.api.models.product_type;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductTypeSetKeyActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductTypeSetKeyActionBuilder builder) {
        ProductTypeSetKeyAction productTypeSetKeyAction = builder.buildUnchecked();
        Assertions.assertThat(productTypeSetKeyAction).isInstanceOf(ProductTypeSetKeyAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", ProductTypeSetKeyAction.builder().key("key") } };
    }

    @Test
    public void key() {
        ProductTypeSetKeyAction value = ProductTypeSetKeyAction.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
