
package com.commercetools.api.models.discount_code;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DiscountCodeSetKeyActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DiscountCodeSetKeyActionBuilder builder) {
        DiscountCodeSetKeyAction discountCodeSetKeyAction = builder.buildUnchecked();
        Assertions.assertThat(discountCodeSetKeyAction).isInstanceOf(DiscountCodeSetKeyAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", DiscountCodeSetKeyAction.builder().key("key") } };
    }

    @Test
    public void key() {
        DiscountCodeSetKeyAction value = DiscountCodeSetKeyAction.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
