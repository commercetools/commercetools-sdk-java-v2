
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
public class CartDiscountValueFixedDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CartDiscountValueFixedDraftBuilder builder) {
        CartDiscountValueFixedDraft cartDiscountValueFixedDraft = builder.buildUnchecked();
        Assertions.assertThat(cartDiscountValueFixedDraft).isInstanceOf(CartDiscountValueFixedDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CartDiscountValueFixedDraft.builder()
                .money(Collections.singletonList(new com.commercetools.api.models.common.MoneyImpl())) } };
    }

    @Test
    public void money() {
        CartDiscountValueFixedDraft value = CartDiscountValueFixedDraft.of();
        value.setMoney(Collections.singletonList(new com.commercetools.api.models.common.MoneyImpl()));
        Assertions.assertThat(value.getMoney())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.MoneyImpl()));
    }
}
