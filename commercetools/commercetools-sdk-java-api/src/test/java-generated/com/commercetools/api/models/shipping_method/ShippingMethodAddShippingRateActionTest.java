
package com.commercetools.api.models.shipping_method;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ShippingMethodAddShippingRateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ShippingMethodAddShippingRateActionBuilder builder) {
        ShippingMethodAddShippingRateAction shippingMethodAddShippingRateAction = builder.buildUnchecked();
        Assertions.assertThat(shippingMethodAddShippingRateAction)
                .isInstanceOf(ShippingMethodAddShippingRateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "zone",
                        ShippingMethodAddShippingRateAction.builder()
                                .zone(new com.commercetools.api.models.zone.ZoneResourceIdentifierImpl()) },
                new Object[] { "shippingRate", ShippingMethodAddShippingRateAction.builder()
                        .shippingRate(new com.commercetools.api.models.shipping_method.ShippingRateDraftImpl()) } };
    }

    @Test
    public void zone() {
        ShippingMethodAddShippingRateAction value = ShippingMethodAddShippingRateAction.of();
        value.setZone(new com.commercetools.api.models.zone.ZoneResourceIdentifierImpl());
        Assertions.assertThat(value.getZone())
                .isEqualTo(new com.commercetools.api.models.zone.ZoneResourceIdentifierImpl());
    }

    @Test
    public void shippingRate() {
        ShippingMethodAddShippingRateAction value = ShippingMethodAddShippingRateAction.of();
        value.setShippingRate(new com.commercetools.api.models.shipping_method.ShippingRateDraftImpl());
        Assertions.assertThat(value.getShippingRate())
                .isEqualTo(new com.commercetools.api.models.shipping_method.ShippingRateDraftImpl());
    }
}
