
package com.commercetools.api.models.cart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartChangeCustomLineItemPriceModeActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartChangeCustomLineItemPriceModeActionBuilder builder) {
        CartChangeCustomLineItemPriceModeAction cartChangeCustomLineItemPriceModeAction = builder.buildUnchecked();
        Assertions.assertThat(cartChangeCustomLineItemPriceModeAction)
                .isInstanceOf(CartChangeCustomLineItemPriceModeAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "customLineItemId",
                        CartChangeCustomLineItemPriceModeAction.builder().customLineItemId("customLineItemId") },
                new Object[] { "customLineItemKey",
                        CartChangeCustomLineItemPriceModeAction.builder().customLineItemKey("customLineItemKey") },
                new Object[] { "mode", CartChangeCustomLineItemPriceModeAction.builder()
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
