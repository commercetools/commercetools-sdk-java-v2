
package com.commercetools.api.models.discount_code;

import java.util.Collections;

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
public class DiscountCodeChangeCartDiscountsActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(DiscountCodeChangeCartDiscountsActionBuilder builder) {
        DiscountCodeChangeCartDiscountsAction discountCodeChangeCartDiscountsAction = builder.buildUnchecked();
        Assertions.assertThat(discountCodeChangeCartDiscountsAction)
                .isInstanceOf(DiscountCodeChangeCartDiscountsAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { DiscountCodeChangeCartDiscountsAction.builder()
                .cartDiscounts(Collections.singletonList(
                    new com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifierImpl())) } };
    }

    @Test
    public void cartDiscounts() {
        DiscountCodeChangeCartDiscountsAction value = DiscountCodeChangeCartDiscountsAction.of();
        value.setCartDiscounts(Collections
                .singletonList(new com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifierImpl()));
        Assertions.assertThat(value.getCartDiscounts())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifierImpl()));
    }
}
