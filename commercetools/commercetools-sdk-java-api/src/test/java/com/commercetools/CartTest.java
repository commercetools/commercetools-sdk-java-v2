
package com.commercetools;

import static com.commercetools.TestUtils.stringFromResource;

import com.commercetools.api.models.cart.CartAddCustomLineItemAction;
import com.commercetools.api.models.cart.DirectDiscountReference;
import com.commercetools.api.models.cart.DiscountedLineItemPrice;
import com.commercetools.api.models.cart_discount.CartDiscountReference;
import com.commercetools.api.models.common.CentPrecisionMoneyDraft;
import com.commercetools.api.models.common.DefaultCurrencyUnits;

import io.vrap.rmf.base.client.utils.json.JsonUtils;

import org.assertj.core.api.Assertions;
import org.javamoney.moneta.FastMoney;
import org.junit.jupiter.api.Test;

public class CartTest {
    @Test
    public void discountedLineItemPortion() {
        DiscountedLineItemPrice price = JsonUtils.fromJsonString(stringFromResource("discounted-price.json"),
            DiscountedLineItemPrice.class);
        Assertions.assertThat(price.getIncludedDiscounts().get(0).getDiscount())
                .isInstanceOf(DirectDiscountReference.class);
        Assertions.assertThat(price.getIncludedDiscounts().get(1).getDiscount())
                .isInstanceOf(CartDiscountReference.class);
    }

    @Test
    public void cartLineItemMoneyBuilder() {
        CartAddCustomLineItemAction action = CartAddCustomLineItemAction.builder()
                .withMoney(
                    moneyBuilder -> moneyBuilder.centPrecisionDraft(FastMoney.of(1.345, DefaultCurrencyUnits.EUR))
                            .build())
                .buildUnchecked();

        Assertions.assertThat(action.getMoney()).isInstanceOf(CentPrecisionMoneyDraft.class);
        Assertions.assertThat(action.getMoney().getCentAmount()).isEqualTo(134);

        CartAddCustomLineItemAction action2 = CartAddCustomLineItemAction.builder()
                .withMoney(
                    moneyBuilder -> moneyBuilder.centPrecisionDraft(FastMoney.of(1.355, DefaultCurrencyUnits.EUR))
                            .build())
                .buildUnchecked();

        Assertions.assertThat(action2.getMoney()).isInstanceOf(CentPrecisionMoneyDraft.class);
        Assertions.assertThat(action2.getMoney().getCentAmount()).isEqualTo(136);
    }
}
