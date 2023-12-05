
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
public class ProductDiscountChangeIsActiveActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductDiscountChangeIsActiveActionBuilder builder) {
        ProductDiscountChangeIsActiveAction productDiscountChangeIsActiveAction = builder.buildUnchecked();
        Assertions.assertThat(productDiscountChangeIsActiveAction)
                .isInstanceOf(ProductDiscountChangeIsActiveAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductDiscountChangeIsActiveAction.builder().isActive(true) } };
    }

    @Test
    public void isActive() {
        ProductDiscountChangeIsActiveAction value = ProductDiscountChangeIsActiveAction.of();
        value.setIsActive(true);
        Assertions.assertThat(value.getIsActive()).isEqualTo(true);
    }
}
