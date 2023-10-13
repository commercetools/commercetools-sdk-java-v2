
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
public class ShippingMethodRemoveShippingRateActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ShippingMethodRemoveShippingRateActionBuilder builder) {
        ShippingMethodRemoveShippingRateAction shippingMethodRemoveShippingRateAction = builder.buildUnchecked();
        Assertions.assertThat(shippingMethodRemoveShippingRateAction)
                .isInstanceOf(ShippingMethodRemoveShippingRateAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ShippingMethodRemoveShippingRateAction.builder()
                        .zone(new com.commercetools.api.models.zone.ZoneResourceIdentifierImpl()) },
                new Object[] { ShippingMethodRemoveShippingRateAction.builder()
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
