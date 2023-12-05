
package com.commercetools.history.models.common;

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
public class ProductVariantAvailabilityTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductVariantAvailabilityBuilder builder) {
        ProductVariantAvailability productVariantAvailability = builder.buildUnchecked();
        Assertions.assertThat(productVariantAvailability).isInstanceOf(ProductVariantAvailability.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductVariantAvailability.builder().isOnStock(true) },
                new Object[] { ProductVariantAvailability.builder().restockableInDays(4) },
                new Object[] { ProductVariantAvailability.builder().availableQuantity(3) },
                new Object[] { ProductVariantAvailability.builder()
                        .channels(
                            new com.commercetools.history.models.common.ProductVariantChannelAvailabilityMapImpl()) } };
    }

    @Test
    public void isOnStock() {
        ProductVariantAvailability value = ProductVariantAvailability.of();
        value.setIsOnStock(true);
        Assertions.assertThat(value.getIsOnStock()).isEqualTo(true);
    }

    @Test
    public void restockableInDays() {
        ProductVariantAvailability value = ProductVariantAvailability.of();
        value.setRestockableInDays(4);
        Assertions.assertThat(value.getRestockableInDays()).isEqualTo(4);
    }

    @Test
    public void availableQuantity() {
        ProductVariantAvailability value = ProductVariantAvailability.of();
        value.setAvailableQuantity(3);
        Assertions.assertThat(value.getAvailableQuantity()).isEqualTo(3);
    }

    @Test
    public void channels() {
        ProductVariantAvailability value = ProductVariantAvailability.of();
        value.setChannels(new com.commercetools.history.models.common.ProductVariantChannelAvailabilityMapImpl());
        Assertions.assertThat(value.getChannels())
                .isEqualTo(new com.commercetools.history.models.common.ProductVariantChannelAvailabilityMapImpl());
    }
}
