
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
public class ShippingMethodSetKeyActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ShippingMethodSetKeyActionBuilder builder) {
        ShippingMethodSetKeyAction shippingMethodSetKeyAction = builder.buildUnchecked();
        Assertions.assertThat(shippingMethodSetKeyAction).isInstanceOf(ShippingMethodSetKeyAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ShippingMethodSetKeyAction.builder().key("key") } };
    }

    @Test
    public void key() {
        ShippingMethodSetKeyAction value = ShippingMethodSetKeyAction.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
