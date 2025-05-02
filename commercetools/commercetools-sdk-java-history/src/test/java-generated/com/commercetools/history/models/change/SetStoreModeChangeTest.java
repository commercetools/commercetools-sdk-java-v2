
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetStoreModeChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetStoreModeChangeBuilder builder) {
        SetStoreModeChange setStoreModeChange = builder.buildUnchecked();
        Assertions.assertThat(setStoreModeChange).isInstanceOf(SetStoreModeChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetStoreModeChange.builder().change("change") },
                new Object[] { "previousValue",
                        SetStoreModeChange.builder()
                                .previousValue(com.commercetools.history.models.common.BusinessUnitStoreMode
                                        .findEnum("Explicit")) },
                new Object[] { "nextValue", SetStoreModeChange.builder()
                        .nextValue(
                            com.commercetools.history.models.common.BusinessUnitStoreMode.findEnum("Explicit")) } };
    }

    @Test
    public void change() {
        SetStoreModeChange value = SetStoreModeChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetStoreModeChange value = SetStoreModeChange.of();
        value.setPreviousValue(com.commercetools.history.models.common.BusinessUnitStoreMode.findEnum("Explicit"));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(com.commercetools.history.models.common.BusinessUnitStoreMode.findEnum("Explicit"));
    }

    @Test
    public void nextValue() {
        SetStoreModeChange value = SetStoreModeChange.of();
        value.setNextValue(com.commercetools.history.models.common.BusinessUnitStoreMode.findEnum("Explicit"));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(com.commercetools.history.models.common.BusinessUnitStoreMode.findEnum("Explicit"));
    }
}
