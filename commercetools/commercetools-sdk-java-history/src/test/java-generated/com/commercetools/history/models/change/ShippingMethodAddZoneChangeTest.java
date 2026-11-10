
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ShippingMethodAddZoneChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ShippingMethodAddZoneChangeBuilder builder) {
        ShippingMethodAddZoneChange shippingMethodAddZoneChange = builder.buildUnchecked();
        Assertions.assertThat(shippingMethodAddZoneChange).isInstanceOf(ShippingMethodAddZoneChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", ShippingMethodAddZoneChange.builder().change("change") },
                new Object[] { "nextValue", ShippingMethodAddZoneChange.builder()
                        .nextValue(new com.commercetools.history.models.common.ReferenceImpl()) } };
    }

    @Test
    public void change() {
        ShippingMethodAddZoneChange value = ShippingMethodAddZoneChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void nextValue() {
        ShippingMethodAddZoneChange value = ShippingMethodAddZoneChange.of();
        value.setNextValue(new com.commercetools.history.models.common.ReferenceImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.ReferenceImpl());
    }
}
