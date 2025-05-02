
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetLocalizedDescriptionChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetLocalizedDescriptionChangeBuilder builder) {
        SetLocalizedDescriptionChange setLocalizedDescriptionChange = builder.buildUnchecked();
        Assertions.assertThat(setLocalizedDescriptionChange).isInstanceOf(SetLocalizedDescriptionChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetLocalizedDescriptionChange.builder().change("change") },
                new Object[] { "previousValue",
                        SetLocalizedDescriptionChange.builder()
                                .previousValue(new com.commercetools.history.models.common.LocalizedStringImpl()) },
                new Object[] { "nextValue", SetLocalizedDescriptionChange.builder()
                        .nextValue(new com.commercetools.history.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void change() {
        SetLocalizedDescriptionChange value = SetLocalizedDescriptionChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetLocalizedDescriptionChange value = SetLocalizedDescriptionChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }

    @Test
    public void nextValue() {
        SetLocalizedDescriptionChange value = SetLocalizedDescriptionChange.of();
        value.setNextValue(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }
}
