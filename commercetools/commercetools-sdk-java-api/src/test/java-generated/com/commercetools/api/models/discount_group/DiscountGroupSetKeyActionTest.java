
package com.commercetools.api.models.discount_group;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DiscountGroupSetKeyActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DiscountGroupSetKeyActionBuilder builder) {
        DiscountGroupSetKeyAction discountGroupSetKeyAction = builder.buildUnchecked();
        Assertions.assertThat(discountGroupSetKeyAction).isInstanceOf(DiscountGroupSetKeyAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", DiscountGroupSetKeyAction.builder().key("key") } };
    }

    @Test
    public void key() {
        DiscountGroupSetKeyAction value = DiscountGroupSetKeyAction.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
