
package com.commercetools.api.models.cart_discount;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartDiscountSetCustomFieldActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartDiscountSetCustomFieldActionBuilder builder) {
        CartDiscountSetCustomFieldAction cartDiscountSetCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(cartDiscountSetCustomFieldAction).isInstanceOf(CartDiscountSetCustomFieldAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", CartDiscountSetCustomFieldAction.builder().name("name") },
                new Object[] { "value", CartDiscountSetCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void name() {
        CartDiscountSetCustomFieldAction value = CartDiscountSetCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        CartDiscountSetCustomFieldAction value = CartDiscountSetCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
