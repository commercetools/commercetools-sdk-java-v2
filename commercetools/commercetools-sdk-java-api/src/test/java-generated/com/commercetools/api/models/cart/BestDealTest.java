
package com.commercetools.api.models.cart;

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
public class BestDealTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(BestDealBuilder builder) {
        BestDeal bestDeal = builder.buildUnchecked();
        Assertions.assertThat(bestDeal).isInstanceOf(BestDeal.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { BestDeal.builder().chosenDiscountType("chosenDiscountType") } };
    }

    @Test
    public void chosenDiscountType() {
        BestDeal value = BestDeal.of();
        value.setChosenDiscountType("chosenDiscountType");
        Assertions.assertThat(value.getChosenDiscountType()).isEqualTo("chosenDiscountType");
    }
}
