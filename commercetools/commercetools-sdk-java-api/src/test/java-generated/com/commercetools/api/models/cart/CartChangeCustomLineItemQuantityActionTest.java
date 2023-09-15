
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
public class CartChangeCustomLineItemQuantityActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CartChangeCustomLineItemQuantityActionBuilder builder) {
        CartChangeCustomLineItemQuantityAction cartChangeCustomLineItemQuantityAction = builder.buildUnchecked();
        Assertions.assertThat(cartChangeCustomLineItemQuantityAction)
                .isInstanceOf(CartChangeCustomLineItemQuantityAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { CartChangeCustomLineItemQuantityAction.builder().customLineItemId("customLineItemId") },
                new Object[] {
                        CartChangeCustomLineItemQuantityAction.builder().customLineItemKey("customLineItemKey") },
                new Object[] { CartChangeCustomLineItemQuantityAction.builder().quantity(8L) } };
    }

    @Test
    public void customLineItemId() {
        CartChangeCustomLineItemQuantityAction value = CartChangeCustomLineItemQuantityAction.of();
        value.setCustomLineItemId("customLineItemId");
        Assertions.assertThat(value.getCustomLineItemId()).isEqualTo("customLineItemId");
    }

    @Test
    public void customLineItemKey() {
        CartChangeCustomLineItemQuantityAction value = CartChangeCustomLineItemQuantityAction.of();
        value.setCustomLineItemKey("customLineItemKey");
        Assertions.assertThat(value.getCustomLineItemKey()).isEqualTo("customLineItemKey");
    }

    @Test
    public void quantity() {
        CartChangeCustomLineItemQuantityAction value = CartChangeCustomLineItemQuantityAction.of();
        value.setQuantity(8L);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8L);
    }
}
