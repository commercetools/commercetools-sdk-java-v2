
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
public class CartDiscountChangeCartPredicateActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CartDiscountChangeCartPredicateActionBuilder builder) {
        CartDiscountChangeCartPredicateAction cartDiscountChangeCartPredicateAction = builder.buildUnchecked();
        Assertions.assertThat(cartDiscountChangeCartPredicateAction)
                .isInstanceOf(CartDiscountChangeCartPredicateAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { CartDiscountChangeCartPredicateAction.builder().cartPredicate("cartPredicate") } };
    }

    @Test
    public void cartPredicate() {
        CartDiscountChangeCartPredicateAction value = CartDiscountChangeCartPredicateAction.of();
        value.setCartPredicate("cartPredicate");
        Assertions.assertThat(value.getCartPredicate()).isEqualTo("cartPredicate");
    }
}
