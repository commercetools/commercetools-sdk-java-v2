
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
public class CartDiscountValueAbsoluteDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CartDiscountValueAbsoluteDraftBuilder builder) {
        CartDiscountValueAbsoluteDraft cartDiscountValueAbsoluteDraft = builder.buildUnchecked();
        Assertions.assertThat(cartDiscountValueAbsoluteDraft).isInstanceOf(CartDiscountValueAbsoluteDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { CartDiscountValueAbsoluteDraft.builder()
                        .money(Collections.singletonList(new com.commercetools.api.models.common.MoneyImpl())) },
                new Object[] { CartDiscountValueAbsoluteDraft.builder()
                        .applicationMode(com.commercetools.api.models.cart_discount.DiscountApplicationMode
                                .findEnum("ProportionateDistribution")) } };
    }

    @Test
    public void money() {
        CartDiscountValueAbsoluteDraft value = CartDiscountValueAbsoluteDraft.of();
        value.setMoney(Collections.singletonList(new com.commercetools.api.models.common.MoneyImpl()));
        Assertions.assertThat(value.getMoney())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.MoneyImpl()));
    }

    @Test
    public void applicationMode() {
        CartDiscountValueAbsoluteDraft value = CartDiscountValueAbsoluteDraft.of();
        value.setApplicationMode(
            com.commercetools.api.models.cart_discount.DiscountApplicationMode.findEnum("ProportionateDistribution"));
        Assertions.assertThat(value.getApplicationMode())
                .isEqualTo(com.commercetools.api.models.cart_discount.DiscountApplicationMode
                        .findEnum("ProportionateDistribution"));
    }
}
