
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
public class CartSetShippingRateInputActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CartSetShippingRateInputActionBuilder builder) {
        CartSetShippingRateInputAction cartSetShippingRateInputAction = builder.buildUnchecked();
        Assertions.assertThat(cartSetShippingRateInputAction).isInstanceOf(CartSetShippingRateInputAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CartSetShippingRateInputAction.builder()
                .shippingRateInput(new com.commercetools.api.models.cart.ShippingRateInputDraftImpl()) } };
    }

    @Test
    public void shippingRateInput() {
        CartSetShippingRateInputAction value = CartSetShippingRateInputAction.of();
        value.setShippingRateInput(new com.commercetools.api.models.cart.ShippingRateInputDraftImpl());
        Assertions.assertThat(value.getShippingRateInput())
                .isEqualTo(new com.commercetools.api.models.cart.ShippingRateInputDraftImpl());
    }
}
