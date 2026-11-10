
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetBusinessUnitChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetBusinessUnitChangeBuilder builder) {
        SetBusinessUnitChange setBusinessUnitChange = builder.buildUnchecked();
        Assertions.assertThat(setBusinessUnitChange).isInstanceOf(SetBusinessUnitChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetBusinessUnitChange.builder().change("change") },
                new Object[] { "previousValue",
                        SetBusinessUnitChange.builder()
                                .previousValue(new com.commercetools.history.models.common.KeyReferenceImpl()) },
                new Object[] { "nextValue", SetBusinessUnitChange.builder()
                        .nextValue(new com.commercetools.history.models.common.KeyReferenceImpl()) } };
    }

    @Test
    public void change() {
        SetBusinessUnitChange value = SetBusinessUnitChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetBusinessUnitChange value = SetBusinessUnitChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.KeyReferenceImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.KeyReferenceImpl());
    }

    @Test
    public void nextValue() {
        SetBusinessUnitChange value = SetBusinessUnitChange.of();
        value.setNextValue(new com.commercetools.history.models.common.KeyReferenceImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.KeyReferenceImpl());
    }
}
