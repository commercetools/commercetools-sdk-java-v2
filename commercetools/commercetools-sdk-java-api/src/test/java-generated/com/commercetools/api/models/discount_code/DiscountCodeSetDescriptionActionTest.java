
package com.commercetools.api.models.discount_code;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DiscountCodeSetDescriptionActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DiscountCodeSetDescriptionActionBuilder builder) {
        DiscountCodeSetDescriptionAction discountCodeSetDescriptionAction = builder.buildUnchecked();
        Assertions.assertThat(discountCodeSetDescriptionAction).isInstanceOf(DiscountCodeSetDescriptionAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "description", DiscountCodeSetDescriptionAction.builder()
                .description(new com.commercetools.api.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void description() {
        DiscountCodeSetDescriptionAction value = DiscountCodeSetDescriptionAction.of();
        value.setDescription(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getDescription())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }
}
