
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
public class CartChangeLineItemQuantityActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CartChangeLineItemQuantityActionBuilder builder) {
        CartChangeLineItemQuantityAction cartChangeLineItemQuantityAction = builder.buildUnchecked();
        Assertions.assertThat(cartChangeLineItemQuantityAction).isInstanceOf(CartChangeLineItemQuantityAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CartChangeLineItemQuantityAction.builder().lineItemId("lineItemId") },
                new Object[] { CartChangeLineItemQuantityAction.builder().lineItemKey("lineItemKey") },
                new Object[] { CartChangeLineItemQuantityAction.builder().quantity(8L) },
                new Object[] { CartChangeLineItemQuantityAction.builder()
                        .externalPrice(new com.commercetools.api.models.common.MoneyImpl()) },
                new Object[] { CartChangeLineItemQuantityAction.builder()
                        .externalTotalPrice(new com.commercetools.api.models.cart.ExternalLineItemTotalPriceImpl()) } };
    }

    @Test
    public void lineItemId() {
        CartChangeLineItemQuantityAction value = CartChangeLineItemQuantityAction.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void lineItemKey() {
        CartChangeLineItemQuantityAction value = CartChangeLineItemQuantityAction.of();
        value.setLineItemKey("lineItemKey");
        Assertions.assertThat(value.getLineItemKey()).isEqualTo("lineItemKey");
    }

    @Test
    public void quantity() {
        CartChangeLineItemQuantityAction value = CartChangeLineItemQuantityAction.of();
        value.setQuantity(8L);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8L);
    }

    @Test
    public void externalPrice() {
        CartChangeLineItemQuantityAction value = CartChangeLineItemQuantityAction.of();
        value.setExternalPrice(new com.commercetools.api.models.common.MoneyImpl());
        Assertions.assertThat(value.getExternalPrice()).isEqualTo(new com.commercetools.api.models.common.MoneyImpl());
    }

    @Test
    public void externalTotalPrice() {
        CartChangeLineItemQuantityAction value = CartChangeLineItemQuantityAction.of();
        value.setExternalTotalPrice(new com.commercetools.api.models.cart.ExternalLineItemTotalPriceImpl());
        Assertions.assertThat(value.getExternalTotalPrice())
                .isEqualTo(new com.commercetools.api.models.cart.ExternalLineItemTotalPriceImpl());
    }
}
