
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
                new Object[] { ProductVariantChannelAvailability.builder().restockableInDays(4L) },
                new Object[] { ProductVariantChannelAvailability.builder().availableQuantity(3L) },
                new Object[] { ProductVariantChannelAvailability.builder().id("id") },
                new Object[] { ProductVariantChannelAvailability.builder().version(2L) } };
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
        value.setRestockableInDays(4L);
        Assertions.assertThat(value.getRestockableInDays()).isEqualTo(4L);
    }

    @Test
    public void availableQuantity() {
        ProductVariantChannelAvailability value = ProductVariantChannelAvailability.of();
        value.setAvailableQuantity(3L);
        Assertions.assertThat(value.getAvailableQuantity()).isEqualTo(3L);
    }

    @Test
    public void id() {
        ProductVariantChannelAvailability value = ProductVariantChannelAvailability.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void version() {
        ProductVariantChannelAvailability value = ProductVariantChannelAvailability.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }
}
