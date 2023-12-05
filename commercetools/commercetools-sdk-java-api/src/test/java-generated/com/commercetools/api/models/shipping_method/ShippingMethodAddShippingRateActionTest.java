
package com.commercetools.api.models.shipping_method;

import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class ShippingMethodAddShippingRateActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ShippingMethodAddShippingRateActionBuilder builder) {
        ShippingMethodAddShippingRateAction shippingMethodAddShippingRateAction = builder.buildUnchecked();
        Assertions.assertThat(shippingMethodAddShippingRateAction)
                .isInstanceOf(ShippingMethodAddShippingRateAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ShippingMethodAddShippingRateAction.builder()
                        .zone(new com.commercetools.api.models.zone.ZoneResourceIdentifierImpl()) },
                new Object[] { ShippingMethodAddShippingRateAction.builder()
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
