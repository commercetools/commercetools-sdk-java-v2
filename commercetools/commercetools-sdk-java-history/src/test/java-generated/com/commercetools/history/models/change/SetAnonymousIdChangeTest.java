
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetAnonymousIdChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetAnonymousIdChangeBuilder builder) {
        SetAnonymousIdChange setAnonymousIdChange = builder.buildUnchecked();
        Assertions.assertThat(setAnonymousIdChange).isInstanceOf(SetAnonymousIdChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetAnonymousIdChange.builder().change("change") },
                new Object[] { "previousValue", SetAnonymousIdChange.builder().previousValue("previousValue") },
                new Object[] { "nextValue", SetAnonymousIdChange.builder().nextValue("nextValue") } };
    }

    @Test
    public void change() {
        SetAnonymousIdChange value = SetAnonymousIdChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetAnonymousIdChange value = SetAnonymousIdChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        SetAnonymousIdChange value = SetAnonymousIdChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }
}
