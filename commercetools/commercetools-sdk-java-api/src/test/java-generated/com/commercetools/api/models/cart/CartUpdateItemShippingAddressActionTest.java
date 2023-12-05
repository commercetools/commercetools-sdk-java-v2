
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
public class CartUpdateItemShippingAddressActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CartUpdateItemShippingAddressActionBuilder builder) {
        CartUpdateItemShippingAddressAction cartUpdateItemShippingAddressAction = builder.buildUnchecked();
        Assertions.assertThat(cartUpdateItemShippingAddressAction)
                .isInstanceOf(CartUpdateItemShippingAddressAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CartUpdateItemShippingAddressAction.builder()
                .address(new com.commercetools.api.models.common.BaseAddressImpl()) } };
    }

    @Test
    public void address() {
        CartUpdateItemShippingAddressAction value = CartUpdateItemShippingAddressAction.of();
        value.setAddress(new com.commercetools.api.models.common.BaseAddressImpl());
        Assertions.assertThat(value.getAddress()).isEqualTo(new com.commercetools.api.models.common.BaseAddressImpl());
    }
}
