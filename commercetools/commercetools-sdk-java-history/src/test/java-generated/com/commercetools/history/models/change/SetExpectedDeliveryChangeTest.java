
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetExpectedDeliveryChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetExpectedDeliveryChangeBuilder builder) {
        SetExpectedDeliveryChange setExpectedDeliveryChange = builder.buildUnchecked();
        Assertions.assertThat(setExpectedDeliveryChange).isInstanceOf(SetExpectedDeliveryChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetExpectedDeliveryChange.builder().change("change") },
                new Object[] { "previousValue", SetExpectedDeliveryChange.builder().previousValue("previousValue") },
                new Object[] { "nextValue", SetExpectedDeliveryChange.builder().nextValue("nextValue") } };
    }

    @Test
    public void change() {
        SetExpectedDeliveryChange value = SetExpectedDeliveryChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetExpectedDeliveryChange value = SetExpectedDeliveryChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        SetExpectedDeliveryChange value = SetExpectedDeliveryChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }
}
