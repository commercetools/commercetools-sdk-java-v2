
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ShippingMethodRemoveZoneChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ShippingMethodRemoveZoneChangeBuilder builder) {
        ShippingMethodRemoveZoneChange shippingMethodRemoveZoneChange = builder.buildUnchecked();
        Assertions.assertThat(shippingMethodRemoveZoneChange).isInstanceOf(ShippingMethodRemoveZoneChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", ShippingMethodRemoveZoneChange.builder().change("change") },
                new Object[] { "previousValue", ShippingMethodRemoveZoneChange.builder()
                        .previousValue(new com.commercetools.history.models.common.ReferenceImpl()) } };
    }

    @Test
    public void change() {
        ShippingMethodRemoveZoneChange value = ShippingMethodRemoveZoneChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ShippingMethodRemoveZoneChange value = ShippingMethodRemoveZoneChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.ReferenceImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.ReferenceImpl());
    }
}
