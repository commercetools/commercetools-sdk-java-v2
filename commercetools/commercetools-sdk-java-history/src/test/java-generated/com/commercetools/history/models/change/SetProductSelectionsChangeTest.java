
package com.commercetools.history.models.change;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetProductSelectionsChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetProductSelectionsChangeBuilder builder) {
        SetProductSelectionsChange setProductSelectionsChange = builder.buildUnchecked();
        Assertions.assertThat(setProductSelectionsChange).isInstanceOf(SetProductSelectionsChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetProductSelectionsChange.builder().change("change") },
                new Object[] { "previousValue",
                        SetProductSelectionsChange.builder()
                                .previousValue(Collections.singletonList(
                                    new com.commercetools.history.models.common.ProductSelectionSettingImpl())) },
                new Object[] { "nextValue",
                        SetProductSelectionsChange.builder()
                                .nextValue(Collections.singletonList(
                                    new com.commercetools.history.models.common.ProductSelectionSettingImpl())) } };
    }

    @Test
    public void change() {
        SetProductSelectionsChange value = SetProductSelectionsChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetProductSelectionsChange value = SetProductSelectionsChange.of();
        value.setPreviousValue(
            Collections.singletonList(new com.commercetools.history.models.common.ProductSelectionSettingImpl()));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.history.models.common.ProductSelectionSettingImpl()));
    }

    @Test
    public void nextValue() {
        SetProductSelectionsChange value = SetProductSelectionsChange.of();
        value.setNextValue(
            Collections.singletonList(new com.commercetools.history.models.common.ProductSelectionSettingImpl()));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.history.models.common.ProductSelectionSettingImpl()));
    }
}
