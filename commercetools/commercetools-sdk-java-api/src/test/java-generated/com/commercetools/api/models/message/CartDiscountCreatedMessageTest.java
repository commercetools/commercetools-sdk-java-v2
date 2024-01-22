
package com.commercetools.api.models.message;

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
public class CartDiscountCreatedMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CartDiscountCreatedMessageBuilder builder) {
        CartDiscountCreatedMessage cartDiscountCreatedMessage = builder.buildUnchecked();
        Assertions.assertThat(cartDiscountCreatedMessage).isInstanceOf(CartDiscountCreatedMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CartDiscountCreatedMessage.builder()
                .cartDiscount(new com.commercetools.api.models.cart_discount.CartDiscountImpl()) } };
    }

    @Test
    public void cartDiscount() {
        CartDiscountCreatedMessage value = CartDiscountCreatedMessage.of();
        value.setCartDiscount(new com.commercetools.api.models.cart_discount.CartDiscountImpl());
        Assertions.assertThat(value.getCartDiscount())
                .isEqualTo(new com.commercetools.api.models.cart_discount.CartDiscountImpl());
    }
}
