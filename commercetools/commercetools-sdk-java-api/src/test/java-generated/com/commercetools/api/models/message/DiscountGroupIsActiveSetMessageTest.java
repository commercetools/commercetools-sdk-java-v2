
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DiscountGroupIsActiveSetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DiscountGroupIsActiveSetMessageBuilder builder) {
        DiscountGroupIsActiveSetMessage discountGroupIsActiveSetMessage = builder.buildUnchecked();
        Assertions.assertThat(discountGroupIsActiveSetMessage).isInstanceOf(DiscountGroupIsActiveSetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "isActive", DiscountGroupIsActiveSetMessage.builder().isActive(true) },
                new Object[] { "oldIsActive", DiscountGroupIsActiveSetMessage.builder().oldIsActive(true) } };
    }

    @Test
    public void isActive() {
        DiscountGroupIsActiveSetMessage value = DiscountGroupIsActiveSetMessage.of();
        value.setIsActive(true);
        Assertions.assertThat(value.getIsActive()).isEqualTo(true);
    }

    @Test
    public void oldIsActive() {
        DiscountGroupIsActiveSetMessage value = DiscountGroupIsActiveSetMessage.of();
        value.setOldIsActive(true);
        Assertions.assertThat(value.getOldIsActive()).isEqualTo(true);
    }
}
