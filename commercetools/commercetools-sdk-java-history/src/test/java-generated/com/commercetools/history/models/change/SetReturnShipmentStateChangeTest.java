
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetReturnShipmentStateChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetReturnShipmentStateChangeBuilder builder) {
        SetReturnShipmentStateChange setReturnShipmentStateChange = builder.buildUnchecked();
        Assertions.assertThat(setReturnShipmentStateChange).isInstanceOf(SetReturnShipmentStateChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetReturnShipmentStateChange.builder().change("change") },
                new Object[] { "previousValue",
                        SetReturnShipmentStateChange.builder()
                                .previousValue(
                                    com.commercetools.history.models.common.ReturnShipmentState.findEnum("Advised")) },
                new Object[] { "nextValue", SetReturnShipmentStateChange.builder()
                        .nextValue(com.commercetools.history.models.common.ReturnShipmentState.findEnum("Advised")) } };
    }

    @Test
    public void change() {
        SetReturnShipmentStateChange value = SetReturnShipmentStateChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetReturnShipmentStateChange value = SetReturnShipmentStateChange.of();
        value.setPreviousValue(com.commercetools.history.models.common.ReturnShipmentState.findEnum("Advised"));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(com.commercetools.history.models.common.ReturnShipmentState.findEnum("Advised"));
    }

    @Test
    public void nextValue() {
        SetReturnShipmentStateChange value = SetReturnShipmentStateChange.of();
        value.setNextValue(com.commercetools.history.models.common.ReturnShipmentState.findEnum("Advised"));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(com.commercetools.history.models.common.ReturnShipmentState.findEnum("Advised"));
    }
}
