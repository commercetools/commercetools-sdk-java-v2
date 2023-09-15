
package com.commercetools.api.models.product;

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
public class ProductSetDiscountedPriceActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductSetDiscountedPriceActionBuilder builder) {
        ProductSetDiscountedPriceAction productSetDiscountedPriceAction = builder.buildUnchecked();
        Assertions.assertThat(productSetDiscountedPriceAction).isInstanceOf(ProductSetDiscountedPriceAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductSetDiscountedPriceAction.builder().priceId("priceId") },
                new Object[] { ProductSetDiscountedPriceAction.builder().staged(true) },
                new Object[] { ProductSetDiscountedPriceAction.builder()
                        .discounted(new com.commercetools.api.models.common.DiscountedPriceDraftImpl()) } };
    }

    @Test
    public void priceId() {
        ProductSetDiscountedPriceAction value = ProductSetDiscountedPriceAction.of();
        value.setPriceId("priceId");
        Assertions.assertThat(value.getPriceId()).isEqualTo("priceId");
    }

    @Test
    public void staged() {
        ProductSetDiscountedPriceAction value = ProductSetDiscountedPriceAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }

    @Test
    public void discounted() {
        ProductSetDiscountedPriceAction value = ProductSetDiscountedPriceAction.of();
        value.setDiscounted(new com.commercetools.api.models.common.DiscountedPriceDraftImpl());
        Assertions.assertThat(value.getDiscounted())
                .isEqualTo(new com.commercetools.api.models.common.DiscountedPriceDraftImpl());
    }
}
