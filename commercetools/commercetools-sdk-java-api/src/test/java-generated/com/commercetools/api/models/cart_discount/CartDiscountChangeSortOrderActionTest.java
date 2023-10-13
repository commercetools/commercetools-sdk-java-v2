
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
public class CartDiscountChangeSortOrderActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CartDiscountChangeSortOrderActionBuilder builder) {
        CartDiscountChangeSortOrderAction cartDiscountChangeSortOrderAction = builder.buildUnchecked();
        Assertions.assertThat(cartDiscountChangeSortOrderAction).isInstanceOf(CartDiscountChangeSortOrderAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CartDiscountChangeSortOrderAction.builder().sortOrder("sortOrder") } };
    }

    @Test
    public void sortOrder() {
        CartDiscountChangeSortOrderAction value = CartDiscountChangeSortOrderAction.of();
        value.setSortOrder("sortOrder");
        Assertions.assertThat(value.getSortOrder()).isEqualTo("sortOrder");
    }
}
