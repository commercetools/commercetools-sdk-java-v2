
package com.commercetools.api.models.cart;

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
public class CartRemoveShippingMethodActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CartRemoveShippingMethodActionBuilder builder) {
        CartRemoveShippingMethodAction cartRemoveShippingMethodAction = builder.buildUnchecked();
        Assertions.assertThat(cartRemoveShippingMethodAction).isInstanceOf(CartRemoveShippingMethodAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CartRemoveShippingMethodAction.builder().shippingKey("shippingKey") } };
    }

    @Test
    public void shippingKey() {
        CartRemoveShippingMethodAction value = CartRemoveShippingMethodAction.of();
        value.setShippingKey("shippingKey");
        Assertions.assertThat(value.getShippingKey()).isEqualTo("shippingKey");
    }
}
