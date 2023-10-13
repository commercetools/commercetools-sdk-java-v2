
package com.commercetools.api.models.cart_discount;

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
public class CartDiscountChangeTargetActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CartDiscountChangeTargetActionBuilder builder) {
        CartDiscountChangeTargetAction cartDiscountChangeTargetAction = builder.buildUnchecked();
        Assertions.assertThat(cartDiscountChangeTargetAction).isInstanceOf(CartDiscountChangeTargetAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CartDiscountChangeTargetAction.builder()
                .target(new com.commercetools.api.models.cart_discount.CartDiscountTargetImpl()) } };
    }

    @Test
    public void target() {
        CartDiscountChangeTargetAction value = CartDiscountChangeTargetAction.of();
        value.setTarget(new com.commercetools.api.models.cart_discount.CartDiscountTargetImpl());
        Assertions.assertThat(value.getTarget())
                .isEqualTo(new com.commercetools.api.models.cart_discount.CartDiscountTargetImpl());
    }
}
