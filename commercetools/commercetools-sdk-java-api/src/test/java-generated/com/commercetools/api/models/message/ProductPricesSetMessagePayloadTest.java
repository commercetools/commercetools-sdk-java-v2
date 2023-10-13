
package com.commercetools.api.models.message;

import java.util.Collections;

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
public class ProductPricesSetMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductPricesSetMessagePayloadBuilder builder) {
        ProductPricesSetMessagePayload productPricesSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(productPricesSetMessagePayload).isInstanceOf(ProductPricesSetMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductPricesSetMessagePayload.builder().variantId(5L) },
                new Object[] { ProductPricesSetMessagePayload.builder()
                        .prices(Collections.singletonList(new com.commercetools.api.models.common.PriceImpl())) },
                new Object[] { ProductPricesSetMessagePayload.builder().staged(true) } };
    }

    @Test
    public void variantId() {
        ProductPricesSetMessagePayload value = ProductPricesSetMessagePayload.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void prices() {
        ProductPricesSetMessagePayload value = ProductPricesSetMessagePayload.of();
        value.setPrices(Collections.singletonList(new com.commercetools.api.models.common.PriceImpl()));
        Assertions.assertThat(value.getPrices())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.PriceImpl()));
    }

    @Test
    public void staged() {
        ProductPricesSetMessagePayload value = ProductPricesSetMessagePayload.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
