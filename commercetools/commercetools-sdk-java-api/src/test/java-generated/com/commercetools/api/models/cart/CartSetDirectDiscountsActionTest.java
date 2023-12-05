
package com.commercetools.api.models.cart;

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
public class CartSetDirectDiscountsActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CartSetDirectDiscountsActionBuilder builder) {
        CartSetDirectDiscountsAction cartSetDirectDiscountsAction = builder.buildUnchecked();
        Assertions.assertThat(cartSetDirectDiscountsAction).isInstanceOf(CartSetDirectDiscountsAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CartSetDirectDiscountsAction.builder()
                .discounts(
                    Collections.singletonList(new com.commercetools.api.models.cart.DirectDiscountDraftImpl())) } };
    }

    @Test
    public void discounts() {
        CartSetDirectDiscountsAction value = CartSetDirectDiscountsAction.of();
        value.setDiscounts(Collections.singletonList(new com.commercetools.api.models.cart.DirectDiscountDraftImpl()));
        Assertions.assertThat(value.getDiscounts())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.cart.DirectDiscountDraftImpl()));
    }
}
