
package com.commercetools.api.models.shipping_method;

import java.util.Collections;

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
public class ShippingMethodUpdateTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ShippingMethodUpdateBuilder builder) {
        ShippingMethodUpdate shippingMethodUpdate = builder.buildUnchecked();
        Assertions.assertThat(shippingMethodUpdate).isInstanceOf(ShippingMethodUpdate.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ShippingMethodUpdate.builder().version(2L) },
                new Object[] { ShippingMethodUpdate.builder()
                        .actions(Collections.singletonList(
                            new com.commercetools.api.models.shipping_method.ShippingMethodUpdateActionImpl())) } };
    }

    @Test
    public void version() {
        ShippingMethodUpdate value = ShippingMethodUpdate.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void actions() {
        ShippingMethodUpdate value = ShippingMethodUpdate.of();
        value.setActions(Collections
                .singletonList(new com.commercetools.api.models.shipping_method.ShippingMethodUpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.api.models.shipping_method.ShippingMethodUpdateActionImpl()));
    }
}
