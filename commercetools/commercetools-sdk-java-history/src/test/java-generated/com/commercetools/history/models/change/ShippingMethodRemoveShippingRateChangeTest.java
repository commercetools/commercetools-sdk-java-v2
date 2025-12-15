
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ShippingMethodRemoveShippingRateChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ShippingMethodRemoveShippingRateChangeBuilder builder) {
        ShippingMethodRemoveShippingRateChange shippingMethodRemoveShippingRateChange = builder.buildUnchecked();
        Assertions.assertThat(shippingMethodRemoveShippingRateChange)
                .isInstanceOf(ShippingMethodRemoveShippingRateChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "change", ShippingMethodRemoveShippingRateChange.builder().change("change") },
                new Object[] { "zone",
                        ShippingMethodRemoveShippingRateChange.builder()
                                .zone(new com.commercetools.history.models.common.ZoneResourceIdentifierImpl()) },
                new Object[] { "previousValue", ShippingMethodRemoveShippingRateChange.builder()
                        .previousValue(new com.commercetools.history.models.common.ShippingRateImpl()) } };
    }

    @Test
    public void change() {
        ShippingMethodRemoveShippingRateChange value = ShippingMethodRemoveShippingRateChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void zone() {
        ShippingMethodRemoveShippingRateChange value = ShippingMethodRemoveShippingRateChange.of();
        value.setZone(new com.commercetools.history.models.common.ZoneResourceIdentifierImpl());
        Assertions.assertThat(value.getZone())
                .isEqualTo(new com.commercetools.history.models.common.ZoneResourceIdentifierImpl());
    }

    @Test
    public void previousValue() {
        ShippingMethodRemoveShippingRateChange value = ShippingMethodRemoveShippingRateChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.ShippingRateImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.ShippingRateImpl());
    }
}
