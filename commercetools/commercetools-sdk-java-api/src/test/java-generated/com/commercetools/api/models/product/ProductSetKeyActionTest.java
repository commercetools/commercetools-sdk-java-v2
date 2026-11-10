
package com.commercetools.api.models.product;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductSetKeyActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductSetKeyActionBuilder builder) {
        ProductSetKeyAction productSetKeyAction = builder.buildUnchecked();
        Assertions.assertThat(productSetKeyAction).isInstanceOf(ProductSetKeyAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", ProductSetKeyAction.builder().key("key") } };
    }

    @Test
    public void key() {
        ProductSetKeyAction value = ProductSetKeyAction.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
