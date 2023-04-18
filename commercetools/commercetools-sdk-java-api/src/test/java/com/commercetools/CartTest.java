
package com.commercetools;

import static com.commercetools.TestUtils.stringFromResource;

import com.commercetools.api.models.cart.DirectDiscountReference;
import com.commercetools.api.models.cart.DiscountedLineItemPrice;
import com.commercetools.api.models.cart_discount.CartDiscountReference;

import io.vrap.rmf.base.client.utils.json.JsonUtils;

import org.assertj.core.api.Assertions;
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
}
