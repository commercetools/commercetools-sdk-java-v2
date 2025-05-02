
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChangeShipmentStateChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChangeShipmentStateChangeBuilder builder) {
        ChangeShipmentStateChange changeShipmentStateChange = builder.buildUnchecked();
        Assertions.assertThat(changeShipmentStateChange).isInstanceOf(ChangeShipmentStateChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", ChangeShipmentStateChange.builder().change("change") },
                new Object[] { "previousValue", ChangeShipmentStateChange.builder()
                        .previousValue(com.commercetools.history.models.common.ShipmentState.findEnum("Shipped")) },
                new Object[] { "nextValue", ChangeShipmentStateChange.builder()
                        .nextValue(com.commercetools.history.models.common.ShipmentState.findEnum("Shipped")) } };
    }

    @Test
    public void change() {
        ChangeShipmentStateChange value = ChangeShipmentStateChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeShipmentStateChange value = ChangeShipmentStateChange.of();
        value.setPreviousValue(com.commercetools.history.models.common.ShipmentState.findEnum("Shipped"));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(com.commercetools.history.models.common.ShipmentState.findEnum("Shipped"));
    }

    @Test
    public void nextValue() {
        ChangeShipmentStateChange value = ChangeShipmentStateChange.of();
        value.setNextValue(com.commercetools.history.models.common.ShipmentState.findEnum("Shipped"));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(com.commercetools.history.models.common.ShipmentState.findEnum("Shipped"));
    }
}
