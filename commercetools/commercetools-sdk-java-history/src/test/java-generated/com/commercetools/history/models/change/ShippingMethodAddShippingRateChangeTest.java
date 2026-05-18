
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ShippingMethodAddShippingRateChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ShippingMethodAddShippingRateChangeBuilder builder) {
        ShippingMethodAddShippingRateChange shippingMethodAddShippingRateChange = builder.buildUnchecked();
        Assertions.assertThat(shippingMethodAddShippingRateChange)
                .isInstanceOf(ShippingMethodAddShippingRateChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "change", ShippingMethodAddShippingRateChange.builder().change("change") },
                new Object[] { "zone",
                        ShippingMethodAddShippingRateChange.builder()
                                .zone(new com.commercetools.history.models.common.ZoneResourceIdentifierImpl()) },
                new Object[] { "nextValue", ShippingMethodAddShippingRateChange.builder()
                        .nextValue(new com.commercetools.history.models.common.ShippingRateImpl()) } };
    }

    @Test
    public void change() {
        ShippingMethodAddShippingRateChange value = ShippingMethodAddShippingRateChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void zone() {
        ShippingMethodAddShippingRateChange value = ShippingMethodAddShippingRateChange.of();
        value.setZone(new com.commercetools.history.models.common.ZoneResourceIdentifierImpl());
        Assertions.assertThat(value.getZone())
                .isEqualTo(new com.commercetools.history.models.common.ZoneResourceIdentifierImpl());
    }

    @Test
    public void nextValue() {
        ShippingMethodAddShippingRateChange value = ShippingMethodAddShippingRateChange.of();
        value.setNextValue(new com.commercetools.history.models.common.ShippingRateImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.ShippingRateImpl());
    }
}
