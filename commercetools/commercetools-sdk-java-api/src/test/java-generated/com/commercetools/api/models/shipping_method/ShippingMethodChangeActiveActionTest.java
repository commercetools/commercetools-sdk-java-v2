
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
public class ShippingMethodChangeActiveActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ShippingMethodChangeActiveActionBuilder builder) {
        ShippingMethodChangeActiveAction shippingMethodChangeActiveAction = builder.buildUnchecked();
        Assertions.assertThat(shippingMethodChangeActiveAction).isInstanceOf(ShippingMethodChangeActiveAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ShippingMethodChangeActiveAction.builder().active(true) } };
    }

    @Test
    public void active() {
        ShippingMethodChangeActiveAction value = ShippingMethodChangeActiveAction.of();
        value.setActive(true);
        Assertions.assertThat(value.getActive()).isEqualTo(true);
    }
}
