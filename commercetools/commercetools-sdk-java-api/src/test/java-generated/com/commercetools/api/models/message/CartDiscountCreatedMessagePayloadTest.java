
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
public class CartDiscountCreatedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CartDiscountCreatedMessagePayloadBuilder builder) {
        CartDiscountCreatedMessagePayload cartDiscountCreatedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(cartDiscountCreatedMessagePayload).isInstanceOf(CartDiscountCreatedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CartDiscountCreatedMessagePayload.builder()
                .cartDiscount(new com.commercetools.api.models.cart_discount.CartDiscountImpl()) } };
    }

    @Test
    public void cartDiscount() {
        CartDiscountCreatedMessagePayload value = CartDiscountCreatedMessagePayload.of();
        value.setCartDiscount(new com.commercetools.api.models.cart_discount.CartDiscountImpl());
        Assertions.assertThat(value.getCartDiscount())
                .isEqualTo(new com.commercetools.api.models.cart_discount.CartDiscountImpl());
    }
}
