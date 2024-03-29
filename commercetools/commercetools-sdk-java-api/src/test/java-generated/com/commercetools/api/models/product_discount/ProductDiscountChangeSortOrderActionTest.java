
package com.commercetools.api.models.product_discount;

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
public class ProductDiscountChangeSortOrderActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductDiscountChangeSortOrderActionBuilder builder) {
        ProductDiscountChangeSortOrderAction productDiscountChangeSortOrderAction = builder.buildUnchecked();
        Assertions.assertThat(productDiscountChangeSortOrderAction)
                .isInstanceOf(ProductDiscountChangeSortOrderAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ProductDiscountChangeSortOrderAction.builder().sortOrder("sortOrder") } };
    }

    @Test
    public void sortOrder() {
        ProductDiscountChangeSortOrderAction value = ProductDiscountChangeSortOrderAction.of();
        value.setSortOrder("sortOrder");
        Assertions.assertThat(value.getSortOrder()).isEqualTo("sortOrder");
    }
}
