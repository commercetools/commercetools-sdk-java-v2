
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
public class CartDiscountChangeStackingModeActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CartDiscountChangeStackingModeActionBuilder builder) {
        CartDiscountChangeStackingModeAction cartDiscountChangeStackingModeAction = builder.buildUnchecked();
        Assertions.assertThat(cartDiscountChangeStackingModeAction)
                .isInstanceOf(CartDiscountChangeStackingModeAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CartDiscountChangeStackingModeAction.builder()
                .stackingMode(com.commercetools.api.models.cart_discount.StackingMode.findEnum("Stacking")) } };
    }

    @Test
    public void stackingMode() {
        CartDiscountChangeStackingModeAction value = CartDiscountChangeStackingModeAction.of();
        value.setStackingMode(com.commercetools.api.models.cart_discount.StackingMode.findEnum("Stacking"));
        Assertions.assertThat(value.getStackingMode())
                .isEqualTo(com.commercetools.api.models.cart_discount.StackingMode.findEnum("Stacking"));
    }
}
