
package com.commercetools.api.models.message;

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
public class ProductPriceAddedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductPriceAddedMessagePayloadBuilder builder) {
        ProductPriceAddedMessagePayload productPriceAddedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(productPriceAddedMessagePayload).isInstanceOf(ProductPriceAddedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductPriceAddedMessagePayload.builder().variantId(5L) },
                new Object[] { ProductPriceAddedMessagePayload.builder()
                        .price(new com.commercetools.api.models.common.PriceImpl()) },
                new Object[] { ProductPriceAddedMessagePayload.builder().staged(true) } };
    }

    @Test
    public void variantId() {
        ProductPriceAddedMessagePayload value = ProductPriceAddedMessagePayload.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void price() {
        ProductPriceAddedMessagePayload value = ProductPriceAddedMessagePayload.of();
        value.setPrice(new com.commercetools.api.models.common.PriceImpl());
        Assertions.assertThat(value.getPrice()).isEqualTo(new com.commercetools.api.models.common.PriceImpl());
    }

    @Test
    public void staged() {
        ProductPriceAddedMessagePayload value = ProductPriceAddedMessagePayload.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
