
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChangeValueChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChangeValueChangeBuilder builder) {
        ChangeValueChange changeValueChange = builder.buildUnchecked();
        Assertions.assertThat(changeValueChange).isInstanceOf(ChangeValueChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", ChangeValueChange.builder().change("change") },
                new Object[] { "previousValue",
                        ChangeValueChange.builder()
                                .previousValue(
                                    new com.commercetools.history.models.change_value.ChangeValueChangeValueImpl()) },
                new Object[] { "nextValue", ChangeValueChange.builder()
                        .nextValue(new com.commercetools.history.models.change_value.ChangeValueChangeValueImpl()) } };
    }

    @Test
    public void change() {
        ChangeValueChange value = ChangeValueChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeValueChange value = ChangeValueChange.of();
        value.setPreviousValue(new com.commercetools.history.models.change_value.ChangeValueChangeValueImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.change_value.ChangeValueChangeValueImpl());
    }

    @Test
    public void nextValue() {
        ChangeValueChange value = ChangeValueChange.of();
        value.setNextValue(new com.commercetools.history.models.change_value.ChangeValueChangeValueImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.change_value.ChangeValueChangeValueImpl());
    }
}
