
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
public class ProductVariantChannelAvailabilityTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductVariantChannelAvailabilityBuilder builder) {
        ProductVariantChannelAvailability productVariantChannelAvailability = builder.buildUnchecked();
        Assertions.assertThat(productVariantChannelAvailability).isInstanceOf(ProductVariantChannelAvailability.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductVariantChannelAvailability.builder().isOnStock(true) },
                new Object[] { ProductVariantChannelAvailability.builder().restockableInDays(4) },
                new Object[] { ProductVariantChannelAvailability.builder().availableQuantity(3) } };
    }

    @Test
    public void isOnStock() {
        ProductVariantChannelAvailability value = ProductVariantChannelAvailability.of();
        value.setIsOnStock(true);
        Assertions.assertThat(value.getIsOnStock()).isEqualTo(true);
    }

    @Test
    public void restockableInDays() {
        ProductVariantChannelAvailability value = ProductVariantChannelAvailability.of();
        value.setRestockableInDays(4);
        Assertions.assertThat(value.getRestockableInDays()).isEqualTo(4);
    }

    @Test
    public void availableQuantity() {
        ProductVariantChannelAvailability value = ProductVariantChannelAvailability.of();
        value.setAvailableQuantity(3);
        Assertions.assertThat(value.getAvailableQuantity()).isEqualTo(3);
    }
}
