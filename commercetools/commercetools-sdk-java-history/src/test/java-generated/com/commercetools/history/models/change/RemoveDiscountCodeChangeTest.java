
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RemoveDiscountCodeChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RemoveDiscountCodeChangeBuilder builder) {
        RemoveDiscountCodeChange removeDiscountCodeChange = builder.buildUnchecked();
        Assertions.assertThat(removeDiscountCodeChange).isInstanceOf(RemoveDiscountCodeChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", RemoveDiscountCodeChange.builder().change("change") },
                new Object[] { "previousValue", RemoveDiscountCodeChange.builder()
                        .previousValue(new com.commercetools.history.models.common.DiscountCodeInfoImpl()) } };
    }

    @Test
    public void change() {
        RemoveDiscountCodeChange value = RemoveDiscountCodeChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        RemoveDiscountCodeChange value = RemoveDiscountCodeChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.DiscountCodeInfoImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.DiscountCodeInfoImpl());
    }
}
