
package com.commercetools.api.models.discount_group;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DiscountGroupSetDescriptionActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DiscountGroupSetDescriptionActionBuilder builder) {
        DiscountGroupSetDescriptionAction discountGroupSetDescriptionAction = builder.buildUnchecked();
        Assertions.assertThat(discountGroupSetDescriptionAction).isInstanceOf(DiscountGroupSetDescriptionAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "description", DiscountGroupSetDescriptionAction.builder()
                .description(new com.commercetools.api.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void description() {
        DiscountGroupSetDescriptionAction value = DiscountGroupSetDescriptionAction.of();
        value.setDescription(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getDescription())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }
}
