
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
public class ProductPriceDiscountsSetMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductPriceDiscountsSetMessagePayloadBuilder builder) {
        ProductPriceDiscountsSetMessagePayload productPriceDiscountsSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(productPriceDiscountsSetMessagePayload)
                .isInstanceOf(ProductPriceDiscountsSetMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductPriceDiscountsSetMessagePayload.builder()
                .updatedPrices(Collections.singletonList(
                    new com.commercetools.api.models.message.ProductPriceDiscountsSetUpdatedPriceImpl())) } };
    }

    @Test
    public void updatedPrices() {
        ProductPriceDiscountsSetMessagePayload value = ProductPriceDiscountsSetMessagePayload.of();
        value.setUpdatedPrices(Collections
                .singletonList(new com.commercetools.api.models.message.ProductPriceDiscountsSetUpdatedPriceImpl()));
        Assertions.assertThat(value.getUpdatedPrices())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.api.models.message.ProductPriceDiscountsSetUpdatedPriceImpl()));
    }
}
