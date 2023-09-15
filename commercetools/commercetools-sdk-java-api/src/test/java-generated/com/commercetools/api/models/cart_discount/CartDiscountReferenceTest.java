
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
public class CartDiscountReferenceTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CartDiscountReferenceBuilder builder) {
        CartDiscountReference cartDiscountReference = builder.buildUnchecked();
        Assertions.assertThat(cartDiscountReference).isInstanceOf(CartDiscountReference.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { CartDiscountReference.builder()
                        .obj(new com.commercetools.api.models.cart_discount.CartDiscountImpl()) },
                new Object[] { CartDiscountReference.builder().id("id") } };
    }

    @Test
    public void obj() {
        CartDiscountReference value = CartDiscountReference.of();
        value.setObj(new com.commercetools.api.models.cart_discount.CartDiscountImpl());
        Assertions.assertThat(value.getObj())
                .isEqualTo(new com.commercetools.api.models.cart_discount.CartDiscountImpl());
    }

    @Test
    public void id() {
        CartDiscountReference value = CartDiscountReference.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }
}
