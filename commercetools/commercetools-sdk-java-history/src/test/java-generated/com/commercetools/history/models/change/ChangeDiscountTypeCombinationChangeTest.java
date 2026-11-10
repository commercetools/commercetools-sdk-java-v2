
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChangeDiscountTypeCombinationChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChangeDiscountTypeCombinationChangeBuilder builder) {
        ChangeDiscountTypeCombinationChange changeDiscountTypeCombinationChange = builder.buildUnchecked();
        Assertions.assertThat(changeDiscountTypeCombinationChange)
                .isInstanceOf(ChangeDiscountTypeCombinationChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "change", ChangeDiscountTypeCombinationChange.builder().change("change") },
                new Object[] { "previousValue", ChangeDiscountTypeCombinationChange.builder()
                        .previousValue(new com.commercetools.history.models.common.DiscountTypeCombinationImpl()) },
                new Object[] { "nextValue", ChangeDiscountTypeCombinationChange.builder()
                        .nextValue(new com.commercetools.history.models.common.DiscountTypeCombinationImpl()) } };
    }

    @Test
    public void change() {
        ChangeDiscountTypeCombinationChange value = ChangeDiscountTypeCombinationChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeDiscountTypeCombinationChange value = ChangeDiscountTypeCombinationChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.DiscountTypeCombinationImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.DiscountTypeCombinationImpl());
    }

    @Test
    public void nextValue() {
        ChangeDiscountTypeCombinationChange value = ChangeDiscountTypeCombinationChange.of();
        value.setNextValue(new com.commercetools.history.models.common.DiscountTypeCombinationImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.DiscountTypeCombinationImpl());
    }
}
