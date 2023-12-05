
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
public class CartDiscountChangeIsActiveActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CartDiscountChangeIsActiveActionBuilder builder) {
        CartDiscountChangeIsActiveAction cartDiscountChangeIsActiveAction = builder.buildUnchecked();
        Assertions.assertThat(cartDiscountChangeIsActiveAction).isInstanceOf(CartDiscountChangeIsActiveAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CartDiscountChangeIsActiveAction.builder().isActive(true) } };
    }

    @Test
    public void isActive() {
        CartDiscountChangeIsActiveAction value = CartDiscountChangeIsActiveAction.of();
        value.setIsActive(true);
        Assertions.assertThat(value.getIsActive()).isEqualTo(true);
    }
}
