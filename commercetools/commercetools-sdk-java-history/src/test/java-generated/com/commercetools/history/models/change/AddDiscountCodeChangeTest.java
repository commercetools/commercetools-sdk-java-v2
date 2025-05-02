
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AddDiscountCodeChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AddDiscountCodeChangeBuilder builder) {
        AddDiscountCodeChange addDiscountCodeChange = builder.buildUnchecked();
        Assertions.assertThat(addDiscountCodeChange).isInstanceOf(AddDiscountCodeChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", AddDiscountCodeChange.builder().change("change") },
                new Object[] { "nextValue", AddDiscountCodeChange.builder()
                        .nextValue(new com.commercetools.history.models.common.DiscountCodeInfoImpl()) } };
    }

    @Test
    public void change() {
        AddDiscountCodeChange value = AddDiscountCodeChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void nextValue() {
        AddDiscountCodeChange value = AddDiscountCodeChange.of();
        value.setNextValue(new com.commercetools.history.models.common.DiscountCodeInfoImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.DiscountCodeInfoImpl());
    }
}
