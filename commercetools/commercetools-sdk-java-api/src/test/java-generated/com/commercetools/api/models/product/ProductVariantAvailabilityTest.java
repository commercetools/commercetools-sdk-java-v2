
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
public class ProductVariantAvailabilityTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductVariantAvailabilityBuilder builder) {
        ProductVariantAvailability productVariantAvailability = builder.buildUnchecked();
        Assertions.assertThat(productVariantAvailability).isInstanceOf(ProductVariantAvailability.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductVariantAvailability.builder()
                .channels(new com.commercetools.api.models.product.ProductVariantChannelAvailabilityMapImpl()) },
                new Object[] { ProductVariantAvailability.builder().isOnStock(true) },
                new Object[] { ProductVariantAvailability.builder().restockableInDays(4L) },
                new Object[] { ProductVariantAvailability.builder().availableQuantity(3L) } };
    }

    @Test
    public void channels() {
        ProductVariantAvailability value = ProductVariantAvailability.of();
        value.setChannels(new com.commercetools.api.models.product.ProductVariantChannelAvailabilityMapImpl());
        Assertions.assertThat(value.getChannels())
                .isEqualTo(new com.commercetools.api.models.product.ProductVariantChannelAvailabilityMapImpl());
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
        value.setRestockableInDays(4L);
        Assertions.assertThat(value.getRestockableInDays()).isEqualTo(4L);
    }

    @Test
    public void availableQuantity() {
        ProductVariantAvailability value = ProductVariantAvailability.of();
        value.setAvailableQuantity(3L);
        Assertions.assertThat(value.getAvailableQuantity()).isEqualTo(3L);
    }
}
