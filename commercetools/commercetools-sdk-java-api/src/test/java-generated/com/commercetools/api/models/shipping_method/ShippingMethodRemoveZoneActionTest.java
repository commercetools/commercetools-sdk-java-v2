
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
public class ShippingMethodRemoveZoneActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ShippingMethodRemoveZoneActionBuilder builder) {
        ShippingMethodRemoveZoneAction shippingMethodRemoveZoneAction = builder.buildUnchecked();
        Assertions.assertThat(shippingMethodRemoveZoneAction).isInstanceOf(ShippingMethodRemoveZoneAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ShippingMethodRemoveZoneAction.builder()
                .zone(new com.commercetools.api.models.zone.ZoneResourceIdentifierImpl()) } };
    }

    @Test
    public void zone() {
        ShippingMethodRemoveZoneAction value = ShippingMethodRemoveZoneAction.of();
        value.setZone(new com.commercetools.api.models.zone.ZoneResourceIdentifierImpl());
        Assertions.assertThat(value.getZone())
                .isEqualTo(new com.commercetools.api.models.zone.ZoneResourceIdentifierImpl());
    }
}
