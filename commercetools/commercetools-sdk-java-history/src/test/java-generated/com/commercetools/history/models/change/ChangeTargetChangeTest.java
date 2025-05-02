
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChangeTargetChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChangeTargetChangeBuilder builder) {
        ChangeTargetChange changeTargetChange = builder.buildUnchecked();
        Assertions.assertThat(changeTargetChange).isInstanceOf(ChangeTargetChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", ChangeTargetChange.builder().change("change") },
                new Object[] { "previousValue",
                        ChangeTargetChange.builder()
                                .previousValue(
                                    new com.commercetools.history.models.change_value.ChangeTargetChangeValueImpl()) },
                new Object[] { "nextValue", ChangeTargetChange.builder()
                        .nextValue(new com.commercetools.history.models.change_value.ChangeTargetChangeValueImpl()) } };
    }

    @Test
    public void change() {
        ChangeTargetChange value = ChangeTargetChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeTargetChange value = ChangeTargetChange.of();
        value.setPreviousValue(new com.commercetools.history.models.change_value.ChangeTargetChangeValueImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.change_value.ChangeTargetChangeValueImpl());
    }

    @Test
    public void nextValue() {
        ChangeTargetChange value = ChangeTargetChange.of();
        value.setNextValue(new com.commercetools.history.models.change_value.ChangeTargetChangeValueImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.change_value.ChangeTargetChangeValueImpl());
    }
}
