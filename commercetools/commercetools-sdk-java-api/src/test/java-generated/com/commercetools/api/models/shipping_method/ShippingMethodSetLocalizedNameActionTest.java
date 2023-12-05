
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
public class ShippingMethodSetLocalizedNameActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ShippingMethodSetLocalizedNameActionBuilder builder) {
        ShippingMethodSetLocalizedNameAction shippingMethodSetLocalizedNameAction = builder.buildUnchecked();
        Assertions.assertThat(shippingMethodSetLocalizedNameAction)
                .isInstanceOf(ShippingMethodSetLocalizedNameAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ShippingMethodSetLocalizedNameAction.builder()
                .localizedName(new com.commercetools.api.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void localizedName() {
        ShippingMethodSetLocalizedNameAction value = ShippingMethodSetLocalizedNameAction.of();
        value.setLocalizedName(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getLocalizedName())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }
}
