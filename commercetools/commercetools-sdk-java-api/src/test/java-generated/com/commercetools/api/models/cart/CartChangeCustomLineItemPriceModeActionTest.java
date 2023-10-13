
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
public class CartChangeCustomLineItemPriceModeActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CartChangeCustomLineItemPriceModeActionBuilder builder) {
        CartChangeCustomLineItemPriceModeAction cartChangeCustomLineItemPriceModeAction = builder.buildUnchecked();
        Assertions.assertThat(cartChangeCustomLineItemPriceModeAction)
                .isInstanceOf(CartChangeCustomLineItemPriceModeAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { CartChangeCustomLineItemPriceModeAction.builder().customLineItemId("customLineItemId") },
                new Object[] {
                        CartChangeCustomLineItemPriceModeAction.builder().customLineItemKey("customLineItemKey") },
                new Object[] { CartChangeCustomLineItemPriceModeAction.builder()
                        .mode(com.commercetools.api.models.cart.CustomLineItemPriceMode.findEnum("Standard")) } };
    }

    @Test
    public void customLineItemId() {
        CartChangeCustomLineItemPriceModeAction value = CartChangeCustomLineItemPriceModeAction.of();
        value.setCustomLineItemId("customLineItemId");
        Assertions.assertThat(value.getCustomLineItemId()).isEqualTo("customLineItemId");
    }

    @Test
    public void customLineItemKey() {
        CartChangeCustomLineItemPriceModeAction value = CartChangeCustomLineItemPriceModeAction.of();
        value.setCustomLineItemKey("customLineItemKey");
        Assertions.assertThat(value.getCustomLineItemKey()).isEqualTo("customLineItemKey");
    }

    @Test
    public void mode() {
        CartChangeCustomLineItemPriceModeAction value = CartChangeCustomLineItemPriceModeAction.of();
        value.setMode(com.commercetools.api.models.cart.CustomLineItemPriceMode.findEnum("Standard"));
        Assertions.assertThat(value.getMode())
                .isEqualTo(com.commercetools.api.models.cart.CustomLineItemPriceMode.findEnum("Standard"));
    }
}
