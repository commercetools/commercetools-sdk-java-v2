
package com.commercetools.api.models.product_discount;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductDiscountSetKeyActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductDiscountSetKeyActionBuilder builder) {
        ProductDiscountSetKeyAction productDiscountSetKeyAction = builder.buildUnchecked();
        Assertions.assertThat(productDiscountSetKeyAction).isInstanceOf(ProductDiscountSetKeyAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", ProductDiscountSetKeyAction.builder().key("key") } };
    }

    @Test
    public void key() {
        ProductDiscountSetKeyAction value = ProductDiscountSetKeyAction.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
