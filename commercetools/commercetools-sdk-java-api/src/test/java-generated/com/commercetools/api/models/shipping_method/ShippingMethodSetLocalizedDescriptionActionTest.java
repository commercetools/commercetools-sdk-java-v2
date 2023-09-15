
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
public class ShippingMethodSetLocalizedDescriptionActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ShippingMethodSetLocalizedDescriptionActionBuilder builder) {
        ShippingMethodSetLocalizedDescriptionAction shippingMethodSetLocalizedDescriptionAction = builder
                .buildUnchecked();
        Assertions.assertThat(shippingMethodSetLocalizedDescriptionAction)
                .isInstanceOf(ShippingMethodSetLocalizedDescriptionAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ShippingMethodSetLocalizedDescriptionAction.builder()
                .localizedDescription(new com.commercetools.api.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void localizedDescription() {
        ShippingMethodSetLocalizedDescriptionAction value = ShippingMethodSetLocalizedDescriptionAction.of();
        value.setLocalizedDescription(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getLocalizedDescription())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }
}
