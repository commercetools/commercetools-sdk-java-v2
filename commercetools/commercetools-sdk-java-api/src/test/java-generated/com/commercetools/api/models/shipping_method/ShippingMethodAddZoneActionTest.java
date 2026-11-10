
package com.commercetools.api.models.shipping_method;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ShippingMethodAddZoneActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ShippingMethodAddZoneActionBuilder builder) {
        ShippingMethodAddZoneAction shippingMethodAddZoneAction = builder.buildUnchecked();
        Assertions.assertThat(shippingMethodAddZoneAction).isInstanceOf(ShippingMethodAddZoneAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "zone", ShippingMethodAddZoneAction.builder()
                .zone(new com.commercetools.api.models.zone.ZoneResourceIdentifierImpl()) } };
    }

    @Test
    public void zone() {
        ShippingMethodAddZoneAction value = ShippingMethodAddZoneAction.of();
        value.setZone(new com.commercetools.api.models.zone.ZoneResourceIdentifierImpl());
        Assertions.assertThat(value.getZone())
                .isEqualTo(new com.commercetools.api.models.zone.ZoneResourceIdentifierImpl());
    }
}
