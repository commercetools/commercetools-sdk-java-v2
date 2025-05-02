
package com.commercetools.api.models.shipping_method;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ShippingMethodRemoveShippingRateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ShippingMethodRemoveShippingRateActionBuilder builder) {
        ShippingMethodRemoveShippingRateAction shippingMethodRemoveShippingRateAction = builder.buildUnchecked();
        Assertions.assertThat(shippingMethodRemoveShippingRateAction)
                .isInstanceOf(ShippingMethodRemoveShippingRateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "zone",
                        ShippingMethodRemoveShippingRateAction.builder()
                                .zone(new com.commercetools.api.models.zone.ZoneResourceIdentifierImpl()) },
                new Object[] { "shippingRate", ShippingMethodRemoveShippingRateAction.builder()
                        .shippingRate(new com.commercetools.api.models.shipping_method.ShippingRateDraftImpl()) } };
    }

    @Test
    public void zone() {
        ShippingMethodRemoveShippingRateAction value = ShippingMethodRemoveShippingRateAction.of();
        value.setZone(new com.commercetools.api.models.zone.ZoneResourceIdentifierImpl());
        Assertions.assertThat(value.getZone())
                .isEqualTo(new com.commercetools.api.models.zone.ZoneResourceIdentifierImpl());
    }

    @Test
    public void shippingRate() {
        ShippingMethodRemoveShippingRateAction value = ShippingMethodRemoveShippingRateAction.of();
        value.setShippingRate(new com.commercetools.api.models.shipping_method.ShippingRateDraftImpl());
        Assertions.assertThat(value.getShippingRate())
                .isEqualTo(new com.commercetools.api.models.shipping_method.ShippingRateDraftImpl());
    }
}
