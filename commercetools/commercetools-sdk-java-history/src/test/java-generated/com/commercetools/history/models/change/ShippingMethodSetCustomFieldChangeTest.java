
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ShippingMethodSetCustomFieldChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ShippingMethodSetCustomFieldChangeBuilder builder) {
        ShippingMethodSetCustomFieldChange shippingMethodSetCustomFieldChange = builder.buildUnchecked();
        Assertions.assertThat(shippingMethodSetCustomFieldChange)
                .isInstanceOf(ShippingMethodSetCustomFieldChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "change", ShippingMethodSetCustomFieldChange.builder().change("change") },
                new Object[] { "name", ShippingMethodSetCustomFieldChange.builder().name("name") },
                new Object[] { "customTypeId",
                        ShippingMethodSetCustomFieldChange.builder().customTypeId("customTypeId") },
                new Object[] { "previousValue",
                        ShippingMethodSetCustomFieldChange.builder().previousValue("previousValue") },
                new Object[] { "nextValue", ShippingMethodSetCustomFieldChange.builder().nextValue("nextValue") } };
    }

    @Test
    public void change() {
        ShippingMethodSetCustomFieldChange value = ShippingMethodSetCustomFieldChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void name() {
        ShippingMethodSetCustomFieldChange value = ShippingMethodSetCustomFieldChange.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void customTypeId() {
        ShippingMethodSetCustomFieldChange value = ShippingMethodSetCustomFieldChange.of();
        value.setCustomTypeId("customTypeId");
        Assertions.assertThat(value.getCustomTypeId()).isEqualTo("customTypeId");
    }

    @Test
    public void previousValue() {
        ShippingMethodSetCustomFieldChange value = ShippingMethodSetCustomFieldChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        ShippingMethodSetCustomFieldChange value = ShippingMethodSetCustomFieldChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }
}
