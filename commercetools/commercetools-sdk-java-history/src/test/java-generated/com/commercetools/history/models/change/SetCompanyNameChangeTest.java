
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetCompanyNameChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetCompanyNameChangeBuilder builder) {
        SetCompanyNameChange setCompanyNameChange = builder.buildUnchecked();
        Assertions.assertThat(setCompanyNameChange).isInstanceOf(SetCompanyNameChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetCompanyNameChange.builder().change("change") },
                new Object[] { "previousValue", SetCompanyNameChange.builder().previousValue("previousValue") },
                new Object[] { "nextValue", SetCompanyNameChange.builder().nextValue("nextValue") } };
    }

    @Test
    public void change() {
        SetCompanyNameChange value = SetCompanyNameChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetCompanyNameChange value = SetCompanyNameChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        SetCompanyNameChange value = SetCompanyNameChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }
}
