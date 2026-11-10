
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChangeStateTypeChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChangeStateTypeChangeBuilder builder) {
        ChangeStateTypeChange changeStateTypeChange = builder.buildUnchecked();
        Assertions.assertThat(changeStateTypeChange).isInstanceOf(ChangeStateTypeChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", ChangeStateTypeChange.builder().change("change") },
                new Object[] { "previousValue", ChangeStateTypeChange.builder()
                        .previousValue(com.commercetools.history.models.common.StateTypeEnum.findEnum("OrderState")) },
                new Object[] { "nextValue", ChangeStateTypeChange.builder()
                        .nextValue(com.commercetools.history.models.common.StateTypeEnum.findEnum("OrderState")) } };
    }

    @Test
    public void change() {
        ChangeStateTypeChange value = ChangeStateTypeChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeStateTypeChange value = ChangeStateTypeChange.of();
        value.setPreviousValue(com.commercetools.history.models.common.StateTypeEnum.findEnum("OrderState"));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(com.commercetools.history.models.common.StateTypeEnum.findEnum("OrderState"));
    }

    @Test
    public void nextValue() {
        ChangeStateTypeChange value = ChangeStateTypeChange.of();
        value.setNextValue(com.commercetools.history.models.common.StateTypeEnum.findEnum("OrderState"));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(com.commercetools.history.models.common.StateTypeEnum.findEnum("OrderState"));
    }
}
