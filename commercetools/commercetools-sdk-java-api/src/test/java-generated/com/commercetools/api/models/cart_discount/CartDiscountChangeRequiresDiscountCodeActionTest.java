
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
public class CartDiscountChangeRequiresDiscountCodeActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CartDiscountChangeRequiresDiscountCodeActionBuilder builder) {
        CartDiscountChangeRequiresDiscountCodeAction cartDiscountChangeRequiresDiscountCodeAction = builder
                .buildUnchecked();
        Assertions.assertThat(cartDiscountChangeRequiresDiscountCodeAction)
                .isInstanceOf(CartDiscountChangeRequiresDiscountCodeAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { CartDiscountChangeRequiresDiscountCodeAction.builder().requiresDiscountCode(true) } };
    }

    @Test
    public void requiresDiscountCode() {
        CartDiscountChangeRequiresDiscountCodeAction value = CartDiscountChangeRequiresDiscountCodeAction.of();
        value.setRequiresDiscountCode(true);
        Assertions.assertThat(value.getRequiresDiscountCode()).isEqualTo(true);
    }
}
