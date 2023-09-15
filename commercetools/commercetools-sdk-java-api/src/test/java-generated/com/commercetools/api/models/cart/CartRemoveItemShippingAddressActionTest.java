
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
public class CartRemoveItemShippingAddressActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CartRemoveItemShippingAddressActionBuilder builder) {
        CartRemoveItemShippingAddressAction cartRemoveItemShippingAddressAction = builder.buildUnchecked();
        Assertions.assertThat(cartRemoveItemShippingAddressAction)
                .isInstanceOf(CartRemoveItemShippingAddressAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { CartRemoveItemShippingAddressAction.builder().addressKey("addressKey") } };
    }

    @Test
    public void addressKey() {
        CartRemoveItemShippingAddressAction value = CartRemoveItemShippingAddressAction.of();
        value.setAddressKey("addressKey");
        Assertions.assertThat(value.getAddressKey()).isEqualTo("addressKey");
    }
}
