
package com.commercetools.api.models.discount_group;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DiscountGroupSetNameActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DiscountGroupSetNameActionBuilder builder) {
        DiscountGroupSetNameAction discountGroupSetNameAction = builder.buildUnchecked();
        Assertions.assertThat(discountGroupSetNameAction).isInstanceOf(DiscountGroupSetNameAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", DiscountGroupSetNameAction.builder()
                .name(new com.commercetools.api.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void name() {
        DiscountGroupSetNameAction value = DiscountGroupSetNameAction.of();
        value.setName(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }
}
