
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetSellerCommentChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetSellerCommentChangeBuilder builder) {
        SetSellerCommentChange setSellerCommentChange = builder.buildUnchecked();
        Assertions.assertThat(setSellerCommentChange).isInstanceOf(SetSellerCommentChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetSellerCommentChange.builder().change("change") },
                new Object[] { "previousValue", SetSellerCommentChange.builder().previousValue("previousValue") },
                new Object[] { "nextValue", SetSellerCommentChange.builder().nextValue("nextValue") } };
    }

    @Test
    public void change() {
        SetSellerCommentChange value = SetSellerCommentChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetSellerCommentChange value = SetSellerCommentChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        SetSellerCommentChange value = SetSellerCommentChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }
}
