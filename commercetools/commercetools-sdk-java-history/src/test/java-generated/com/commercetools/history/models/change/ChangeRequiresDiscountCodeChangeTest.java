
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChangeRequiresDiscountCodeChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChangeRequiresDiscountCodeChangeBuilder builder) {
        ChangeRequiresDiscountCodeChange changeRequiresDiscountCodeChange = builder.buildUnchecked();
        Assertions.assertThat(changeRequiresDiscountCodeChange).isInstanceOf(ChangeRequiresDiscountCodeChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", ChangeRequiresDiscountCodeChange.builder().change("change") },
                new Object[] { "previousValue", ChangeRequiresDiscountCodeChange.builder().previousValue(true) },
                new Object[] { "nextValue", ChangeRequiresDiscountCodeChange.builder().nextValue(true) } };
    }

    @Test
    public void change() {
        ChangeRequiresDiscountCodeChange value = ChangeRequiresDiscountCodeChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeRequiresDiscountCodeChange value = ChangeRequiresDiscountCodeChange.of();
        value.setPreviousValue(true);
        Assertions.assertThat(value.getPreviousValue()).isEqualTo(true);
    }

    @Test
    public void nextValue() {
        ChangeRequiresDiscountCodeChange value = ChangeRequiresDiscountCodeChange.of();
        value.setNextValue(true);
        Assertions.assertThat(value.getNextValue()).isEqualTo(true);
    }
}
