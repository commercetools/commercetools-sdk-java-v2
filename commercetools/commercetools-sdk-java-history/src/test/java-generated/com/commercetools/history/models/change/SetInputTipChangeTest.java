
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetInputTipChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetInputTipChangeBuilder builder) {
        SetInputTipChange setInputTipChange = builder.buildUnchecked();
        Assertions.assertThat(setInputTipChange).isInstanceOf(SetInputTipChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetInputTipChange.builder().change("change") },
                new Object[] { "previousValue",
                        SetInputTipChange.builder()
                                .previousValue(new com.commercetools.history.models.common.LocalizedStringImpl()) },
                new Object[] { "nextValue",
                        SetInputTipChange.builder()
                                .nextValue(new com.commercetools.history.models.common.LocalizedStringImpl()) },
                new Object[] { "attributeName", SetInputTipChange.builder().attributeName("attributeName") } };
    }

    @Test
    public void change() {
        SetInputTipChange value = SetInputTipChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetInputTipChange value = SetInputTipChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }

    @Test
    public void nextValue() {
        SetInputTipChange value = SetInputTipChange.of();
        value.setNextValue(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }

    @Test
    public void attributeName() {
        SetInputTipChange value = SetInputTipChange.of();
        value.setAttributeName("attributeName");
        Assertions.assertThat(value.getAttributeName()).isEqualTo("attributeName");
    }
}
