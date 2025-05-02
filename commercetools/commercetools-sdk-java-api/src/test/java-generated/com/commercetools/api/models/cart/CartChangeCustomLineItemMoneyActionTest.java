
package com.commercetools.api.models.cart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartChangeCustomLineItemMoneyActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartChangeCustomLineItemMoneyActionBuilder builder) {
        CartChangeCustomLineItemMoneyAction cartChangeCustomLineItemMoneyAction = builder.buildUnchecked();
        Assertions.assertThat(cartChangeCustomLineItemMoneyAction)
                .isInstanceOf(CartChangeCustomLineItemMoneyAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "customLineItemId",
                        CartChangeCustomLineItemMoneyAction.builder().customLineItemId("customLineItemId") },
                new Object[] { "customLineItemKey",
                        CartChangeCustomLineItemMoneyAction.builder().customLineItemKey("customLineItemKey") },
                new Object[] { "money", CartChangeCustomLineItemMoneyAction.builder()
                        .money(new com.commercetools.api.models.common.MoneyImpl()) } };
    }

    @Test
    public void customLineItemId() {
        CartChangeCustomLineItemMoneyAction value = CartChangeCustomLineItemMoneyAction.of();
        value.setCustomLineItemId("customLineItemId");
        Assertions.assertThat(value.getCustomLineItemId()).isEqualTo("customLineItemId");
    }

    @Test
    public void customLineItemKey() {
        CartChangeCustomLineItemMoneyAction value = CartChangeCustomLineItemMoneyAction.of();
        value.setCustomLineItemKey("customLineItemKey");
        Assertions.assertThat(value.getCustomLineItemKey()).isEqualTo("customLineItemKey");
    }

    @Test
    public void money() {
        CartChangeCustomLineItemMoneyAction value = CartChangeCustomLineItemMoneyAction.of();
        value.setMoney(new com.commercetools.api.models.common.MoneyImpl());
        Assertions.assertThat(value.getMoney()).isEqualTo(new com.commercetools.api.models.common.MoneyImpl());
    }
}
