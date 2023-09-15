
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
public class ProductPriceChangedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductPriceChangedMessagePayloadBuilder builder) {
        ProductPriceChangedMessagePayload productPriceChangedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(productPriceChangedMessagePayload).isInstanceOf(ProductPriceChangedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductPriceChangedMessagePayload.builder().variantId(5L) },
                new Object[] { ProductPriceChangedMessagePayload.builder()
                        .oldPrice(new com.commercetools.api.models.common.PriceImpl()) },
                new Object[] { ProductPriceChangedMessagePayload.builder()
                        .newPrice(new com.commercetools.api.models.common.PriceImpl()) },
                new Object[] { ProductPriceChangedMessagePayload.builder().staged(true) },
                new Object[] { ProductPriceChangedMessagePayload.builder()
                        .oldStagedPrice(new com.commercetools.api.models.common.PriceImpl()) } };
    }

    @Test
    public void variantId() {
        ProductPriceChangedMessagePayload value = ProductPriceChangedMessagePayload.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void oldPrice() {
        ProductPriceChangedMessagePayload value = ProductPriceChangedMessagePayload.of();
        value.setOldPrice(new com.commercetools.api.models.common.PriceImpl());
        Assertions.assertThat(value.getOldPrice()).isEqualTo(new com.commercetools.api.models.common.PriceImpl());
    }

    @Test
    public void newPrice() {
        ProductPriceChangedMessagePayload value = ProductPriceChangedMessagePayload.of();
        value.setNewPrice(new com.commercetools.api.models.common.PriceImpl());
        Assertions.assertThat(value.getNewPrice()).isEqualTo(new com.commercetools.api.models.common.PriceImpl());
    }

    @Test
    public void staged() {
        ProductPriceChangedMessagePayload value = ProductPriceChangedMessagePayload.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }

    @Test
    public void oldStagedPrice() {
        ProductPriceChangedMessagePayload value = ProductPriceChangedMessagePayload.of();
        value.setOldStagedPrice(new com.commercetools.api.models.common.PriceImpl());
        Assertions.assertThat(value.getOldStagedPrice()).isEqualTo(new com.commercetools.api.models.common.PriceImpl());
    }
}
