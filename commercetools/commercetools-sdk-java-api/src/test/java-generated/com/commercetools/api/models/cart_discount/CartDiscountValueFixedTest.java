
package com.commercetools.api.models.cart_discount;

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
public class CartDiscountValueFixedTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CartDiscountValueFixedBuilder builder) {
        CartDiscountValueFixed cartDiscountValueFixed = builder.buildUnchecked();
        Assertions.assertThat(cartDiscountValueFixed).isInstanceOf(CartDiscountValueFixed.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CartDiscountValueFixed.builder()
                .money(Collections.singletonList(new com.commercetools.api.models.common.TypedMoneyImpl())) } };
    }

    @Test
    public void money() {
        CartDiscountValueFixed value = CartDiscountValueFixed.of();
        value.setMoney(Collections.singletonList(new com.commercetools.api.models.common.TypedMoneyImpl()));
        Assertions.assertThat(value.getMoney())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.TypedMoneyImpl()));
    }
}
