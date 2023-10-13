
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
public class CartSetShippingMethodTaxAmountActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CartSetShippingMethodTaxAmountActionBuilder builder) {
        CartSetShippingMethodTaxAmountAction cartSetShippingMethodTaxAmountAction = builder.buildUnchecked();
        Assertions.assertThat(cartSetShippingMethodTaxAmountAction)
                .isInstanceOf(CartSetShippingMethodTaxAmountAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { CartSetShippingMethodTaxAmountAction.builder().shippingKey("shippingKey") },
                new Object[] { CartSetShippingMethodTaxAmountAction.builder()
                        .externalTaxAmount(new com.commercetools.api.models.cart.ExternalTaxAmountDraftImpl()) } };
    }

    @Test
    public void shippingKey() {
        CartSetShippingMethodTaxAmountAction value = CartSetShippingMethodTaxAmountAction.of();
        value.setShippingKey("shippingKey");
        Assertions.assertThat(value.getShippingKey()).isEqualTo("shippingKey");
    }

    @Test
    public void externalTaxAmount() {
        CartSetShippingMethodTaxAmountAction value = CartSetShippingMethodTaxAmountAction.of();
        value.setExternalTaxAmount(new com.commercetools.api.models.cart.ExternalTaxAmountDraftImpl());
        Assertions.assertThat(value.getExternalTaxAmount())
                .isEqualTo(new com.commercetools.api.models.cart.ExternalTaxAmountDraftImpl());
    }
}
