
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
public class CartDiscountChangeValueActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CartDiscountChangeValueActionBuilder builder) {
        CartDiscountChangeValueAction cartDiscountChangeValueAction = builder.buildUnchecked();
        Assertions.assertThat(cartDiscountChangeValueAction).isInstanceOf(CartDiscountChangeValueAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CartDiscountChangeValueAction.builder()
                .value(new com.commercetools.api.models.cart_discount.CartDiscountValueDraftImpl()) } };
    }

    @Test
    public void value() {
        CartDiscountChangeValueAction value = CartDiscountChangeValueAction.of();
        value.setValue(new com.commercetools.api.models.cart_discount.CartDiscountValueDraftImpl());
        Assertions.assertThat(value.getValue())
                .isEqualTo(new com.commercetools.api.models.cart_discount.CartDiscountValueDraftImpl());
    }
}
