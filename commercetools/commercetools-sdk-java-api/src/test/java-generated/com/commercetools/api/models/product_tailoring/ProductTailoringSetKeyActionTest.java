
package com.commercetools.api.models.product_tailoring;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductTailoringSetKeyActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductTailoringSetKeyActionBuilder builder) {
        ProductTailoringSetKeyAction productTailoringSetKeyAction = builder.buildUnchecked();
        Assertions.assertThat(productTailoringSetKeyAction).isInstanceOf(ProductTailoringSetKeyAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", ProductTailoringSetKeyAction.builder().key("key") } };
    }

    @Test
    public void key() {
        ProductTailoringSetKeyAction value = ProductTailoringSetKeyAction.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
