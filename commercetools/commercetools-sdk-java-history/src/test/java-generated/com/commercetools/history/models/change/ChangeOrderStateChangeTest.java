
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChangeOrderStateChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChangeOrderStateChangeBuilder builder) {
        ChangeOrderStateChange changeOrderStateChange = builder.buildUnchecked();
        Assertions.assertThat(changeOrderStateChange).isInstanceOf(ChangeOrderStateChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", ChangeOrderStateChange.builder().change("change") },
                new Object[] { "previousValue",
                        ChangeOrderStateChange.builder()
                                .previousValue(com.commercetools.history.models.common.OrderState.findEnum("Open")) },
                new Object[] { "nextValue", ChangeOrderStateChange.builder()
                        .nextValue(com.commercetools.history.models.common.OrderState.findEnum("Open")) } };
    }

    @Test
    public void change() {
        ChangeOrderStateChange value = ChangeOrderStateChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeOrderStateChange value = ChangeOrderStateChange.of();
        value.setPreviousValue(com.commercetools.history.models.common.OrderState.findEnum("Open"));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(com.commercetools.history.models.common.OrderState.findEnum("Open"));
    }

    @Test
    public void nextValue() {
        ChangeOrderStateChange value = ChangeOrderStateChange.of();
        value.setNextValue(com.commercetools.history.models.common.OrderState.findEnum("Open"));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(com.commercetools.history.models.common.OrderState.findEnum("Open"));
    }
}
